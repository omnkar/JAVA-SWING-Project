/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package finalproject;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;


/**
 *
 * @author onkar
 */
public class AdminDashboard extends javax.swing.JFrame
{

    /**
     * Creates new form AdminDashboard
     */
    AdminLogin ref;
    ButtonGroup bg;
    EnquiryTable enqt;
    public AdminDashboard(AdminLogin obj)
    {
        ref=obj;
        bg=new ButtonGroup();
        initComponents();
        BufferedImage adphoto;
        try
        {
             adphoto=ImageIO.read(new File("C:\\Users\\onkar\\OneDrive\\Pictures\\Documents\\NetBeansProjects\\Assignment_14\\Images\\Login.png"));
            Image limg;
            limg=adphoto.getScaledInstance(lblphoto.getWidth(),lblphoto.getHeight(),Image.SCALE_SMOOTH);
            ImageIcon loginIc=new ImageIcon(limg);
            lblphoto.setIcon(loginIc);
        }
        catch(Exception e)
        {
            System.out.println("catch");
        }
       
    }
    void showDashboard()
    {
        this.setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        pnlmain = new javax.swing.JPanel();
        lblphoto = new javax.swing.JLabel();
        btnlogout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        menubar = new javax.swing.JMenuBar();
        stdmenu = new javax.swing.JMenu();
        newstdmnitem = new javax.swing.JMenuItem();
        oldstdmnitem = new javax.swing.JMenuItem();
        faqmenu = new javax.swing.JMenu();
        rdchkAll = new javax.swing.JRadioButtonMenuItem();
        rdchkMon = new javax.swing.JRadioButtonMenuItem();
        rdchkclg = new javax.swing.JRadioButtonMenuItem();
        rdchksub = new javax.swing.JRadioButtonMenuItem();
        feemenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pnlmain.setBackground(new java.awt.Color(153, 255, 255));

        btnlogout.setBackground(new java.awt.Color(51, 51, 51));
        btnlogout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnlogout.setForeground(new java.awt.Color(51, 255, 255));
        btnlogout.setText("logout");
        btnlogout.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnlogoutActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Admin Name :");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Onkar Muthe");

