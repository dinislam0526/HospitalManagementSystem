/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gui.java;

import com.dbc.java.DBConnection1;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author dinis
 */
public class PrescriptionForm extends javax.swing.JFrame {

    /**
     * Creates new form PrescriptionForm
     */
    String doctorCode = "";
    
    public PrescriptionForm() {
        initComponents();
    }
    public PrescriptionForm(String doctorCode) {
        initComponents();
        DataController.loadComboBox(combo_DoctorCode, "select doctor_code from doctors where doctor_code = '" + doctorCode + "'");
        DataController.loadComboBox(combo_patientCode, "select patient_code from appointment where doctor_code = '" + doctorCode + "'");
        DataController.loadComboBox(combo_PrecriptionId, "select prescription_code from prescription where doctor_code = '" + doctorCode + "'");
        this.doctorCode = doctorCode;
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        combo_patientCode = new javax.swing.JComboBox();
        btn_createNewPrescription = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txt_medicineName = new javax.swing.JTextField();
        btn_savePrescription = new javax.swing.JButton();
        combo_PrecriptionId = new javax.swing.JComboBox();
        btn_viewPrescription = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txt_Date = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        combo_DoctorCode = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        txt_instruction = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(248, 240, 227));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(248, 240, 227));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Pres_Id");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Patient_code");

        combo_patientCode.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btn_createNewPrescription.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_createNewPrescription.setText("Create new Prescription");
        btn_createNewPrescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_createNewPrescriptionActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Medicine Name");

        btn_savePrescription.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_savePrescription.setText("Save Prescription");
        btn_savePrescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_savePrescriptionActionPerformed(evt);
            }
        });

        combo_PrecriptionId.setEditable(true);
        combo_PrecriptionId.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btn_viewPrescription.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_viewPrescription.setText("View Prescription");
        btn_viewPrescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_viewPrescriptionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(305, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btn_createNewPrescription)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(28, 28, 28)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(combo_PrecriptionId, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(combo_patientCode, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_medicineName, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(59, 59, 59))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_savePrescription, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btn_viewPrescription)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combo_patientCode, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combo_PrecriptionId, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(52, 52, 52)
                .addComponent(btn_createNewPrescription, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_medicineName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_viewPrescription)
                    .addComponent(btn_savePrescription))
                .addContainerGap(140, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 163, 710, 560));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gui/java/adminHL.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 150, -1));

        jPanel3.setBackground(new java.awt.Color(0, 204, 255));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Prescription details");

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("Logout");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 672, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 27, 1260, -1));
        jPanel1.add(txt_Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 170, 255, 33));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Date");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 170, 78, 28));

        combo_DoctorCode.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combo_DoctorCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_DoctorCodeActionPerformed(evt);
            }
        });
        jPanel1.add(combo_DoctorCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 240, 260, 33));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Doctor_code");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 240, -1, 30));

        txt_instruction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_instructionActionPerformed(evt);
            }
        });
        jPanel1.add(txt_instruction, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 450, 260, 36));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Instruction");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 450, 96, 37));

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

    private void combo_DoctorCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_DoctorCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_DoctorCodeActionPerformed

    private void btn_viewPrescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_viewPrescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_viewPrescriptionActionPerformed

    private void txt_instructionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_instructionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_instructionActionPerformed

    private void btn_createNewPrescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_createNewPrescriptionActionPerformed
       HashMap prescription = getPrescription();

        String sql = "insert into prescription(prescription_code,doctor_code,patient_code,date) values(?,?,?,?)";

        try {
            Connection con = DBConnection1.getDBConnection1();
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, prescription.get("prescription_code").toString());
            stmt.setString(2, prescription.get("doctor_code").toString());
            stmt.setString(3, prescription.get("patient_code").toString());
            stmt.setString(4, prescription.get("date").toString());

            int status = stmt.executeUpdate();

           DataController.loadComboBox(combo_PrecriptionId, "select prescription_code from prescription where doctor_code = '" + doctorCode + "'");
           JOptionPane.showMessageDialog(null, "Prescription Added Successfully!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "This code is already used??");
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_createNewPrescriptionActionPerformed

    private void btn_savePrescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_savePrescriptionActionPerformed
        HashMap prescriptionDetails = getPrescriptionDetails();

        String sql = "insert into prescription_details(prescription_code,medicine_name,instruction) values(?,?,?)";

        try {
            Connection con = DBConnection1.getDBConnection1();
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, prescriptionDetails.get("prescription_code").toString());
            stmt.setString(2, prescriptionDetails.get("medicine_name").toString());
            stmt.setString(3, prescriptionDetails.get("instruction").toString());

            int status = stmt.executeUpdate();

           JOptionPane.showMessageDialog(null, "Prescription Details Added Successfully!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "This code is already used??");
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_savePrescriptionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        new DoctorHome().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       this.dispose();
       new LoginForm().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private HashMap getPrescription() {

        HashMap prescription = new HashMap<String, String>();

        prescription.put("prescription_code", combo_PrecriptionId.getSelectedItem());
        prescription.put("doctor_code", combo_DoctorCode.getSelectedItem());
        prescription.put("patient_code", combo_patientCode.getSelectedItem());
        prescription.put("date", txt_Date.getText());
       

        return prescription;
    }
    private HashMap getPrescriptionDetails() {

        HashMap prescriptionDetails = new HashMap<String, String>();

        prescriptionDetails.put("prescription_code", combo_PrecriptionId.getSelectedItem());
        prescriptionDetails.put("medicine_name", txt_medicineName.getText());
        prescriptionDetails.put("instruction", txt_instruction.getText());
       
        return prescriptionDetails;
    }
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
            java.util.logging.Logger.getLogger(PrescriptionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrescriptionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrescriptionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrescriptionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrescriptionForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_createNewPrescription;
    private javax.swing.JButton btn_savePrescription;
    private javax.swing.JButton btn_viewPrescription;
    private javax.swing.JComboBox combo_DoctorCode;
    private javax.swing.JComboBox combo_PrecriptionId;
    private javax.swing.JComboBox combo_patientCode;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txt_Date;
    private javax.swing.JTextField txt_instruction;
    private javax.swing.JTextField txt_medicineName;
    // End of variables declaration//GEN-END:variables
}
