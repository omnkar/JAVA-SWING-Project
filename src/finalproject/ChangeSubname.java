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
public class ChangeSubname extends javax.swing.JFrame
{

    Tables tb;
    ChangeSubname chngsub;
    public ChangeSubname(Tables obj)
    {
        tb=obj;
        chngsub=this;
        initComponents();
        MykeyListener mkl=new MykeyListener();
        txtnewsubname.addKeyListener(mkl);
        txtoldsubname.addKeyListener(mkl);
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

    void showChngsub()
    {
        tb.dispose();
        this.setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        txtoldsubname = new javax.swing.JTextField();
        txtnewsubname = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnchangSub = new javax.swing.JButton();
        lblclose = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        txtoldsubname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtoldsubname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtoldsubname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        txtnewsubname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtnewsubname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnewsubname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Old Subject Name");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("New Subject Name");

        btnchangSub.setBackground(new java.awt.Color(0, 0, 0));
        btnchangSub.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnchangSub.setForeground(new java.awt.Color(0, 255, 255));
        btnchangSub.setText("Change");
        btnchangSub.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnchangSubActionPerformed(evt);
            }
        });

        lblclose.setBackground(new java.awt.Color(255, 255, 0));
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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(btnchangSub, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtnewsubname, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtoldsubname, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblclose, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblclose, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtoldsubname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtnewsubname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(42, 42, 42)
                .addComponent(btnchangSub, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
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

    private void btnchangSubActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnchangSubActionPerformed
    {//GEN-HEADEREND:event_btnchangSubActionPerformed
        // TODO add your handling code here:
        String oldsub,newsub;
        oldsub=txtoldsubname.getText().trim();
        newsub=txtnewsubname.getText().trim();
        if(oldsub.equals("")|| newsub.equals(""))
        {
            JOptionPane.showMessageDialog(this, "please Enter all data");
        }
        else
        {
            try
            {
                 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","sa123");
                 String q1="select sub_id from fees_structure where sub_name =?";
                 PreparedStatement pst1=con.prepareStatement(q1);
                 pst1.setString(1,oldsub);
                 ResultSet rs;
                 rs=pst1.executeQuery();
                 if(rs.next())
                 {
                     String id=rs.getString(1);
                     try
                     {
                        String q2="Update  fees_structure set sub_name=? where sub_id=?";
                        PreparedStatement pst2=con.prepareStatement(q2);
                        pst2.setString(1, newsub);
                        pst2.setString(2, id);
                        pst2.executeUpdate();
                        JOptionPane.showMessageDialog(this, "Subject name change Successfully");
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
                     JOptionPane.showMessageDialog(this,"Old Subject Not FOund","Not Exist", JOptionPane.ERROR_MESSAGE);
                     
                 }
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(this,e);
            }
        }
        
    }//GEN-LAST:event_btnchangSubActionPerformed

    private void lblcloseMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblcloseMouseClicked
    {//GEN-HEADEREND:event_lblcloseMouseClicked
        // TODO add your handling code here:
        chngsub.dispose();
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
            java.util.logging.Logger.getLogger(ChangeSubname.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(ChangeSubname.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(ChangeSubname.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(ChangeSubname.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                //new ChangeSubname().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnchangSub;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblclose;
    private javax.swing.JTextField txtnewsubname;
    private javax.swing.JTextField txtoldsubname;
    // End of variables declaration//GEN-END:variables
}
