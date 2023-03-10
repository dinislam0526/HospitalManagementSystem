/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gui.java;

import com.dbc.java.DBConnection1;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

public class AppointmentDetail extends javax.swing.JFrame {

    DefaultTableModel model;

    /**
     * Creates new form LoginForm
     */
    public AppointmentDetail() {
        initComponents();
        DataController.loadComboBox(combo_doctorCode, "select doctor_code from doctors");
        DataController.loadComboBox(combo_patientCode, "select patient_code from patients");
        DataController.loadComboBox(txtsearch, "select appoint_id from appointment");
        viewAppointments1();
    }
    
         public void viewAppointments1(){
         model = new DefaultTableModel();
         model.addColumn("Appoint_id");
         model.addColumn("Doctor_code");
         model.addColumn("Patient_code");
         model.addColumn("Appoint_Date");
         model.addColumn("Appoint_Time");
         model.addColumn("Phone");
         model.addColumn("Status");
         
        String sql = "select * from appointment ";
        try {
              Connection con = DBConnection1.getDBConnection1();
              Statement stmt = con.createStatement();
              ResultSet rs = stmt.executeQuery(sql);
             
              while(rs.next()){
                  //Object[] rowdata = {rs.getString("")}; 
                
                    String Appoint_id = rs.getString("appoint_id");
                    String Doctor_code = rs.getString("doctor_code");
                    String Patient_code = rs.getString("patient_code");
                    String Appoint_Date = rs.getString("appoint_date");
                    String Appoint_Time = rs.getString("appoint_time");
                    String Phone = rs.getString("phone");
                    String Status = rs.getString("status");
                    
                  Object[] rowData = {Appoint_id, Doctor_code, Patient_code, Appoint_Date, Appoint_Time, Phone, Status};
                  model.addRow(rowData);
                  //System.out.println(rs.getString("code"));
              }        
              jTable1.setModel(model);
              
          
              
        } catch (Exception e) {
            System.out.println(e);
        }
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
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_doctorName = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        logoutbtn = new javax.swing.JButton();
        home = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        addbtn = new javax.swing.JButton();
        updatebtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtphone = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txt_appointDate = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txt_appointTime = new javax.swing.JTextField();
        combo_doctorCode = new javax.swing.JComboBox();
        combo_patientCode = new javax.swing.JComboBox();
        txt_patientName = new javax.swing.JTextField();
        combo_status = new javax.swing.JComboBox();
        txtsearch = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(248, 240, 227));
        jPanel2.setLayout(null);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("Edit");
        jPanel2.add(jButton1);
        jButton1.setBounds(570, 0, 100, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gui/java/adminHL.png"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 10, 120, 130);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Status");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(140, 320, 100, 30);

