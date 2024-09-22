/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package finalproject;

/**
 *
 * @author onkar
 */

import java.awt.*;
import java.sql.*;
import java.io.*;
import com.github.sarxos.webcam.Webcam;
import java.awt.List;
import java.awt.image.BufferedImage;
import static java.util.Collections.list;
import javax.imageio.*;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.event.*;
import java.util.*;
import java.sql.Date;
import java.util.ArrayList;
import com.toedter.calendar.JDateChooser;
public class StudentAdmission extends javax.swing.JFrame implements Runnable
{

    Webcam wc;
    volatile boolean flag1=true;
    boolean flag2=false;
    ButtonGroup cbg;
    AdminDashboard ref;
    String defaultDirectory,filename;
    Thread t;
    public StudentAdmission(AdminDashboard obj)
    {
        cbg=new ButtonGroup();
        initComponents();
        t=new Thread(this);
        ref=obj;
        setLayout(null);
        MykeyListener mkl=new MykeyListener();
        txtname.addKeyListener(mkl);
        t.start();
        BufferedImage closeimg;
        try
        {
            closeimg=ImageIO.read(new File("C:\\Users\\onkar\\OneDrive\\Pictures\\Documents\\NetBeansProjects\\Assignment_14\\Images\\close.png"));
            Image cimg;
            cimg=closeimg.getScaledInstance(lblclose.getWidth(), lblclose.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon closeIcn=new ImageIcon(cimg);
            lblclose.setIcon(closeIcn);
        }
        catch(Exception e)
        {
             System.out.println("Caught");
        }
    }
    public void showFrame()
    {
        ref.setVisible(false);
        this.setVisible(true);
    }
    @Override
    public void run()
    {
        wc=Webcam.getDefault();
        wc.open();
        
        while(flag1)
        {
            Image img=wc.getImage();
            Image newImg=img.getScaledInstance(lblphoto.getWidth(), lblphoto.getHeight(), Image.SCALE_SMOOTH);
            
            try
            {
                lblphoto.setIcon(new ImageIcon(newImg));
                    
            }
            catch(Exception e)
            {
                
            }
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        txtname = new javax.swing.JTextField();
        btnClick = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        dtEnquiry = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rbmale = new javax.swing.JRadioButton();
        rbfemale = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtlocal = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        chkpl = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtPermanant = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        txthmtown = new javax.swing.JTextField();
        dtBdate = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnsubmit = new javax.swing.JButton();
        lblphoto = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstSub = new javax.swing.JList<>();
        jLabel13 = new javax.swing.JLabel();
        btnRetake = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtEnq = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        cmbgclg = new javax.swing.JComboBox<>();
        btnAdd = new javax.swing.JButton();
        lblclose = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        txtname.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtname.setToolTipText("Enter  First Name");
        txtname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        btnClick.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnClick.setText("Click");
        btnClick.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btnClick.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnClickActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Click your Photo *");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Name Of Student  *");

        txtPhone.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtPhone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPhone.setToolTipText("Enter Phone No.");
        txtPhone.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        txtPhone.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtPhoneKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Phone No. *");

        txtEmail.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEmail.setToolTipText("Enter Mail");
        txtEmail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txtEmailKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Email.id *");

        dtEnquiry.setDateFormatString("yyyy-MM-dd");
        dtEnquiry.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Birth Date *");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Gender *");

        cbg.add(rbmale);
        rbmale.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rbmale.setText("Male");

        cbg.add(rbfemale);
        rbfemale.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rbfemale.setText("Female");

        txtlocal.setColumns(20);
        txtlocal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtlocal.setLineWrap(true);
        txtlocal.setRows(5);
        txtlocal.setToolTipText("Enter Local Address");
        jScrollPane1.setViewportView(txtlocal);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Local Address *");

        chkpl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        chkpl.setText("Permanant Address is same as Local Address?");
        chkpl.addItemListener(new java.awt.event.ItemListener()
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt)
            {
                chkplItemStateChanged(evt);
            }
        });
        chkpl.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                chkplActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Permanant Address *");

        txtPermanant.setColumns(20);
        txtPermanant.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPermanant.setLineWrap(true);
        txtPermanant.setRows(5);
        txtPermanant.setToolTipText("Enter Permanant Address");
        jScrollPane2.setViewportView(txtPermanant);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("HomeTown");

        txthmtown.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txthmtown.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txthmtown.setToolTipText("Enter  First Name");
        txthmtown.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        dtBdate.setToolTipText("Enter BirthDate");
        dtBdate.setDateFormatString("YYYY-MM-dd");
        dtBdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Enquiry Date *");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Select Subject You are intrested in *");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("College Name *");

        btnsubmit.setBackground(new java.awt.Color(51, 51, 51));
        btnsubmit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnsubmit.setForeground(new java.awt.Color(0, 255, 255));
        btnsubmit.setText("Submit");
        btnsubmit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btnsubmit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnsubmitActionPerformed(evt);
            }
        });

        lblphoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblphoto.setOpaque(true);

        lstSub.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        lstSub.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lstSub.setModel(new javax.swing.AbstractListModel<String>()
        {
            String[] strings = { "C", "CPP", "DS", "ADS", "JAVA" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstSub.setToolTipText("");
        jScrollPane3.setViewportView(lstSub);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 51, 51));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("* mark are compulsory");

        btnRetake.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRetake.setText("Retake");
        btnRetake.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btnRetake.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnRetakeActionPerformed(evt);
            }
        });

        txtEnq.setColumns(20);
        txtEnq.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtEnq.setLineWrap(true);
        txtEnq.setRows(5);
        txtEnq.setToolTipText("Enter Local Address");
        jScrollPane4.setViewportView(txtEnq);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setText("Enquiry *");

        cmbgclg.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cmbgclg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PICT", "BHARATI VIDYAPITH", "VIT", "VIIT", "COEP" }));

        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAddActionPerformed(evt);
            }
        });

        lblclose.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblcloseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(43, 43, 43))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel5))
                                        .addGap(22, 22, 22))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dtBdate, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cmbgclg, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addComponent(chkpl, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addGap(52, 52, 52)
                                            .addComponent(dtEnquiry, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(138, 138, 138))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txthmtown, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(54, 54, 54)
                                                .addComponent(rbmale, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(rbfemale, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jLabel11))
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblphoto, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnRetake, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(49, 49, 49))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(186, 186, 186)
                                .addComponent(btnClick, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(553, 553, 553)
                        .addComponent(btnsubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(326, 326, 326)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(184, 184, 184)
                .addComponent(lblclose, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(lblclose, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(lblphoto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(65, 65, 65)
                                        .addComponent(btnRetake, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnClick, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(cmbgclg, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAdd)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dtEnquiry, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rbmale)
                                    .addComponent(rbfemale)))))
                    .addComponent(dtBdate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txthmtown, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(chkpl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel8)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel14)
                        .addGap(16, 16, 16)
                        .addComponent(btnsubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnsubmitActionPerformed
    {//GEN-HEADEREND:event_btnsubmitActionPerformed
        if(txtname.getText().equals("") || txtEmail.getText().equals("") || txtPhone.getText().equals("") || txtPermanant.getText().equals("") || txtlocal.getText().equals("")|| (rbfemale.isSelected()==false && rbmale.isSelected()==false)|| lblphoto.isVisible()==false || flag2==false||dtBdate==null || dtEnquiry==null)
        {
            JOptionPane.showMessageDialog(this, "Please fill * fields");
            return;
        }
        else if (txtEmail.getText().endsWith("@gmail.com")==false)
        {
            JOptionPane.showMessageDialog(this, "Please Enter valid Emial","Invalid Email", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else if (lstSub.isSelectionEmpty())
        {
            JOptionPane.showMessageDialog(this, "Please select at least 1 subject");
            return;
        }
        
        String name=txtname.getText().trim();
        String email=txtEmail.getText().trim();
        String phone=txtPhone.getText().trim();
        int ind=cmbgclg.getSelectedIndex();
        String clgnm=cmbgclg.getItemAt(ind);
        if(phone.length()<10)
        {
            JOptionPane.showConfirmDialog(this,"Enter 10 digit Phone No.", "Envaid Phone no.", JOptionPane.OK_OPTION);
            return;
        }
        String lcladdress=txtlocal.getText().trim();
        String pntaddress=txtPermanant.getText().trim();
        Date bdate,edate;
        try
        {
            bdate = new java.sql.Date(dtBdate.getDate().getTime());
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,"Please Birth date");
            return;
        }
        
        try
        {
            edate= new java.sql.Date(dtEnquiry.getDate().getTime());
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,"Please Enquiry date");
            return;
        }
        char gender=' ';
        if(rbmale.isSelected())
        {
            gender='M';
        }
        else if(rbfemale.isSelected())
        {
            gender='F';
        }
        String hmtown=txthmtown.getText();
        String str="";
        String enq=txtEnq.getText().trim();
        ArrayList<String>sub=(ArrayList<String>)lstSub.getSelectedValuesList();
        for(String s:sub)
        {
            str=str+s+" ";
        }
        try
        {
           FileInputStream fin=new FileInputStream(defaultDirectory+"\\"+filename);
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","sa123");
           String query="INSERT INTO students (stdname,stdphoto ,stdphnumber, stdemailid, stdbdate, stdlcladdress, stdpmtaddress, stdhometown, stdgender, stdclgname, stdenquirydt, stdintrsubjects) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
           PreparedStatement pst=con.prepareStatement(query);
           pst.setString(1,name);
           pst.setBlob(2,fin);
           pst.setString(3, phone);
           pst.setString(4, email);
           pst.setDate(5, bdate);
           pst.setString(6, lcladdress);
           pst.setString(7, pntaddress);
           pst.setString(8, hmtown);
           pst.setString(9, Character.toString(gender));
           pst.setString(10, clgnm);
           pst.setDate(11,edate);
           pst.setString(12, str);
           pst.executeUpdate();
           
           String query1="select stdid from students where stdemailid = ?";
           PreparedStatement pst1=con.prepareStatement(query1);
           pst1.setString(1, email);
           ResultSet rs=pst1.executeQuery();
           int id = -1;
            if (rs.next()) 
            {
                id = rs.getInt(1);
            } 
            else 
            {
                
                JOptionPane.showMessageDialog(this, "No student found with the provided email.");
                return; 
            }
           
           String query2="INSERT INTO `student`.`enquiry` (`stdenq`, `std_id`) VALUES (?,?);";
           PreparedStatement pst2=con.prepareStatement(query2);
           pst2.setString(1, enq);
           pst2.setInt(2, id);
           
            
            pst2.executeUpdate();
           
           
           JOptionPane.showMessageDialog(this,"Data Submitted Successfully");
        } 
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(this,"error"+e);
        }
        
        wc.close();
        //dispose();       
        
    }//GEN-LAST:event_btnsubmitActionPerformed

    private void chkplActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_chkplActionPerformed
    {//GEN-HEADEREND:event_chkplActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkplActionPerformed

    private void chkplItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_chkplItemStateChanged
    {//GEN-HEADEREND:event_chkplItemStateChanged
        // TODO add your handling code here:
        if(chkpl.isSelected())
        {
            txtPermanant.setText(txtlocal.getText());
        }
        else
        {
            txtPermanant.setText("");
        }
    }//GEN-LAST:event_chkplItemStateChanged

    private void txtEmailKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtEmailKeyTyped
    {//GEN-HEADEREND:event_txtEmailKeyTyped
        char ch=evt.getKeyChar();
        if(ch==' ')
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtEmailKeyTyped

    private void txtPhoneKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtPhoneKeyTyped
    {//GEN-HEADEREND:event_txtPhoneKeyTyped
        // TODO add your handling code here:
        if(Character.isDigit(evt.getKeyChar())==false || txtPhone.getText().length()>=10)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtPhoneKeyTyped

    private void btnClickActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnClickActionPerformed
    {//GEN-HEADEREND:event_btnClickActionPerformed
        // TODO add your handling code here:
        try
        {
             flag1=false;
            defaultDirectory = "C:\\Users\\onkar\\OneDrive\\Pictures\\Documents\\NetBeansProjects\\FinalProject\\src\\images";
            filename =txtname.getText()+".jpg"; // Change this to your desired filename

            // Ensure the directory exists, create it if it doesn't
            File dir = new File(defaultDirectory);
            try
            {

                ImageIO.write(wc.getImage(),"jpg",new File(dir,filename));
                Image img=wc.getImage();
                lblphoto.setIcon(new ImageIcon(img));
                JOptionPane.showMessageDialog(this,"Image click successfully");
                flag2=true;

            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,"Cannot click Image");
            }
        }
        catch(Exception e)
        {
            
        }
        
    }//GEN-LAST:event_btnClickActionPerformed

    private void btnRetakeActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnRetakeActionPerformed
    {//GEN-HEADEREND:event_btnRetakeActionPerformed
        // TODO add your handling code here:
        flag1=true;
        
        t=new Thread(this);
        t.start();
    }//GEN-LAST:event_btnRetakeActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAddActionPerformed
    {//GEN-HEADEREND:event_btnAddActionPerformed
        // TODO add your handling code here:
        String clgname=JOptionPane.showInputDialog(this,"Enter College Name", "College Name", JOptionPane.PLAIN_MESSAGE).trim();
        
        if(!clgname.equalsIgnoreCase(""))
        {
            cmbgclg.addItem(clgname);
        }
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void lblcloseMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblcloseMouseClicked
    {//GEN-HEADEREND:event_lblcloseMouseClicked
        // TODO add your handling code here:
        dispose();
        ref.setVisible(true);
    }//GEN-LAST:event_lblcloseMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(StudentAdmission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(StudentAdmission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(StudentAdmission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(StudentAdmission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                //new StudentEnquiry().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClick;
    private javax.swing.JButton btnRetake;
    private javax.swing.JButton btnsubmit;
    private javax.swing.JCheckBox chkpl;
    private javax.swing.JComboBox<String> cmbgclg;
    private com.toedter.calendar.JDateChooser dtBdate;
    private com.toedter.calendar.JDateChooser dtEnquiry;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblclose;
    private javax.swing.JLabel lblphoto;
    private javax.swing.JList<String> lstSub;
    private javax.swing.JRadioButton rbfemale;
    private javax.swing.JRadioButton rbmale;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextArea txtEnq;
    private javax.swing.JTextArea txtPermanant;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txthmtown;
    private javax.swing.JTextArea txtlocal;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
class MykeyListener extends KeyAdapter
{

    @Override
    public void keyTyped(KeyEvent e)
    {
        if(Character.isAlphabetic(e.getKeyChar())==false && e.getKeyChar()!=' ')
        {
            e.consume();
        }
    }
    
}
