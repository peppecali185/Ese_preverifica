/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esestatisticheconbuffer;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author peppe
 */
public class DatiCondivisi {

    private char buffer;
    private int numSpaziInseriti, numPuntiInseriti;
    private int numSpaziLetti, numPuntiLetti;
    private boolean ferma;
    private Semaphore s1, s2, s3, datiDaVisualizzare, datiVisualizzati;

    public DatiCondivisi(char buffer) {
        this.buffer = buffer;
        ferma = false;
        s1 = new Semaphore(2);
        s2 = new Semaphore(0);
        s3 = new Semaphore(0);
        datiDaVisualizzare = new Semaphore(0);
        datiVisualizzati = new Semaphore(1);
    }

    public DatiCondivisi() {
        buffer = ' ';
        s1 = new Semaphore(2);
        s2 = new Semaphore(0);
        s3 = new Semaphore(0);
        datiDaVisualizzare = new Semaphore(0);
        datiVisualizzati = new Semaphore(0);
    }

    public boolean isFerma() {
        return ferma;
    }

    public void s1Wait() {
        try {
            s1.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(DatiCondivisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void s2Wait() {
        try {
            s2.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(DatiCondivisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void s3Wait() {
        try {
            s3.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(DatiCondivisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void waitDatiDaVisualizzare() {
        try {
            datiDaVisualizzare.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(DatiCondivisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void waitDatiVisualizzati() {
        try {
            datiVisualizzati.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(DatiCondivisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void signalDatiDaVisualizzare() {
        datiDaVisualizzare.release();
    }
    public void signalDatiVisualizzati() {
        datiVisualizzati.release();
    }

    public void s1Signal() {
        s1.release();
    }

    public void s2Signal() {
        s2.release();
    }

    public void s3Signal() {
        s3.release();
    }

    public int getNumSpaziInseriti() {
        return numSpaziInseriti;
    }

    public int getNumPuntiInseriti() {
        return numPuntiInseriti;
    }

    public char getBuffer() {
        return buffer;
    }

    public int getNumSpaziLetti() {
        return numSpaziLetti;
    }

    public void setNumSpaziLetti(int numSpaziLetti) {
        this.numSpaziLetti = numSpaziLetti;
    }

    public int getNumPuntiLetti() {
        return numPuntiLetti;
    }

    public void setNumPuntiLetti(int numPuntiLetti) {
        this.numPuntiLetti = numPuntiLetti;
    }

    public synchronized void inserisciNelBuffer(char c) {
        buffer = c;
    }

    public synchronized void FERMATUTTO() {
        ferma = true;
    }

    public synchronized void incrementaSpaziInseriti() {
        numSpaziInseriti++;
    }

    public synchronized void incrementaPuntiInseriti() {
        numPuntiInseriti++;
    }

    public synchronized void incrementaPuntiLetti() {
        numPuntiLetti++;
    }

    public synchronized void incrementaSpaziLetti() {
        numSpaziLetti++;
    }

}
