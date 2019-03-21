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
public class Th4 extends Thread {

    private datiCondivisi d;

    public Th4(datiCondivisi d) {
        this.d = d;

    }

    @Override
    public void run() {
        char[] v = d.getV();
        for (int i = 0; i < v.length; i++) {
            
            ///////////////////////////
            try {
                d.s4Wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Th4.class.getName()).log(Level.SEVERE, null, ex);
            }
            ///////////////////////////
            
            for (int j = 0; j < d.getElementiPresenti(); j++) {         //per visualizzare tutto l'array
                System.out.print(v[j] + "-");
            }
            System.out.println();
            System.out.println("il numero di spazi inseriti e': " + d.getNumSpaziInseriti());
            System.out.println("------------------");
            System.out.println("il numero di spazi letti e': " + d.getNumSpaziLetti());
            System.out.println("------------------");
            System.out.println("il numero di punti inseriti e': " + d.getNumPuntiInseriti());
            System.out.println("------------------");
            System.out.println("il numero di punti letti e': " + d.getNumPuntiLetti());
            
            ///////////////////////////
            try {
                d.s1Signal();
            } catch (InterruptedException ex) {
                Logger.getLogger(Th4.class.getName()).log(Level.SEVERE, null, ex);
            }
            ///////////////////////////
        }
       
        
        
    }
}
