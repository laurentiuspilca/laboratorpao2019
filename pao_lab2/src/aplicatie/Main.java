/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicatie;

/**
 *
 * @author Student
 */
public class Main {
    
    public static void main(String[] args) {
        Owner o1 = new Owner("John", "Doe");
        
        Account a1 = new Account();
        a1.setOwner(o1);
        a1.setAmount(1000);
        
        Card c1 = new Card("123-123", CardType.MASTERCARD);
        Card c2 = new Card("789-456", CardType.VISA);
        
        a1.addCard(c1);
        a1.addCard(c2);
        
        a1.displayCards();
    }
}
