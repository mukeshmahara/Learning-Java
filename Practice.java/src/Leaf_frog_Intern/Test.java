//Question 1
//Create a program which replaces all the x's in the string in 
//the following ways:
//Replace all x's with 'csk' UNLESS:
//*The word begins with 'x' , therefore replace it with 'z'.
//*The word is just the letter 'x', therefore replace it with 'ecks'.
//*Assume all x will be lower case'




package Leaf_frog_Intern;

import java.util.Scanner;


public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your String");
		Scanner input = new Scanner(System.in);
		String string = input.nextLine();
		StringBuilder  str = new StringBuilder(string);
		
		if (string.charAt(0) == 'x' && string.length()!=1) {
//			str = str.replace('x', 'z');
			str.setCharAt(0, 'z');
			System.out.println(str);

		}
		else if(string.length() ==1 && string.charAt(0)=='x') {
			string = string.replace("x", "ecks");

			
			System.out.println(string);
		}
		else {
			string = string.replace("x", "cks");

}
	}}