        txt_doctorName.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jPanel2.add(txt_doctorName);
        txt_doctorName.setBounds(670, 210, 190, 30);

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Appointment Details");

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
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 652, Short.MAX_VALUE)
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
        jLabel1.setBounds(0, -10, 1470, 130);

        addbtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        addbtn.setText("Add");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });
        jPanel2.add(addbtn);
        addbtn.setBounds(180, 0, 120, 40);

        updatebtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        updatebtn.setText("Update");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });
        jPanel2.add(updatebtn);
        updatebtn.setBounds(310, 0, 120, 40);

        deletebtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        deletebtn.setText("Delete");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });
        jPanel2.add(deletebtn);
        deletebtn.setBounds(440, 0, 120, 40);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("Doctor Code");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(140, 210, 100, 30);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("Patient Code");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(140, 260, 100, 30);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setText("Doctor Name");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(530, 210, 110, 30);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel14.setText("Patient Name");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(530, 260, 110, 30);

        txtphone.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jPanel2.add(txtphone);
        txtphone.setBounds(670, 320, 190, 30);

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel18.setText("Phone No.");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(530, 320, 100, 30);

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel21.setText("Appoint Date");
        jPanel2.add(jLabel21);
        jLabel21.setBounds(930, 210, 110, 30);

        txt_appointDate.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txt_appointDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_appointDateActionPerformed(evt);
            }
        });
        jPanel2.add(txt_appointDate);
        txt_appointDate.setBounds(1060, 210, 190, 30);

        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel22.setText("Appoint Time");
        jPanel2.add(jLabel22);
        jLabel22.setBounds(930, 270, 110, 30);

        txt_appointTime.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txt_appointTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_appointTimeActionPerformed(evt);
            }
        });
        jPanel2.add(txt_appointTime);
        txt_appointTime.setBounds(1060, 270, 190, 30);

        combo_doctorCode.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Write ID" }));
        combo_doctorCode.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_doctorCodeItemStateChanged(evt);
            }
        });
        combo_doctorCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_doctorCodeActionPerformed(evt);
            }
        });
        jPanel2.add(combo_doctorCode);
        combo_doctorCode.setBounds(270, 210, 170, 30);

        combo_patientCode.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Write ID" }));
        combo_patientCode.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_patientCodeItemStateChanged(evt);
            }
        });
        combo_patientCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_patientCodeActionPerformed(evt);
            }
        });
        jPanel2.add(combo_patientCode);
        combo_patientCode.setBounds(270, 260, 170, 30);
        jPanel2.add(txt_patientName);
        txt_patientName.setBounds(670, 260, 190, 30);

        combo_status.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pending", "Done", "Absent" }));
        jPanel2.add(combo_status);
        combo_status.setBounds(270, 320, 170, 40);

        txtsearch.setEditable(true);
        txtsearch.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Write ID" }));
        txtsearch.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                txtsearchItemStateChanged(evt);
            }
        });
        jPanel2.add(txtsearch);
        txtsearch.setBounds(270, 160, 170, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(10, 420, 1330, 280);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Appoint Code");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(140, 160, 100, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1353, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbtnActionPerformed
        this.dispose();
        new LoginForm().setVisible(true);
    }//GEN-LAST:event_logoutbtnActionPerformed

    private void txt_appointDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_appointDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_appointDateActionPerformed

    private void txt_appointTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_appointTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_appointTimeActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        this.dispose();
        ReceptionistHome ph = new ReceptionistHome();
        ph.setVisible(true);
        ph.setLocationRelativeTo(null);
    }//GEN-LAST:event_homeActionPerformed

    private HashMap getAppointmentDetails() {

        HashMap appointDetails = new HashMap<String, String>();

        appointDetails.put("appoint_id", txtsearch.getSelectedItem());
        appointDetails.put("doctor_code", combo_doctorCode.getSelectedItem());
        appointDetails.put("patient_code", combo_patientCode.getSelectedItem());
        appointDetails.put("appoint_date", txt_appointDate.getText());
        appointDetails.put("appoint_time", txt_appointTime.getText());
        appointDetails.put("status", combo_status.getSelectedItem());
        appointDetails.put("phone", txtphone.getText());

        return appointDetails;
    }

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        HashMap appointment = getAppointmentDetails();

        String sql = "insert into appointment(appoint_id,doctor_code,patient_code,appoint_date,appoint_time,status,phone) values(?,?,?,?,?,?,?)";

        try {
            Connection con = DBConnection1.getDBConnection1();
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, appointment.get("appoint_id").toString());
            stmt.setString(2, appointment.get("doctor_code").toString());
            stmt.setString(3, appointment.get("patient_code").toString());
            stmt.setString(4, appointment.get("appoint_date").toString());
            stmt.setString(5, appointment.get("appoint_time").toString());
            stmt.setString(6, appointment.get("status").toString());
            stmt.setString(7, appointment.get("phone").toString());

            int status = stmt.executeUpdate();

           DataController.loadComboBox(txtsearch, "select appoint_id from appointment");
           JOptionPane.showMessageDialog(addbtn, "Appointment Added Successfully!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(addbtn, "This code is already used??");
            e.printStackTrace();
        }
    }//GEN-LAST:event_addbtnActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed

    }//GEN-LAST:event_updatebtnActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed

    }//GEN-LAST:event_deletebtnActionPerformed

    private void combo_doctorCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_doctorCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_doctorCodeActionPerformed

    private void combo_doctorCodeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_doctorCodeItemStateChanged
        DataController.comboItemStateChange(combo_doctorCode, txt_doctorName, "select fname from doctors where doctor_code =");

    }//GEN-LAST:event_combo_doctorCodeItemStateChanged

    private void combo_patientCodeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_patientCodeItemStateChanged
        DataController.comboItemStateChange(combo_patientCode, txt_patientName, "select fname from patients where patient_code =");

    }//GEN-LAST:event_combo_patientCodeItemStateChanged

    private void txtsearchItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_txtsearchItemStateChanged
        if (txtsearch.getSelectedIndex() > 0) {
            Connection con = null;
            Statement cstmt = null;
            ResultSet rst = null;
            try {
                con = DBConnection1.getDBConnection1();

                cstmt = con.createStatement();
                rst = cstmt.executeQuery("select * from appointment where appoint_id = '" + txtsearch.getSelectedItem().toString() + "'");

                while (rst.next()) {

                    combo_doctorCode.setSelectedItem(rst.getString("doctor_code"));
                    combo_patientCode.setSelectedItem(rst.getString("patient_code"));
                    txt_appointDate.setText(rst.getString("appoint_date"));
                    txt_appointTime.setText(rst.getString("appoint_time"));
                    combo_status.setSelectedItem(rst.getString("status"));
                    txtphone.setText(rst.getString("phone"));
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    con.close();
                    cstmt.close();
                    rst.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } else {
            combo_doctorCode.setSelectedIndex(0);
            combo_patientCode.setSelectedIndex(0);
            txt_appointDate.setText("");
            txt_appointTime.setText("");
            combo_status.setSelectedIndex(0);
            txtphone.setText("");
        }
    }//GEN-LAST:event_txtsearchItemStateChanged

    private void combo_patientCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_patientCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_patientCodeActionPerformed

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
            java.util.logging.Logger.getLogger(AppointmentDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppointmentDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppointmentDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppointmentDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppointmentDetail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JComboBox combo_doctorCode;
    private javax.swing.JComboBox combo_patientCode;
    private javax.swing.JComboBox combo_status;
    private javax.swing.JButton deletebtn;
    private javax.swing.JButton home;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton logoutbtn;
    private javax.swing.JTextField txt_appointDate;
    private javax.swing.JTextField txt_appointTime;
    private javax.swing.JTextField txt_doctorName;
    private javax.swing.JTextField txt_patientName;
    private javax.swing.JTextField txtphone;
    private javax.swing.JComboBox txtsearch;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}
