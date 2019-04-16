/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.LinkedList;

/**
 *
 * @author Student
 */
public class Exemplu3 {
    
    
    public static void main(String [] args) {
        LinkedList<Integer> list = new LinkedList<>();
        
        list.addFirst(10);
        list.addFirst(20);
        list.removeLast();
        list.addLast(30);
        list.addFirst(90);
        list.removeFirst();
        list.addFirst(40);
        list.removeFirst();
        
        list.forEach(System.out::println);
    }
}
