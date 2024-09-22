/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package finalproject;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author onkar
 */
public class ChangeFees extends javax.swing.JFrame
{

    Tables tb;
    ChangeFees chngfee;
    public ChangeFees(Tables obj)
    {
        tb=obj;
        chngfee=this;
        initComponents();
        MykeyListener mkl=new MykeyListener();
        txtsubnm.addKeyListener(mkl);
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

    void chngfee()
    {
        tb.dispose();
        this.setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        txtsubnm = new javax.swing.JTextField();
        txtoldfee = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt = new javax.swing.JLabel();
        btnchngfee = new javax.swing.JButton();
        lblclose = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        txtsubnm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtsubnm.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtsubnm.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        txtoldfee.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtoldfee.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtoldfee.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Subject Name");

        txt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt.setText("New Fee");

        btnchngfee.setBackground(new java.awt.Color(0, 0, 0));
        btnchngfee.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnchngfee.setForeground(new java.awt.Color(0, 255, 255));
        btnchngfee.setText("Change");
        btnchngfee.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnchngfeeActionPerformed(evt);
            }
        });

        lblclose.setBackground(new java.awt.Color(255, 255, 102));
        lblclose.setOpaque(true);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txt, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtoldfee, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsubnm, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(btnchngfee, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblclose, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblclose, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsubnm, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtoldfee, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt))
                .addGap(56, 56, 56)
                .addComponent(btnchngfee, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnchngfeeActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnchngfeeActionPerformed
    {//GEN-HEADEREND:event_btnchngfeeActionPerformed
        // TODO add your handling code here:
        String sub,newfee;
        sub=txtsubnm.getText().trim();
        newfee=txtoldfee.getText().trim();
        if(sub.equals("")|| newfee.equals(""))
        {
            JOptionPane.showMessageDialog(this, "please Enter all data");
        }
        else
        {
            try
            {
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","sa123");
                String q1="select sub_id from fees_structure where sub_name = ?";
                PreparedStatement pst1=con.prepareStatement(q1);
                pst1.setString(1, sub);
                ResultSet rs;
                rs=pst1.executeQuery();
                if(rs.next())
                {
                    String id=rs.getString(1);
                    try
                    {
                        String q2="Update fees_structure set fees=? where sub_id=?";
                        PreparedStatement pst2=con.prepareStatement(q2);
                        pst2.setString(1, newfee);
                         pst2.setString(2, id);
                        pst2.executeUpdate();
                        JOptionPane.showMessageDialog(this, "Subject fees change Successfully");
                        this.dispose();
                        tb.showTable();
                    }
                    catch(SQLException e)
                    {
                        JOptionPane.showMessageDialog(this, e);
                    }

                }
                else
                {
                    JOptionPane.showMessageDialog(this,"Subject Not FOund","Not Exist", JOptionPane.ERROR_MESSAGE);

                }
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(this,e);
            }
        }

    }//GEN-LAST:event_btnchngfeeActionPerformed

    private void lblcloseMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblcloseMouseClicked
    {//GEN-HEADEREND:event_lblcloseMouseClicked
        // TODO add your handling code here:
        chngfee.dispose();
        tb.setVisible(true);
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
            java.util.logging.Logger.getLogger(ChangeFees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(ChangeFees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(ChangeFees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(ChangeFees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                //new ChangeFees().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnchngfee;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblclose;
    private javax.swing.JLabel txt;
    private javax.swing.JTextField txtoldfee;
    private javax.swing.JTextField txtsubnm;
    // End of variables declaration//GEN-END:variables
}
