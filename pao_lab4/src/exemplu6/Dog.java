/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplu6;

/**
 *
 * @author Student
 */
public class Dog {
    private static Dog dog;
    
    String name;
    
    private Dog() {}
    
    public static Dog getInstance() {
        if (dog == null) {
            dog = new Dog();
        }
        return dog;
    }
}
