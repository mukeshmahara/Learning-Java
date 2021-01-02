
//Question 3
//A 1 is unhappy if the digit to its left and the digit to its right are both 0s. A 0 is
//unhappy if the digit to its left and the digit to its right are both 1s. 
//If a number has only one neighbor, Its is unhappy if its only neighbor is different. Otherwise, it is happy
//If a number doesn't have any neighbor, it is unhappy.
//Write a program that takes a string as an input, consisting only of 1s and 0s and returns the count of happy numbers.


package Leaf_frog_Intern;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;

public class Happy_Counter {

	public Happy_Counter() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string;
		int counter=0,index=0;
		Scanner input = new Scanner(System.in);
		string = input.next();
		int len=string.length();
		do {
			
			
			if((string.charAt(index)==0 && string.charAt(index+1)==0)||(string.charAt(index)==1 && string.charAt(index+1)==1)) {
				counter++;

				System.out.println("Happy count = "+counter);
				
			}
			len--;
			index++;
		}while(len>0);
	}

}
