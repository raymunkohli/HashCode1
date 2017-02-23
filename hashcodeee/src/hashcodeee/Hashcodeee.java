/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashcodeee;

import java.io.*;
import java.util.ArrayList;

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
            ArrayList<VideoSizes> sizes = new ArrayList<VideoSizes>();
           /* while((strLine = br.readLine()) != null){
                String message = strLine;
                System.out.println(strLine);
            }*/
           String topline = br.readLine();
           String[] a =  topline.split(" ");
           String secondLine = br.readLine();
           String[] b = secondLine.split(" ");
           System.out.println(a[0]);
           int length = Integer.parseInt(a[0]);
           for(int i=0;i!=length;i++){
               sizes.add(new VideoSizes(Integer.parseInt(b[i])));
           }           
           
            
        } catch (Exception e){//Catch exception if any
            System.err.println("Error: " + e.getMessage());
  }

        // make new VideoSizes objects from the sizes in the .txt file
        
        
    }
    
}
