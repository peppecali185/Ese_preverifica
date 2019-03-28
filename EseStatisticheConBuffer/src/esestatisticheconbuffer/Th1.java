/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esestatisticheconbuffer;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author peppe
 */
public class Th1 extends Thread {

    private DatiCondivisi g;
    private String sequenza;
    private int SIZE;
    private int tempo;

    public Th1(DatiCondivisi d, int tempo) {
        sequenza = "abcdefghijklmnoprstuvwxyz .,";
        SIZE = sequenza.length();
        g = d;
        this.tempo = tempo;
    }

    public Th1() {
        sequenza = "abcdefghijklmnoprstuvwxyz .,";
        SIZE = sequenza.length();
    }

    @Override
    public void run() {
        Random r = new Random();
        int i = 0;

        while (i < tempo) {

            g.s1Wait();
            g.s1Wait();

            char t = sequenza.charAt(r.nextInt(SIZE));  //genera il carattere
            g.inserisciNelBuffer(t);

            if (t == ' ') {
                g.incrementaSpaziInseriti();

                g.signalDatiDaVisualizzare(); //0
                g.waitDatiVisualizzati();//1
            }
            if (t == '.') {
                g.incrementaPuntiInseriti();

                g.signalDatiDaVisualizzare();
                g.waitDatiVisualizzati();

            }

            i++;

            g.s2Signal();
            g.s3Signal();
        }
        g.FERMATUTTO();
       System.out.println("LA MERDA DEFINITIVA E':");
      g.signalDatiDaVisualizzare();
    }

}
