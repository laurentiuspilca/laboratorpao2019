/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Student
 */
public class Graf1 {
    
    public static void main(String [] args) {
        Map<String, List<String>> g = new HashMap<>();
        
        g.put("A", new ArrayList<>());
        g.put("B", new ArrayList<>());
        g.put("C", new ArrayList<>());
        g.put("D", new ArrayList<>());
        g.put("E", new ArrayList<>());
        
        g.get("A").add("B");
        g.get("A").add("C");
        
        g.get("B").add("C");
        g.get("B").add("E");
        
        //....
    }
}
