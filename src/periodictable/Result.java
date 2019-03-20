/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package periodictable;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author ASHIKUL SHAKIL
 */
public class Result {
       
   
    public static void method(String s)
    {       
        
         Sound sound =new Sound();
        UIManager UI = new UIManager();
        UI.put("OptionPane.background", Color.black);
        UIManager.put("Button.background", Color.magenta);
        UI.put("Panel.background", Color.black);
        UI.put("OptionPane.messageForeground", Color.red);
        
        
        String input="";
            String output="";
             String output2="";
       // int integ = Integer.parseInt(s);
         int p=0;
         int index=0;
         String ar[]=  Str.NAME();
        String ss="";
        String s2="";
        int length=s.length();
        char[] Array = s.toCharArray();
        
            if(Array[0]>='a'&&Array[0]<='z')
                Array[0]=(char)(Array[0]-32);
                ss=ss+Array[0];
             for(int i=1;i<length;i++){
                if(Array[i]>='A'&&Array[i]<='Z')
                    Array[i]=(char)(Array[i]+32); 
                     ss=ss+Array[i];
             }
            
             if(length>3){
             for(int k=0;k<120;k++)
             {
                 if (ss.equals(ar[k])){
                     p=1;
                  index=k;
                  
               output2=ss;
                  break;
                 }
               
                     
                
             }
              input=Str.Name_of_txt[index];
             s2=Str.Name_of_pic[index];
             
             }
             else if(length<=2&&Array[0]>57)
                     {
                         for(int d=0;d<120;d++){
                            
                                 if (ss.equals(Str.Symbol_of_elements2[d]))
                                 {
                                 p=1;
                             index=d;
                             output2=ar[index];
                             break;
                                 
                                 }
                         
                     }
                        input=Str.Name_of_txt[index]; 
                         s2=Str.Name_of_pic[index];
                     }
             else if(length<=3)
             {  try{
                int integ = Integer.parseInt(s);
                if(integ>=1&&integ<=118){
                 p=1;
                index=integ-1;
                
                }
                if(p==1)
              output2=Str.Name_of_elements1[index];
                input=Str.Name_of_txt2[index];
                s2=Str.Name_of_pic2[index];
             }catch(Exception e){
                 
             }
             }
              try {
                       String fileName=input;
                    BufferedReader input1 = new BufferedReader(new FileReader(fileName));
                        String line;

                        while ((line = input1.readLine()) != null) {
                            output = output + line + '\n';

                        }

                    } catch (IOException ee) {
                       
                    }
                 
         if(p==1){
            // JOptionPane.showMessageDialog(null, output,output2, JOptionPane.INFORMATION_MESSAGE);
            //System.out.println(output);
             new Sobi(output,output2,s2);
             
                    output = "";
         }
                  
         if(p!=1){
             String p2="Your input Is Invalid\n"
                     + "Please try to Set Valid Input";
                     sound.playSound("error.wav");
             JOptionPane.showMessageDialog(null,p2 ,"INVALID INPUT", JOptionPane.INFORMATION_MESSAGE); 
         }
    }
    
    
}