        javax.swing.GroupLayout pnlmainLayout = new javax.swing.GroupLayout(pnlmain);
        pnlmain.setLayout(pnlmainLayout);
        pnlmainLayout.setHorizontalGroup(
            pnlmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlmainLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnlogout)
                .addGap(43, 43, 43))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlmainLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 321, Short.MAX_VALUE)
                .addComponent(lblphoto, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlmainLayout.setVerticalGroup(
            pnlmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlmainLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(pnlmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblphoto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlmainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnlogout)
                .addContainerGap(229, Short.MAX_VALUE))
        );

        stdmenu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        stdmenu.setText("Student");
        stdmenu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        newstdmnitem.setText("New Student");
        newstdmnitem.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                newstdmnitemActionPerformed(evt);
            }
        });
        stdmenu.add(newstdmnitem);

        oldstdmnitem.setText("Old Student");
        oldstdmnitem.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                oldstdmnitemActionPerformed(evt);
            }
        });
        stdmenu.add(oldstdmnitem);

        menubar.add(stdmenu);

        faqmenu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        faqmenu.setText("FaQ");
        faqmenu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        bg.add(rdchkAll);
        rdchkAll.setSelected(true);
        rdchkAll.setText("Check All Enquiries");
        rdchkAll.setName("chkall"); // NOI18N
        rdchkAll.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rdchkAllActionPerformed(evt);
            }
        });
        faqmenu.add(rdchkAll);

        bg.add(rdchkMon);
        rdchkMon.setSelected(true);
        rdchkMon.setText("check Enquiry in specific Month");
        rdchkMon.setName("chkmon"); // NOI18N
        rdchkMon.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rdchkMonActionPerformed(evt);
            }
        });
        faqmenu.add(rdchkMon);

        bg.add(rdchkclg);
        rdchkclg.setSelected(true);
        rdchkclg.setText("Check Enquiry from Specific College");
        rdchkclg.setName("chkclg"); // NOI18N
        rdchkclg.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rdchkclgActionPerformed(evt);
            }
        });
        faqmenu.add(rdchkclg);

        bg.add(rdchksub);
        rdchksub.setSelected(true);
        rdchksub.setText("Check Enquiry for Specific Subject");
        rdchksub.setName("chksub"); // NOI18N
        rdchksub.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                rdchksubActionPerformed(evt);
            }
        });
        faqmenu.add(rdchksub);

        menubar.add(faqmenu);

        feemenu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        feemenu.setText("Fess Structure");
        feemenu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        feemenu.addMenuListener(new javax.swing.event.MenuListener()
        {
            public void menuCanceled(javax.swing.event.MenuEvent evt)
            {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt)
            {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt)
            {
                feemenuMenuSelected(evt);
            }
        });
        menubar.add(feemenu);

        setJMenuBar(menubar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlmain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlmain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void oldstdmnitemActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_oldstdmnitemActionPerformed
    {//GEN-HEADEREND:event_oldstdmnitemActionPerformed
        Enquiry eq=new Enquiry(this);
        eq.showEnquiry();
    }//GEN-LAST:event_oldstdmnitemActionPerformed

    private void newstdmnitemActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_newstdmnitemActionPerformed
    {//GEN-HEADEREND:event_newstdmnitemActionPerformed
        // TODO add your handling code here:
        StudentAdmission stdadm=new StudentAdmission(this);
        stdadm.showFrame();
        //this.setVisible(false);
    }//GEN-LAST:event_newstdmnitemActionPerformed

    private void feemenuMenuSelected(javax.swing.event.MenuEvent evt)//GEN-FIRST:event_feemenuMenuSelected
    {//GEN-HEADEREND:event_feemenuMenuSelected
        // TODO add your handling code here:
        Tables tb=new Tables(this);
        tb.showTable();
    }//GEN-LAST:event_feemenuMenuSelected

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnlogoutActionPerformed
    {//GEN-HEADEREND:event_btnlogoutActionPerformed
        // TODO add your handling code here:
        this.dispose();
        ref.setVisible(true);
        
    }//GEN-LAST:event_btnlogoutActionPerformed

    private void rdchkAllActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rdchkAllActionPerformed
    {//GEN-HEADEREND:event_rdchkAllActionPerformed
        // TODO add your handling code here:
        enqt=new EnquiryTable(this,rdchkAll.getName());
        enqt.showEnqTable();
        
    }//GEN-LAST:event_rdchkAllActionPerformed

    private void rdchkMonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rdchkMonActionPerformed
    {//GEN-HEADEREND:event_rdchkMonActionPerformed
        // TODO add your handling code here:
        enqt=new EnquiryTable(this,rdchkMon.getName());
        enqt.showEnqTable();
    }//GEN-LAST:event_rdchkMonActionPerformed

    private void rdchkclgActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rdchkclgActionPerformed
    {//GEN-HEADEREND:event_rdchkclgActionPerformed
        // TODO add your handling code here:
        enqt=new EnquiryTable(this,rdchkclg.getName());
        enqt.showEnqTable();
    }//GEN-LAST:event_rdchkclgActionPerformed

    private void rdchksubActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rdchksubActionPerformed
    {//GEN-HEADEREND:event_rdchksubActionPerformed
        // TODO add your handling code here:
        enqt=new EnquiryTable(this,rdchksub.getName());
        enqt.showEnqTable();
    }//GEN-LAST:event_rdchksubActionPerformed

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
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                //new AdminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlogout;
    private javax.swing.JMenu faqmenu;
    private javax.swing.JMenu feemenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblphoto;
    private javax.swing.JMenuBar menubar;
    private javax.swing.JMenuItem newstdmnitem;
    private javax.swing.JMenuItem oldstdmnitem;
    private javax.swing.JPanel pnlmain;
    private javax.swing.JRadioButtonMenuItem rdchkAll;
    private javax.swing.JRadioButtonMenuItem rdchkMon;
    private javax.swing.JRadioButtonMenuItem rdchkclg;
    private javax.swing.JRadioButtonMenuItem rdchksub;
    private javax.swing.JMenu stdmenu;
    // End of variables declaration//GEN-END:variables
}
