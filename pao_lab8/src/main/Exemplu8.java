/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Student
 */
public class Exemplu8 {
    
    public static void main(String [] args) {
        Comparator<Cat> q1 = (a,b) -> a.getAge() - b.getAge();
        Comparator<Cat> q2 = (a,b) -> a.getName().compareTo(b.getName());
        
        Set<Cat> set = new TreeSet<>(q2);
        
        set.add(new Cat("Kitty", 1));
        set.add(new Cat("Leo", 4));
        set.add(new Cat("Tom", 2));
        set.add(new Cat("Mitzy", 3));
        
        set.forEach(c -> System.out.println(c.getName() + " " + c.getAge()));
    }
}
