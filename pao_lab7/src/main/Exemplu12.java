/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author Student
 */
public class Exemplu12 {
    
    public static void main(String [] args) {
        A a = new A();
        B b = new B();
        
        a.b = b;
        b.a = a;
        
        try (
           FileOutputStream fos = new FileOutputStream("E:\\cat");
           ObjectOutputStream out = new ObjectOutputStream(fos)) {
           
           out.writeObject(a);
           System.out.println("The a was written in the file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
