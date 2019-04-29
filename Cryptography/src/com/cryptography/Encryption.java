/**
 * 
 */
package com.cryptography;

/**
 * @author Mukes
 *
 */

import java.util.Scanner;
import com.basicOperation.Operation;


public class Encryption {
			
    void shiftCipher() {
		
	Scanner s = new Scanner(System.in);
		
	System.out.println("Please Enter the Shift value :");
	int shift = s.nextInt();
	
	System.out.println("Please enter a plain Text to Encrypt text using ShiftCipher :\n");
	String key=s.next();
		
	System.out.println("The Encrypted message is :");
	char[] stringToCharArray = key.toCharArray();
	for (char value : stringToCharArray) {
            int asci = (value);
            if (asci > 64 && asci < 91) {
		int val = asci - 65 + shift;
                int val1 = val % 25;
		int result = val + 65;
		String message= Character.toString((char)result);			
		System.out.println(message);	
            }
            else if(asci > 96 && asci < 123){
		int val = asci - 97 + shift;
		int val1 = val % 25;
		int result = val + 97;
		String message = Character.toString((char)result);			
		System.out.println(message);
            }
	}	
    }
void playFairCipher(){

    System.out.println("Enter your keyword :");
    Scanner s = new Scanner(System.in);
    String keyword = s.nextLine();
    char matrix[][] = new char[5][5];
		
    char[] chars = keyword.toCharArray();
		
    int i=0, j=0, k=0;
    for( i=0 ; i < 5 ; i++) {
	for(j=0 ; j<5 ; j++) {
            if(k < chars.length) {
		matrix [i] [j]= chars [k++];
                    System.out.print(matrix[i][j]+"\t");		
            }
				
	}
        System.out.println("\n");
    }
		
    int counter=97;
    for(i=0 ;i<5 ;i++) {
	for(j=0 ;j<5 ;j++) {
            int length=keyword.length();
            while(length<26) {
		k=0;
		if((int)chars[k]!=counter) {
						
                    matrix[length/5][length%5]=(char)counter;
                    counter++;
                    k++;
                    length++;
						
		}	
					
            }
				
            for(i=0;i<5;i++) {
		for(j=0;j<5;j++) {
                    System.out.println(matrix[i][j]);
		}
            }
        }
        System.out.println("\n");
    }
		
}
		

	
void hillCipher(){
    
}
	
void vigenereCipher(){

}
	
void vernamCipher(){

}
	
void relativePrimeNumberChecker() {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter Two numbers: \n a=");
                
    int a=s.nextInt();
    System.out.println("b = ");
    int b=s.nextInt();
    
}		

/**
	 * @param args
	 */

public static void main(String[] arg){		
    Encryption obj=new Encryption();
    Scanner cho = new Scanner(System.in);
		
//		obj.shiftCipher(); Working verified
    obj.playFairCipher();
}
}
