/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplu6;

/**
 *
 * @author Student
 */
public class Main {
    
    public static void main(String [] args) {
        RevolutCard c1 = new RevolutCard("12345");
        RevolutCard c2 = new RevolutCard("12345");
        
        System.out.println(c1);
        System.out.println(c1 == c2);
        System.out.println(c1.equals(c2));
        
        
        String x = "HELLO";
        String y = "HELLO";
        System.out.println(x.equals(y));
    }
}
