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
public class Exemplu3 {
    
    public static void main(String[] args) {
        int [] x = new int[]{1,2,3,4,5,6,7};
        
        Arrays.stream(x)
                .filter(i -> i % 2 == 0)
                .forEach(i -> System.out.println(i));
        //m(new int[]{1,2,3,4,5,6,7});
    }
    
    public static void m(int [] x) {
        
    }
}
