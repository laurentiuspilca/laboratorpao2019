/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Student
 */
public class Exemplu9 {
    
    public static void main(String [] args) {
        Map<Integer, String> m = new HashMap<>();
        
        m.put(10, "ABC");
        m.put(20, "ABC");
        m.put(10, "DEF");
        m.put(40, "ABC");
        
//        Set<Integer> keys = m.keySet();
//        for (Integer k : keys) {
//            System.out.println(k + " " + m.get(k));
//        }
        
        m.forEach((k, v) -> System.out.println(k + " " + v));
    }
}
