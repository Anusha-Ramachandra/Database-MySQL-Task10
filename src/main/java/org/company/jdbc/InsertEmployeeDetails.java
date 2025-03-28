package org.company.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertEmployeeDetails {
    public static void main(String[] args) {
        // Database connection details
        String url = "jdbc:mysql://localhost:3306/company"; // Change database name
        String user = "root"; // Change to your MySQL username
        String password = "Ganesha@25"; // Change to your MySQL password

        // SQL query to insert data
        String insertSQL = "INSERT INTO EmployeeDetails (empcode, empname, empage, esalary) VALUES (?, ?, ?, ?)";

        // Employee data to insert
        Object[][] employees = {
                {101, "Jenny", 25, 10000.0},
                {102, "Jacky", 30, 20000.0},
                {103, "Joe", 20, 40000.0},
                {104, "John", 40, 80000.0},
                {105, "Shammer", 25, 90000.0}
        };

        // JDBC connection and data insertion
        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {

            for (Object[] emp : employees) {
                pstmt.setInt(1, (int) emp[0]);
                pstmt.setString(2, (String) emp[1]);
                pstmt.setInt(3, (int) emp[2]);
                pstmt.setDouble(4, (double) emp[3]);
                pstmt.executeUpdate(); // Execute the insert query
            }

            System.out.println("Employee data inserted successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

