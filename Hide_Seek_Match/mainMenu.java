/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hide_Seek_Match;


import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;

import javax.swing.JOptionPane;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.*;
import java.util.*;
/**
 *
 * @author Dimas Yudha
 */
public class mainMenu extends javax.swing.JFrame {

    /**
     * Creates new form mainMenu
     */
    public mainMenu() {
        initComponents();
        
        default1();
        jLabel2.setText("\u00a9 R&D PRODUCTION \u00a9");
    }
    boolean clicked2;
    
    static String player,namep;
    
    boolean click1, click2, clicked;
    
    
    
    public String player1(){
        return player;
    }
    
    private void default1(){
        
        jPanel8.setVisible(false);
        jPanel9.setVisible(false);
        jLabel4.setVisible(false);
        pnlAbt.setVisible(false);
        
        inputnametext.setVisible(false);
        Mulaibtn.setVisible(false);
        Highscorepane.setVisible(false);
        
        aulia11.setVisible(false);
        harry11.setVisible(false);
        sarah11.setVisible(false);
        peter11.setVisible(false);
        
        aulia11.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Hide_Seek_Match/images/aulia10.png")).getImage().getScaledInstance(aulia11.getWidth(), aulia11.getHeight(), Image.SCALE_SMOOTH)));
        harry11.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Hide_Seek_Match/images/harry10.png")).getImage().getScaledInstance(harry11.getWidth(), harry11.getHeight(), Image.SCALE_SMOOTH)));
        peter11.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Hide_Seek_Match/images/peter10.png")).getImage().getScaledInstance(peter11.getWidth(), peter11.getHeight(), Image.SCALE_SMOOTH)));
        sarah11.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Hide_Seek_Match/images/sarah10.png")).getImage().getScaledInstance(sarah11.getWidth(), sarah11.getHeight(), Image.SCALE_SMOOTH)));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        inputnametext = new javax.swing.JTextField();
        Mulaibtn = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        historyPane5 = new javax.swing.JScrollPane();
        hnama2 = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        aulia11 = new javax.swing.JLabel();
        harry11 = new javax.swing.JLabel();
        peter11 = new javax.swing.JLabel();
        sarah11 = new javax.swing.JLabel();
        Highscorepane = new javax.swing.JLabel();
        pnlAbt = new javax.swing.JPanel();
        txAbt = new javax.swing.JLabel();
        txAbt1 = new javax.swing.JLabel();
        txAbt2 = new javax.swing.JLabel();
        txAbt3 = new javax.swing.JLabel();
        txAbt4 = new javax.swing.JLabel();
        txAbt5 = new javax.swing.JLabel();
        txAbt6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(930, 680));

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setPreferredSize(new java.awt.Dimension(865, 504));
        jPanel5.setLayout(null);

