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
public class Ingredient implements Comparable<Ingredient> {
    
    private final String nume;
    private final double pret;
    
    public Ingredient(String nume, double pret) {
        this.nume = nume;
        this.pret = pret;
    }

    public String getNume() {
        return nume;
    }

    public double getPret() {
        return pret;
    }

    @Override
    public int compareTo(Ingredient o) {
        // this < o  -
        // this = o  0
        // this > o  +
        
        if(this.pret < o.pret) return -1;
        if(this.pret > o.pret) return 1;
        return 0;
    }
    
    
}
