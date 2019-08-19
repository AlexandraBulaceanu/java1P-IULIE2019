/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author student
 */
public class Frame5 extends JFrame {
    private JButton []v = new JButton[12];
    public Frame5(){
        setLayout(new GridLayout(4,3));
        for(int i=0;i<v.length;i++){
            v[i]=new JButton(String.valueOf(i+1));
            add(v[i]);
        }
        setSize(400,400);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
