/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

/**
 *
 * @author student
 */
public class Frame6 extends JFrame{
    private JMenuBar mb;//bara de meniu
    private JMenu m1;//meniu
    private JMenu m2;
    private JMenu sub1;//submeniu
    private JMenuItem mi1,mi2,mi3,mi4,mi5;//butoane de meniu
    public Frame6(){
        mb = new JMenuBar();
        setJMenuBar(mb);
        m1 = new JMenu("Menu1");
        m2 = new JMenu("Menu2");
        mb.add(m1);
        mb.add(m2);
        sub1 = new JMenu("submenu1");
        mi1 = new JMenuItem("Item1");
        m1.add(sub1);
        m1.add(mi1);
        mi2 = new JMenuItem("Item2");
        mi3 = new JMenuItem("Item3");
        mi4 = new JMenuItem("Item4");
        mi5 = new JMenuItem("Item5");
        m2.add(mi5);
        sub1.add(mi2);
        sub1.add(mi3);
        sub1.add(mi4);
        setSize(400,400);
        setLocationRelativeTo(null);
        setVisible(true);
        mi1.addActionListener(ev->sayHi());
        KeyStroke ks1 = KeyStroke.getKeyStroke("W");
        mi1.setAccelerator(ks1);
        m1.setMnemonic('M');
        
                
    }
    private void sayHi(){
        JOptionPane.showMessageDialog(null,"HI");//casuta de dialog ce imi afiseaza un mesaj
    }
}
