/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author Student
 */
public class Exemplu10 {
    
    public static void main(String [] args) {
        try (
             FileInputStream fis = new FileInputStream("E:\\cat");
             ObjectInputStream in = new ObjectInputStream(fis)
             ) {
            
            Cat c = (Cat) in.readObject();
            System.out.println(c.getName() + " " + c.getAge());
            
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
