/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hide_Seek_Match;

import java.awt.Color;
import java.awt.Image;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.JOptionPane;
/**
 *
 * @author hp
 */
public class fMain_room extends javax.swing.JFrame {

    /**
     * Creates new form fMain_room
     */
    public static String p_char, p_name;
    public static String[] chara = {"sarah", "harry", "peter", "aulia"};
    public static String[] ch = new String[3];;
    private int cl;
    private static int score;
    Boolean it1, it2, it3;
    
    Border border1 = BorderFactory.createLineBorder(Color.BLACK, 3);
    Border border2 = BorderFactory.createLineBorder(Color.YELLOW, 3);
    
    gameon game = new gameon();
    Timer myTimer = new Timer();
    
    public fMain_room(){
        initComponents();
        
        bBack.setVisible(true);
        jPanel4.setVisible(true);
        lblTimer.setVisible(true);
        ctc.setVisible(false);
        load_room();
        load_item();
        load_img();
        
        it1 = false;
        it2 = false;
        it3 = false;
        
        char1.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Hide_Seek_Match/images/" + ch[0] + "10.png")).getImage().getScaledInstance(char1.getWidth(), char1.getHeight(), Image.SCALE_SMOOTH)));
        char2.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Hide_Seek_Match/images/" + ch[1] + "10.png")).getImage().getScaledInstance(char2.getWidth(), char2.getHeight(), Image.SCALE_SMOOTH)));
        char3.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Hide_Seek_Match/images/" + ch[2] + "10.png")).getImage().getScaledInstance(char3.getWidth(), char3.getHeight(), Image.SCALE_SMOOTH)));
        refresh();
        
        ta.setText("Match the items with the owner.");
        
//        if(bl){
            TimerTask task = new TimerTask(){
                public void run(){
                    lblTimer.setText(Integer.toString(game.getTime()));

                    if(game.getTime() <= 0){
                        myTimer.cancel();
                        myTimer.purge();
                        gameOver();
                    }
                }
            };

            myTimer.scheduleAtFixedRate(task, 1000, 1000);
        
        
    }
    
    public fMain_room(String karakter, String nama) {
        initComponents();
        bBack.setVisible(false);
        jPanel4.setVisible(false);
        lblTimer.setVisible(false);
        invisible();
        
        it1 = false;
        it2 = false;
        it3 = false;
        
        cl = 1;
        score = 0;
        
        p_char = karakter;
        p_name = nama;
        
        game.updPc(p_char);
        
        load_room();
        load_img();
        
        prolog();
    }
    
    private void load_item(){
        String str1 = game.getItem(0);
        String str2 = game.getItem(1);
        String str3 = game.getItem(2);
        
        if(str1 != "")
            item1.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Hide_Seek_Match/images/" + str1 + ".png")).getImage().getScaledInstance(item1.getWidth(), item1.getHeight(), Image.SCALE_SMOOTH)));
        else
            item1.setIcon(null);
        
        if(str2 != "")
            item2.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Hide_Seek_Match/images/" + str2 + ".png")).getImage().getScaledInstance(item2.getWidth(), item2.getHeight(), Image.SCALE_SMOOTH)));
        else
            item2.setIcon(null);
        
        if(str3 != "")
            item3.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Hide_Seek_Match/images/" + str3 + ".png")).getImage().getScaledInstance(item3.getWidth(), item3.getHeight(), Image.SCALE_SMOOTH)));
        else
            item3.setIcon(null);
    }
    
    private void load_room(){
        int k = 0;
        p1.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Hide_Seek_Match/images/bg.jpg")).getImage().getScaledInstance(p1.getWidth(), p1.getHeight(), Image.SCALE_SMOOTH)));
        p2.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Hide_Seek_Match/images/r11.jpg")).getImage().getScaledInstance(p2.getWidth(), p2.getHeight(), Image.SCALE_SMOOTH)));
        
        for(int i = 0; i < 4; i++){
            if(chara[i] != p_char){
                ch[k] = chara[i];
                k++;
            }
        }
        
        item1.setBorder(border1);
        item2.setBorder(border1);
        item3.setBorder(border1);
    }
    
