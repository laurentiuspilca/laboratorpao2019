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
public class Exemplu4 {
    
    public static void main(String[] args) {
        int [] m[]  = new int[4][];
        
        m[0] = new int[3];
        m[0][0] = 5;
        
        for (int [] x : m) {
            System.out.println(x);
        }
    }
}
