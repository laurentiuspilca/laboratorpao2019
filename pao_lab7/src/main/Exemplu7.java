/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Student
 */
public class Exemplu7 {
    
    public static void main(String [] args) {
        Path p = Paths.get("E:\\output.txt");
        try (BufferedWriter out = Files.newBufferedWriter(p)) {
            out.write("Bau!");
        } catch (IOException e) {
            System.out.println(":(");
        }
    }
}
