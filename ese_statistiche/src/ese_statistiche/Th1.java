/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ese_statistiche;

import java.util.Random;

/**
 *
 * @author caliendo_giuseppe
 */
public class Th1 extends Thread {

    private String sequenza;
    private int SIZE;
    private datiCondivisi g=new datiCondivisi();

    public Th1(datiCondivisi d) {
        sequenza = "abcdefghijklmnoprstuvwxyz .,";
        SIZE = sequenza.length();
        g=d;
    }
    public Th1() {
        sequenza = "abcdefghijklmnoprstuvwxyz .,";
        SIZE = sequenza.length();
    }

    @Override
    public void run() {
        Random r = new Random();
        while (true) {
            char t = sequenza.charAt(r.nextInt(SIZE));
            g.inserisci(t);
        }
    }

}
