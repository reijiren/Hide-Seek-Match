/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hide_Seek_Match;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Dimas Yudha
 */
public class textae {
    
    public void inputtext(String nama,int nilai){
        FileOutputStream foutput=null;
        String angka = Integer.toString(nilai);
        //String data="Halo And Hai";
        try 
        {   
//            foutput = new FileOutputStream("C:\\Users\\Dimas Yudha\\Documents\\NetBeansProjects\\CCIT_Projects\\history.txt");
//            for(int i=0;i<data.length();i++){
//                foutput.append((int) data.charAt(i));
//                //foutput.write(System.getProperty("line.separator"));
//            }            
//            
//            foutput.close();
            
            FileWriter fr = new FileWriter("history.txt",true);
            BufferedWriter br = new BufferedWriter(fr);
            br.write(nama);
            //br.write(System.getProperty("line.separator"));
            br.write("\n");
            br.write(angka);
            br.write("\n");
            //br.write(System.getProperty("line.separator"));
            br.close();
            fr.close();
            
        } catch (IOException ex)
        {
            //JOptionPane.showMessageDialog(this, "error while input data");
        }
    }
    
    public void deletall(){
        FileOutputStream foutput=null;
        String data="";
        try 
        {   
            foutput = new FileOutputStream("history.txt");
            for(int i=0;i<data.length();i++){
                foutput.write(data.charAt(i));
                //foutput.write(System.getProperty("line.separator"));
            }            
            
            foutput.close();
        } catch (IOException ex)
        {
            //JOptionPane.showMessageDialog(this, "error while input data");
        }
    }
}
