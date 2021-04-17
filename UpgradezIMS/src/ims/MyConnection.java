/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims;

import java.sql.*;

/**
 *
 * @author user
 */
public class MyConnection {
    
    // create a function to connect with mysql database
    public static Connection getConnection() {
        Connection cn = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/upgradez_ims", "root", "");
        } 
        
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return cn;
    }
    
}    
    

