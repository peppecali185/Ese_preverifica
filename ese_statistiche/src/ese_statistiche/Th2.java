/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ese_statistiche;

/**
 *
 * @author peppe
 */
public class Th2 extends Thread{
    
   private datiCondivisi g;
    
    public Th2(datiCondivisi g) {
        this.g=g;
    }
    
    @Override
    public void run() {
    char[] v=g.getV();
    
    for(int i=0;i<v.length;i++){
        if(v[i]==' '){
            g.incrementaSpaziLetti();
           
        }
    }
    }
}
