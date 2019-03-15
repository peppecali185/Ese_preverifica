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

    private char[] v=new char[100000];;
    private int elementiPresenti;
    private int maxElem=100000;
    
    public datiCondivisi() {
        
        elementiPresenti = 0;
    }

    public char[] getV() {
        return v;
    }

    public int getElementiPresenti() {
        return elementiPresenti;
    }

    public synchronized void inserisci(char c) {
        if(elementiPresenti<maxElem)
        {
        v[elementiPresenti] = c;
        elementiPresenti++;
        
        }
        
    }
    public synchronized void visualizza() {
        for (int i = 0; i < this.elementiPresenti; i++) {
            System.out.println(v[i]);
        }
    }
    

}
