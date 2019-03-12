/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplu6;

import java.util.Arrays;

/**
 *
 * @author Student
 */
public class RevolutCard {
    
    private String number;
    
    public RevolutCard(String number) {
        this.number = number;
    }
    
    @Override
    public String toString() {
        return "Card " + number;
    }
    
    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        
        if (o instanceof RevolutCard) {
            RevolutCard c = (RevolutCard) o;
            return c.number.equals(this.number);
        }
        
        return false;
    }
    
    @Override
    public int hashCode() {
        return Arrays.asList(this.number.split(""))
                .stream()
                .mapToInt(Integer::parseInt) // x -> Integer.parseInt(x)
                .sum();
    }
}
