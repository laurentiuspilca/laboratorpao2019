/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Student
 */
public class Exemplu2 {
    
    public static void main(String [] args) {
        List<Integer> list = new ArrayList<>();
        
        list.add(1);
        list.add(2);
        list.add(1); // X
        list.add(4);
        list.add(1);
        list.add(5);
        
        //list.remove(2);
        list.remove(new Integer(2));
        
        System.out.println(list);
        
        Collections.sort(list, (a,b) -> b - a);
        
        System.out.println(list);
    }
}
