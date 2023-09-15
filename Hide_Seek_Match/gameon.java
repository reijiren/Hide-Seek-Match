/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hide_Seek_Match;

import java.awt.font.ShapeGraphicAttribute;
import java.util.Random;

public class gameon {
    Random rand = new Random();
    public static int time;
    public static String[][] arr = new String[4][4];
    public static String[] c_char = new String[3];
    public static String[] stuff = new String[5];
    public static String[] stuff2 = new String[5];
    public static String[] item = new String[3];
    public static Boolean[] ls = new Boolean[10];
    public static int ls2;
    public static String pc;
    
    public void start(String ch1, String ch2, String ch3)
    {
        time = 120;
        
        //sarah
        arr[0][0] = "sarah";
        arr[0][1] = "jacket1";
        arr[0][2] = "glassess1";
        arr[0][3] = "masker";
        
        //harry
        arr[1][0] = "harry";
        arr[1][1] = "jacket2";
        arr[1][2] = "glassess2";
        arr[1][3] = "hat1";
        
        //peter
        arr[2][0] = "peter";
        arr[2][1] = "watch1";
        arr[2][2] = "necklace1";
        arr[2][3] = "hat2";
        
        //aulia
        arr[3][0] = "aulia";
        arr[3][1] = "watch2";
        arr[3][2] = "hat";
        arr[3][3] = "necklace2";
        
        c_char[0] = ch1;
        c_char[1] = ch2;
        c_char[2] = ch3;
        
        stuff[0] = "";
        stuff[1] = "";
        stuff[2] = "";
        stuff[3] = "";
        stuff[4] = "";
        
        stuff2[0] = "";
        stuff2[1] = "";
        stuff2[2] = "";
        stuff2[3] = "";
        stuff2[4] = "";
        
        item[0] = "";
        item[1] = "";
        item[2] = "";
        
        ls2 = 0;
        
        ls[0] = false;
        ls[1] = false;
        ls[2] = false;
        ls[3] = false;
        ls[4] = false;
        ls[5] = false;
        ls[6] = false;
        ls[7] = false;
        ls[8] = false;
        ls[9] = false;
        
        start_rand();
    }
    
    public String getCh(int arr){
        return c_char[arr];
    }
    
    public void start_rand(){
        int a1 = rand.nextInt(3); //siapa yg nyembunyiin hanya 1 item
        int z = 0, y = 0, x = 0;
        
        switch(a1){
            case 0:
                z = 0;
                y = 1;
                x = 2;
                break;
            case 1:
                z = 1;
                y = 2;
                x = 0;
                break;
            case 2:
                z = 2;
                y = 0;
                x = 1;
                break;
        }
        
        int i = 0;
        while(i < 5){
            switch(i){
                case 0:
                    stuff[i] = rndItem(c_char[z]);
                    stuff2[i] = stuff[i];
                    break;
                case 1:
                case 2:
                    stuff[i] = rndItem(c_char[y]);
                    stuff2[i] = stuff[i];
                    break;
                case 3:
                case 4:
                    stuff[i] = rndItem(c_char[x]);
                    stuff2[i] = stuff[i];
                    break;
            }
            i++;
        }
    }
    
    private String rndItem(String nm){
        for(int i = 0; i < 4; i++){
            if(arr[i][0].equals(nm)){
                while(true){
                    int a1 = rand.nextInt(3);
                    a1++;

                    if(check(arr[i][a1]))
                        return arr[i][a1];
                }
            }
        }
        return "";
    }
    
    private Boolean check(String str){
        for(int check = 0; check < 5; check++){
            if(stuff[check].equals(str))
                return false;
        }
        return true;
    }
    
    public void updLs2(int num){
        ls2 = num;
    }
    
    public int getLs2(){
        return ls2;
    }
    
    public void updLs(int arr, Boolean b){
        ls[arr] = b;
    }
    
    public Boolean getLs(int arr){
        return ls[arr];
    }
    
    public void updStuff(String arr){
        for(int i = 0; i < 5; i++){
            if(stuff[i].equals(arr))
                stuff[i] = "";
        }
    }
    
    public void updStuff2(String arr){
        for(int i = 0; i < 5; i++){
            if(stuff2[i].equals(arr))
                stuff2[i] = "";
        }
    }
    
    public String gv_stuff(int arr){
        return stuff[arr];
    }
    
    public String gv_stuff2(int arr){
        return stuff2[arr];
    }
    
    public int itemLeft(){
        int i = 0;
        
        for(int j = 0; j < 5; j++){
            if(stuff[j] != "")
                i++;
        }
        
        return i;
    }
    
    public void see(){
        for(int i = 0; i < 4; i++){
            for(int k = 0; k < 4; k++){
                System.out.println(arr[i][k]);
            }
        }
    }
    
    public Boolean isMatch(String own, String obj){
        for(int i = 0; i < 4; i++){
            for(int k = 0; k < 4; k++){
                if(arr[i][k] == obj){
                    System.out.println(i + k);
                    if(arr[i][0] == own){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public void updPc(String str){
        pc = str;
    }
    
    public String getPc(){
        return pc;
    }
    
    public void time_elaps(){
        time--;
    }
    
    public int getTime(){
        return time;
    }
    
    public void updItem(int i, String str){
        item[i] = str;
    }
    
    public String getItem(int i){
        return item[i];
    }
    
    public void clear(){
        time = 500;
    }
}
