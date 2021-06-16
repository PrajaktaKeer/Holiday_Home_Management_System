/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jing
 */
import java.sql.*;
import javax.swing.*;

public class MysqlConnect {
    Connection conn = null;
    
    public static Connection ConnectDb() {
        try {
            //Class.forName("com.mysql.jdbc.Driver");
            //Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sl3_a5","root","password");
            
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/holiday_home_management", "root", "password");
            //JOptionPane.showMessageDialog(null, "connected to database");
            return conn;
            
        } catch(Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                        return null;

        }
    }
    
}