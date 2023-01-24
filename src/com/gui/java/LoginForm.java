/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gui.java;

/**
 *
 * @author dinis
 */
public class LoginForm extends javax.swing.JFrame {

    /**
     * Creates new form LoginForm
     */
    public LoginForm() {
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
        adminbtn = new javax.swing.JButton();
        receptionistbtn = new javax.swing.JButton();
        doctorbtn = new javax.swing.JButton();
        pharmacistbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(null);

        adminbtn.setBackground(new java.awt.Color(255, 255, 255));
        adminbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        adminbtn.setText("ADMIN");
        adminbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminbtnActionPerformed(evt);
            }
        });
        jPanel2.add(adminbtn);
        adminbtn.setBounds(360, 500, 150, 50);

        receptionistbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        receptionistbtn.setText("RECEPTIONIST");
        receptionistbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receptionistbtnActionPerformed(evt);
            }
        });
        jPanel2.add(receptionistbtn);
        receptionistbtn.setBounds(570, 500, 170, 50);

        doctorbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        doctorbtn.setText("DOCTOR");
        doctorbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorbtnActionPerformed(evt);
            }
        });
        jPanel2.add(doctorbtn);
        doctorbtn.setBounds(780, 500, 150, 50);

        pharmacistbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pharmacistbtn.setText("PHARMACIST");
        pharmacistbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pharmacistbtnActionPerformed(evt);
            }
        });
        jPanel2.add(pharmacistbtn);
        pharmacistbtn.setBounds(970, 500, 155, 50);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gui/java/LoginHomePic.jpg"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 1420, 700);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1350, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void adminbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminbtnActionPerformed
        this.dispose();
        AdminLogin ad = new AdminLogin();
        ad.setVisible(true);
        ad.setLocationRelativeTo(ad);
        
    }//GEN-LAST:event_adminbtnActionPerformed

    private void receptionistbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receptionistbtnActionPerformed
        Receptionist re = new Receptionist();
        re.setVisible(true);
        re.setLocationRelativeTo(re);
    }//GEN-LAST:event_receptionistbtnActionPerformed

    private void doctorbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorbtnActionPerformed
        this.dispose();
        DoctorLogin dc = new DoctorLogin();
        dc.setVisible(true);
        dc.setLocationRelativeTo(dc);
    }//GEN-LAST:event_doctorbtnActionPerformed

    private void pharmacistbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pharmacistbtnActionPerformed
        PharmacistLogin ph = new PharmacistLogin();
        ph.setVisible(true);
        ph.setLocationRelativeTo(ph);
    }//GEN-LAST:event_pharmacistbtnActionPerformed

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminbtn;
    private javax.swing.JButton doctorbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton pharmacistbtn;
    private javax.swing.JButton receptionistbtn;
    // End of variables declaration//GEN-END:variables
}
