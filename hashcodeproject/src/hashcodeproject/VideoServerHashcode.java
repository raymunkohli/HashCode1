/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videoserverhashcode;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 *
 * @author DanTe
 */
public class VideoServerHashcode {

    
    private int V;
    private int E;
    private int R;
    private int C;
    private int X;

        public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("hello world");
        try{
            FileInputStream fstream = new FileInputStream("data/me_at_the_zoo.in");
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

            String strLine;
            String toppings;

            while((strLine = br.readLine()) != null){
                String message = strLine;
                System.out.println(strLine);
            }

             fstream.close();


        }catch (Exception e){//Catch exception if any
            System.err.println("Error: " + e.getMessage());
            }
        }
        // TODO code application logic here
    }
    

