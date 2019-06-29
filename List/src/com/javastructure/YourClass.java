/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javastructure;
import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author Mukes
 */
public class YourClass {
    
    public static void main(String[] args) {
            
       
             ArrayList<String> cars = new ArrayList<String>();
    
            cars.add("Farari");
            cars.add("BMW");
            cars.add("Tesla");
            
            System.out.println(cars);
            
            cars.set(1,"Maruti");
            
            System.out.println(cars);
            
            System.out.println("\nHere the list of cars in the array are:\n");
            
            for(int i=0;i<cars.size();i++){
                System.out.println(cars.get(i));
            }
            
            
            HashMap<String,String>  capitalcities = new HashMap<String,String>();
            
            capitalcities.put("Nepal","Kathmandu"); 
            capitalcities.put("Japan", "Tokyo");
            capitalcities.put("China", "Bejing");
            capitalcities.put("England", "London");
            capitalcities.put("Germany", "Berlin");
            capitalcities.put("Norway", "Oslo");
            capitalcities.put("USA", "Washington DC");
            
//            System.out.println(capitalcities.size());
            
            for (String i : capitalcities.keySet()){
            System.out.println("The capital city of "+i+" is "+ capitalcities.get(i));
            }
            
            
    }            
    
    
}
