/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package finalproject;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
/**
 *
 * @author onkar
 */
public class Tables extends javax.swing.JFrame
{

    AdminDashboard ref;
    Tables t;
    public Tables(AdminDashboard obj)
    {
        ref=obj;
        t=this;
        initComponents();
        tbl.setFillsViewportHeight(true);
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

    void showTable()
    {
        ref.setVisible(false);
        this.setVisible(true);
        insertIntoTable();
    }
    void insertIntoTable()
    {
        try
        {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","sa123");
            String query="select * from fees_structure";
            PreparedStatement pst1=con.prepareStatement(query);
            ResultSet rs=pst1.executeQuery();
            while(rs.next())
            {
                String id,subname,duration,fees;
                id=rs.getString(1);
                subname=rs.getString(2);
                duration=rs.getString(3);
                fees=rs.getString(4);
                DefaultTableModel dtm=(DefaultTableModel) tbl.getModel();
                tbl.setModel(dtm);
                dtm.addRow(new Object[]{id,subname,duration,fees});
            }
            
        }
        catch(SQLException e)
        {
            
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnAddsub = new javax.swing.JButton();
        btnchngSubFee = new javax.swing.JButton();
        btnchngSub = new javax.swing.JButton();
        lblclose = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        tbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Id", "Subject Name", "Duration", "Fees"
            }
        )
        {
            boolean[] canEdit = new boolean []
            {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        tbl.setAutoscrolls(false);
        tbl.setEditingColumn(0);
        tbl.setEditingRow(0);
        tbl.setEnabled(false);
        jScrollPane1.setViewportView(tbl);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Fees Structure");

        btnAddsub.setBackground(new java.awt.Color(51, 51, 51));
        btnAddsub.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAddsub.setForeground(new java.awt.Color(51, 255, 255));
        btnAddsub.setText("Add Subject");
        btnAddsub.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAddsubActionPerformed(evt);
            }
        });

        btnchngSubFee.setBackground(new java.awt.Color(51, 51, 51));
        btnchngSubFee.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnchngSubFee.setForeground(new java.awt.Color(51, 255, 255));
        btnchngSubFee.setText("Change Subject fees");
        btnchngSubFee.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnchngSubFeeActionPerformed(evt);
            }
        });

        btnchngSub.setBackground(new java.awt.Color(51, 51, 51));
        btnchngSub.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnchngSub.setForeground(new java.awt.Color(51, 255, 255));
        btnchngSub.setText("Change Subject name");
        btnchngSub.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnchngSubActionPerformed(evt);
            }
        });

        lblclose.setBackground(new java.awt.Color(255, 255, 51));
        lblclose.setOpaque(true);
        lblclose.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                lblcloseMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblclose, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btnAddsub, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addComponent(btnchngSub, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnchngSubFee, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblclose, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnchngSub)
                    .addComponent(btnchngSubFee)
                    .addComponent(btnAddsub))
                .addGap(182, 182, 182))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddsubActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAddsubActionPerformed
    {//GEN-HEADEREND:event_btnAddsubActionPerformed
        // TODO add your handling code here:
        AddSubject adsub=new AddSubject(this);
        adsub.showFrm();
    }//GEN-LAST:event_btnAddsubActionPerformed

    private void btnchngSubFeeActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnchngSubFeeActionPerformed
    {//GEN-HEADEREND:event_btnchngSubFeeActionPerformed
        // TODO add your handling code here:
        ChangeFees chfee=new ChangeFees(this);
        chfee.chngfee();
    }//GEN-LAST:event_btnchngSubFeeActionPerformed

    private void btnchngSubActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnchngSubActionPerformed
    {//GEN-HEADEREND:event_btnchngSubActionPerformed
        // TODO add your handling code here:
        ChangeSubname chngsubnm=new ChangeSubname(this);
        chngsubnm.showChngsub();
    }//GEN-LAST:event_btnchngSubActionPerformed

    private void lblcloseMousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblcloseMousePressed
    {//GEN-HEADEREND:event_lblcloseMousePressed
        // TODO add your handling code here:
        t.dispose();
        ref.setVisible(true);
    }//GEN-LAST:event_lblcloseMousePressed

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
            java.util.logging.Logger.getLogger(Tables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Tables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Tables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Tables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
               // new Tables().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddsub;
    private javax.swing.JButton btnchngSub;
    private javax.swing.JButton btnchngSubFee;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblclose;
    private javax.swing.JTable tbl;
    // End of variables declaration//GEN-END:variables
}
    
   