        jPanel10.setBackground(new java.awt.Color(102, 102, 102));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));

        jLabel13.setBackground(new java.awt.Color(255, 51, 51));
        jLabel13.setFont(new java.awt.Font("Tekton Pro", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("ABOUT");
        jLabel13.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel10);
        jPanel10.setBounds(730, 450, 124, 37);

        jLabel4.setFont(new java.awt.Font("Tekton Pro", 0, 36)); // NOI18N
        jLabel4.setText("Select Character...");
        jPanel5.add(jLabel4);
        jLabel4.setBounds(140, 20, 310, 50);

        jPanel11.setBackground(new java.awt.Color(102, 102, 102));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));

        jLabel14.setBackground(new java.awt.Color(102, 102, 102));
        jLabel14.setFont(new java.awt.Font("Tekton Pro", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("HELP");
        jLabel14.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.setOpaque(true);
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel11);
        jPanel11.setBounds(10, 120, 120, 40);

        jPanel9.setBackground(new java.awt.Color(102, 102, 102));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));

        jLabel12.setBackground(new java.awt.Color(255, 51, 51));
        jLabel12.setFont(new java.awt.Font("Tekton Pro", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("BACK");
        jLabel12.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel9);
        jPanel9.setBounds(720, 20, 124, 37);

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tekton Pro", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("HISTORY");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel3);
        jPanel3.setBounds(20, 70, 124, 41);

        jPanel6.setBackground(new java.awt.Color(102, 102, 102));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));

        jLabel6.setBackground(new java.awt.Color(255, 51, 51));
        jLabel6.setFont(new java.awt.Font("Tekton Pro", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("START");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel6);
        jPanel6.setBounds(10, 20, 124, 37);

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tekton Pro", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EXIT");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel4);
        jPanel4.setBounds(20, 170, 124, 41);

        inputnametext.setFont(new java.awt.Font("Tekton Pro", 0, 24)); // NOI18N
        inputnametext.setForeground(new java.awt.Color(102, 102, 102));
        inputnametext.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputnametext.setText("Input Your Name");
        inputnametext.setName(""); // NOI18N
        inputnametext.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputnametextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputnametextFocusLost(evt);
            }
        });
        inputnametext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputnametextActionPerformed(evt);
            }
        });
        jPanel5.add(inputnametext);
        inputnametext.setBounds(340, 360, 234, 36);

        Mulaibtn.setBackground(new java.awt.Color(102, 102, 102));
        Mulaibtn.setText("PLAY");
        Mulaibtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Mulaibtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MulaibtnActionPerformed(evt);
            }
        });
        jPanel5.add(Mulaibtn);
        Mulaibtn.setBounds(420, 410, 70, 23);

        hnama2.setEditable(false);
        hnama2.setColumns(20);
        hnama2.setFont(new java.awt.Font("Tekton Pro", 0, 24)); // NOI18N
        hnama2.setRows(5);
        hnama2.setText("gsdfgsg");
        historyPane5.setViewportView(hnama2);

        jLabel9.setFont(new java.awt.Font("Tekton Pro", 0, 36)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Score");

        jLabel10.setFont(new java.awt.Font("Tekton Pro", 0, 36)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Name");

        jButton1.setText("Delete All");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(historyPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(historyPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1))
        );

        jPanel5.add(jPanel8);
        jPanel8.setBounds(190, 100, 530, 350);

        aulia11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hide_Seek_Match/images/aulia10.png"))); // NOI18N
        aulia11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aulia11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aulia11MouseClicked(evt);
            }
        });
        jPanel5.add(aulia11);
        aulia11.setBounds(0, 90, 287, 415);

        harry11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hide_Seek_Match/images/harry10.png"))); // NOI18N
        harry11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        harry11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                harry11MouseClicked(evt);
            }
        });
        jPanel5.add(harry11);
        harry11.setBounds(430, 80, 249, 448);

        peter11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hide_Seek_Match/images/peter10.png"))); // NOI18N
        peter11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        peter11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                peter11MouseClicked(evt);
            }
        });
        jPanel5.add(peter11);
        peter11.setBounds(620, 80, 241, 427);

        sarah11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hide_Seek_Match/images/sarah10.png"))); // NOI18N
        sarah11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sarah11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sarah11MouseClicked(evt);
            }
        });
        jPanel5.add(sarah11);
        sarah11.setBounds(240, 100, 195, 407);

        Highscorepane.setFont(new java.awt.Font("Tekton Pro", 0, 36)); // NOI18N
        Highscorepane.setText("Highscore :");
        jPanel5.add(Highscorepane);
        Highscorepane.setBounds(200, 50, 400, 44);

        pnlAbt.setBackground(java.awt.Color.white);
        pnlAbt.setLayout(null);

        txAbt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txAbt.setText("Developed by:");
        pnlAbt.add(txAbt);
        txAbt.setBounds(35, 10, 190, 40);

        txAbt1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txAbt1.setText(" - Muhammad Dimas Yudha");
        pnlAbt.add(txAbt1);
        txAbt1.setBounds(35, 50, 320, 30);

        txAbt2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txAbt2.setText(" - Muhammad Rhefa Farizi");
        pnlAbt.add(txAbt2);
        txAbt2.setBounds(35, 90, 310, 40);

        txAbt3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txAbt3.setText("Special Thanks to:");
        pnlAbt.add(txAbt3);
        txAbt3.setBounds(35, 150, 270, 30);

        txAbt4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txAbt4.setText(" - Allah SWT.");
        pnlAbt.add(txAbt4);
        txAbt4.setBounds(35, 190, 270, 30);

        txAbt5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txAbt5.setText(" - M.Riza Iqbal");
        pnlAbt.add(txAbt5);
        txAbt5.setBounds(35, 230, 280, 30);

        txAbt6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txAbt6.setText(" - All our beloved friends");
        pnlAbt.add(txAbt6);
        txAbt6.setBounds(35, 270, 360, 30);

        jPanel5.add(pnlAbt);
        pnlAbt.setBounds(180, 69, 510, 340);
        jPanel5.add(jLabel2);
        jLabel2.setBounds(10, 480, 180, 20);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hide_Seek_Match/images/bg13.png"))); // NOI18N
        jPanel5.add(jLabel11);
        jLabel11.setBounds(0, 0, 860, 504);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    String[][] aa = new String[100][2];
    
    public void bacahis(){
        int n = 0;
        //String[][] score = new String[50][1];
        
        try{
            FileReader reader = new FileReader("history.txt");
            BufferedReader br = new BufferedReader(reader);

            String st;

            hnama2.setText(""); //reset

            while((st = br.readLine()) != null){
                String sl = br.readLine();
                
                //System.out.println(st+" "+sl);
                
                aa[n][0] = st;
                aa[n][1] = sl;
                n++;

//                hnama2.append(aa[n][0]+"\n");
//                hscore2.append(aa[n][0]+"\n");              
//System.out.println(score[n]);

            }
            reader.close();
            br.close();

        }catch(IOException e){
            System.out.println("" +e);
        }
        for(int h = 0; h < n ; h++){
            hnama2.append(aa[h][0]+"\t\t"+aa[h][1]+"\n");
            //hscore2.append(aa[h][1]+"\n");
                
//            System.out.println(aa[h][0]);
//            System.out.println(aa[h][1]);
        }
        
        for(int i = 1; i<n-1;i++){
            for(int j = 0; j<n-i;j++){
                int a = Integer.parseInt(aa[j][1]);
                int b = Integer.parseInt(aa[j+1][1]);
//                System.out.println("\n Index i: "+i+"     index j+1: "+j+"     val: "+aa[j+1][1]);
//                System.out.println("\n Index i: "+i+"     index j  : "+j+"     val: "+aa[j][1]);
                if(a < b){
                    for(int y = 0;y<2;y++){
                        String temp1;
                    temp1 = aa[j][y];
                    aa[j][y] = aa[j+1][y];
                    aa[j+1][y] = temp1;
                    }                   

                }
            }
        }
        

        
//        System.out.println(score[1]);
//        System.out.println(score[2]);
//        System.out.println(score[3]);
//        System.out.println(score[4]);
//
//        System.out.println(aa[0]);
//        System.out.println(aa[1]);
//        System.out.println(aa[2]);
//        System.out.println(aa[3]);
//        System.out.println(aa[4]);
//        System.out.println(aa[5]);
//        System.out.println(aa[6]);
//        System.out.println(aa[7]);
//
//        String highscore = aa[0];
//        String[] parts = highscore.split("/");
//        
        if(aa[0][0] == null){
            aa[0][0] = "-";
        }
        if(aa[0][1] == null){
            aa[0][1] = "";
        }
        Highscorepane.setText("Highscore : "+aa[0][0]+" ("+aa[0][1]+")");
    }
    
    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        //historybutton
        if(click2){
            click2 = false;
            jLabel13.setForeground(Color.white);
            pnlAbt.setVisible(false);
        }
        if(click1 == false){
            click1 = true;
            jLabel5.setForeground(Color.gray);
            jPanel8.setVisible(true);
            Highscorepane.setVisible(true);
            bacahis();
        }
        else{
            click1 = false;
            jLabel5.setForeground(Color.white);
            jPanel8.setVisible(false);
            Highscorepane.setVisible(false);
        }
        //BufferedReader br = null;
        
        
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        //startbutton
        if(click1){
            click1 = false;
            jLabel5.setForeground(Color.white);
            jPanel8.setVisible(false);
            Highscorepane.setVisible(false);
        }
        if(click2){
            click2 = false;
            jLabel13.setForeground(Color.white);
            pnlAbt.setVisible(false);
        }
        
        jLabel4.setVisible(true);
        
        jPanel11.setVisible(false);
        jPanel10.setVisible(false);
        jPanel4.setVisible(false);
        jPanel3.setVisible(false);
        jPanel6.setVisible(false);
        jPanel9.setVisible(true);
        
        aulia11.setVisible(true);
        harry11.setVisible(true);
        sarah11.setVisible(true);
        peter11.setVisible(true);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
            System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void MulaibtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MulaibtnActionPerformed
        // TODO add your handling code here
        
        String nama = inputnametext.getText();

        if(nama.trim().equals("")|| nama.trim().equals("Input Your Name")){
            JOptionPane.showMessageDialog(this,"Harap masukkan nama");
            inputnametext.setText("");
        }
        else{
            //jLabel4.setForeground(Color.gray);
            fMain_room mulai1 = new fMain_room(player, nama);
            mulai1.pack();
            mulai1.setLocationRelativeTo(null);
            mulai1.show();
            this.hide();
            
        }
    }//GEN-LAST:event_MulaibtnActionPerformed

    private void inputnametextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputnametextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputnametextActionPerformed
    
    private void aulia11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aulia11MouseClicked
        player = "aulia";
        //JOptionPane.showMessageDialog(this,"Anda Memilih "+player);
        
        harry11.setVisible(false);
        sarah11.setVisible(false);
        peter11.setVisible(false);
        
        inputnametext.setVisible(true);
        Mulaibtn.setVisible(true);
        jLabel4.setVisible(false);
        
    }//GEN-LAST:event_aulia11MouseClicked

    private void sarah11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sarah11MouseClicked
        player = "sarah";
        //JOptionPane.showMessageDialog(this,"Anda Memilih "+player);
        
        aulia11.setVisible(false);
        harry11.setVisible(false);
        peter11.setVisible(false);
        
        inputnametext.setVisible(true);
        Mulaibtn.setVisible(true);
        jLabel4.setVisible(false);
    }//GEN-LAST:event_sarah11MouseClicked

    private void harry11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_harry11MouseClicked
        player = "harry";
        //JOptionPane.showMessageDialog(this,"Anda Memilih "+player);
        
        aulia11.setVisible(false);
        sarah11.setVisible(false);
        peter11.setVisible(false);
        
        inputnametext.setVisible(true);
        Mulaibtn.setVisible(true);
        jLabel4.setVisible(false);
    }//GEN-LAST:event_harry11MouseClicked

    private void peter11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_peter11MouseClicked
        player = "peter";
        //JOptionPane.showMessageDialog(this,"Anda Memilih "+player);
        
        aulia11.setVisible(false);
        harry11.setVisible(false);
        sarah11.setVisible(false);
        
        inputnametext.setVisible(true);
        Mulaibtn.setVisible(true);
        jLabel4.setVisible(false);
    }//GEN-LAST:event_peter11MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        
        aulia11.setVisible(false);
        harry11.setVisible(false);
        sarah11.setVisible(false);
        peter11.setVisible(false);
            
        jLabel4.setVisible(false);
            
        jPanel4.setVisible(true);
        jPanel3.setVisible(true);
        jPanel6.setVisible(true);
        jPanel11.setVisible(true);
        jPanel10.setVisible(true);
        jPanel9.setVisible(false);
            
        inputnametext.setVisible(false);
        Mulaibtn.setVisible(false);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void inputnametextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputnametextFocusGained
        if(inputnametext.getText().equals("Input Your Name")){
            inputnametext.setText("");
            inputnametext.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_inputnametextFocusGained

    private void inputnametextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputnametextFocusLost
        if(inputnametext.getText().isEmpty()){
            inputnametext.setForeground(Color.GRAY);
            inputnametext.setText("Input Your Name");
        }
    }//GEN-LAST:event_inputnametextFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        textae as = new textae();
        as.deletall();
        bacahis();
        Highscorepane.setText("Highscore : - ()");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        if(click1){
            click1 = false;
            jLabel5.setForeground(Color.white);
            jPanel8.setVisible(false);
            Highscorepane.setVisible(false);
        }
        if(click2 == false){
            click2 = true;
            jLabel13.setForeground(Color.gray);
            pnlAbt.setVisible(true);
        }
        else{
            click2 = false;
            jLabel13.setForeground(Color.white);
            pnlAbt.setVisible(false);
        }
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
       Helpform asd = new Helpform();
       asd.show();
       //this.hide();
    }//GEN-LAST:event_jLabel14MouseClicked
    

    
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
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                mainMenu m = new mainMenu();
                m.pack();
                m.setLocationRelativeTo(null);
                m.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Highscorepane;
    private javax.swing.JButton Mulaibtn;
    private javax.swing.JLabel aulia11;
    private javax.swing.JLabel harry11;
    private javax.swing.JScrollPane historyPane5;
    private javax.swing.JTextArea hnama2;
    private javax.swing.JTextField inputnametext;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel peter11;
    private javax.swing.JPanel pnlAbt;
    private javax.swing.JLabel sarah11;
    private javax.swing.JLabel txAbt;
    private javax.swing.JLabel txAbt1;
    private javax.swing.JLabel txAbt2;
    private javax.swing.JLabel txAbt3;
    private javax.swing.JLabel txAbt4;
    private javax.swing.JLabel txAbt5;
    private javax.swing.JLabel txAbt6;
    // End of variables declaration//GEN-END:variables
}
