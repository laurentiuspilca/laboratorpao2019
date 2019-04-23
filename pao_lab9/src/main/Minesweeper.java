/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Student
 */
public class Minesweeper extends JFrame {
    
    private JButton s = new JButton();
    private JPanel p1 = new JPanel();
    private JPanel p2 = new JPanel(new GridLayout(10, 10));
    private JButton [][] b = new JButton[10][10];
    
    private int [][] m = new int[12][12];
    
    private Icon mineIcon = new ImageIcon("C:\\Users\\Student\\Documents\\NetBeansProjects\\pao_lab9\\src\\main\\m.png");
    private Icon flagIcon = new ImageIcon("C:\\Users\\Student\\Documents\\NetBeansProjects\\pao_lab9\\src\\main\\f.png");
    
    public Minesweeper() {
        setTitle("Minesweeper");
        
        add(p1, BorderLayout.NORTH);
        p1.add(s);
        s.addActionListener(ev -> newGame());
        
        s.setIcon(new ImageIcon("C:\\Users\\Student\\Documents\\NetBeansProjects\\pao_lab9\\src\\main\\s.png"));
        
        add(p2);
        
        generateMines();
        countNearMines();
        createAndAddButtons();
        
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,500);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    private void createAndAddButtons() {
        for (int i=0; i<b.length; i++) {
            for (int j=0; j<b[i].length; j++) {
                b[i][j] = new JButton();
                p2.add(b[i][j]);
                b[i][j].addActionListener(ev -> buttonPressed(ev));
                b[i][j].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent ev) {
                        if (ev.getButton() == MouseEvent.BUTTON3) {
                            flagAction(ev);
                        }
                    }
                });
                // this::buttonPressed
            }
        }
    }
    
    private void generateMines() {
        Random r = new Random();
        
        for (int i=0; i<20; i++) {
            int x = r.nextInt(10) + 1;
            int y = r.nextInt(10) + 1;
            
            if (m[x][y] != -1) {
                m[x][y] = -1;
            } else {
                i--;
            }
        }
    }
    
    private void countNearMines() {
        for (int i=1;i<m.length-1;i++) {
            for (int j=1; j<m[i].length-1; j++) {
                if (m[i][j] != -1) {
                    if (m[i-1][j-1] == -1) m[i][j]++;
                    if (m[i-1][j] == -1) m[i][j]++;
                    if (m[i-1][j+1] == -1) m[i][j]++;
                    if (m[i][j-1] == -1) m[i][j]++;
                    if (m[i][j+1] == -1) m[i][j]++;
                    if (m[i+1][j-1] == -1) m[i][j]++;
                    if (m[i+1][j] == -1) m[i][j]++;
                    if (m[i+1][j+1] == -1) m[i][j]++;
                }
            }
        }
    }
    
    private void buttonPressed(ActionEvent ev) {
        JButton x = (JButton) ev.getSource();
        for (int i=0;i<b.length;i++) {
            for (int j=0; j<b[i].length; j++) {
                if (x == b[i][j]) {
                    if (m[i+1][j+1] == -1) {
                        gameOver();
                    } else {
                        //if (m[i+1][j+1] == 0) {
                        //    deactivateAround(i, j);
                        //} else {
                            b[i][j].setText(m[i+1][j+1] + "");
                            b[i][j].setEnabled(false);
                        //}
                    }
                    
                    return;
                }
            }
        }
    }
    
    private void flagAction(MouseEvent ev) {
        JButton x = (JButton) ev.getSource();
        for (int i=0;i<b.length;i++) {
            for (int j=0; j<b[i].length; j++) {
                if (x == b[i][j]) {
                    if (b[i][j].getIcon() == null) {
                        b[i][j].setIcon(flagIcon);
                    } else {
                        b[i][j].setIcon(null);
                    }
                }
            }
        }
    }
        
    private void gameOver() {
        for (int i = 0; i< b.length; i++) {
            for (int j = 0; j<b[i].length; j++) {
                b[i][j].setEnabled(false);
                if (m[i+1][j+1] == -1) {
                    b[i][j].setIcon(mineIcon);
                }
            }
        }
        JOptionPane.showMessageDialog(this, "GAME OVER!");
    }
    
    private void newGame() {
        for (int i = 0; i<m.length; i++) {
            for (int j = 0; j<m[i].length; j++) {
                m[i][j] = 0;
            }
        }
        generateMines();
        countNearMines();
        for (int i = 0; i<b.length; i++) {
            for (int j = 0; j<b[i].length; j++) {
                b[i][j].setText(null);
                b[i][j].setIcon(null);
                b[i][j].setEnabled(true);
            }
        }
    }
    
    private void deactivateAround(int i, int j) {
        if(!b[i][j].isEnabled()) return;
                
        b[i][j].setEnabled(false);
        
        b[i-1][j-1].setEnabled(false);
        if (m[i][j] == 0) 
            deactivateAround(i-1, j-1);
        else 
            b[i-1][j-1].setText(m[i][j] + "");
        
        b[i-1][j].setEnabled(false);
        if (m[i][j+1] == 0) 
            deactivateAround(i-1, j);
        else
            b[i-1][j].setText(m[i][j+1] + "");
        
        b[i-1][j+1].setEnabled(false);
        if (m[i][j+2] == 0) 
            deactivateAround(i-1, j+1);
        else 
            b[i-1][j+1].setText(m[i][j+2] + "");
        
        b[i][j-1].setEnabled(false);
        if (m[i+1][j] == 0) 
            deactivateAround(i, j-1);
        else
            b[i][j-1].setText(m[i+1][j] + "");
        
        b[i][j+1].setEnabled(false);
        if (m[i+1][j+2] == 0) 
            deactivateAround(i, j+1);
        else
            b[i][j+1].setText(m[i+1][j+2] + "");
        
        b[i+1][j-1].setEnabled(false);
        if (m[i+2][j] == 0) 
            deactivateAround(i+1, j-1);
        else
            b[i+1][j-1].setText(m[i+2][j] + "");
        
        b[i+1][j].setEnabled(false);
        if (m[i+2][j+1] == 0) 
            deactivateAround(i+1, j);
        else
            b[i+1][j].setText(m[i+2][j+1] + "");
        
        b[i+1][j+1].setEnabled(false);
        if (m[i+2][j+2] == 0) 
            deactivateAround(i+1, j+1);
        else
            b[i+1][j+1].setText(m[i+2][j+2] + "");
    }
}
