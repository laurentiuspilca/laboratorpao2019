/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import model.Comanda;
import model.Pizza;
import repository.IComandaRepository;

/**
 *
 * @author Student
 */
public class ComandaService implements IComandaService {
    
    private final IComandaRepository comandaRepository;
    
    public ComandaService(IComandaRepository comandaRepository) {
        this.comandaRepository = comandaRepository;
    }

    @Override
    public void creazaComanda(String nume) {
        Comanda c = new Comanda(nume);
        comandaRepository.adaugaComanda(c);
    }

    @Override
    public void adaugaPizza(String comanda, Pizza p) {
        Comanda c = comandaRepository.cautaComandaDupaNume(comanda);
        c.adaugaPizza(p);
    }

    @Override
    public List<Pizza> getPizza(String comanda) {
        Comanda c = comandaRepository.cautaComandaDupaNume(comanda);
        return c.getPizzas();
    }
    
}
