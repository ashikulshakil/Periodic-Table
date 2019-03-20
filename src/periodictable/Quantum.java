/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package periodictable;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author ASHIKUL SHAKIL
 */
public class Quantum 
{   static int inp;
    public static void quantumnum(String sd,String si)
   {
      Sound sound =new Sound();
        UIManager UI = new UIManager();
        UI.put("OptionPane.background", Color.black);
        UIManager.put("Button.background", Color.magenta);
        UI.put("Panel.background", Color.black);
        UI.put("OptionPane.messageForeground", Color.red);
       
       String s=sd;
      
       try {
           inp= Integer.parseInt(si); 
       } catch (Exception e) {
       }
      // int inp= Integer.parseInt(si);
       char P = 0;
       char sk = 0;
       String mk = null;
      String sp = null;
       int k;
       int t;
       int pivot=0;
      String s1[]={"0"};
      String p1[]={"-1","0","+1"};
      String d1[]={"-2","-1","0","+1","+2"};
      String f1[]={"-3","-2","-1","0","+1","+2","+3"};
        int length=s.length();
        char[] A= s.toCharArray();
        if(length==4)
            k=(A[2]-'0')*10+(A[3]-'0');
            else k=A[2]-'0';
      
        
            if(A[1]=='S'||A[1]=='s')
                
            {
              if(inp<=2&&k<=2&&((A[0]-'0')<=7))
              pivot=1;
              P=A[0];
              sk='0';
              mk=s1[0];
              if(inp<=1)
                  sp="1/2";
              else 
                  sp="-1/2";
            }
            
         else  if(A[1]=='p'||A[1]=='P')
                
            {
               if(inp<=6&&k<=6&&((A[0]-'0')<=7))
              pivot=1;
              P=A[0];
              sk='1';
               t=inp%3;
              if(inp%3==0)
                  t=3;
              t--;
              mk=p1[t];
              if(inp<=3)
                  sp="1/2";
              else 
                  sp="-1/2";
            }
          else if(A[1]=='d'||A[1]=='D')
                
            {
               if(inp<=10&&k<=10&&((A[0]-'0')<=7))
               pivot=1;
              P=A[0];
              sk='2';
              t=inp%5;
              if(inp%5==0)
                  t=5;
              t--;
              mk=d1[t];
             
              if(inp<=5)
                  sp="1/2";
              else 
                  sp="-1/2";
            }
           
           else if(A[1]=='f'||A[1]=='F')
                
            {
              
               if(inp<=14&&k<=14&&((A[0]-'0')<=7))  
              pivot=1;
              P=A[0];
              sk='3';
              t=inp%7;
              if(inp%7==0)
                  t=7;
              t--;
              mk=f1[t];
             
              if(inp<=7)
                  sp="1/2";
              else 
                  sp="-1/2";
            }
            
            
            String k2="Principal quantum number n="+P+"\n"+"Angular quantum number l="+sk+"\n"+"Magnetic quantum number m="+mk+"\n"+"Spin quantum number s="+sp;
            
            //System.out.println(k2);
            if(pivot==1)
            JOptionPane.showMessageDialog(null,k2,"Quantum Number", JOptionPane.INFORMATION_MESSAGE);
            else if(pivot==0)
            {
                String h ="Invalid Input";
                sound.playSound("error.wav");
                 JOptionPane.showMessageDialog(null,h,"Invalid Input", JOptionPane.INFORMATION_MESSAGE);
            }
                
            
            
            
        }
        
 
}
