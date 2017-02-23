/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashcodeee;

import java.io.*;
import static java.lang.String.valueOf;

/**
 *
 * @author raymu
 */
public class Hashcodeee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        try{
        FileInputStream fstream = new FileInputStream("data/me_at_the_zoo.in");
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

            
            String strLine;
            String toppings;

           /* while((strLine = br.readLine()) != null){
                String message = strLine;
                System.out.println(strLine);
            }*/
           String message = br.readLine();
           String[] a =  message.split(" ");
           System.out.println(a[0]);
           int length = Integer.parseInt(a[0]);
           for(int i=0;i!=length;i++){
               new Video(/*size of the videos goes here*/);
               //add videos to video arrayList?
           }           
            
        } catch (Exception e){//Catch exception if any
            System.err.println("Error: " + e.getMessage());
  }
    }
    
}
