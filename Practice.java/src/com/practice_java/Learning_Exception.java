package com.practice_java;

import java.util.Scanner;

//import java.util.Scanner;

public class Learning_Exception {
	static int a[]= {1,2,3,5,6,9,7};
	static int num;
	public void Display()  {
	
		System.out.println("The element in the position is :"+a[num-1]);
	}
		//This will create a situation to throw exception because the index 21 of the array a[] does not exists	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("This is the exception handellling program");
		Learning_Exception obj = new Learning_Exception();
		try {
			Scanner n=new Scanner(System.in);
			
			System.out.println("Enter the position of the element in the array :");
			num=n.nextInt();
			obj.Display();
			
		}
		catch(Exception e) {
		
			e.printStackTrace();

			System.out.println("There is a problem. Index is out of bound");	
		}

	}

}
