/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gui.java;

import com.dbc.java.DBConnection1;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
    
   
public class DoctorProfile extends javax.swing.JFrame {
     DefaultTableModel model;
    /**
     * Creates new form LoginForm
     */
    public DoctorProfile() {
        initComponents();
        DataController.loadComboBox(txtDeptCombo, "select name from departments");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtlname = new javax.swing.JTextField();
        updatebtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        logoutbtn = new javax.swing.JButton();
        home = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtcode = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtfname = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtage = new javax.swing.JTextField();
        txtmarit = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaddress = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        txtgender = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtphone = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtldate = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtday = new javax.swing.JTextField();
        txtsearch = new javax.swing.JTextField();
        searchbtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtuname = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();
        txtDeptCombo = new javax.swing.JComboBox();
        jLabel20 = new javax.swing.JLabel();
        txtcnic = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtjdate = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtvtime = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(248, 240, 227));
        jPanel2.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gui/java/adminHL.png"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 10, 120, 130);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Days");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(560, 560, 100, 30);

        txtlname.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jPanel2.add(txtlname);
        txtlname.setBounds(690, 230, 180, 30);

        updatebtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        updatebtn.setText("Update");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });
        jPanel2.add(updatebtn);
        updatebtn.setBounds(140, 0, 120, 40);

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Doctor Details");

        logoutbtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        logoutbtn.setText("Logout");
        logoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbtnActionPerformed(evt);
            }
        });

        home.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        home.setText("Home");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 674, Short.MAX_VALUE)
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(logoutbtn)
                .addGap(51, 51, 51))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logoutbtn)
                    .addComponent(home))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel1);
        jPanel1.setBounds(120, 40, 1230, 70);

        jLabel1.setBackground(new java.awt.Color(248, 240, 227));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(-60, 0, 1470, 130);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Doctor Code");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(880, 130, 100, 30);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Doctor Code");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(150, 180, 100, 30);

        txtcode.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtcode.setText("DC_100");
        jPanel2.add(txtcode);
        txtcode.setBounds(270, 180, 170, 30);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("Fast Name");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(150, 230, 80, 30);

        txtfname.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jPanel2.add(txtfname);
        txtfname.setBounds(270, 230, 170, 30);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("Age");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(150, 270, 80, 30);

        txtage.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jPanel2.add(txtage);
        txtage.setBounds(270, 270, 170, 30);

        txtmarit.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtmarit.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Married", "Unmarried" }));
        jPanel2.add(txtmarit);
        txtmarit.setBounds(270, 330, 170, 40);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setText("Leaving Date");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(550, 490, 100, 30);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setText("Marital status");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(150, 340, 100, 30);

        txtaddress.setColumns(20);
        txtaddress.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtaddress.setRows(5);
        jScrollPane1.setViewportView(txtaddress);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(270, 390, 190, 70);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setText("Second Name");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(550, 230, 110, 30);

        txtgender.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtgender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female", "Other" }));
        jPanel2.add(txtgender);
        txtgender.setBounds(690, 280, 180, 30);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel14.setText("Gender");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(550, 280, 110, 30);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel15.setText("Department");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(550, 340, 90, 30);

        txtphone.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jPanel2.add(txtphone);
        txtphone.setBounds(690, 420, 190, 30);

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel16.setText("Address");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(150, 400, 100, 30);

        txtldate.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtldate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtldateActionPerformed(evt);
            }
        });
        jPanel2.add(txtldate);
        txtldate.setBounds(690, 490, 190, 30);

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel18.setText("Phone No.");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(550, 420, 100, 30);

        txtday.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jPanel2.add(txtday);
        txtday.setBounds(690, 560, 190, 30);

        txtsearch.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtsearch.setText("DC_100");
        jPanel2.add(txtsearch);
        txtsearch.setBounds(1000, 130, 170, 30);

        searchbtn.setBackground(new java.awt.Color(0, 204, 255));
        searchbtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        searchbtn.setText("Search");
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });
        jPanel2.add(searchbtn);
        searchbtn.setBounds(1200, 130, 90, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gui/java/doctorImage2.jpg"))); // NOI18N
        jPanel2.add(jLabel7);
        jLabel7.setBounds(1060, 220, 200, 170);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Password");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(1000, 510, 90, 30);

        txtuname.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jPanel2.add(txtuname);
        txtuname.setBounds(1110, 440, 170, 30);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setText("User Name");
        jPanel2.add(jLabel19);
        jLabel19.setBounds(1000, 440, 90, 30);

        txtpassword.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jPanel2.add(txtpassword);
        txtpassword.setBounds(1110, 510, 170, 30);

        txtDeptCombo.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtDeptCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<select>" }));
        txtDeptCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeptComboActionPerformed(evt);
            }
        });
        jPanel2.add(txtDeptCombo);
        txtDeptCombo.setBounds(690, 340, 190, 30);

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel20.setText("CNIC");
        jPanel2.add(jLabel20);
        jLabel20.setBounds(160, 620, 90, 30);

        txtcnic.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtcnic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcnicActionPerformed(evt);
            }
        });
        jPanel2.add(txtcnic);
        txtcnic.setBounds(270, 620, 190, 30);

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel21.setText("Join Date");
        jPanel2.add(jLabel21);
        jLabel21.setBounds(150, 490, 90, 30);

        txtjdate.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtjdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjdateActionPerformed(evt);
            }
        });
        jPanel2.add(txtjdate);
        txtjdate.setBounds(270, 490, 190, 30);

        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel22.setText("Visit Timing");
        jPanel2.add(jLabel22);
        jLabel22.setBounds(150, 560, 90, 30);

        txtvtime.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtvtime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtvtimeActionPerformed(evt);
            }
        });
        jPanel2.add(txtvtime);
        txtvtime.setBounds(270, 560, 190, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1353, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtldateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtldateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtldateActionPerformed

    private void logoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbtnActionPerformed
       this.dispose();
       new LoginForm().setVisible(true);
    }//GEN-LAST:event_logoutbtnActionPerformed

    private void txtcnicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcnicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcnicActionPerformed

    private void txtjdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjdateActionPerformed

    private void txtvtimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvtimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtvtimeActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        this.dispose();
        DoctorHome ph = new DoctorHome();
        ph.setVisible(true);
        ph.setLocationRelativeTo(null);
    }//GEN-LAST:event_homeActionPerformed

    private HashMap getDoctorDetails(){
        HashMap doctorDetails = new HashMap<String, String>();
        
        doctorDetails.put("doctor_code", txtcode.getText());
        doctorDetails.put("fname", txtfname.getText());
        doctorDetails.put("lname", txtlname.getText());
        doctorDetails.put("age", txtage.getText());
        doctorDetails.put("marital_status", txtmarit.getSelectedItem().toString());
        doctorDetails.put("gender", txtgender.getSelectedItem().toString());
        doctorDetails.put("address", txtaddress.getText());
        doctorDetails.put("department", txtDeptCombo.getSelectedItem().toString());
        doctorDetails.put("join_date", txtjdate.getText());
        doctorDetails.put("leaving_date", txtldate.getText());
        doctorDetails.put("visit_timing", txtvtime.getText());
        doctorDetails.put("days", txtday.getText());
        doctorDetails.put("cnic", txtcnic.getText());
        doctorDetails.put("user_name", txtuname.getText());
        doctorDetails.put("password", txtpassword.getText());
        doctorDetails.put("phone", txtphone.getText());
        
        return doctorDetails;
    }
    
    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
         String doctor_code = txtsearch.getText();
        
       
          String update = "select * from doctors where doctor_code = ?";
            try {
                Connection con = DBConnection1.getDBConnection1();
                PreparedStatement psmt = con.prepareStatement(update);
                psmt.setString(1, doctor_code);
                ResultSet rs = psmt.executeQuery();
              
                if(rs.next()){
              
                txtcode.setText(rs.getString("doctor_code"));
                txtfname.setText(rs.getString("fname"));
                txtlname.setText(rs.getString("lname"));
                txtage.setText(rs.getString("age"));
                txtmarit.setSelectedItem(rs.getString("marital_status"));
                txtgender.setSelectedItem(rs.getString("gender"));
                txtaddress.setText(rs.getString("address"));
                txtDeptCombo.setSelectedItem(rs.getString("department"));
                txtjdate.setText(rs.getString("join_date"));
                txtldate.setText(rs.getString("leaving_date"));
                txtvtime.setText(rs.getString("visit_timing"));
                txtday.setText(rs.getString("days"));
                txtcnic.setText(rs.getString("cnic"));
                txtuname.setText(rs.getString("user_name"));
                txtpassword.setText(rs.getString("password"));
                txtphone.setText(rs.getString("phone"));
       
                }else{
                    JOptionPane.showMessageDialog(searchbtn, "Employee code does not match");
                }
                setVisible(true);
            } catch (Exception e) {
                System.out.println(e);
            }
  
    
    
    }//GEN-LAST:event_searchbtnActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
       String doctor_code = txtcode.getText();
       String fname = txtfname.getText();
       String lname = txtlname.getText();
       String age = txtage.getText();
       String marital_status = txtmarit.getSelectedItem().toString();
       String gender = txtgender.getSelectedItem().toString();
       String address = txtaddress.getText();
       String department = txtDeptCombo.getSelectedItem().toString();
       String join_date = txtjdate.getText();
       String leaving_date = txtldate.getText();
       String visit_timing = txtvtime.getText();
       String days = txtday.getText();
       String cnic = txtcnic.getText();
       String user_name = txtuname.getText();
       String password = txtpassword.getText();
       String phone = txtphone.getText();
       
       
       
       String sql = "update  doctors set doctor_code =?, fname = ?,lname= ?,age= ?,marital_status= ?,gender= ?,address= ?,department= ?,join_date= ?,leaving_date= ?,visit_timing= ?,days= ?,cnic= ?,user_name= ?,password= ?,phone = ? where doctor_code = ?"; 
       
       try {
           Connection con = DBConnection1.getDBConnection1();
           PreparedStatement  stmt = con.prepareStatement(sql);
            stmt.setString(1, doctor_code);
            stmt.setString(2, fname);
            stmt.setString(3, lname);
            stmt.setString(4, age);
            stmt.setString(5, marital_status);
            stmt.setString(6, gender);
            stmt.setString(7, address);
            stmt.setString(8, department);
            stmt.setString(9, join_date);
            stmt.setString(10, leaving_date);
            stmt.setString(11, visit_timing);
            stmt.setString(12, days);
            stmt.setString(13, cnic);
            stmt.setString(14, user_name);
            stmt.setString(15, password);
            stmt.setString(16, phone);
            stmt.setString(17, doctor_code);
            
            
            int status = stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Update Successful");
            
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_updatebtnActionPerformed

    private void txtDeptComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeptComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDeptComboActionPerformed

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
            java.util.logging.Logger.getLogger(DoctorProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logoutbtn;
    private javax.swing.JButton searchbtn;
    private javax.swing.JComboBox txtDeptCombo;
    private javax.swing.JTextArea txtaddress;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtcnic;
    private javax.swing.JTextField txtcode;
    private javax.swing.JTextField txtday;
    private javax.swing.JTextField txtfname;
    private javax.swing.JComboBox txtgender;
    private javax.swing.JTextField txtjdate;
    private javax.swing.JTextField txtldate;
    private javax.swing.JTextField txtlname;
    private javax.swing.JComboBox txtmarit;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtphone;
    private javax.swing.JTextField txtsearch;
    private javax.swing.JTextField txtuname;
    private javax.swing.JTextField txtvtime;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}