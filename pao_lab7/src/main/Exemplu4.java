/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Student
 */
public class Exemplu4 {
    
    public static void main(String [] args) {
        Path p = Paths.get("E:\\hello.txt");
        try {
            Files.lines(p).forEach(System.out::println);
        } catch (IOException e) {
            System.out.println(":(");
        }
    }
}
