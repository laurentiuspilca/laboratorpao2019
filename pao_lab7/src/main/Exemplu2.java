/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 *
 * @author Student
 */
public class Exemplu2 {
    
    public static void main(String [] args) {
        
        try (InputStream in = new FileInputStream("E:\\hello.txt");
            Reader reader = new InputStreamReader(in); // FileReader
            BufferedReader br = new BufferedReader(reader)) {

            String line = br.readLine();
            
            System.out.println(line);
        } catch (IOException e) {
            System.out.println(":(");
        }
    }
}
