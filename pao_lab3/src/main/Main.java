/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import exemplu1.Bicycle;
import exemplu1.Cart;
import exemplu1.Tricycle;
import exemplu1.Wheel;

/**
 * 
 * @author Student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Bicycle b = new Cart();
        
        b.setFront(new Wheel());
        b.setBack(new Wheel());
        
        Tricycle t = (Tricycle) b;
        
        System.out.println(":)");
    }
    
}
