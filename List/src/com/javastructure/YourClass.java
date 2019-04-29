/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javastructure;

/**
 *
 * @author Mukes
 */
public class YourClass {
   static int a=10;// If the value of 'a' is of non-static type then it cannnot be reference from the main function
   public void Display(){
           System.out.println(a);
        }
   
    public static class Submylist{
        int b=100;
    }
    public static void main(String[] args) {
            
        YourClass smlo = new YourClass();
            Submylist sm = new Submylist();
            smlo.Display();
            
    }               
    
    
}
