/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author student
 */
public class Frame3 extends JFrame{
    private JButton b1,b2,b3,b4,b5;
    public Frame3(){
        setTitle("Frame");
        //setLayout(new FlowLayout(FlowLayout.LEFT));
        b1 = new JButton("b1");
        b2 = new JButton("b2");
        b3 = new JButton("b3");
        b4 = new JButton("b4");
        b5 = new JButton("b5");
        
        add(b1,BorderLayout.SOUTH);
        add(b2,BorderLayout.EAST);
        add(b3,BorderLayout.NORTH);
        add(b4,BorderLayout.WEST);
        add(b5,BorderLayout.CENTER);
        
        setSize(400,400);
        setLocationRelativeTo(null);
        setResizable(false);
        
    }
}
