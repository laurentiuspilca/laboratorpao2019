/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author Student
 */
public class Exemplu1 {
    
    
    public static void main(String[] args) {
        List<Automobil> list = new ArrayList<>();
        list.add(new Automobil("A", "Q", 500, 1500));
        list.add(new Automobil("D", "QWERRTY", 800, 10000));
        list.add(new Automobil("T", "T", 2500, 12000));
        
        Comparator<Automobil> c = (a1,a2) -> {
            if (a1.getPret() < a2.getPret()) return 1;
            if (a2.getPret() < a1.getPret()) return -1;
            return 0;
        };
        
        List<Automobil> res1 = 
            list.stream()
                    .filter(a -> a.getPret() >= 5000)
                    .sorted(c)
                    .collect(Collectors.toList());
        
        System.out.println(res1);
        
        List<String> res2 = 
            list.stream()
                    .map(a -> a.getMarca())
                    .distinct()
                    .collect(Collectors.toList());
        
        System.out.println(res2);
        
        List<Automobil> res3 = 
            list.stream()
                    .filter(a -> a.getCapacitate() >= 2000)
                    .filter(a -> a.getCapacitate() < 3000)
                    .collect(Collectors.toList());
        
        Map<String, List<Automobil>> res4 =
            list.stream()
                    .collect(Collectors.groupingBy(a -> a.getMarca()));
        
        Map<String, List<String>> map = new HashMap<>();
        res4.forEach((a, b) -> map.put(a, 
                b.stream()
                    .map(x -> x.getModel())
                    .collect(Collectors.toList())));
    }
    
    static class Automobil {
        private String marca;
        private String model;
        private int capacitate;
        private double pret;

        public Automobil(String marca, String model, int capacitate, double pret) {
            this.marca = marca;
            this.model = model;
            this.capacitate = capacitate;
            this.pret = pret;
        }
        
        

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public int getCapacitate() {
            return capacitate;
        }

        public void setCapacitate(int capacitate) {
            this.capacitate = capacitate;
        }

        public double getPret() {
            return pret;
        }

        public void setPret(double pret) {
            this.pret = pret;
        }
        
        
    }
}
