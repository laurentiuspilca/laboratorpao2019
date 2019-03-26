/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Student
 */
public abstract class Pizza {
    
    protected Blat blat;
    protected List<Ingredient> ingrediente;
    protected final int maxIngrediente;
    
    public Pizza(int maxIngrediente) {
        this.maxIngrediente = maxIngrediente;
    }
    
    public void sortareIngredienteDupaPret() {
        Collections.sort(ingrediente);
    }
    
    public void sortareIngredienteDupaNume() {
        Comparator<Ingredient> c = 
                (i1,i2) -> i1.getNume().compareTo(i2.getNume());
        Collections.sort(ingrediente, c);
    }
}
