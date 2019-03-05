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
public class Card {
    
    private String number;
    private CardType cardType;

    public Card(String number, CardType cardType) {
        this.number = number;
        this.cardType = cardType;
    }
    
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    @Override
    public String toString() {
        return "Card{" + "number=" + number + ", cardType=" + cardType + '}';
    }
    
    
    
}
