/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 *
 * @author Student
 */
public class Exemplu7 {
    
    public static void main(String [] args) {
        TreeSet<Integer> set = new TreeSet<>();
        
        set.add(80);
        set.add(20);
        set.add(30);
        set.add(50);
        set.add(10);
        
        set.forEach(System.out::println);
    }
}
