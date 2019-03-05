/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

/**
 *
 * @author Student
 */
public class Exemplu1 {
    
    public static void main(String [] args) {
        int [] x;
        
        x = new int[10];
        
        x[0] = 10;
        x[1] = 20;
        x[5] = 40;
        
        for (int i=0; i<x.length; i++) {
            System.out.println(x[i]);
        }
    }
}
