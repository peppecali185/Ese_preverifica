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
public class Th2 extends Thread {

    private datiCondivisi g;
    private int dimensione;

    public Th2(datiCondivisi g,int d) {
        this.g = g;
        dimensione=d;
    }

    @Override
    public void run() {
        char[] v = g.getV();

        

        for (int i = 0; i < v.length; i++) {
        ///////////////////////////
        try {
            g.s2Wait();
        } catch (InterruptedException ex) {
            Logger.getLogger(Th2.class.getName()).log(Level.SEVERE, null, ex);
        }
        ///////////////////////////
            if (v[i] == ' ') {
                g.incrementaSpaziLetti();

            }
        ///////////////////////////    
        try {
            g.s3Signal();
        } catch (InterruptedException ex) {
            Logger.getLogger(Th2.class.getName()).log(Level.SEVERE, null, ex);
        }
        ///////////////////////////          
            
        }



    }
}
