package org.company.jdbc;

import java.sql.*;
import java.util.Scanner;

public class AddEmployee {
    public static void main(String[] args) {
        // Database connection details
        String url = "jdbc:mysql://localhost:3306/company"; // Change to your DB name
        String user = "root"; // Change to your MySQL username
        String password = "Ganesha@25"; // Change to your MySQL password

        // SQL Query to insert a new employee
        String insertSQL = "INSERT INTO Empl (empno, ename, job, mgr, hiredate, sal, comm, deptno) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(insertSQL);
             Scanner scanner = new Scanner(System.in)) {

            // Get input from the user
            System.out.print("Enter Employee Number (empno): ");
            int empno = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            System.out.print("Enter Employee Name (ename): ");
            String ename = scanner.nextLine();

            System.out.print("Enter Job Title: ");
            String job = scanner.nextLine();

            System.out.print("Enter Manager ID (mgr) [Enter 0 if none]: ");
            int mgr = scanner.nextInt();
            mgr = (mgr == 0) ? 0 : mgr; // Handle null manager case

            System.out.print("Enter Hire Date (YYYY-MM-DD): ");
            scanner.nextLine(); // Consume newline
            String hiredate = scanner.nextLine();

            System.out.print("Enter Salary (sal): ");
            double sal = scanner.nextDouble();

            System.out.print("Enter Commission (comm) [Enter 0 if none]: ");
            double comm = scanner.nextDouble();
            comm = (comm == 0) ? 0 : comm; // Handle null commission case

            System.out.print("Enter Department Number (deptno): ");
            int deptno = scanner.nextInt();

            // Set values in prepared statement
            pstmt.setInt(1, empno);
            pstmt.setString(2, ename);
            pstmt.setString(3, job);
            pstmt.setInt(4, mgr == 0 ? Types.NULL : mgr); // Handle NULL for mgr
            pstmt.setString(5, hiredate);
            pstmt.setDouble(6, sal);
            pstmt.setDouble(7, comm == 0 ? Types.NULL : comm); // Handle NULL for comm
            pstmt.setInt(8, deptno);

            // Execute insertion
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Employee added successfully.");
            } else {
                System.out.println("Employee insertion failed.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

