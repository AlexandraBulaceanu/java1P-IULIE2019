/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author student
 */
public class Frame4 extends JFrame{
    private JPanel p1;
    private JPanel p2;
    private JButton b1,b2,b3;
    
    public Frame4(){
    p1 = new JPanel();
    p2 = new JPanel();
    b1 = new JButton("RED");
    b2 = new JButton("BLUE");
    b3 = new JButton("GREEN");
    p1.add(b1);
    p1.add(b2);
    p1.add(b3);
    add(p1,BorderLayout.SOUTH);
    add(p2);
    setSize(500,500);
    setLocationRelativeTo(null);
    setVisible(true);
    b1.addActionListener(ev->coloreazaCuRosu());
    b2.addActionListener(ev->coloreazaCuAlbastru());
    b3.addActionListener(ev->coloreazaCuVerde());
}
    private void coloreazaCuRosu(){
        p2.setBackground(Color.RED);
    }
    private void coloreazaCuAlbastru(){
        p2.setBackground(Color.BLUE);
    }
    private void coloreazaCuVerde(){
        p2.setBackground(Color.GREEN);
    }
    
}
