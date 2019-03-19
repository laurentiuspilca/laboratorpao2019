/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.service;

import java.util.List;
import main.model.Product;

/**
 *
 * @author Student
 */
public class ProductService {
    
    public double calculateTotalPrice(List<Product> p) {
        return p.stream().mapToDouble(x -> x.getPrice()).sum();
    }
    
    // cate alte metode vrei care impl alg
}
