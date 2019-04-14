/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principale;

/**
 * La classe CalcoloEdInserisco implementa la classe runnable e
 * ha come attributi un numero (double) e una variabile di tipo
 * GestCalcoli
 * 
 * @author 73734062
 */
public class CalcoloEdInserisco implements Runnable{
    private double b;
    private GestCalcoli gc;
    
    /** Scrittura del costruttore */
    
    public CalcoloEdInserisco (double b, GestCalcoli gc){
        this.b = b;
        this.gc = gc;
    }
    
    /**
     * Il metodo run viene sovrascritto al metodo run base in modo che venga
     * stampato il numero alla quale è riferito il thread corrente
     */
    
    @Override
    public void run(){
        gc.setRisultato(gc.getRisultato()+b);
        System.out.println(Thread.currentThread().getName() + " " + gc.getRisultato());
    }
}
