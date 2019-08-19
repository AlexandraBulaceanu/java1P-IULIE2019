/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author student
 */
public class Frame2 extends JFrame{
    private JButton b1;
    private int x;
    public Frame2(){
        this.setLayout(new FlowLayout());
        b1 = new JButton("0");
        this.add(b1);
        b1.addActionListener(ev->increment());
        this.setSize(300,300);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    private void increment(){
        x++;
        b1.setText(String.valueOf(x));
    }
}
