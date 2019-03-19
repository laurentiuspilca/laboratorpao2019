/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplu3;

/**
 *
 * @author Student
 */
public class Exemplu3 {
    
    public static void main(String [] args) {
        StringBuilder x = new StringBuilder("HELLO");
        
        for (int i=0 ;i<100; i++) {
            x.append("WORLD");
        }
        
        System.out.println(x);
    }
}
