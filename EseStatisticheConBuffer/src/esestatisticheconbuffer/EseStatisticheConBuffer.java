/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esestatisticheconbuffer;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author peppe
 */
public class EseStatisticheConBuffer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            java.io.BufferedReader console = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
            Scanner input = new Scanner(System.in);
            int durata;
            System.out.println("quanto deve durare il test?");
            durata = input.nextInt();

            DatiCondivisi d = new DatiCondivisi();

            Th1 th1 = new Th1(d, durata);
            Th2 th2 = new Th2(d);
            Th3 th3 = new Th3(d);
            ThVisualizza thvis = new ThVisualizza(d);

            th1.start();
            th2.start();
            th3.start();
            thvis.start();

            th1.join();
            th2.join();
            th3.join();
            thvis.join();



        } catch (InterruptedException ex) {
            Logger.getLogger(EseStatisticheConBuffer.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
