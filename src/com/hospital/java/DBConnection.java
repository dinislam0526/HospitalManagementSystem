
package com.hospital.java;

import java.sql.*;
import java.sql.DriverManager;

public class DBConnection {
    public static Connection getDBConnection(){
        Connection con = null;
        try {
          con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "root");
        } catch (Exception e) {
        }
        return con;
    
  }
}

