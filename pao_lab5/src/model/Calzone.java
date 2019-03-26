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
public class Calzone extends Pizza {
    private static final int MAX_INGREDIENTE = 10;
    
    public Calzone() {
        super(MAX_INGREDIENTE);
    }
}
