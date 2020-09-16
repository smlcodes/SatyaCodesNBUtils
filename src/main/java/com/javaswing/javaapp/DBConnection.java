/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaswing.javaapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author KavetiS
 */
public class DBConnection {
public static void main(String[] args) throws Exception {
 Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/swingdb?serverTimezone=UTC", "root", "root");
    System.out.println("----> con :: "+con);
    Statement stmt = con.createStatement();
    ResultSet rs = stmt.executeQuery("SELECT * FROM user");
    
    System.out.println("=========> rs :"+rs);
    
 while (rs.next())
System.out.println(rs.getInt(1)+":"+rs.getString(2)+ "  " + rs.getString(3));
 con.close();
	}


    public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/swingdb?serverTimezone=UTC", "root", "root");

        if (con != null) {

            System.out.println("Connection SUccess " + con);
        } else {
            System.out.println("Connection Failed " + con);
        }

        return con;

    }

}
