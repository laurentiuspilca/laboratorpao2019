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
public class Patrat extends Forma {
    private double latura;
    
    public Patrat(double latura) {
        this.latura = latura;
    }
    
    public double arie() {
        return latura * latura;
    }
}
