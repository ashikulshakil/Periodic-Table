/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package periodictable;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import static java.nio.file.Files.size;

public class Design extends JFrame implements ActionListener {
      static int i;
      static int h;
      static String k1 ="";
       static String k2 ="";
        static String k3 ="";
     public static void table() {
          Sound sound =new Sound();
        JFrame frame = new JFrame();
        frame.setSize(1360, 700);
        frame.setResizable(false);
        JPanel panel = new JPanel();
        panel.setBackground(Color.gray);
        frame.getContentPane().add(panel);
        JButton[] b = new JButton[120];
        JButton[] b1 = new JButton[40];
          
        String k = "H";
        panel.setLayout(null);
        JButton button = new JButton("Periodic Table");
        button.setFont(new Font("Serif", Font.BOLD, 20));
        button.setForeground(Color.red);
        button.setBackground(Color.black);
        // b[i].setPreferredSize(new Dimension(50, 50));
        button.setVisible(true);
        
        button.setBounds(560, 0, 200, 60);
        panel.add(button);
         String P ="OK";
         String P1="OK";
         String P2="About";
        JButton button2 =new JButton();
        JButton button3 =new JButton();
        button2 =  new JButton("<html>" + P.replaceAll("\\n", "<br>") + "</html>");
        button3 =  new JButton("<html>" + P.replaceAll("\\n", "<br>") + "</html>");
         JButton b6=new JButton();
         b6 =  new JButton("<html>" + P2.replaceAll("\\n", "<br>") + "</html>");
          button2.setBackground(Color.green);
          button2.setForeground(Color.black);
           b6.setBackground(Color.black);
          b6.setForeground(Color.red);
         button2.setBounds(0,0,190,20);
       button2.setBounds(130,20,40,20);
       b6.setBounds(1300,0,60,20);
       
       button3.setBackground(Color.green);
          button3.setForeground(Color.black);
         button3.setBounds(0,0,190,20);
       button3.setBounds(1120,20,40,20);
      panel.add(button2);
      panel.add(button3);
      panel.add(b6);
      JTextField t2=new JTextField();
      JTextField t3=new JTextField();
      JTextField t4=new JTextField();
      panel.add(t3);
       panel.add(t2);
       panel.add(t4);
        JLabel lab1 = new JLabel("Search By Name,Symbol or Atomic Number:");
        JLabel lab2 = new JLabel("Input Electron Conf like 4s2 or 5d9 Formate:");
        JLabel lab3 = new JLabel("Nth Electron:");
         JLabel lab4 = new JLabel("Quantum Number Calculator");
          lab1.setBounds(0,0,300,20);
          lab2.setBounds(800,0,300,20);
          lab3.setBounds(1050,0,100,20);
          lab4.setBounds(950,40,200,20);
            lab1.setForeground(Color.cyan);
            lab2.setForeground(Color.cyan);
            lab3.setForeground(Color.cyan);
            lab4.setForeground(Color.red);
           t2.setBounds(0,20,120,20);
           t3.setBounds(900,20,120,20);
           t4.setBounds(1050,20,60,20);
          panel.add(lab1);
           panel.add(lab2);
           panel.add(lab3);
           panel.add(lab4);
         button2.addActionListener(new ActionListener() { 
  public void actionPerformed(ActionEvent e) { 
  if ((t2.getText() != null && !t2.getText().isEmpty()))
  { 
      k1 = t2.getText();
      sound.playSound("button.wav");
     Result.method(k1);
     // JOptionPane.showMessageDialog(null, k,"SHAKIL", JOptionPane.INFORMATION_MESSAGE);
  }
  } 
} );
        
          button3.addActionListener(new ActionListener() { 
  public void actionPerformed(ActionEvent e) { 
  if ((t3.getText() != null && !t3.getText().isEmpty())&&(t4.getText() != null && !t4.getText().isEmpty()))
  { 
      k2 = t3.getText();
       k3 = t4.getText();
      sound.playSound("button.wav");
    Quantum.quantumnum(k2, k3);
     // JOptionPane.showMessageDialog(null, k,"SHAKIL", JOptionPane.INFORMATION_MESSAGE);
  }
  } 
} );
         
         
         
         
         t2.addKeyListener(new KeyAdapter()
      {

      public void keyPressed(KeyEvent e)
      {
         if ((t2.getText() != null && !t2.getText().isEmpty())){
              k1 = t2.getText();
           
        if (e.getKeyCode() == KeyEvent.VK_ENTER)
        { 
              sound.playSound("button.wav");
           Result.method(k1);
           
        }
      }
      }
    });  
         
         
        String name[]=Str.NAME();
       Str st = new Str();
      
        UIManager UI = new UIManager();
        UI.put("OptionPane.background", Color.black);
        UIManager.put("Button.background", Color.magenta);
        UI.put("Panel.background", Color.black);
        UI.put("OptionPane.messageForeground", Color.red);
        int p1 = 0, v1 = 60, t = 0;
      
        for (i = 0; i < 26; i++) {
            b1[i] = new JButton(st.num[i]);
            
            // b[i].setPreferredSize(new Dimension(50, 50));
            b1[i].setVisible(true);

            b1[i].setBounds(p1, v1, 70, 60);
            if (t == 0) {
                p1 = p1 + 70;
            } else if (t == 1) {
                v1 += 60;
            }
            if (p1 == 1330) {
                t = 1;
                p1 = 0;
                v1 = v1 + 60;
            }
            b1[i].setForeground(Color.white);
           b1[i].setBackground(Color.black);
            panel.add(b1[i]);

        }
  int h=0;
        int p = 70, v = 120, v2 = 540, p2 = 210;
        for (i = 0; i < 120; i++) {
            //b[i] = new JButton(st.Symbol_of_elements[i]);
            String twoLines = st.Symbol_of_elements[i];
           b[i]  =  new JButton("<html>" + twoLines.replaceAll("\\n", "<br>") + "</html>");
            // b[i].setPreferredSize(new Dimension(50, 50));
            b[i].setVisible(true);

            if (i < 90) {
                if (i == 1) {
                    p = 1260;
                } else if (i == 4) {
                    p = 910;
                } else if (i == 12) {
                    p = 910;
                }

                b[i].setBounds(p, v, 70, 60);
                p = p + 70;
                if (p == 1330) {
                    p = 70;
                    v = v + 60;
                }
            } else if (i >= 90) {
                b[i].setBounds(p2, v2, 70, 60);
                p2 = p2 + 70;
                if (p2 == 1260) {
                    p2 = 210;
                    v2 = v2 + 60;
                }
            }
           
            if(i==0||(i>=5&&i<=7)||i==14||i==15||i==33)
            {
                b[i].setBackground(Color.red);
            }
                
            else if(i==2||i==10||i==18||i==36||i==54||i==72)
            {
                b[i].setBackground(Color.orange);
            }
            
            else if(i==3||i==11||i==19||i==37||i==55||i==73)
            {
                b[i].setBackground(Color.GREEN);
            }
            
             else if((i>=20&&i<=29)||(i>=38&&i<=47)||(i>=57&&i<=65)||(i>=75&&i<=83))
            {
                b[i].setBackground(Color.cyan);
            }
             if(i==56||i==74||(i>=90&&i<=104)||(i>=105&&i<=119))
            {
                b[i].setBackground(Color.yellow);
            }
            else if(i==12||i==30||i==48||i==49||i==66||i==67||i==68)
            {
                b[i].setBackground(Color.pink);
            }
             else if(i==4||i==13||i==31||i==32||i==50||i==51||i==69)
            {
                b[i].setBackground(Color.lightGray);
            }
            
             else if(i==1||i==9||i==17||i==35||i==53||i==71)
            {
                b[i].setBackground(Color.blue);
            }
              else if(i==8||i==16||i==34||i==52||i==70)
            {
                b[i].setBackground(Color.MAGENTA);
            }
             else if(i>=84&&i<=89)
            {
                b[i].setBackground(Color.white);
            }
            
            
            
            String fileName =st.Name_of_txt[i];
           
             String s2=Str.Name_of_pic[i];
           
          String st2=name[i];
          b[i].addActionListener(new ActionListener() { 
                String output = "";
             
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        BufferedReader input = new BufferedReader(new FileReader(fileName));
                        String line;

                        while ((line = input.readLine()) != null) {
                            output = output + line + '\n';

                        }

                    } catch (IOException ee) {
                       
                    }

               //To change body of generated methods, choose Tools | Templates.
                    // JOptionPane.showMessageDialog(null,"sjdf\nxccxxc\nfgjg\nfghj\ng\nm\nj");
                     sound.playSound("button.wav");
                     
                     new Sobi(output,st2,s2);
                   // JOptionPane.showMessageDialog(null, output,st2, JOptionPane.INFORMATION_MESSAGE);
                    output = "";
                    
                            
                   
                  
                   
                }
            });
          
          
       
            panel.add(b[i]);

        }
          b6.addActionListener(new ActionListener() { 
              
             
                @Override
                public void actionPerformed(ActionEvent e) {
                    

               //To change body of generated methods, choose Tools | Templates.
                    // JOptionPane.showMessageDialog(null,"sjdf\nxccxxc\nfgjg\nfghj\ng\nm\nj");
                     sound.playSound("button.wav");
                      About.call();
                     
                   // JOptionPane.showMessageDialog(null, output,st2, JOptionPane.INFORMATION_MESSAGE);
                   
                    
                            
                   
                  
                   
                }
            });

        frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
    }
}
