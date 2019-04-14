/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principale;

/**
 * Nella classe Principale vengono fatti partire 10 thread ed ognuno ha un suo valore
 * Alla fine viene stampato a video il risultato cioè il numero di thread che sono 
 * stati inizializzati
 * @author 73734062
 */

public class Principale {

    /**
     * Vengono inizializzate le variabili e fatti partire, atraverso un ciclo for,
     * i 10 thread e infine viene stampato il numero di thread che sono stati
     * fatti partire
     */
    
    public static void main(String[] args) {
        GestCalcoli GC = new GestCalcoli();
        GC.setRisultato(0);
        System.out.println(GC.getRisultato());
        
        for(int i=0; i< 10;i++)
            new Thread(new CalcoloEdInserisco(1,GC)).start();
        
        while(Thread.activeCount() > 1){
            System.out.println(Thread.activeCount());
        }
        
        System.out.println("Ora ho concluso");
        System.out.println(Thread.activeCount());
        System.out.println("Risulato finale: " + GC.getRisultato());
    }
    
}
