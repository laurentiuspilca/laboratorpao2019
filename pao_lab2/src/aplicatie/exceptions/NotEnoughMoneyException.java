/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicatie.exceptions;

/**
 *
 * @author Student
 */
public class NotEnoughMoneyException extends RuntimeException{
    
    public NotEnoughMoneyException() {
        super("There is not enough money in the account!");
    }
}
