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
public class ThVisualizza extends Thread {

    private DatiCondivisi g;

    public ThVisualizza(DatiCondivisi d) {
        g = d;
    }

    @Override
    public void run() {
        while (!g.isFerma()) {
            
            g.waitDatiDaVisualizzare();//0
            System.out.println("il numero di spazi inseriti è: " + g.getNumSpaziInseriti());
            System.out.println("il numero di spazi letti è: " + g.getNumSpaziLetti());
            System.out.println("il numero di punti inseriti è: " + g.getNumPuntiInseriti());
            System.out.println("il numero di punti letti è: " + g.getNumPuntiLetti());
            System.out.println("-----------------------------------");
            g.signalDatiVisualizzati(); //2

        }
    }
}
