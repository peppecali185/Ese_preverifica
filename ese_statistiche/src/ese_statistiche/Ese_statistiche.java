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
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        java.io.BufferedReader console = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        Scanner input = new Scanner(System.in);
        boolean finito = false;
        datiCondivisi d = new datiCondivisi();
        Th1 th1 = new Th1(d);

        th1.start();

        while (!finito) {
            d.visualizza();
            String s = console.readLine();
            if (s.endsWith(" ")) {
                finito = true;
            } else {
                clearConsole();
            }
        }
        
        th1.interrupt();

    }

    private static void clearConsole() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (IOException | InterruptedException ex) {
        }
    }

}
