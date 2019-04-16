/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Student
 */
public class Exemplu5 {
 
    public static void main(String [] args) {
        Set<Integer> s1 = new HashSet<>();
        //NavigableSet<Integer> s2 = new TreeSet<>();
        //SortedSet<Integer> s3 = new TreeSet<>();
        
        s1.add(10);
        s1.add(50);
        s1.add(10);
        s1.add(70);
        s1.add(10);
        
        System.out.println(s1);
        
        s1.forEach(System.out::println);
    }
}
