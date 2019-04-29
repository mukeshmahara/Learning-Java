/**
 * 
 */
package SocketPractice;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/**
 * @author Mukes
 *
 */
public class Client {

	/**
	 * @param args
	 */
	
	public final static int socket_port=6001;
	public final static String SERVER = "127.0.0.1";
	public final static String
		file_to_received = "C:/xampp/htdocs/project/index.php";
	
	public static int file_size = 400 ;
	
	public static void main(String[] args) throws IOException {
		int bytesRead;
		int current = 0;
		FileOutputStream fos =null;
		BufferedOutputStream bos = null;
		Socket sock = null;
		
		try {
			sock =new Socket(SERVER, socket_port);
			System.out.println("Connecting....");
			
			//receive file
			
			byte [] mybytearray =new byte [file_size];
			InputStream is = sock.getInputStream();
			fos = new FileOutputStream(file_to_received);
			bos = new BufferedOutputStream(fos);
			bytesRead = is.read(mybytearray , 0, mybytearray.length);
			current = bytesRead;
			
			do {
				bytesRead = 
						is.read(mybytearray, current, (mybytearray.length-current));
				if( bytesRead >= 0) 
					current += bytesRead;
				
			}while(bytesRead >-1);
			
			bos.flush();
			System.out.println("File "+ file_to_received +" downloaded("+ current + " bytes read)");
			
			
		}
		finally {
			if(fos !=null) fos.close();
			if( bos !=null) bos.close();
			if(sock !=null) sock.close();
		}


	}

}
