/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicatie;

import aplicatie.exceptions.NotEnoughMoneyException;
import java.util.UUID;

/**
 *
 * @author Student
 */
public class Account {
    
    private int i;
    
    private String id;
    private Owner owner;
    private double amount;
    private Card [] cards;

    public Account() {
        this.id = UUID.randomUUID().toString();
        this.cards = new Card[10];
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void addCard(Card c) {
        this.cards[i] = c;
        i++;
    }
    
    public void displayCards() {
        for (int j=0; j<i ; j++) {
            System.out.println(this.cards[j]);
        }
    }
    
    public void deposit(double amount) {
        this.amount += amount;
    }
    
    public void withdraw(double amount) {
        if (this.amount >= amount) {
            this.amount -= amount;
        } else {
            throw new NotEnoughMoneyException();
        }
    }
}
