/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author Student
 */
public class Exemplu4 {
    
    
    public static void main(String [] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        
        deque.push(10); // adauga la inceput
        deque.offer(50); // adauga la final
        int x1 = deque.peek(); // returneaza prima valoare fara sa o elimine
        int x2 = deque.pop(); // returneaza si elimina prima valoare
        
        System.out.println(x1);
        System.out.println(x2);
    }
}
