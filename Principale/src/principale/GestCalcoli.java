/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principale;

/**
 * La classe GestCalcoli ha come unico attributo un numero (double)
 * 
 * @author 73734062
*/
public class GestCalcoli {
    private double risultato;

    /** Questo metodo ritorna l'attributo risultato di questa classe
     * @return attributo risultato 
    */
    
    public double getRisultato() {
        return risultato;
    }
    /** Questo metodo serve a settare un risultato
     * @param risultato numero che si vuole impostare nella variabile risultato
    */
    
    public void setRisultato(double risultato) {
        this.risultato = risultato;
    }
    
}
