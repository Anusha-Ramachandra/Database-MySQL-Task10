package org.company.jdbc;

import java.sql.*;
        import java.util.Scanner;

public class DeleteEmployee {
    public static void main(String[] args) {
        // Database connection details
        String url = "jdbc:mysql://localhost:3306/company"; // Change to your DB name
        String user = "root"; // Change to your MySQL username
        String password = "Ganesha@25"; // Change to your MySQL password

        // SQL Query to delete employee
        String deleteSQL = "DELETE FROM Empl WHERE empno = ?";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(deleteSQL);
             Scanner scanner = new Scanner(System.in)) {

            // Get input from the user
            System.out.print("Enter Employee Number (empno) to delete: ");
            int empno = scanner.nextInt();

            // Set value in prepared statement
            pstmt.setInt(1, empno);

            // Execute delete
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Employee deleted successfully.");
            } else {
                System.out.println("Employee not found.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

