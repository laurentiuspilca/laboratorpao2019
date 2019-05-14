/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laurentiuspilca.pao_lab12.gui;

import com.laurentiuspilca.pao_lab12.model.Produs;
import com.laurentiuspilca.pao_lab12.services.ProdusService;
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Student
 */
public class ProdusFrame extends JFrame {
    
    private ProdusService produsService = new ProdusService();
    
    private JPanel p1 = new JPanel(new BorderLayout());
    private JPanel p2 = new JPanel(/*new FlowLayout(FlowLayout.LEFT)*/);
    
    private JLabel e1 = new JLabel("NUME:");
    private JLabel e2 = new JLabel("PRET:");
    private JTextField t1 = new JTextField(10);
    private JTextField t2 = new JTextField(10);
    private JButton b1 = new JButton("ADAUGA");
    
    private DefaultListModel<Produs> model = new DefaultListModel<>();
    private JList<Produs> list = new JList<>(model);
    
    public ProdusFrame() {
        super("PRODUSE"); // TITLU
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600,600); 
        setLocationRelativeTo(null); // ALINIERE CENTRATA
        
        add(p1); // PE CENTRU
        add(p2, BorderLayout.SOUTH); // JOS
        
        p2.add(e1);
        p2.add(t1);
        p2.add(e2);
        p2.add(t2);
        p2.add(b1);
        b1.addActionListener(ev -> adaugaProdus());
        
        p1.add(list);
        
        list.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    Produs p = list.getSelectedValue();
                    if (p != null) {
                        deleteProdus(p);
                    }
                }
            }
            
        });
        afisareProduse();
        
        setVisible(true);
    }
    
    private void adaugaProdus() {
        String nume = t1.getText();
        double pret = Double.parseDouble(t2.getText());
        produsService.adaugaProdus(nume, pret);
        t1.setText(null);
        t2.setText(null);
        afisareProduse();
        JOptionPane.showMessageDialog(this, "Ai adaugat un produs!");
    }
    
    private void afisareProduse() {
        model.clear();
        List<Produs> produse = produsService.getProduse();
        produse.forEach(p -> model.addElement(p));
    }
    
    private void deleteProdus(Produs p) {
        produsService.delete(p);
        afisareProduse();
    }
}
