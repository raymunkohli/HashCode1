/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzacode;

import java.io.*;

/**
 *
 * @author raymu
 */
public class PizzaCode {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("hello world");
        try{
    FileInputStream fstream = new FileInputStream("data/medium.in");
    BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
    
    int a;
    int b;
    int c;
    int d;
    String strLine;
    String pizzaString = "";
    
    
    while((strLine = br.readLine()) != null){
        //System.out.println(strLine);
        
        pizzaString = pizzaString + strLine;
        System.out.println(pizzaString);
    }
     fstream.close();
     
            System.out.println(pizzaString);
    }catch (Exception e){//Catch exception if any
  System.err.println("Error: " + e.getMessage());
  }
  }
    }
    
    

