/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javafx.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author student
 */
public class Frame1 extends JFrame{
    private JButton buton1;
    public Frame1(){
        super("Main Frame");
        buton1 = new JButton("Apasa!");
        this.add(buton1);
        buton1.setBackground(Color.RED);
        buton1.setForeground(Color.WHITE);
        this.setLayout(new FlowLayout());//manager de pozitionare, pt aliniere
        setSize(500,500);
        setLocationRelativeTo(null);
        setVisible(true);
        /*ActionListener a1 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ev){
                eventButton();
            }
        
        };
        buton1.addActionListener(a1);*/
        buton1.addActionListener(ev->eventButton());
        
    }
    private void eventButton(){
        if(buton1.getText().equals("Apasa!")){
            buton1.setText("URA! Ai apasat butonul!");
        }else{
            buton1.setText("Apasa!");
        }
    }
}
