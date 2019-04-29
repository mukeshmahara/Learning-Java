/**
 * 
 */
package SocketPractice;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Mukes
 *
 */
public class Server {

	/**
	 * @param args
	 */	
	public final static int socket_port=6001;
	public final static String file_to_send="C:/xampp/htdocs/index.php";
	

	
	public static void main(String[] args) throws IOException {
		//Here we should import IOException package
	
		FileInputStream fis =null;
		BufferedInputStream bis = null;
		OutputStream os = null;
		ServerSocket servsock = null;
		Socket sock = null;
		
		try {
			servsock = new ServerSocket(socket_port);
			while(true) {
				System.out.println("waiting....");
				try {
					sock=servsock.accept();
					System.out.println("Accepted connection:"+sock);
					
					//Send File
					
					File myFile=new File(file_to_send);
					byte [] mybytearray = new byte [(int)myFile.length()];
					fis= new FileInputStream(myFile);
					bis= new BufferedInputStream(fis);
					bis.read(mybytearray, 0, mybytearray.length);
					os=sock.getOutputStream();
					System.out.println("Sending"+ file_to_send+ "("+mybytearray.length+"bytes");
					os.write(mybytearray, 0,mybytearray.length);
					os.flush();
					System.out.println("Done...");
				}
				
				
				finally {
					if(bis != null )bis.close();
					if (os != null) os.close();
					if( sock !=null) sock.close();
					
				}
			}
		}
	
		finally{
			if( servsock !=null) servsock.close();
		}
		
	}

}
