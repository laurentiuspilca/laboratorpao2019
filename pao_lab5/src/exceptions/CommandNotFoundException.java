/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author Student
 */
public class CommandNotFoundException extends RuntimeException {
    
    public CommandNotFoundException() {
        super("There is no such command");
    }
}
