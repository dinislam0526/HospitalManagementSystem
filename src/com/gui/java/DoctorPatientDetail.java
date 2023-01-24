/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gui.java;

import com.dbc.java.DBConnection1;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author dinis
 */
public class DoctorPatientDetail extends javax.swing.JFrame {

    /**
     * Creates new form LoginForm
     */
    public DoctorPatientDetail() {
        initComponents();
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
        viewbtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtlname = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        logoutbtn = new javax.swing.JButton();
        homebtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        addbtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
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
        txtadate = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtphone = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtcnic = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtbed = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtsearch = new javax.swing.JTextField();
        searchbtn = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        txtword = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(248, 240, 227));
        jPanel2.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gui/java/adminHL.png"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 10, 120, 130);

        viewbtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        viewbtn.setText("View");
        viewbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbtnActionPerformed(evt);
            }
        });
        jPanel2.add(viewbtn);
        viewbtn.setBounds(310, 0, 120, 40);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Bed No.");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(570, 540, 100, 30);

        txtlname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel2.add(txtlname);
        txtlname.setBounds(690, 230, 180, 30);

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Patient Details");

        logoutbtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        logoutbtn.setText("Logout");
        logoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbtnActionPerformed(evt);
            }
        });

        homebtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        homebtn.setText("Home");
        homebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homebtnActionPerformed(evt);
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
                .addComponent(homebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(homebtn))
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

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Patient Code");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(150, 180, 100, 30);

        txtcode.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtcode.setText("Pt_00");
        jPanel2.add(txtcode);
        txtcode.setBounds(270, 180, 170, 30);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("Fast Name");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(150, 230, 80, 30);

        txtfname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel2.add(txtfname);
        txtfname.setBounds(270, 230, 170, 30);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("Age");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(150, 280, 80, 30);

        txtage.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel2.add(txtage);
        txtage.setBounds(270, 270, 170, 30);

        txtmarit.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<select>", "Married", "UnMarried", "Others" }));
        jPanel2.add(txtmarit);
        txtmarit.setBounds(270, 330, 170, 40);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setText("CNIC");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(160, 600, 90, 30);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setText("Marital status");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(150, 340, 100, 30);

        txtaddress.setColumns(20);
        txtaddress.setRows(5);
        jScrollPane1.setViewportView(txtaddress);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(270, 390, 190, 70);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setText("Second Name");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(550, 230, 110, 30);

        txtgender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<select>", "Male", "Female", "Others" }));
        jPanel2.add(txtgender);
        txtgender.setBounds(690, 280, 180, 30);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel14.setText("Gender");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(560, 280, 110, 30);
        jPanel2.add(txtadate);
        txtadate.setBounds(690, 340, 180, 30);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel15.setText("Admit_date");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(560, 340, 90, 30);
        jPanel2.add(txtphone);
        txtphone.setBounds(690, 420, 190, 30);

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel16.setText("Address");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(150, 400, 100, 30);

        txtcnic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcnicActionPerformed(evt);
            }
        });
        jPanel2.add(txtcnic);
        txtcnic.setBounds(270, 600, 190, 30);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 51, 255));
        jLabel17.setText("(For Indoor Patient only)");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(140, 500, 160, 30);

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel18.setText("Phone No.");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(570, 420, 100, 30);
        jPanel2.add(txtbed);
        txtbed.setBounds(690, 540, 190, 30);

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel19.setText("Patient Code");
        jPanel2.add(jLabel19);
        jLabel19.setBounds(880, 130, 100, 30);

        txtsearch.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtsearch.setText("Pt_00");
        txtsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearchActionPerformed(evt);
            }
        });
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

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel20.setText("Word No.");
        jPanel2.add(jLabel20);
        jLabel20.setBounds(150, 540, 90, 30);

        txtword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtwordActionPerformed(evt);
            }
        });
        jPanel2.add(txtword);
        txtword.setBounds(270, 540, 190, 30);

        jLabel21.setText("(yyyy - mm - dd)");
        jPanel2.add(jLabel21);
        jLabel21.setBounds(890, 340, 90, 20);

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

    private void txtcnicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcnicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcnicActionPerformed

    private void logoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbtnActionPerformed
        new LoginForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutbtnActionPerformed

    private void txtwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtwordActionPerformed

    private void homebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebtnActionPerformed
        new DoctorHome().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homebtnActionPerformed

    private void viewbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbtnActionPerformed
      this.dispose();
      new DoctorViewPatient().setVisible(true);
       
    }//GEN-LAST:event_viewbtnActionPerformed

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
       String patient_code = txtcode.getText();
       String fname = txtfname.getText();
       String lname = txtlname.getText();
       String age = txtage.getText();
       String marital_status = txtmarit.getSelectedItem().toString();
       String gender = txtgender.getSelectedItem().toString();
       String address = txtaddress.getText();
       String admit_date = txtadate.getText();
       String word_no = txtword.getText();
       String bed_no = txtbed.getText();
       String cnic = txtcnic.getText();
       String phone = txtphone.getText();
       
       
       
       String sql = "insert into patients(patient_code,fname,lname,age,marital_status,gender,address,phone,admit_date,word_no,bed_no,cnic) values(?,?,?,?,?,?,?,?,?,?,?,?)";
       
       try {
           Connection con = DBConnection1.getDBConnection1();
           PreparedStatement  stmt = con.prepareStatement(sql);
            stmt.setString(1,patient_code);
            stmt.setString(2, fname);
            stmt.setString(3, lname);
            stmt.setString(4, age);
            stmt.setString(5, marital_status);
            stmt.setString(6, gender);
            stmt.setString(7, address);
            stmt.setString(8, phone);
            stmt.setString(9, admit_date);
            stmt.setString(10, word_no);
            stmt.setString(11, bed_no);
            stmt.setString(12, cnic);
            
            int status = stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Patient Added??");
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "This code is already used??");
            System.out.println(e);
        }
    }//GEN-LAST:event_addbtnActionPerformed

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
        String patient_code = txtsearch.getText();
        
          String update = "select * from patients where patient_code = ?";
            try {
                Connection con = DBConnection1.getDBConnection1();
                PreparedStatement psmt = con.prepareStatement(update);
                psmt.setString(1, patient_code);
                ResultSet rs = psmt.executeQuery();
              
                if(rs.next()){
              
                txtcode.setText(rs.getString("patient_code"));
                txtfname.setText(rs.getString("fname"));
                txtlname.setText(rs.getString("lname"));
                txtage.setText(rs.getString("age"));
                txtmarit.setSelectedItem(rs.getString("marital_status"));
                txtgender.setSelectedItem(rs.getString("gender"));
                txtaddress.setText(rs.getString("address"));
                txtadate.setText(rs.getString("admit_date"));
                txtcnic.setText(rs.getString("cnic"));
                txtword.setText(rs.getString("word_no"));
                txtbed.setText(rs.getString("bed_no"));
                txtphone.setText(rs.getString("phone"));
       
                }else{
                    JOptionPane.showMessageDialog(null, "Patient code does not match");
                }
                setVisible(true);
            } catch (Exception e) {
                System.out.println(e);
            }
            
    }//GEN-LAST:event_searchbtnActionPerformed

    private void txtsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsearchActionPerformed

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
            java.util.logging.Logger.getLogger(DoctorPatientDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorPatientDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorPatientDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorPatientDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorPatientDetail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JButton homebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logoutbtn;
    private javax.swing.JButton searchbtn;
    private javax.swing.JTextField txtadate;
    private javax.swing.JTextArea txtaddress;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtbed;
    private javax.swing.JTextField txtcnic;
    private javax.swing.JTextField txtcode;
    private javax.swing.JTextField txtfname;
    private javax.swing.JComboBox txtgender;
    private javax.swing.JTextField txtlname;
    private javax.swing.JComboBox txtmarit;
    private javax.swing.JTextField txtphone;
    private javax.swing.JTextField txtsearch;
    private javax.swing.JTextField txtword;
    private javax.swing.JButton viewbtn;
    // End of variables declaration//GEN-END:variables
}