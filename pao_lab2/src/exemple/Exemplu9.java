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
public class Exemplu9 {
    
    public static void main(String[] args) {
        int [] x = {3,7,2,6,8,9,0,3};
        
        Arrays.sort(x);
        
        for (int i=0; i<x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
        
        int i = Arrays.binarySearch(x, 2);
        System.out.println(i);
    }
}
