/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashcodeproject;

/**
 *
 * @author raymu
 */
public class casheServer {
    public int endPoint,id,casheToEndPoint;
    casheServer(int endPoint, int id, int casheToEndPoint){
        
        
    }

    public int getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(int endPoint) {
        this.endPoint = endPoint;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCasheToEndPoint() {
        return casheToEndPoint;
    }

    public void setCasheToEndPoint(int casheToEndPoint) {
        this.casheToEndPoint = casheToEndPoint;
    }
}
