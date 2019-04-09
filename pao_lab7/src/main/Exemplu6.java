/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

/**
 *
 * @author Student
 */
public class Exemplu6 {
    
    public static void main(String [] args) {
        System.out.println(":)"); // PrintStream
        
        try (PrintStream out = new PrintStream("E:\\output.txt")) {
            out.println("BAU!");
        } catch (FileNotFoundException e) {
            System.out.println(":(");
        } catch (IOException e) {
            System.out.println(":(");
        }
    }
}
