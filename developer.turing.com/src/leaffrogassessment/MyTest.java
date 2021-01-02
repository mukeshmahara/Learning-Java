/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leaffrogassessment;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class MyTest {

    //Do not edit the main function 
    public static void main(String[] args) {

        String input;

        //Get the input
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();

        //Print output returned from the logic function
        System.out.println(logic(input));
    }

    //The function is expected to return a String.
    //The function accepts String as parameter.
    public static String logic(String input) {

        String output = new String();
        //Write your code here
        for (int index = 0; index < input.length(); index++) {
            output = input;
            if (input.charAt(index) == 'x') {

                output = input.replace("x", "cks");
                System.out.println(output);
            }
            
        }
        return input;
        //You can create other functions and call from here
        //Don't print anything. Just return the intended output
    }

}
