/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

/**
 *
 * @author Student
 */
public class Exemplu8 {
    
    public static void main(String [] args) {
        
        try {
            Path p = Paths.get("E:\\input.csv");
            
            int sum =
                Files.lines(p)
                     .flatMap(line -> Arrays.stream(line.split(",")))
                     .mapToInt(Integer::parseInt)
                     .sum();
            
            System.out.println(sum);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
