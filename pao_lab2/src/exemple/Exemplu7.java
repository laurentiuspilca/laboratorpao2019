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
public class Exemplu7 {
    
    
    public static void main(String[] args) {
        String [] x = {"C", "ABC", "D", "ERT"};
        
        Arrays.sort(x);
        
        for (String s: x) {
            System.out.println(s);
        }
    }
}
