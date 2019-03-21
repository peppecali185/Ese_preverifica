/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ese_statistiche;

import java.io.IOException;
import static java.lang.System.console;
import java.util.Scanner;

/**
 *
 * @author caliendo_giuseppe
 */
public class Ese_statistiche {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        // TODO code application logic here
        java.io.BufferedReader console = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        Scanner input = new Scanner(System.in);

        boolean finito = false;
        int tempo;
        datiCondivisi d = new datiCondivisi();

        System.out.println("quanti caratteri devo generare?");
        tempo = input.nextInt();

        Th1 th1 = new Th1(d, tempo);
        Th2 th2 = new Th2(d, tempo);
        Th3 th3 = new Th3(d, tempo);
        Th4 th4 = new Th4(d, tempo);

        th1.start();
        th2.start();
        th3.start();
        th4.start();

        d.semFINITOwait();
        /* System.out.println("il numero di spazi inseriti e': "+d.getNumSpaziInseriti());
        System.out.println("------------------");
        System.out.println("il numero di spazi letti e': "+d.getNumSpaziLetti());
        System.out.println("------------------");
        System.out.println("il numero di punti inseriti e': "+d.getNumPuntiInseriti());
        System.out.println("------------------");
        System.out.println("il numero di punti letti e': "+d.getNumPuntiLetti());*/
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("PROGRAMMA FINITO");
        
    }

    

}
