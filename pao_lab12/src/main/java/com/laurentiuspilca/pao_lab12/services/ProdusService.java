/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laurentiuspilca.pao_lab12.services;

import com.laurentiuspilca.pao_lab12.model.Produs;
import com.laurentiuspilca.pao_lab12.repositories.ProdusRepository;
import java.util.List;

/**
 *
 * @author Student
 */
public class ProdusService {
    
    private ProdusRepository produseRepository;

    public ProdusService() {
        produseRepository = new ProdusRepository();
    }
    
    public void adaugaProdus(String nume, double pret) {
        Produs p = new Produs();
        p.setNume(nume);
        p.setPret(pret);
        produseRepository.adaugaProdus(p);
    }
    
    public List<Produs> getProduse() {
        return produseRepository.findProduse();
    }
    
    public void delete(Produs p) {
        produseRepository.stergeProdus(p);
    }
    
}
