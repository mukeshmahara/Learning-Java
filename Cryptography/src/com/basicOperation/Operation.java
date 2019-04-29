/**
 * 
 */
package com.basicOperation;

import java.util.Scanner;

/**
 * @author Mukes
 *
 */

public class Operation {
    void modulo() {
	Scanner s = new Scanner(System.in);			
		
	System.out.println("Enter a number to find its modulo : ");
	int num = s.nextInt();
		
	System.out.println("Enter the mode :");
	int mode = s.nextInt();
		
			
	if(num>=0) {
            int result = num % mode;
            System.out.println(+num+" mode "+mode+" = " +result);
	}
	else{
			
            int result = (num % mode) + mode;
            System.out.println(+num+" mode "+mode+" = " +result);
	}
    }
            
    void GCD(int a,int b) {
	
	if(b==0) {
            System.out.println(+a);	
	}
	else {
			
            int temp=b;
            b=a%b;
            GCD(temp,b);
	}
    }
	
        
    void additiveInverse() {
			
    }
		
    void multiplicativeInverse() {

    }
	
    /**
     * @param args
     */
    
    public static void main(String[] args) {
        Operation op=new Operation();
	Scanner s = new Scanner(System.in);
		
		
	System.out.println("GCD(a,b)\nEnter the value of a :");
	int a=s.nextInt();
		
	System.out.println("Enter the value of b :");
	int b=s.nextInt();	
		
	System.out.println("GCD of "+a+" and "+b+" is :");
		
		
	op.GCD(a,b);
    }
}
