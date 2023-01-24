/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gui.java;

import com.dbc.java.DBConnection1;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author dinis
 */
public class DataController {
      public static void loadComboBox(JComboBox combo, String query){
        Connection con = null;
        Statement cstmt = null;
        ResultSet rst = null;
        try {
            con = DBConnection1.getDBConnection1();
            cstmt = con.createStatement();
            rst = cstmt.executeQuery(query);
            List idlst = new ArrayList();
            while(rst.next()){
                idlst.add(rst.getString(1));
            }
            combo.setModel(new DefaultComboBoxModel(idlst.toArray()));
            combo.insertItemAt("Select or Write ID", 0);
            combo.setSelectedIndex(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            try {
                con.close();
                cstmt.close();
                rst.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
      
    public static void comboItemStateChange(JComboBox comboBox, JTextField textField, String query){
    if (comboBox.getSelectedIndex() > 0) {
            Connection con = null;
            Statement cstmt = null;
            ResultSet rst = null;
            try {
                con = DBConnection1.getDBConnection1();
               
                
                cstmt = con.createStatement();
                rst = cstmt.executeQuery(query + "'" + comboBox.getSelectedItem().toString() + "'");
                
                while (rst.next()) {
                    textField.setText(rst.getString("fname"));
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
        } 
        else {
            textField.setText("");
        }
    }
    
    public static void comboItemStateChangePayment(JComboBox comboBox, JTextField textField,JTextField textField1, String query){
    if (comboBox.getSelectedIndex() > 0) {
            Connection con = null;
            Statement cstmt = null;
            ResultSet rst = null;
            try {
                con = DBConnection1.getDBConnection1();
               
                
                cstmt = con.createStatement();
                rst = cstmt.executeQuery(query + "'" + comboBox.getSelectedItem().toString() + "'");
                
                while (rst.next()) {
                    textField.setText(rst.getString("fname"));
                    textField1.setText(rst.getString("department"));
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
        } 
        else {
            textField.setText("");
            textField1.setText("");
        }
    }
    
    public static void comboItemStateChange1(JComboBox comboBox, JTextField textField, String query){
    if (comboBox.getSelectedIndex() > 0) {
            Connection con = null;
            Statement cstmt = null;
            ResultSet rst = null;
            try {
                con = DBConnection1.getDBConnection1();
               
                
                cstmt = con.createStatement();
                rst = cstmt.executeQuery(query + "'" + comboBox.getSelectedItem().toString() + "'");
                
                while (rst.next()) {
                    textField.setText(rst.getString("fname"));
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
        } 
        else {
            textField.setText("");
        }
    }
             
}

 
    