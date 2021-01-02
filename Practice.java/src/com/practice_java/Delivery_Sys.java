package com.practice_java;

import java.util.Scanner;

public class Delivery_Sys {
	
	 String s ="HALFPRICE" ;
	
	public Delivery_Sys() {
		// TODO Auto-generated constructor stub
		
		
		
	}
	
	public void Calculate_Charge(int n) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Do you have COUPON ?");
		
		String input = s.nextLine();
		
//		System.out.println("your input is :"+input);
		
		if(input.equals("yes")) {
			System.out.println("Enter the Coupon Code :");
			String CCode = s.nextLine();
			
			if(CCode.equals(this.s)) {
				System.out.println("Verified Coupon code...");
				System.out.println("Congratulation!! You Recieved 50% Discount on Delivery Charge.");
				
				if(n>10) {
					System.out.println("Your total delivery charge is : $10");
				}
				if(n>6 && n<10) {
					System.out.println("Your total delivery charge is : $7.5");
				}
				if(n>2 && n<6) {
					System.out.println("Your total delivery charge is : $5");
				}
				if(n==1) {
					System.out.println("Your total de;ivery charge is : $2.5");
				}			
		}
		else {
			System.out.println("NO Such coupon avialable");
			if(n>10) {
				System.out.println("Your total delivery charge is : $20");
			}
			if(n>6 && n<10) {
				System.out.println("Your total delivery charge is : $15");
			}
			if(n>2 && n<6) {
				System.out.println("Your total delivery charge is : $10");
			}
			if(n==1) {
				System.out.println("Your total de;ivery charge is : $5");
			}	
			if(n<1) {
				System.out.println("Invalid Package number");
			}	
		}
		}
		else {
			System.out.println("Ok Fine...");
			if(n>10) {
				System.out.println("Your total delivery charge is : $20");
			}
			if(n>6 && n<10) {
				System.out.println("Your total delivery charge is : $15");
			}
			if(n>2 && n<6) {
				System.out.println("Your total delivery charge is : $10");
			}
			if(n==1) {
				System.out.println("Your total de;ivery charge is : $5");
			}
			
		}
		s.close();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Delivery_Sys DS = new Delivery_Sys();
		System.out.println("Enter the number of packages :");
		Scanner s = new Scanner(System.in);
		int  package_num;
		package_num = s.nextInt();
		
		DS.Calculate_Charge(package_num);
		s.close();
		
		
	}

}
