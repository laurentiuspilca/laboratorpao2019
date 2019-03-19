/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplu1;

/**
 *
 * @author Student
 */
public class Exemplu1 {
    
    public static void main(String [] args) {
        Matematician m = new Matematician();
        
        Cerc c = new Cerc(10);
        double arie = m.calculeazaAria(c);
        
        System.out.println(arie);
    }
}
