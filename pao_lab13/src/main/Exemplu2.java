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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 *
 * @author Student
 */
public class Exemplu2 {
    
    
    public static void main(String[] args) {
        List<String> fisiere = Arrays.asList("exemplu1.txt", "exemplu2.txt", "exemplu3.txt");
        Scanner s = new Scanner(System.in);
        String cuvant = s.nextLine();
        
        List<WordReader> workers = new ArrayList<>();
        fisiere.forEach(f -> {
            WordReader w = new WordReader(f, cuvant);
            w.execute();
            workers.add(w);
        });
        
        while(true) {
            if (workers.stream().allMatch(w -> w.getResult() >= 0)) {
                break;
            }
        }
        
        long result = workers.stream().mapToLong(w -> w.getResult()).sum();
        
        System.out.println(result);
    }
    
    static class WordReader implements Runnable {
        
        private String file;
        private String cuvant;
        private long result = -1;
        
        public WordReader(String file, String cuvant) {
            this.file = file;
            this.cuvant = cuvant;
        }
        
        private long countWord(String word) throws IOException {
            Path p = Paths.get(file);
            return Files.lines(p)
                    .flatMap(x -> Arrays.stream(x.split("\\s+")))
                    .filter(cuv -> word.equals(cuv))
                    .count();
        }
        
        public void execute() {
            new Thread(this).start();
        }
        
        public long getResult() {
            return this.result;
        }

        @Override
        public void run() {
            try {
                result = countWord(file);
            } catch (IOException ex) {
                result = 0;
                throw  new RuntimeException();
            }
        }
        
    }
    
    class WordReader2 {
        private String file;
        
        public WordReader2(String file) {
            this.file = file;
        }
        
        private Future<Long> countWord(String word) throws IOException {
            Path p = Paths.get(file);
            Callable<Long> c = () -> Files.lines(p)
                    .flatMap(x -> Arrays.stream(x.split("\\s+[?][.][,]")))
                    .filter(cuv -> word.equals(cuv))
                    .count();
            
            ExecutorService service = null;
            try {
                service = Executors.newSingleThreadExecutor();
                return service.submit(c);
            } finally {
                if (service != null) {
                    service.shutdown();
                } 
            }
        }
    }
}
