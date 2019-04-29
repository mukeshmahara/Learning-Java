
package GCDpackage;

import java.util.*;

public class Program {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
	}
	
	public int gcd(int a,int b) {
		int num = 10;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the data of x=");
		int x = scan.nextInt();
//		System.out.println("The number is :"+x);
		
//		Scanner b=new Scanner(System.in);
		System.out.println("Enter the data of y=");
		int y=scan.nextInt();
	
		
	int calculate(x,y) {
		if(x==0) {
			return y;
		}
		else if (y==0) {
			return x;
		}
		else {
			int temp=y;
			y=x%y;
			
			return num;
		}
			
			
		
	}
				
			
		
	
	

