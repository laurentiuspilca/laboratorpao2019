/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Student
 */
public class Exemplu1 {
    
    public static void main(String [] args) {
        List<Integer> list = new ArrayList<>();
        
        list.add(10); // 0
        list.add(20); // 1
        list.add(30); // 2
        list.add(1, 40); //
        
        //System.out.println(list); // [10, 40, 20 ,30]
        
        for (int i=0; i<list.size(); i++) {
            int x = list.get(i);
            System.out.println(x);
        }
        
        for (Integer x : list) {
            System.out.println(x);
        }
        
        list.forEach(x -> System.out.println(x)); 
    }
}
