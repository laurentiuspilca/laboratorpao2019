/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Student
 */
public class Exemplu11 {
    
    public static void main(String [] args) {
        List<Cat> list = new ArrayList<>();
        list.add(new Cat());
        list.add(new Cat());
        list.add(new Cat());
        
        try (FileOutputStream fos = new FileOutputStream("E:\\manycats");
             ObjectOutputStream out = new ObjectOutputStream(fos)){
             out.writeObject(list);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
