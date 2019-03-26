/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Student
 */
public class Comanda {
    private String nume;
    private List<Pizza> pizzas = new ArrayList<>();
    
    public Comanda(String nume) {
        this.nume = nume;
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
    
    public void adaugaPizza(Pizza p) {
        pizzas.add(p);
    }
}
