/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laurentiuspilca.pao_lab12.repositories;

import com.laurentiuspilca.pao_lab12.model.Produs;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Student
 */
public class ProdusRepository {
    
    private String url = "jdbc:mysql://localhost/lab12";
    private String username = "user1";
    private String password = "12345";
    
    public void adaugaProdus(Produs p) {
        String  sql = "INSERT INTO produse VALUES (NULL, ?, ?)";
        try (
         Connection con = DriverManager.getConnection(url, username, password);
         PreparedStatement s = con.prepareStatement(sql);
        ) {
            s.setString(1, p.getNume());
            s.setDouble(2, p.getPret());
            s.executeUpdate(); // INSERT, UPDATE, DELETE
        } catch (Exception e) { // SQLException
            e.printStackTrace();
        }
    }
    
    public List<Produs> findProduse() {
        List<Produs> list = new ArrayList<>();
        
        String sql = "SELECT * FROM produse";
        
        try (
         Connection con = DriverManager.getConnection(url, username, password);
         PreparedStatement s = con.prepareStatement(sql);
         ResultSet rs = s.executeQuery();
        ) {
            while (rs.next()) {
                int id = rs.getInt("id");
                String nume = rs.getString("nume");
                double pret = rs.getDouble("pret");
                
                list.add(new Produs(id, nume, pret));
            }
        } catch (Exception e) { // SQLException
            e.printStackTrace();
        }
        
        return list;
    }
    
    public void stergeProdus(Produs p) {
        String sql = "DELETE FROM produse WHERE id = ?";
        
        try (
         Connection con = DriverManager.getConnection(url, username, password);
         PreparedStatement s = con.prepareStatement(sql);
        ) {
            s.setInt(1, p.getId());
            s.executeUpdate(); 
        } catch (Exception e) { // SQLException
            e.printStackTrace();
        }
    } 
}
