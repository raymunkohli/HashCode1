/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashcodeee;

/**
 *
 * @author raymu
 */
public class DataCentre {
    public static int ID, latencyFromEP, noOfCS;
    
    void dataCentre (int a, int b, int c) {
        ID = a;
        latencyFromEP = b;
        noOfCS = c;
    }

    public static int getID() {
        return ID;
    }

    public static void setID(int ID) {
        DataCentre.ID = ID;
    }

    public static int getLatencyFromEP() {
        return latencyFromEP;
    }

    public static void setLatencyFromEP(int latencyFromEP) {
        DataCentre.latencyFromEP = latencyFromEP;
    }

    public static int getNoOfCS() {
        return noOfCS;
    }

    public static void setNoOfCS(int noOfCS) {
        DataCentre.noOfCS = noOfCS;
    }
    
    
}
