/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import javax.swing.ImageIcon;

/**
 *
 * @author GRS
 */

    
   import java.awt.FlowLayout;
import java.awt.HeadlessException;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import sun.applet.Main;

public class teste extends JFrame {
    
  public teste() throws HeadlessException {
    setSize(300, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new FlowLayout(FlowLayout.LEFT));

    Icon icon = new ImageIcon("png.png");
    JLabel label1 = new JLabel("Full Name :", icon, JLabel.LEFT);

    JLabel label2 = new JLabel("Address :", JLabel.LEFT);
    label2.setIcon(new ImageIcon("/Imagens/imaJPG.jpg"));

    getContentPane().add(label1);
    getContentPane().add(label2);
  }

  public static void main(String[] args) {
    new teste().setVisible(true);
  }
}
    

