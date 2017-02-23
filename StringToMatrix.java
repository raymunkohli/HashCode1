/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaslicer;

/**
 *
 * @author Robert
 */
public class StringToMatrix {
    private int noOfRows;
    private int noOfColumns;
    private int currRow;
    private String pizzaString;
    private char [][] pizzaMatrix;
    
    public void stringToMatrix(int noOfRows, int noOfColumns, String pizzaString) {
        this.noOfRows = noOfRows;
        this.noOfColumns = noOfColumns;
        this.pizzaString = pizzaString;
        pizzaMatrix = new char[noOfRows][noOfColumns];
        for(int currRow=0; currRow<noOfRows; currRow++) {
        for(int i=0; i<noOfColumns; i++) {
            pizzaMatrix[i][currRow] = pizzaString.charAt(i+currRow*noOfColumns);
            }
        }
        //pizzaMatrix[0][0] = pizzaString.charAt(0);
        System.out.println(pizzaMatrix[0][0]); //test
    }
}
