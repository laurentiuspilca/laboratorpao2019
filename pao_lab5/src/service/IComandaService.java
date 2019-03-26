/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import model.Pizza;

/**
 *
 * @author Student
 */
public interface IComandaService {
    
    public void creazaComanda(String nume);
    public void adaugaPizza(String comanda, Pizza p);
    public List<Pizza> getPizza(String comanda);
}
