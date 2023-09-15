/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hide_Seek_Match;

import java.awt.Image;
import javax.swing.ImageIcon;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Random;

/**
 *
 * @author hp
 */
public class fRoom_1 extends javax.swing.JFrame {

    int c_room;
    fMain_room buka = new fMain_room();
    gameon game = new gameon();
    Random rand = new Random();
    static boolean aa1, aa2, aa3, aa4, aa5, aa6, aa8, aa9, aa0, bb0;
    static int aa7;
    Timer myTimer = new Timer();
    
    public fRoom_1(Boolean bl){
        initComponents();
        
        c_room = 1;
        load_room(c_room);
        
        
        TimerTask task = new TimerTask(){
            public void run(){
                
                if(bl)
                    game.time_elaps();
                
                lblTimer.setText(Integer.toString(game.getTime()));
                
                if(game.getTime() <= 0){
                    myTimer.cancel();
                    myTimer.purge();
                    gameOver();
                }
            }
        };
        
        myTimer.scheduleAtFixedRate(task, 1000, 1000);
        
        load_stuff(bl);
        load_item();
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
    
    public void load_room(int curr_room){
        switch(curr_room){
            case 1: p1.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Hide_Seek_Match/images/r11.jpg")).getImage().getScaledInstance(p1.getWidth(), p1.getHeight(), Image.SCALE_SMOOTH)));
                jaket11.setVisible(true);
                topi11.setVisible(true);
                topi12.setVisible(true);
                kcmt11.setVisible(true);
                kcmt12.setVisible(true);
                masker11.setVisible(true);
                masker12.setVisible(true);
                
                jaket21.setVisible(false);
                jaket22.setVisible(false);
                jaket23.setVisible(false);
                jam21.setVisible(false);
                jam22.setVisible(false);
                jam23.setVisible(false);
                kalung21.setVisible(false);
                kalung22.setVisible(false);
                topi21.setVisible(false);
                topi22.setVisible(false);
                jam31.setVisible(false);
                kalung31.setVisible(false);
                kalung32.setVisible(false);
                kcmt31.setVisible(false);
                kcmt32.setVisible(false);
                masker31.setVisible(false);
                masker32.setVisible(false);
                topi31.setVisible(false);
                
                bPrev.setEnabled(false);
                bNext.setEnabled(true);
                break;
            case 2: p1.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Hide_Seek_Match/images/r22.jpg")).getImage().getScaledInstance(p1.getWidth(), p1.getHeight(), Image.SCALE_SMOOTH)));
                jaket11.setVisible(false);
                topi11.setVisible(false);
                topi12.setVisible(false);
                kcmt11.setVisible(false);
                kcmt12.setVisible(false);
                masker11.setVisible(false);
                masker12.setVisible(false);
                
                jaket21.setVisible(true);
                jaket22.setVisible(true);
                jaket23.setVisible(true);
                jam21.setVisible(true);
                jam22.setVisible(true);
                jam23.setVisible(true);
                kalung21.setVisible(true);
                kalung22.setVisible(true);
                topi21.setVisible(true);
                topi22.setVisible(true);
                
                jam31.setVisible(false);
                kalung31.setVisible(false);
                kalung32.setVisible(false);
                kcmt31.setVisible(false);
                kcmt32.setVisible(false);
                masker31.setVisible(false);
                masker32.setVisible(false);
                topi31.setVisible(false);
            
                bPrev.setEnabled(true);
                bNext.setEnabled(true);
                break;
            case 3: p1.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Hide_Seek_Match/images/r33.jpg")).getImage().getScaledInstance(p1.getWidth(), p1.getHeight(), Image.SCALE_SMOOTH)));
                jaket11.setVisible(false);
                topi11.setVisible(false);
                topi12.setVisible(false);
                kcmt11.setVisible(false);
                kcmt12.setVisible(false);
                masker11.setVisible(false);
                masker12.setVisible(false);
                jaket21.setVisible(false);
                jaket22.setVisible(false);
                jaket23.setVisible(false);
                jam21.setVisible(false);
                jam22.setVisible(false);
                jam23.setVisible(false);
                kalung21.setVisible(false);
                kalung22.setVisible(false);
                topi21.setVisible(false);
                topi22.setVisible(false);
                
                jam31.setVisible(true);
                kalung31.setVisible(true);
                kalung32.setVisible(true);
                kcmt31.setVisible(true);
                kcmt32.setVisible(true);
                masker31.setVisible(true);
                masker32.setVisible(true);
                topi31.setVisible(true);
            
                bPrev.setEnabled(true);
                bNext.setEnabled(false);
                break;
        }
    }
    
    public void gameOver(){
        buka.gameOver();
        this.dispose();
    }
    
    private void load_stuff(Boolean b){
        int i = 0;
        
        while(i < 5){
            String str = game.gv_stuff2(i);
            
            switch(str){
                case "glassess1":
                    if(b){
                        Boolean a1 = rand.nextBoolean();
                        game.updLs(0, a1);
                    }
                    if(game.getLs(0))
                        kcmt11.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Hide_Seek_Match/images/glassess1.png")).getImage().getScaledInstance(kcmt11.getWidth(), kcmt11.getHeight(), Image.SCALE_SMOOTH)));
                    else
                        kcmt31.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Hide_Seek_Match/images/glassess1.png")).getImage().getScaledInstance(kcmt31.getWidth(), kcmt31.getHeight(), Image.SCALE_SMOOTH)));
                    break;
                case "glassess2":
                    if(b){
                        Boolean a1 = rand.nextBoolean();
                        game.updLs(1, a1);
                    }
                    if(game.getLs(1))
                        kcmt12.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Hide_Seek_Match/images/glassess2.png")).getImage().getScaledInstance(kcmt12.getWidth(), kcmt12.getHeight(), Image.SCALE_SMOOTH)));
                    else
                        kcmt32.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Hide_Seek_Match/images/glassess2.png")).getImage().getScaledInstance(kcmt32.getWidth(), kcmt32.getHeight(), Image.SCALE_SMOOTH)));
                    break;
                case "hat":
                    topi21.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Hide_Seek_Match/images/hat.png")).getImage().getScaledInstance(topi21.getWidth(), topi21.getHeight(), Image.SCALE_SMOOTH)));
                    break;
                case "hat1":
                    if(b){
                        Boolean a1 = rand.nextBoolean();
                        game.updLs(2, a1);
                    }
                    if(game.getLs(2))
                        topi11.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Hide_Seek_Match/images/hat1.png")).getImage().getScaledInstance(topi11.getWidth(), topi11.getHeight(), Image.SCALE_SMOOTH)));
                    else
                        topi31.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Hide_Seek_Match/images/hat1.png")).getImage().getScaledInstance(topi31.getWidth(), topi31.getHeight(), Image.SCALE_SMOOTH)));
                    break;
                case "hat2":
                    if(b){
                        Boolean a1 = rand.nextBoolean();
                        game.updLs(3, a1);
                    }
                    if(game.getLs(3))
                        topi12.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Hide_Seek_Match/images/hat2.png")).getImage().getScaledInstance(topi12.getWidth(), topi12.getHeight(), Image.SCALE_SMOOTH)));
                    else
                        topi22.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Hide_Seek_Match/images/hat2.png")).getImage().getScaledInstance(topi22.getWidth(), topi22.getHeight(), Image.SCALE_SMOOTH)));
                    break;
                case "jacket1":
                    if(b){
                        Boolean a1 = rand.nextBoolean();
                        game.updLs(4, a1);
                    }
                    if(game.getLs(4))
                        jaket11.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Hide_Seek_Match/images/jacket1.png")).getImage().getScaledInstance(jaket11.getWidth(), jaket11.getHeight(), Image.SCALE_SMOOTH)));
                    else
                        jaket21.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Hide_Seek_Match/images/jacket1.png")).getImage().getScaledInstance(jaket21.getWidth(), jaket21.getHeight(), Image.SCALE_SMOOTH)));
                    break;
                case "jacket2":
                    if(b){
                        Boolean a1 = rand.nextBoolean();
                        game.updLs(5, a1);
                    }
                    if(game.getLs(5))
                        jaket22.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Hide_Seek_Match/images/jacket2.png")).getImage().getScaledInstance(jaket22.getWidth(), jaket22.getHeight(), Image.SCALE_SMOOTH)));
                    else
                        jaket23.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Hide_Seek_Match/images/jacket2.png")).getImage().getScaledInstance(jaket23.getWidth(), jaket23.getHeight(), Image.SCALE_SMOOTH)));
                    break;
                case "masker":
                    if(b){
                        int a7 = rand.nextInt(4);
                        game.updLs2(a7);
                    }
                    switch(game.getLs2()){
                        case 0:
                            masker11.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Hide_Seek_Match/images/masker.png")).getImage().getScaledInstance(masker11.getWidth(), masker11.getHeight(), Image.SCALE_SMOOTH)));
                            break;
                        case 1:
                            masker12.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Hide_Seek_Match/images/masker.png")).getImage().getScaledInstance(masker12.getWidth(), masker12.getHeight(), Image.SCALE_SMOOTH)));
                            break;
                        case 2:
                            masker31.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Hide_Seek_Match/images/masker.png")).getImage().getScaledInstance(masker31.getWidth(), masker31.getHeight(), Image.SCALE_SMOOTH)));
                            break;
                        case 3:
                            masker32.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Hide_Seek_Match/images/masker.png")).getImage().getScaledInstance(masker32.getWidth(), masker32.getHeight(), Image.SCALE_SMOOTH)));
                            break;
                    }
                    break;
                case "necklace1":
                    if(b){
                        Boolean a1 = rand.nextBoolean();
                        game.updLs(6, a1);
                    }
                    if(game.getLs(6))
                        kalung21.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Hide_Seek_Match/images/necklace1.png")).getImage().getScaledInstance(kalung21.getWidth(), kalung21.getHeight(), Image.SCALE_SMOOTH)));
                    else
                        kalung22.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Hide_Seek_Match/images/necklace1.png")).getImage().getScaledInstance(kalung22.getWidth(), kalung22.getHeight(), Image.SCALE_SMOOTH)));
                    break;
                case "necklace2":
                    if(b){
                        Boolean a1 = rand.nextBoolean();
                        game.updLs(7, a1);
                    }
                    if(game.getLs(7))
                        kalung31.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Hide_Seek_Match/images/necklace2.png")).getImage().getScaledInstance(kalung31.getWidth(), kalung31.getHeight(), Image.SCALE_SMOOTH)));
                    else
                        kalung32.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Hide_Seek_Match/images/necklace2.png")).getImage().getScaledInstance(kalung32.getWidth(), kalung32.getHeight(), Image.SCALE_SMOOTH)));
                    break;
                case "watch1":
                    if(b){
                        Boolean a1 = rand.nextBoolean();
                        game.updLs(8, a1);
                    }
                    if(game.getLs(8))
                        jam21.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Hide_Seek_Match/images/watch1.png")).getImage().getScaledInstance(jam21.getWidth(), jam21.getHeight(), Image.SCALE_SMOOTH)));
                    else
                        jam22.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Hide_Seek_Match/images/watch1.png")).getImage().getScaledInstance(jam22.getWidth(), jam22.getHeight(), Image.SCALE_SMOOTH)));
                    break;
                case "watch2":
                    if(b){
                        Boolean a1 = rand.nextBoolean();
                        game.updLs(9, a1);
                    }
                    if(game.getLs(9))
                        jam23.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Hide_Seek_Match/images/watch2.png")).getImage().getScaledInstance(jam23.getWidth(), jam23.getHeight(), Image.SCALE_SMOOTH)));
                    else
                        jam31.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Hide_Seek_Match/images/watch2.png")).getImage().getScaledInstance(jam31.getWidth(), jam31.getHeight(), Image.SCALE_SMOOTH)));
                    break;
            }    
            i++;
        }
    }
    
    private void setItem(String str){
        if(item1.getIcon() == null){
            item1.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Hide_Seek_Match/images/" + str + ".png")).getImage().getScaledInstance(item1.getWidth(), item1.getHeight(), Image.SCALE_SMOOTH)));
            game.updItem(0, str);
        }else if(item2.getIcon() == null){
            item2.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Hide_Seek_Match/images/" + str + ".png")).getImage().getScaledInstance(item2.getWidth(), item2.getHeight(), Image.SCALE_SMOOTH)));
            game.updItem(1, str);
        }else{
            item3.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Hide_Seek_Match/images/" + str + ".png")).getImage().getScaledInstance(item3.getWidth(), item3.getHeight(), Image.SCALE_SMOOTH)));
            game.updItem(2, str);
        }
        game.updStuff2(str);
    }
    
    private Boolean isAvailable(){
        if(item1.getIcon() == null){
            return true;
        }else if(item2.getIcon() == null){
            return true;
        }else if(item3.getIcon() == null){
            return true;
        }else{
            return false;
        }
    }
    
    public String found_obj(String str){
        switch(str){
            case "glassess1":
            case "glassess2":
                str = "n Eyeglassess.";
                break;
            case "hat":
            case "hat1":
            case "hat2":
                str = " Hat.";
                break;
            case "jacket1":
            case "jacket2":
                str = " Jacket.";
                break;
            case "masker":
                str = " Masker.";
                break;
            case "necklace1":
            case "necklace2":
                str = " Necklace";
                break;
            case "watch1":
            case "watch2":
                str = " Watch.";
                break;
        }
        return str;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTimer = new javax.swing.JLabel();
        bPrev = new javax.swing.JButton();
        bNext = new javax.swing.JButton();
        masker11 = new javax.swing.JLabel();
        masker12 = new javax.swing.JLabel();
        kcmt11 = new javax.swing.JLabel();
        kcmt12 = new javax.swing.JLabel();
        topi11 = new javax.swing.JLabel();
        topi12 = new javax.swing.JLabel();
        jaket11 = new javax.swing.JLabel();
        jam21 = new javax.swing.JLabel();
        jam22 = new javax.swing.JLabel();
        jam23 = new javax.swing.JLabel();
        kalung21 = new javax.swing.JLabel();
        kalung22 = new javax.swing.JLabel();
        jaket21 = new javax.swing.JLabel();
        jaket22 = new javax.swing.JLabel();
        jaket23 = new javax.swing.JLabel();
        topi21 = new javax.swing.JLabel();
        topi22 = new javax.swing.JLabel();
        masker31 = new javax.swing.JLabel();
        masker32 = new javax.swing.JLabel();
        kcmt31 = new javax.swing.JLabel();
        kcmt32 = new javax.swing.JLabel();
        kalung31 = new javax.swing.JLabel();
        kalung32 = new javax.swing.JLabel();
        jam31 = new javax.swing.JLabel();
        topi31 = new javax.swing.JLabel();
        p1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        item1 = new javax.swing.JLabel();
        item2 = new javax.swing.JLabel();
        item3 = new javax.swing.JLabel();
        bGuess = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hide-Seek-Match");
        setName("fRoom_1"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(930, 680));

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.setLayout(null);

        lblTimer.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTimer.setForeground(new java.awt.Color(255, 255, 0));
        jPanel1.add(lblTimer);
        lblTimer.setBounds(20, 20, 70, 30);

        bPrev.setText("<< Prev");
        bPrev.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bPrev.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bPrevMouseClicked(evt);
            }
        });
        jPanel1.add(bPrev);
        bPrev.setBounds(10, 440, 73, 23);

        bNext.setText("Next >>");
        bNext.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bNextMouseClicked(evt);
            }
        });
        jPanel1.add(bNext);
        bNext.setBounds(670, 440, 73, 23);

        masker11.setForeground(java.awt.Color.yellow);
        masker11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        masker11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                masker11MouseClicked(evt);
            }
        });
        jPanel1.add(masker11);
        masker11.setBounds(30, 300, 50, 20);

        masker12.setForeground(java.awt.Color.yellow);
        masker12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        masker12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                masker12MouseClicked(evt);
            }
        });
        jPanel1.add(masker12);
        masker12.setBounds(660, 230, 50, 20);

        kcmt11.setForeground(java.awt.Color.blue);
        kcmt11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kcmt11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kcmt11MouseClicked(evt);
            }
        });
        jPanel1.add(kcmt11);
        kcmt11.setBounds(450, 380, 40, 20);

        kcmt12.setForeground(java.awt.Color.blue);
        kcmt12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kcmt12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kcmt12MouseClicked(evt);
            }
        });
        jPanel1.add(kcmt12);
        kcmt12.setBounds(100, 254, 40, 20);

        topi11.setForeground(java.awt.Color.green);
        topi11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        topi11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                topi11MouseClicked(evt);
            }
        });
        jPanel1.add(topi11);
        topi11.setBounds(520, 420, 50, 20);

        topi12.setForeground(java.awt.Color.green);
        topi12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        topi12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                topi12MouseClicked(evt);
            }
        });
        jPanel1.add(topi12);
        topi12.setBounds(590, 250, 40, 20);

        jaket11.setForeground(java.awt.Color.pink);
        jaket11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jaket11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jaket11MouseClicked(evt);
            }
        });
        jPanel1.add(jaket11);
        jaket11.setBounds(410, 190, 40, 110);

        jam21.setForeground(java.awt.Color.magenta);
        jam21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jam21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jam21MouseClicked(evt);
            }
        });
        jPanel1.add(jam21);
        jam21.setBounds(710, 380, 20, 20);

        jam22.setForeground(java.awt.Color.magenta);
        jam22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jam22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jam22MouseClicked(evt);
            }
        });
        jPanel1.add(jam22);
        jam22.setBounds(150, 310, 20, 20);

        jam23.setForeground(java.awt.Color.magenta);
        jam23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jam23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jam23MouseClicked(evt);
            }
        });
        jPanel1.add(jam23);
        jam23.setBounds(610, 290, 20, 20);

        kalung21.setForeground(java.awt.Color.red);
        kalung21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kalung21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kalung21MouseClicked(evt);
            }
        });
        jPanel1.add(kalung21);
        kalung21.setBounds(430, 240, 20, 20);

        kalung22.setForeground(java.awt.Color.red);
        kalung22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kalung22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kalung22MouseClicked(evt);
            }
        });
        jPanel1.add(kalung22);
        kalung22.setBounds(660, 360, 20, 20);

        jaket21.setForeground(java.awt.Color.pink);
        jaket21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jaket21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jaket21MouseClicked(evt);
            }
        });
        jPanel1.add(jaket21);
        jaket21.setBounds(620, 320, 60, 30);

        jaket22.setForeground(java.awt.Color.pink);
        jaket22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jaket22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jaket22MouseClicked(evt);
            }
        });
        jPanel1.add(jaket22);
        jaket22.setBounds(220, 220, 70, 130);

        jaket23.setForeground(java.awt.Color.pink);
        jaket23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jaket23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jaket23MouseClicked(evt);
            }
        });
        jPanel1.add(jaket23);
        jaket23.setBounds(300, 290, 70, 90);

        topi21.setForeground(java.awt.Color.green);
        topi21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        topi21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                topi21MouseClicked(evt);
            }
        });
        jPanel1.add(topi21);
        topi21.setBounds(390, 300, 50, 30);

        topi22.setForeground(java.awt.Color.green);
        topi22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        topi22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                topi22MouseClicked(evt);
            }
        });
        jPanel1.add(topi22);
        topi22.setBounds(490, 390, 40, 20);

        masker31.setForeground(java.awt.Color.yellow);
        masker31.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        masker31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                masker31MouseClicked(evt);
            }
        });
        jPanel1.add(masker31);
        masker31.setBounds(680, 130, 20, 50);

        masker32.setForeground(java.awt.Color.yellow);
        masker32.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        masker32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                masker32MouseClicked(evt);
            }
        });
        jPanel1.add(masker32);
        masker32.setBounds(40, 390, 50, 20);

        kcmt31.setForeground(java.awt.Color.blue);
        kcmt31.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kcmt31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kcmt31MouseClicked(evt);
            }
        });
        jPanel1.add(kcmt31);
        kcmt31.setBounds(520, 260, 40, 20);

        kcmt32.setForeground(java.awt.Color.blue);
        kcmt32.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kcmt32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kcmt32MouseClicked(evt);
            }
        });
        jPanel1.add(kcmt32);
        kcmt32.setBounds(120, 280, 40, 20);

        kalung31.setForeground(java.awt.Color.red);
        kalung31.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kalung31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kalung31MouseClicked(evt);
            }
        });
        jPanel1.add(kalung31);
        kalung31.setBounds(310, 450, 20, 20);

        kalung32.setForeground(java.awt.Color.red);
        kalung32.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kalung32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kalung32MouseClicked(evt);
            }
        });
        jPanel1.add(kalung32);
        kalung32.setBounds(230, 50, 20, 40);

        jam31.setForeground(java.awt.Color.magenta);
        jam31.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jam31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jam31MouseClicked(evt);
            }
        });
        jPanel1.add(jam31);
        jam31.setBounds(270, 240, 30, 20);

        topi31.setForeground(java.awt.Color.green);
        topi31.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        topi31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                topi31MouseClicked(evt);
            }
        });
        jPanel1.add(topi31);
        topi31.setBounds(420, 420, 70, 40);
        jPanel1.add(p1);
        p1.setBounds(0, 0, 760, 480);

        jScrollPane1.setAutoscrolls(true);

        ta.setEditable(false);
        ta.setColumns(20);
        ta.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        ta.setLineWrap(true);
        ta.setRows(5);
        ta.setText("Find the hidden items.");
        ta.setWrapStyleWord(true);
        ta.setAutoscrolls(false);
        ta.setFocusable(false);
        jScrollPane1.setViewportView(ta);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("ITEMS");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(40, 20, 52, 30);

        item1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.add(item1);
        item1.setBounds(10, 60, 110, 110);

        item2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.add(item2);
        item2.setBounds(10, 200, 110, 110);

        item3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.add(item3);
        item3.setBounds(10, 340, 110, 110);

        bGuess.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bGuess.setText("Guess");
        bGuess.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bGuess.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bGuessMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 759, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bGuess, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(bGuess, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bPrevMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bPrevMouseClicked
        if(bPrev.isEnabled()){
            c_room--;
            load_room(c_room);
        }
    }//GEN-LAST:event_bPrevMouseClicked

    private void bNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bNextMouseClicked
        if(bNext.isEnabled()){
            c_room++;
            load_room(c_room);
        }
    }//GEN-LAST:event_bNextMouseClicked

    private void bGuessMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bGuessMouseClicked
        fMain_room bklg = new fMain_room();
        bklg.pack();
        bklg.setLocationRelativeTo(null);
        bklg.show();
        this.hide();
    }//GEN-LAST:event_bGuessMouseClicked

    private void masker11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masker11MouseClicked
        if(masker11.getIcon() != null){
            if(isAvailable()){
                String st = "masker";
                setItem(st);
                ta.setText("You have found a" + found_obj(st));
                masker11.setIcon(null);
            }
            else
                ta.setText("Your hand is full. Let's click the \"Guess\" button to bring the item back to the owner.");
        }
    }//GEN-LAST:event_masker11MouseClicked

    private void masker12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masker12MouseClicked
        if(masker12.getIcon() != null){
            if(isAvailable()){
                String st = "masker";
                setItem(st);
                ta.setText("You have found a" + found_obj(st));
                masker12.setIcon(null);
            }
            else
                ta.setText("Your hand is full. Let's click the \"Guess\" button to bring the item back to the owner.");
        }
    }//GEN-LAST:event_masker12MouseClicked

    private void kcmt11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kcmt11MouseClicked
        if(kcmt11.getIcon() != null){
            if(isAvailable()){
                String st = "glassess1";
                setItem(st);
                ta.setText("You have found a" + found_obj(st));
                kcmt11.setIcon(null);
            }
            else
                ta.setText("Your hand is full. Let's click the \"Guess\" button to bring the item back to the owner.");
        }
    }//GEN-LAST:event_kcmt11MouseClicked

    private void kcmt12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kcmt12MouseClicked
        if(kcmt12.getIcon() != null){
            if(isAvailable()){
                String st = "glassess2";
                setItem(st);
                ta.setText("You have found a" + found_obj(st));
                kcmt12.setIcon(null);
            }
            else
                ta.setText("Your hand is full. Let's click the \"Guess\" button to bring the item back to the owner.");
        }
    }//GEN-LAST:event_kcmt12MouseClicked

    private void topi11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topi11MouseClicked
        if(topi11.getIcon() != null){
            if(isAvailable()){
                String st = "hat1";
                setItem(st);
                ta.setText("You have found a" + found_obj(st));
                topi11.setIcon(null);
            }
            else
                ta.setText("Your hand is full. Let's click the \"Guess\" button to bring the item back to the owner.");
        }
    }//GEN-LAST:event_topi11MouseClicked

    private void topi12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topi12MouseClicked
        if(topi12.getIcon() != null){
            if(isAvailable()){
                String st = "hat2";
                setItem(st);
                ta.setText("You have found a" + found_obj(st));
                topi12.setIcon(null);
            }
            else
                ta.setText("Your hand is full. Let's click the \"Guess\" button to bring the item back to the owner.");
        }
    }//GEN-LAST:event_topi12MouseClicked

    private void jaket11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jaket11MouseClicked
        if(jaket11.getIcon() != null){
            if(isAvailable()){
                String st = "jacket1";
                setItem(st);
                ta.setText("You have found a" + found_obj(st));
                jaket11.setIcon(null);
            }
            else
                ta.setText("Your hand is full. Let's click the \"Guess\" button to bring the item back to the owner.");
        }
    }//GEN-LAST:event_jaket11MouseClicked

    private void jam21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jam21MouseClicked
        if(jam21.getIcon() != null){
            if(isAvailable()){
                String st = "watch1";
                setItem(st);
                ta.setText("You have found a" + found_obj(st));
                jam21.setIcon(null);
            }
            else
                ta.setText("Your hand is full. Let's click the \"Guess\" button to bring the item back to the owner.");
        }
    }//GEN-LAST:event_jam21MouseClicked

    private void jam22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jam22MouseClicked
        if(jam22.getIcon() != null){
            if(isAvailable()){
                String st = "watch1";
                setItem(st);
                ta.setText("You have found a" + found_obj(st));
                jam22.setIcon(null);
            }
            else
                ta.setText("Your hand is full. Let's click the \"Guess\" button to bring the item back to the owner.");
        }
    }//GEN-LAST:event_jam22MouseClicked

    private void jam23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jam23MouseClicked
        if(jam23.getIcon() != null){
            if(isAvailable()){
                String st = "watch2";
                setItem(st);
                ta.setText("You have found a" + found_obj(st));
                jam23.setIcon(null);
            }
            else
                ta.setText("Your hand is full. Let's click the \"Guess\" button to bring the item back to the owner.");
        }
    }//GEN-LAST:event_jam23MouseClicked

    private void kalung21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kalung21MouseClicked
        if(kalung21.getIcon() != null){
            if(isAvailable()){
                String st = "necklace1";
                setItem(st);
                ta.setText("You have found a" + found_obj(st));
                kalung21.setIcon(null);
            }
            else
                ta.setText("Your hand is full. Let's click the \"Guess\" button to bring the item back to the owner.");
        }
    }//GEN-LAST:event_kalung21MouseClicked

    private void kalung22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kalung22MouseClicked
        if(kalung22.getIcon() != null){
            if(isAvailable()){
                String st = "necklace1";
                setItem(st);
                ta.setText("You have found a" + found_obj(st));
                kalung22.setIcon(null);
            }
            else
                ta.setText("Your hand is full. Let's click the \"Guess\" button to bring the item back to the owner.");
        }
    }//GEN-LAST:event_kalung22MouseClicked

    private void jaket21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jaket21MouseClicked
        if(jaket21.getIcon() != null){
            if(isAvailable()){
                String st = "jacket1";
                setItem(st);
                ta.setText("You have found a" + found_obj(st));
                jaket21.setIcon(null);
            }
            else
                ta.setText("Your hand is full. Let's click the \"Guess\" button to bring the item back to the owner.");
        }
    }//GEN-LAST:event_jaket21MouseClicked

    private void jaket22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jaket22MouseClicked
        if(jaket22.getIcon() != null){
            if(isAvailable()){
                String st = "jacket2";
                setItem(st);
                ta.setText("You have found a" + found_obj(st));
                jaket22.setIcon(null);
            }
            else
                ta.setText("Your hand is full. Let's click the \"Guess\" button to bring the item back to the owner.");
        }
    }//GEN-LAST:event_jaket22MouseClicked

    private void jaket23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jaket23MouseClicked
        if(jaket23.getIcon() != null){
            if(isAvailable()){
                String st = "jacket2";
                setItem(st);
                ta.setText("You have found a" + found_obj(st));
                jaket23.setIcon(null);
            }
            else
                ta.setText("Your hand is full. Let's click the \"Guess\" button to bring the item back to the owner.");
        }
    }//GEN-LAST:event_jaket23MouseClicked

    private void topi21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topi21MouseClicked
        if(topi21.getIcon() != null){
            if(isAvailable()){
                String st = "hat";
                setItem(st);
                ta.setText("You have found a" + found_obj(st));
                topi21.setIcon(null);
            }
            else
                ta.setText("Your hand is full. Let's click the \"Guess\" button to bring the item back to the owner.");
        }
    }//GEN-LAST:event_topi21MouseClicked

    private void masker31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masker31MouseClicked
        if(masker31.getIcon() != null){
            if(isAvailable()){
                String st = "masker";
                setItem(st);
                ta.setText("You have found a" + found_obj(st));
                masker31.setIcon(null);
            }
            else
                ta.setText("Your hand is full. Let's click the \"Guess\" button to bring the item back to the owner.");
        }
    }//GEN-LAST:event_masker31MouseClicked

    private void masker32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masker32MouseClicked
        if(masker32.getIcon() != null){
            if(isAvailable()){
                String st = "masker";
                setItem(st);
                ta.setText("You have found a" + found_obj(st));
                masker32.setIcon(null);
            }
            else
                ta.setText("Your hand is full. Let's click the \"Guess\" button to bring the item back to the owner.");
        }
    }//GEN-LAST:event_masker32MouseClicked

    private void kcmt31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kcmt31MouseClicked
        if(kcmt31.getIcon() != null){
            if(isAvailable()){
                String st = "glassess1";
                setItem(st);
                ta.setText("You have found a" + found_obj(st));
                kcmt31.setIcon(null);
            }
            else
                ta.setText("Your hand is full. Let's click the \"Guess\" button to bring the item back to the owner.");
        }
    }//GEN-LAST:event_kcmt31MouseClicked

    private void kcmt32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kcmt32MouseClicked
        if(kcmt32.getIcon() != null){
            if(isAvailable()){
                String st = "glassess2";
                setItem(st);
                ta.setText("You have found a" + found_obj(st));
                kcmt32.setIcon(null);
            }
            else
                ta.setText("Your hand is full. Let's click the \"Guess\" button to bring the item back to the owner.");
        }
    }//GEN-LAST:event_kcmt32MouseClicked

    private void kalung31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kalung31MouseClicked
        if(kalung31.getIcon() != null){
            if(isAvailable()){
                String st = "necklace2";
                setItem(st);
                ta.setText("You have found a" + found_obj(st));
                kalung31.setIcon(null);
            }
            else
                ta.setText("Your hand is full. Let's click the \"Guess\" button to bring the item back to the owner.");
        }
    }//GEN-LAST:event_kalung31MouseClicked

    private void kalung32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kalung32MouseClicked
        if(kalung32.getIcon() != null){
            if(isAvailable()){
                String st = "necklace2";
                setItem(st);
                ta.setText("You have found a" + found_obj(st));
                kalung32.setIcon(null);
            }
            else
                ta.setText("Your hand is full. Let's click the \"Guess\" button to bring the item back to the owner.");
        }
    }//GEN-LAST:event_kalung32MouseClicked

    private void jam31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jam31MouseClicked
        if(jam31.getIcon() != null){
            if(isAvailable()){
                String st = "watch2";
                setItem(st);
                ta.setText("You have found a" + found_obj(st));
                jam31.setIcon(null);
            }
            else
                ta.setText("Your hand is full. Let's click the \"Guess\" button to bring the item back to the owner.");
        }
    }//GEN-LAST:event_jam31MouseClicked

    private void topi31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topi31MouseClicked
        if(topi31.getIcon() != null){
            if(isAvailable()){
                String st = "hat1";
                setItem(st);
                ta.setText("You have found a" + found_obj(st));
                topi31.setIcon(null);
            }
            else
                ta.setText("Your hand is full. Let's click the \"Guess\" button to bring the item back to the owner.");
        }
    }//GEN-LAST:event_topi31MouseClicked

    private void topi22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topi22MouseClicked
        if(topi22.getIcon() != null){
            if(isAvailable()){
                String st = "hat2";
                setItem(st);
                ta.setText("You have found a" + found_obj(st));
                topi22.setIcon(null);
            }
            else
                ta.setText("Your hand is full. Let's click the \"Guess\" button to bring the item back to the owner.");
        }
    }//GEN-LAST:event_topi22MouseClicked

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
            java.util.logging.Logger.getLogger(fRoom_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fRoom_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fRoom_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fRoom_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                fRoom_1 m = new fRoom_1(true);
                m.pack();
                m.setLocationRelativeTo(null);
                m.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bGuess;
    private javax.swing.JButton bNext;
    private javax.swing.JButton bPrev;
    private javax.swing.JLabel item1;
    private javax.swing.JLabel item2;
    private javax.swing.JLabel item3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jaket11;
    private javax.swing.JLabel jaket21;
    private javax.swing.JLabel jaket22;
    private javax.swing.JLabel jaket23;
    private javax.swing.JLabel jam21;
    private javax.swing.JLabel jam22;
    private javax.swing.JLabel jam23;
    private javax.swing.JLabel jam31;
    private javax.swing.JLabel kalung21;
    private javax.swing.JLabel kalung22;
    private javax.swing.JLabel kalung31;
    private javax.swing.JLabel kalung32;
    private javax.swing.JLabel kcmt11;
    private javax.swing.JLabel kcmt12;
    private javax.swing.JLabel kcmt31;
    private javax.swing.JLabel kcmt32;
    private javax.swing.JLabel lblTimer;
    private javax.swing.JLabel masker11;
    private javax.swing.JLabel masker12;
    private javax.swing.JLabel masker31;
    private javax.swing.JLabel masker32;
    private javax.swing.JLabel p1;
    private javax.swing.JTextArea ta;
    private javax.swing.JLabel topi11;
    private javax.swing.JLabel topi12;
    private javax.swing.JLabel topi21;
    private javax.swing.JLabel topi22;
    private javax.swing.JLabel topi31;
    // End of variables declaration//GEN-END:variables
}
