/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laurentiuspilca.pao_lab12.model;

/**
 *
 * @author Student
 */
public class Produs {
    
    private int id;
    private String nume;
    private double pret;

    public Produs() {
    }

    public Produs(int id, String nume, double pret) {
        this.id = id;
        this.nume = nume;
        this.pret = pret;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "Produs{" + "id=" + id + ", nume=" + nume + ", pret=" + pret + '}';
    }
    
    
}
