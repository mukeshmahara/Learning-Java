/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.net.*; 
import java.io.*; 
package socketprogramming;

/**
 *
 * @author Mukes
 */
//    public static void main(String[] args) {
//        // TODO code application logic here
//    }
//    
//}


  
public class Socketprogramming 
{ 
    // initialize socket and input output streams 
    private Socket socket            = null; 
    private DataInputStream  input   = null; 
    private DataOutputStream out     = null; 
  
    // constructor to put ip address and port 

  
    public static void main(String args[]) 
    { 
        Socketprogramming client = new Socketprogramming("127.0.0.1", 5000); 
    } 
} 