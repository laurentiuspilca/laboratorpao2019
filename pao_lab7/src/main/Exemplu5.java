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
public class Exemplu5 {
    
    public static void main(String [] args) {
        Path p = Paths.get("E:\\hello.txt");
        try {
            Files.lines(p)
                 .flatMap(line -> Arrays.stream(line.split("\\s+")))
                 .filter(cuv -> cuv.length() % 2 == 0)
                 .map(cuv -> new StringBuilder(cuv).reverse())
                 .forEach(System.out::println);
        } catch (IOException e) {
            System.out.println(":(");
        }
    }
}
