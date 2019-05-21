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
public class Exemplu3 {
    
    
    public static void main(String[] args) {
        Thread t1 = new Thread(new R());
        t1.start();
        Thread t2 = new Thread(new R());
        t2.start();
        Thread t3 = new Thread(new R());
        t3.start();
    }
    
    static class R implements Runnable {

        @Override
        public void run() {
            try {
                for (int i=0; i<=10; i++) {
                    System.out.println(i);
                    Thread.sleep(1000); // 1 seconds
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
    }
}
