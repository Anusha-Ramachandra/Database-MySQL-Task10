package org.company.jdbc;

import java.sql.*;

public class FetchEmployees {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/company"; // Change DB name
        String user = "root"; // Change MySQL username
        String password = "Ganesha@25"; // Change MySQL password

        String selectSQL = "SELECT * FROM Empl";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(selectSQL)) {

            System.out.println("Employee Data:");
            System.out.println("-----------------------------------------------------");

            while (rs.next()) {
                int empno = rs.getInt("empno");
                String ename = rs.getString("ename");
                String job = rs.getString("job");
                int mgr = rs.getInt("mgr");
                Date hiredate = rs.getDate("hiredate");
                double sal = rs.getDouble("sal");
                Double comm = rs.getObject("comm", Double.class); // Handle NULL values
                int deptno = rs.getInt("deptno");

                System.out.println("Emp No: " + empno + ", Name: " + ename + ", Job: " + job +
                        ", Manager: " + mgr + ", Hire Date: " + hiredate +
                        ", Salary: " + sal + ", Commission: " + (comm != null ? comm : "N/A") +
                        ", Dept No: " + deptno);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
