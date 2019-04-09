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
public class Exemplu9 {
    
    public static void main(String [] args) {
        Cat c1 = new Cat();
        c1.setName("Tom");
        c1.setAge(2);
        
        try (
           FileOutputStream fos = new FileOutputStream("E:\\cat");
           ObjectOutputStream out = new ObjectOutputStream(fos)) {
           
           out.writeObject(c1);
           System.out.println("The cat was written in the file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
