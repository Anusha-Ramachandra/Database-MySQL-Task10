package org.company.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {
    public static void main(String[] args) {
        // Database connection URL
        String url = "jdbc:mysql://localhost:3306/company"; // Change 'company' to your database name
        String user = "root"; // Change if you have a different username
        String password = "Ganesha@25"; // Enter your MySQL password here

        // Step 1: Load MySQL JDBC Driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("MySQL JDBC Driver Registered!");

            // Step 2: Establish the Connection
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the database successfully!");

            // Step 3: Close the Connection
            conn.close();
            System.out.println("Connection closed.");
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection Failed!");
            e.printStackTrace();
        }
    }
}

