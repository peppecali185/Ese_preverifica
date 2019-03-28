/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esestatisticheconbuffer;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author peppe
 */
public class Th2 extends Thread {

    private DatiCondivisi g;

    public Th2(DatiCondivisi d) {
        g = d;
    }

    @Override
    public void run() {

        while (!g.isFerma()) {

            
                g.s2Wait();
            
            if (g.getBuffer() == ' ') {
                g.incrementaSpaziLetti();
            }
            
                g.s1Signal();
            

        }
    }
}
