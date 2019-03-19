/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplu2;

/**
 *
 * @author Student
 */
public interface TaietorSiInsurubator extends Insurubator, InstrumentDeTaiat {
    
    public static final int x = 10;
    
    public abstract void m();
    
    default void q() {
        
    }
}
