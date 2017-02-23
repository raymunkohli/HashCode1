/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashcodeee;

/**
 *
 * @author bookw
 */
public class Latency {
    private Source s;
    private EndPoint e;
    private int latency;
    
    public Latency(Source s, EndPoint e) {//this will allow us to have latencies for multiple objects???idek 
        this.s = s;
        this.e = e;
    }

    public int getLatency() {
        return latency;
    }

    public void setLatency(int latency) {
        this.latency = latency;
    }
        
}
