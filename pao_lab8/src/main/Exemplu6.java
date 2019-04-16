/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/**
 *
 * @author Student
 */
public class Exemplu6 {
    
    public static void main(String [] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        
        set.add(10);
        set.add(20);
        set.add(10);
        set.add(50);
        set.add(10);
        
        set.forEach(System.out::println);
    }
}
