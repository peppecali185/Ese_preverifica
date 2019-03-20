/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ese_statistiche;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author peppe
 */
public class Th3 extends Thread{
    
     private datiCondivisi g;
    
    public Th3(datiCondivisi g) {
        this.g=g;
    }
    
    @Override
    public void run() {
    char[] v=g.getV();
    
    for(int i=0;i<v.length;i++){
        ///////////////////////////
        try {
            g.s3Wait();
        } catch (InterruptedException ex) {
            Logger.getLogger(Th2.class.getName()).log(Level.SEVERE, null, ex);
        }
        ///////////////////////////        
        if(v[i]=='.'){
            g.incrementaPuntiLetti();         
        }
        ///////////////////////////
        try {
            g.s1Signal();
        } catch (InterruptedException ex) {
            Logger.getLogger(Th2.class.getName()).log(Level.SEVERE, null, ex);
        }
        ///////////////////////////
        
    }
    }
}
