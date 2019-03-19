/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplu4;

/**
 *
 * @author Student
 */
public class Exemplu4 {
    
    public static void main(String [] args) {
        String x = "HELLOWORLD";
        
        int q1 = x.length();
        char q2 = x.charAt(1); // E
        boolean q3 = x.equals("helloworld"); // false
        boolean q4 = x.equalsIgnoreCase("helloworld"); // true
        int q5 = "A".compareTo("a"); // -
        int q6 = "A".compareToIgnoreCase("a"); // 0
        boolean q7 = x.contains("WORLD"); // true
        int q8 = x.indexOf("WORLD"); // 5
        boolean q9 = x.endsWith("WORLD");
        boolean q10 = x.startsWith("HELLO");
        
        String [] res = "ala,bala,portocala".split(",");
        // ["ala", "bala", "portocala"]
        
        String q11 = x.substring(1, 4); // ELL
        String q12 = "       ABC DEF     ".trim(); // "ABC DEF"
        
    }
}
