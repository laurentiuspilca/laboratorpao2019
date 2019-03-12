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
public class Card {
    
    protected double amount;
    
    public void deposit(double amount) {
        this.amount += amount;
    } 
    
    protected void withdraw(double amount) {
        this.amount -= amount;
    }
}
