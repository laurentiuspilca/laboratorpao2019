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
public class Cutit implements Insurubator, InstrumentDeTaiat {

    @Override
    public void insurubeaza() {
        System.out.println("Insurubeaza");
    }

    @Override
    public void desurubeaza() {
        System.out.println("Desurubeaza");
    }

    @Override
    public void taie() {
        System.out.println("Taie");
    }
    
}
