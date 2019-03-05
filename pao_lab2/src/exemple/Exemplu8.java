/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import java.util.Arrays;

/**
 *
 * @author Student
 */
public class Exemplu8 {
    
    public static void main(String[] args) {
        Cat c[] = new Cat[4];
        
        c[0] = new Cat("Tom", 3);
        c[1] = new Cat("Leo", 1);
        c[2] = new Cat("Mitzy", 2);
        c[3] = new Cat("Kitty", 4);
        
        Arrays.sort(c);
        
        for (Cat x : c) {
            System.out.println(x);
        }
    }
}
