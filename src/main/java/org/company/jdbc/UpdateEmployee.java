package org.company.jdbc;

import java.sql.*;
        import java.util.Scanner;

public class UpdateEmployee {
    public static void main(String[] args) {
        // Database connection details
        String url = "jdbc:mysql://localhost:3306/company"; // Change to your DB name
        String user = "root"; // Change to your MySQL username
        String password = "Ganesha@25"; // Change to your MySQL password

        // SQL Query to update employee details
        String updateSQL = "UPDATE Empl SET sal = ?, job = ? WHERE empno = ?";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(updateSQL);
             Scanner scanner = new Scanner(System.in)) {

            // Get input from the user
            System.out.print("Enter Employee Number (empno) to update: ");
            int empno = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            System.out.print("Enter new Job Title: ");
            String newJob = scanner.nextLine();

            System.out.print("Enter new Salary: ");
            double newSalary = scanner.nextDouble();

            // Set values in the prepared statement
            pstmt.setDouble(1, newSalary);
            pstmt.setString(2, newJob);
            pstmt.setInt(3, empno);

            // Execute update
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Employee details updated successfully.");
            } else {
                System.out.println("Employee not found.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

