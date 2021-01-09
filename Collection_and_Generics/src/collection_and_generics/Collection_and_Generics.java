/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection_and_generics;

import java.io.Serializable;
import java.util.ArrayList;

import java.util.Iterator;

import jdk.internal.misc.JavaAWTAccess;




/**
 *
 * @author Dell
 */
public class Collection_and_Generics implements Serializable {
	

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    	
    	ArrayList<String> list = new ArrayList<String>();
    	list.add("Father Mahara");
    	list.add("Mother Mahara");
    	list.add("Me Mahara");
    	list.add("Sister Mahara");
    	list.add("Brother Mahara");
    	
    	
    	
    	Iterator<String> iterator = list.iterator();
    	int count=0;
    	while(iterator.hasNext()) {
    		count++;
    		System.out.println(count+". "+iterator.next());
    		
    	}
    }
    
}