    private void aMatch(int i){
        switch(i){    
            case 0:
               item1.setIcon(null);
               item1.setBorder(border1);
               it1 = false;
               break;
            case 1:
                item2.setIcon(null);
                item2.setBorder(border1);
                it2 = false;
                break;
            case 2:
                item3.setIcon(null);
                item3.setBorder(border1);
                it3 = false;
                break;
        }
    }
    
    private void invisible(){
        jktch1.setVisible(false);
        jktch2.setVisible(false);
        jmch2.setVisible(false);
        jmch3.setVisible(false);
        jmch4.setVisible(false);
        kcmtch1.setVisible(false);
        kcmtch2.setVisible(false);
        klgch2.setVisible(false);
        klgch3.setVisible(false);
        mkch1.setVisible(false);
        topich1.setVisible(false);
        topich2.setVisible(false);
        topich3.setVisible(false);
    }
    
    private void load_img(){
        String[] item_sarah = {"/Hide_Seek_Match/images/glassess1.png", "/Hide_Seek_Match/images/masker.png", "/Hide_Seek_Match/images/jacket1.png"};
        String[] item_harry = {"/Hide_Seek_Match/images/hat1.png", "/Hide_Seek_Match/images/glassess2.png", "/Hide_Seek_Match/images/jacket2.png"};
        String[] item_peter = {"/Hide_Seek_Match/images/watch1.png", "/Hide_Seek_Match/images/hat2.png", "/Hide_Seek_Match/images/necklace1.png"};
        String[] item_aulia = {"/Hide_Seek_Match/images/watch2.png", "/Hide_Seek_Match/images/hat.png", "/Hide_Seek_Match/images/necklace2.png"};
        
        if(ch[0].equals("sarah")){
            kcmtch1.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(item_sarah[0])).getImage().getScaledInstance(kcmtch1.getWidth(), kcmtch1.getHeight(), Image.SCALE_SMOOTH)));
            mkch1.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(item_sarah[1])).getImage().getScaledInstance(mkch1.getWidth(), mkch1.getHeight(), Image.SCALE_SMOOTH)));
            jktch1.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(item_sarah[2])).getImage().getScaledInstance(jktch1.getWidth(), jktch1.getHeight(), Image.SCALE_SMOOTH)));
        }else{
            topich1.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(item_harry[0])).getImage().getScaledInstance(topich1.getWidth(), topich1.getHeight(), Image.SCALE_SMOOTH)));
            kcmtch1.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(item_harry[1])).getImage().getScaledInstance(kcmtch1.getWidth(), kcmtch1.getHeight(), Image.SCALE_SMOOTH)));
            jktch1.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(item_harry[2])).getImage().getScaledInstance(jktch1.getWidth(), jktch1.getHeight(), Image.SCALE_SMOOTH)));
        }
        
        if(ch[1].equals("harry")){
            topich2.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(item_harry[0])).getImage().getScaledInstance(topich2.getWidth(), topich2.getHeight(), Image.SCALE_SMOOTH)));
            kcmtch2.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(item_harry[1])).getImage().getScaledInstance(kcmtch2.getWidth(), kcmtch2.getHeight(), Image.SCALE_SMOOTH)));
            jktch2.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(item_harry[2])).getImage().getScaledInstance(jktch2.getWidth(), jktch2.getHeight(), Image.SCALE_SMOOTH)));
        }else{
            jmch2.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(item_peter[0])).getImage().getScaledInstance(jmch2.getWidth(), jmch2.getHeight(), Image.SCALE_SMOOTH)));
            topich2.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(item_peter[1])).getImage().getScaledInstance(topich2.getWidth(), topich2.getHeight(), Image.SCALE_SMOOTH)));
            klgch2.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(item_peter[2])).getImage().getScaledInstance(klgch2.getWidth(), klgch2.getHeight(), Image.SCALE_SMOOTH)));
        }
        
        if(ch[2].equals("peter")){
            jmch3.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(item_peter[0])).getImage().getScaledInstance(jmch3.getWidth(), jmch3.getHeight(), Image.SCALE_SMOOTH)));
            topich3.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(item_peter[1])).getImage().getScaledInstance(topich3.getWidth(), topich3.getHeight(), Image.SCALE_SMOOTH)));
            klgch3.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(item_peter[2])).getImage().getScaledInstance(klgch3.getWidth(), klgch3.getHeight(), Image.SCALE_SMOOTH)));
        }else{
            jmch4.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(item_aulia[0])).getImage().getScaledInstance(jmch4.getWidth(), jmch4.getHeight(), Image.SCALE_SMOOTH)));
            topich3.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(item_aulia[1])).getImage().getScaledInstance(topich3.getWidth(), topich3.getHeight(), Image.SCALE_SMOOTH)));
            klgch3.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(item_aulia[2])).getImage().getScaledInstance(klgch3.getWidth(), klgch3.getHeight(), Image.SCALE_SMOOTH)));
        }
    }
    
    private void prolog(){
        switch(cl){
            case 1:
                game.start(ch[0], ch[1], ch[2]);
                ta.setText(p_name.toUpperCase() + " :\nHey guys, since we have a lot of spare time, lets play a game!!!");
                LChar.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Hide_Seek_Match/images/" + p_char + "9.jpg")).getImage().getScaledInstance(LChar.getWidth(), LChar.getHeight(), Image.SCALE_SMOOTH)));
                break;
            case 2:
                ta.setText(ch[0].toUpperCase()+" :\nGood idea, but what game should we do?");
                LChar.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Hide_Seek_Match/images/" + ch[0] + "9.jpg")).getImage().getScaledInstance(LChar.getWidth(), LChar.getHeight(), Image.SCALE_SMOOTH)));
                char1.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Hide_Seek_Match/images/" + ch[0] + "10.png")).getImage().getScaledInstance(char1.getWidth(), char1.getHeight(), Image.SCALE_SMOOTH)));
                show_it(1);
                break;
            case 3:
                ta.setText(p_name.toUpperCase() + " :\nThis game is called \"Hide-Seek-Match\".");
                LChar.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Hide_Seek_Match/images/" + p_char + "9.jpg")).getImage().getScaledInstance(LChar.getWidth(), LChar.getHeight(), Image.SCALE_SMOOTH)));
                break;
            case 4:
                ta.setText(ch[1].toUpperCase()+" :\nWhat kind of game is that?");
                LChar.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Hide_Seek_Match/images/" + ch[1] + "9.jpg")).getImage().getScaledInstance(LChar.getWidth(), LChar.getHeight(), Image.SCALE_SMOOTH)));
                char2.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Hide_Seek_Match/images/" + ch[1] + "10.png")).getImage().getScaledInstance(char2.getWidth(), char2.getHeight(), Image.SCALE_SMOOTH)));
                show_it(2);
                break;
            case 5:
                ta.setText(p_name.toUpperCase() + " :\nSimple, first we must do hompimpa. The winner will hide their stuff and the loser will find it and guess whom the stuff is belong.");
                LChar.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Hide_Seek_Match/images/" + p_char + "9.jpg")).getImage().getScaledInstance(LChar.getWidth(), LChar.getHeight(), Image.SCALE_SMOOTH)));
                break;
            case 6:
                ta.setText(ch[2].toUpperCase()+" :\nSounds interesting. I'm in.");
                LChar.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Hide_Seek_Match/images/" + ch[2] + "9.jpg")).getImage().getScaledInstance(LChar.getWidth(), LChar.getHeight(), Image.SCALE_SMOOTH)));
                char3.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Hide_Seek_Match/images/" + ch[2] + "10.png")).getImage().getScaledInstance(char3.getWidth(), char3.getHeight(), Image.SCALE_SMOOTH)));
                show_it(3);
                break;
            case 7:
                ta.setText(ch[0].toUpperCase()+" :\nYeah, it could be the best game I've ever played");
                LChar.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Hide_Seek_Match/images/" + ch[0] + "9.jpg")).getImage().getScaledInstance(LChar.getWidth(), LChar.getHeight(), Image.SCALE_SMOOTH)));
                break;
            case 8:
                ta.setText(p_name.toUpperCase() + " :\nNow, let's do hompimpa.");
                LChar.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Hide_Seek_Match/images/" + p_char + "9.jpg")).getImage().getScaledInstance(LChar.getWidth(), LChar.getHeight(), Image.SCALE_SMOOTH)));
                break;
            case 9:
                ta.setText("Everyone :\nHompimpa alayum gambreng...\n" + p_name.toUpperCase() + " lose the hompimpa.");
                LChar.setIcon(null);
                break;
            case 10:
                ta.setText(ch[0].toUpperCase() + ", " + ch[1].toUpperCase() + " and " + ch[2].toUpperCase() + " is now hiding their stuff.");
                char1.setVisible(false);
                char2.setVisible(false);
                char3.setVisible(false);
                p2.setIcon(null);
                invisible();
                break;
            case 11:
                show_it(ch[0], ch[1], ch[2]);
                hide_it(p_char);
                ta.setText("You might notice that there are some stuff missing. ");
                char1.setVisible(true);
                char2.setVisible(true);
                char3.setVisible(true);
                p2.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Hide_Seek_Match/images/r11.jpg")).getImage().getScaledInstance(p2.getWidth(), p2.getHeight(), Image.SCALE_SMOOTH)));
                break;
            case 12:
                ta.setText("Now, go find their missing stuff!");
                break;
            case 13:
                ctc.setVisible(false);
                fRoom_1 mulai = new fRoom_1(true);
                mulai.pack();
                mulai.setLocationRelativeTo(null);
                mulai.show();
                this.hide();
                break;
            default:
                ta.setText("Find the missing stuff!");
                break;
        }
    }
    
    private void show_it(int i){
        switch(i){
            case 1:
                if(ch[0] == "sarah"){
                    kcmtch1.setVisible(true);
                    mkch1.setVisible(true);
                    jktch1.setVisible(true);
                }else{
                    topich1.setVisible(true);
                    kcmtch1.setVisible(true);
                    jktch1.setVisible(true);
                }
                break;
            case 2:
                if(ch[1] == "harry"){
                    topich2.setVisible(true);
                    kcmtch2.setVisible(true);
                    jktch2.setVisible(true);
                }else{
                    jmch2.setVisible(true);
                    topich2.setVisible(true);
                    klgch2.setVisible(true);
                }
                break;
            case 3:
                if(ch[2] == "peter"){
                    topich3.setVisible(true);
                    klgch3.setVisible(true);
                    jmch3.setVisible(true);
                }else{
                    jmch4.setVisible(true);
                    topich3.setVisible(true);
                    klgch3.setVisible(true);
                }
                break;
        }
    }
    
    private void show_it(String a1, String a2, String a3){
        if(a1 == "sarah"){
            kcmtch1.setVisible(true);
            mkch1.setVisible(true);
            jktch1.setVisible(true);
        }else{
            topich1.setVisible(true);
            kcmtch1.setVisible(true);
            jktch1.setVisible(true);
        }
        if(a2 == "harry"){
            topich2.setVisible(true);
            kcmtch2.setVisible(true);
            jktch2.setVisible(true);
        }else{
            jmch2.setVisible(true);
            topich2.setVisible(true);
            klgch2.setVisible(true);
        }
        if(a3 == "peter"){
            topich3.setVisible(true);
            klgch3.setVisible(true);
            jmch3.setVisible(true);
        }else{
            jmch4.setVisible(true);
            topich3.setVisible(true);
            klgch3.setVisible(true);
        }
    }
    
    private void hide_it(String str){
        int i = 0;
        
        while(i < 5){
            switch(str){
            case "sarah":
                switch(game.gv_stuff(i)){
                    case "jacket2":
                        jktch1.setVisible(false);
                        break;
                    case "glassess2":
                        kcmtch1.setVisible(false);
                        break;
                    case "hat1":
                        topich1.setVisible(false);
                        break;
                    case "watch1":
                        jmch2.setVisible(false);
                        break;
                    case "necklace1":
                        klgch2.setVisible(false);
                        break;
                    case "hat2":
                        topich2.setVisible(false);
                        break;
                    case "watch2":
                        jmch4.setVisible(false);
                        break;
                    case "hat":
                        topich3.setVisible(false);
                        break;
                    case "necklace2":
                        klgch3.setVisible(false);
                        break;
                }
                break;
            case "harry":
                switch(game.gv_stuff(i)){
                    case "jacket1":
                        jktch1.setVisible(false);
                        break;
                    case "glassess1":
                        kcmtch1.setVisible(false);
                        break;
                    case "masker":
                        mkch1.setVisible(false);
                        break;
                    case "watch1":
                        jmch2.setVisible(false);
                        break;
                    case "necklace1":
                        klgch2.setVisible(false);
                        break;
                    case "hat2":
                        topich2.setVisible(false);
                        break;
                    case "watch2":
                        jmch4.setVisible(false);
                        break;
                    case "hat":
                        topich3.setVisible(false);
                        break;
                    case "necklace2":
                        klgch3.setVisible(false);
                        break;
                }
                break;
            case "peter":
                switch(game.gv_stuff(i)){
                    case "jacket1":
                        jktch1.setVisible(false);
                        break;
                    case "glassess1":
                        kcmtch1.setVisible(false);
                        break;
                    case "masker":
                        mkch1.setVisible(false);
                        break;
                    case "jacket2":
                        jktch2.setVisible(false);
                        break;
                    case "glassess2":
                        kcmtch2.setVisible(false);
                        break;
                    case "hat1":
                        topich2.setVisible(false);
                        break;
                    case "watch2":
                        jmch4.setVisible(false);
                        break;
                    case "hat":
                        topich3.setVisible(false);
                        break;
                    case "necklace2":
                        klgch3.setVisible(false);
                        break;
                }
                break;
            case "aulia":
                switch(game.gv_stuff(i)){
                    case "jacket1":
                        jktch1.setVisible(false);
                        break;
                    case "glassess1":
                        kcmtch1.setVisible(false);
                        break;
                    case "masker":
                        mkch1.setVisible(false);
                        break;
                    case "jacket2":
                        jktch2.setVisible(false);
                        break;
                    case "glassess2":
                        kcmtch2.setVisible(false);
                        break;
                    case "hat1":
                        topich2.setVisible(false);
                        break;
                    case "watch1":
                        jmch3.setVisible(false);
                        break;
                    case "hat2":
                        topich3.setVisible(false);
                        break;
                    case "necklace1":
                        klgch3.setVisible(false);
                        break;
                }
                break;
            }
            i++;
        }
    }
    
    private void refresh(){
        show_it(ch[0], ch[1], ch[2]);
        hide_it(p_char);
        ta.setText(ta.getText() + "\n\nItems left : " + Integer.toString(game.itemLeft()));
    }
    
    private String getCharName(int lbl){
        return ch[lbl];
    }
    
    private void updScore(int i){
        score += i;
    }
    
    private int getSc(){
        return (game.getTime()*10);
    }
    
    private int finalScore(){
        return score;
    }
    
    private Boolean isClear(){
        for(int i = 0; i < 5; i++){
            if(!game.gv_stuff(i).equals(""))
                return false;
        }
        return true;
    }
    
    public void gameOver(){
        textae t = new textae();
        t.inputtext(p_name, score);
        
        game.clear();
        myTimer.cancel();
        
        lblTimer.setText("--");
        
        JOptionPane.showMessageDialog(this, "Your score is :" + score ,"Game Over", HEIGHT);

        mainMenu mm = new mainMenu();
        mm.pack();
        mm.setLocationRelativeTo(null);
        mm.show();
        this.dispose();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblTimer = new javax.swing.JLabel();
        topich1 = new javax.swing.JLabel();
        topich2 = new javax.swing.JLabel();
        topich3 = new javax.swing.JLabel();
        klgch2 = new javax.swing.JLabel();
        klgch3 = new javax.swing.JLabel();
        kcmtch1 = new javax.swing.JLabel();
        kcmtch2 = new javax.swing.JLabel();
        mkch1 = new javax.swing.JLabel();
        jmch2 = new javax.swing.JLabel();
        jmch3 = new javax.swing.JLabel();
        jmch4 = new javax.swing.JLabel();
        jktch1 = new javax.swing.JLabel();
        jktch2 = new javax.swing.JLabel();
        char1 = new javax.swing.JLabel();
        char2 = new javax.swing.JLabel();
        char3 = new javax.swing.JLabel();
        LChar = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        item1 = new javax.swing.JLabel();
        item2 = new javax.swing.JLabel();
        item3 = new javax.swing.JLabel();
        bBack = new javax.swing.JButton();
        ctc = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta = new javax.swing.JTextArea();
        p2 = new javax.swing.JLabel();
        p1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hide-Seek-Match");
        setName("fMRoom"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(930, 680));

        jPanel1.setLayout(null);

        jPanel2.setBackground(java.awt.Color.white);
        jPanel2.setLayout(null);

        lblTimer.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTimer.setForeground(new java.awt.Color(255, 255, 0));
        jPanel2.add(lblTimer);
        lblTimer.setBounds(20, 20, 70, 30);

        topich1.setBackground(java.awt.Color.red);
        topich1.setForeground(java.awt.Color.red);
        jPanel2.add(topich1);
        topich1.setBounds(110, 140, 80, 30);

        topich2.setBackground(java.awt.Color.red);
        topich2.setForeground(java.awt.Color.red);
        jPanel2.add(topich2);
        topich2.setBounds(330, 140, 80, 30);

        topich3.setBackground(java.awt.Color.red);
        topich3.setForeground(java.awt.Color.red);
        jPanel2.add(topich3);
        topich3.setBounds(560, 140, 80, 30);

        klgch2.setBackground(java.awt.Color.red);
        jPanel2.add(klgch2);
        klgch2.setBounds(350, 220, 40, 14);

        klgch3.setBackground(java.awt.Color.red);
        jPanel2.add(klgch3);
        klgch3.setBounds(580, 220, 40, 14);
        jPanel2.add(kcmtch1);
        kcmtch1.setBounds(130, 180, 40, 10);
        jPanel2.add(kcmtch2);
        kcmtch2.setBounds(350, 180, 40, 10);
        jPanel2.add(mkch1);
        mkch1.setBounds(130, 200, 40, 20);
        jPanel2.add(jmch2);
        jmch2.setBounds(400, 410, 30, 30);
        jPanel2.add(jmch3);
        jmch3.setBounds(630, 410, 30, 30);
        jPanel2.add(jmch4);
        jmch4.setBounds(640, 340, 20, 20);
        jPanel2.add(jktch1);
        jktch1.setBounds(65, 230, 170, 190);
        jPanel2.add(jktch2);
        jktch2.setBounds(280, 220, 180, 210);

        char1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        char1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                char1MouseClicked(evt);
            }
        });
        jPanel2.add(char1);
        char1.setBounds(70, 140, 160, 310);

        char2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        char2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                char2MouseClicked(evt);
            }
        });
        jPanel2.add(char2);
        char2.setBounds(290, 140, 160, 310);

        char3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        char3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                char3MouseClicked(evt);
            }
        });
        jPanel2.add(char3);
        char3.setBounds(520, 140, 160, 310);

        LChar.setBackground(java.awt.Color.white);
        LChar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        LChar.setOpaque(true);
        jPanel2.add(LChar);
        LChar.setBounds(20, 480, 110, 120);

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.white, 2));
        jPanel4.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("ITEMS");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(40, 20, 52, 30);

        item1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        item1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        item1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                item1MouseClicked(evt);
            }
        });
        jPanel4.add(item1);
        item1.setBounds(10, 60, 110, 110);

        item2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        item2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        item2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                item2MouseClicked(evt);
            }
        });
        jPanel4.add(item2);
        item2.setBounds(10, 200, 110, 110);

        item3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        item3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        item3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                item3MouseClicked(evt);
            }
        });
        jPanel4.add(item3);
        item3.setBounds(10, 340, 110, 110);

        jPanel2.add(jPanel4);
        jPanel4.setBounds(740, 10, 130, 460);

        bBack.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bBack.setText("Back");
        bBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bBackMouseClicked(evt);
            }
        });
        jPanel2.add(bBack);
        bBack.setBounds(740, 480, 130, 120);

        ctc.setText("Click to continue...");
        ctc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ctcMouseClicked(evt);
            }
        });
        jPanel2.add(ctc);
        ctc.setBounds(610, 580, 100, 14);

        ta.setEditable(false);
        ta.setColumns(20);
        ta.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        ta.setLineWrap(true);
        ta.setRows(5);
        ta.setWrapStyleWord(true);
        ta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                taMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ta);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(150, 480, 560, 120);

        p2.setBackground(java.awt.Color.black);
        p2.setOpaque(true);
        jPanel2.add(p2);
        p2.setBounds(5, 4, 890, 620);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 10, 900, 630);
        jPanel1.add(p1);
        p1.setBounds(0, 0, 930, 680);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 930, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void taMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_taMouseClicked
        cl++;
        prolog();
    }//GEN-LAST:event_taMouseClicked

    private void ctcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ctcMouseClicked
        cl++;
        prolog();
    }//GEN-LAST:event_ctcMouseClicked

    private void bBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bBackMouseClicked
        fRoom_1 mulai = new fRoom_1(false);
        mulai.pack();
        mulai.setLocationRelativeTo(null);
        mulai.show();
        this.hide();
    }//GEN-LAST:event_bBackMouseClicked

    private void char1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_char1MouseClicked
        if(it1 || it2 || it3){
            int i;
            if(it1){
                i = 0;
            }else if(it2){
                i = 1;
            }else{
                i = 2;
            }
            if(game.isMatch(game.getCh(0), game.getItem(i))){
                updScore(getSc());
                game.updStuff(game.getItem(i));
                game.updItem(i, "");
                aMatch(i);
                ta.setText("Correct! You got " + Integer.toString(getSc()) + " Point");
            }else{
                game.updStuff(game.getItem(i));
                game.updItem(i, "");
                aMatch(i);
                ta.setText("Oops, you're wrong.");
            }
            refresh();

            if(isClear()){
                game.clear();
                gameOver();
            }
        }
    }//GEN-LAST:event_char1MouseClicked

    private void char2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_char2MouseClicked
        if(it1 || it2 || it3){
            int i;
            if(it1){
                i = 0;
            }else if(it2){
                i = 1;
            }else{
                i = 2;
            }
            if(game.isMatch(game.getCh(1), game.getItem(i))){
                updScore(getSc());
                game.updStuff(game.getItem(i));
                game.updItem(i, "");
                aMatch(i);
                ta.setText("Correct! You got " + Integer.toString(getSc()) + "Point");
            }else{
                game.updStuff(game.getItem(i));
                game.updItem(i, "");
                aMatch(i);
                ta.setText("Oops, you're wrong.");
            }
            refresh();
            
            if(isClear()){
                game.clear();
                gameOver();
                
            }
        }
    }//GEN-LAST:event_char2MouseClicked

    private void char3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_char3MouseClicked
        if(it1 || it2 || it3){
            int i;
            if(it1){
                i = 0;
            }else if(it2){
                i = 1;
            }else{
                i = 2;
            }
            if(game.isMatch(game.getCh(2), game.getItem(i))){
                updScore(getSc());
                game.updStuff(game.getItem(i));
                game.updItem(i, "");
                aMatch(i);
                ta.setText("Correct! You got " + Integer.toString(getSc()) + "Point");
            }else{
                game.updStuff(game.getItem(i));
                game.updItem(i, "");
                aMatch(i);
                ta.setText("Oops, you're wrong.");
            }
            refresh();

            if(isClear()){
                game.clear();
                gameOver();
            }
        }
    }//GEN-LAST:event_char3MouseClicked
     
    private void item2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item2MouseClicked
        if(item2.getIcon() != null){
            if(it2){
                item2.setBorder(border1);
                it2 = false;
            }else{
                item2.setBorder(border2);
                it2 = true;
                System.out.println("Item 2 act");
                System.out.println(game.getItem(1));
                if(!it1 || !it3){
                    it1 = false;
                    it3 = false;
                    item1.setBorder(border1);
                    item3.setBorder(border1);
                }
            }
        }
    }//GEN-LAST:event_item2MouseClicked

    private void item1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item1MouseClicked
        if(item1.getIcon() != null){
            if(it1){
                item1.setBorder(border1);
                it1 = false;
            }else{
                item1.setBorder(border2);
                it1 = true;
                System.out.println("Item 1 act");
                System.out.println(game.getCh(0));
                System.out.println(game.getItem(0));
                if(!it2 || !it3){
                    it2 = false;
                    it3 = false;
                    item2.setBorder(border1);
                    item3.setBorder(border1);
                }
            }
        }
    }//GEN-LAST:event_item1MouseClicked

    private void item3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item3MouseClicked
        if(item3.getIcon() != null){
            if(it3){
                item3.setBorder(border1);
                it3 = false;
                System.out.println("Item 3 act");
            }else{
                item3.setBorder(border2);
                it3 = true;
                if(!it1 || !it2){
                    it1 = false;
                    it2 = false;
                    item1.setBorder(border1);
                    item2.setBorder(border1);
                }
            }
        }
    }//GEN-LAST:event_item3MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(fMain_room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fMain_room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fMain_room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fMain_room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                fMain_room m = new fMain_room();
                m.pack();
                m.setLocationRelativeTo(null);
                m.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LChar;
    private javax.swing.JButton bBack;
    private javax.swing.JLabel char1;
    private javax.swing.JLabel char2;
    private javax.swing.JLabel char3;
    private javax.swing.JLabel ctc;
    private javax.swing.JLabel item1;
    private javax.swing.JLabel item2;
    private javax.swing.JLabel item3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jktch1;
    private javax.swing.JLabel jktch2;
    private javax.swing.JLabel jmch2;
    private javax.swing.JLabel jmch3;
    private javax.swing.JLabel jmch4;
    private javax.swing.JLabel kcmtch1;
    private javax.swing.JLabel kcmtch2;
    private javax.swing.JLabel klgch2;
    private javax.swing.JLabel klgch3;
    private javax.swing.JLabel lblTimer;
    private javax.swing.JLabel mkch1;
    private javax.swing.JLabel p1;
    private javax.swing.JLabel p2;
    private javax.swing.JTextArea ta;
    private javax.swing.JLabel topich1;
    private javax.swing.JLabel topich2;
    private javax.swing.JLabel topich3;
    // End of variables declaration//GEN-END:variables
}
