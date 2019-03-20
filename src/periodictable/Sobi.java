/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package periodictable;

import static java.awt.AWTEventMulticaster.add;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.TextArea;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;

/**
 *
 * @author ASHIKUL SHAKIL
 */
public class Sobi extends JFrame{
ImageIcon image =new ImageIcon();
JLabel lab =new JLabel();

   
    /**
     * @param args the command line arguments
     */
    
    Sobi(String s,String s1,String s2)
    {       JFrame f=new JFrame();
             f.setSize(1360, 700);
            JPanel f2= new JPanel();
            f2.setBackground(Color.cyan);
            f.getContentPane().add(f2);
            f2.setLayout(null);
           // image = new ImageIcon(getClass().getResource("field/pic1.jpg"));
            String ss="folder/";
            ss=ss+s2;
           image =new ImageIcon(getClass().getClassLoader().getResource(ss));
            
          // "resources/images/logo.png")
            lab =new JLabel(image);
           lab.setBounds(680,0,680,700);
            
            f2.add(lab);
            //JLabel n = new JLabel (s);
            TextArea n =new TextArea(s);
            n.setBackground(Color.cyan);
           
            Font font = new Font("Serif", Font.ITALIC, 20);
             Font font2 = new Font("Serif", Font.ITALIC, 20);
           n.setFont(font);
            n.setEditable(false);
            n.setBounds(0,0,680,700);
            n.setForeground(Color.black);
            f2.add(n);
            
            f.setTitle(s1);
            f.setFont(font2);
            f.setResizable(true);
             f.setVisible(true);
            
      //s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // s.setBackground(Color.RED);
    // s.setSize(900, 700);
        //s.setVisible(true);
        //s.pack();
       
        
    }
   
}
