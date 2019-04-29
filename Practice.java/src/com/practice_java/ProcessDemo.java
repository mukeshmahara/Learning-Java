package com.practice_java;

import java.io.InputStream;

public class ProcessDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
	         // create a new process
	         System.out.println("Creating Process...");
	          
	         Process p =  Runtime.getRuntime().exec("notepads.exe");
	          //Here this line will cause the error because there is no any program named as notepads.exe

	         // get the input stream of the process and print it
	         InputStream in = p.getInputStream();
	         for (int i = -1; i < in.available(); i++) {
	            System.out.println("what" + in.read());
	         }

	         // wait for 10 seconds and then destroy the process
	         Thread.sleep(10000);
	         p.destroy();
	      } 
		  catch (Exception e) {
	         e.printStackTrace();
	      }
		finally{
			System.out.println("Try catch block is finished");
			
		}

	}

}
