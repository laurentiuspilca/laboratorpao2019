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
public class DebitCard extends Card {
    
    protected String amount;
    
    @Override
    public void withdraw(double amount) {
        if (super.amount >= amount) {
            super.amount += amount;
        } else {
            throw new RuntimeException("Not enough money!");
        }
    }
    
    public void withdraw() {
        
    }
    
    public void withdraw(String x, int y) {
        
    }
    
    public void withdraw(int x, String y) {
        
    }
}
