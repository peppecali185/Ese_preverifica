/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ese_statistiche;

/**
 *
 * @author caliendo_giuseppe
 */
public class datiCondivisi {

    private char[] v = new char[100000];
    ;
    private int elementiPresenti, numSpaziInseriti, numPuntiInseriti, numSpaziLetti, numPuntiLetti;

    public datiCondivisi() {
        numSpaziInseriti = 0;
        elementiPresenti = 0;
        numPuntiInseriti = 0;
        numSpaziLetti = 0;
        numPuntiLetti = 0;
    }

    public synchronized char[] getV() {
        return v;
    }

    public int getNumSpaziInseriti() {
        return numSpaziInseriti;
    }

    public int getNumPuntiInseriti() {
        return numPuntiInseriti;
    }

    public int getElementiPresenti() {
        return elementiPresenti;
    }

    public int getNumSpaziLetti() {
        return numSpaziLetti;
    }

    public int getNumPuntiLetti() {
        return numPuntiLetti;
    }

    public void incrementaPuntiInseriti() {
        numPuntiInseriti++;
    }

    public void incrementaSpaziInseriti() {
        numSpaziInseriti++;
    }
    
    public void incrementaPuntiLetti() {
        numPuntiLetti++;
    }

    public void incrementaSpaziLetti() {
        numSpaziLetti++;
    }

    public synchronized void inserisci(char c) {
        v[elementiPresenti] = c;
        elementiPresenti++;
    }

    public synchronized void visualizza() {
        for (int i = 0; i < this.elementiPresenti; i++) {
            System.out.println(v[i]);
        }
    }

}
