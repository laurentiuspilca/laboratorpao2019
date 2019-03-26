/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Student
 */
public enum Blat {
    SUBTIRE(10), MEDIU(20), PUFOS(25);
    
    private final double pret;
    
    private Blat(double pret) {
        this.pret = pret;
    }
    
    public double getPret() {
        return this.pret;
    }
}
