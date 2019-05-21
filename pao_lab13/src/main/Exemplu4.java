/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Student
 */
public class Exemplu4 {
    
    public static void main(String[] args) {
        T t = new T();
        t.start();
    }
}

class T extends Thread {
    
    @Override
    public void run() {
        System.out.println("A");
        // bla bla ce vreti voi sa fie pe thread
    }
}
