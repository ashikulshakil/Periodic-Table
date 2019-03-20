/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package periodictable;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import static periodictable.Design.i;

/**
 *
 * @author ASHIKUL SHAKIL
 */
public class About
{
           
    
    public static void call(){
            JFrame f=new JFrame();
             f.setSize(1360, 700);
            JPanel f2= new JPanel();
            f2.setBackground(Color.cyan);
            f.getContentPane().add(f2);
            f2.setLayout(null);
           
            String fileName="about.txt";
            String output="";
             
                    try {
                        BufferedReader input = new BufferedReader(new FileReader(fileName));
                        String line;

                        while ((line = input.readLine()) != null) {
                            output = output + line + '\n';

                        }

                    } catch (IOException ee)
                    {
                    }
                    
                     TextArea n =new TextArea(output);
                     n.setBackground(Color.cyan);
           
                 Font font = new Font("Serif", Font.ITALIC, 25);
            
                     n.setFont(font);
             n.setEditable(false);
            n.setBounds(0,0,1360,700);
            n.setForeground(Color.black);
            f2.add(n);
            
            f.setTitle("About");
            f.setFont(font);
            f.setResizable(true);
             f.setVisible(true);
               //To change body of generated methods, choose Tools | Templates.
                    // JOptionPane.showMessageDialog(null,"sjdf\nxccxxc\nfgjg\nfghj\ng\nm\nj");
                     
                     
                    
                   // JOptionPane.showMessageDialog(null, output,st2, JOptionPane.INFORMATION_MESSAGE);
                    output = "";
                    
                            
                   
                  
                   
                }
}
           
            
            
            
            
            
            
    

