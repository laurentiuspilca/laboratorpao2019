/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplu5;

/**
 *
 * @author Student
 * 
 * LAUR.SPILCA@GMAIL.COM
 * LAURENTIU.SPILCA@ENDAVA.COM
 * 
 * C -> C  extends
 * I -> I  extends
 * 
 * C -> I implements
 */
public class Exemplu5 {
    
    public static void main(String [] args) {
        StringBuilder sb = new StringBuilder("HELLO");
        
        sb.append("WORLD"); // HELLOWORLD
        sb.reverse(); // DLROWOLLEH
        sb.delete(1, 3); // DOWOLLEH
        sb.insert(1, "AAA"); // DAAAWOLLEH
        sb.replace(1, 4, "BBB"); // DBBBWOLLEH
    }
}
