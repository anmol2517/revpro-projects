package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    static final String dburl = "jdbc:mysql://localhost:3306/";
    static final String user = "root";
    static final String password = "Scar2511@#";

    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection(dburl, user, password);
        Statement stmt = conn.createStatement();

        stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS learning_java");
        stmt.execute("USE learning_java");

        String sql = "CREATE TABLE IF NOT EXISTS mytable(id INT PRIMARY KEY, name VARCHAR(55), city VARCHAR(50))";
        stmt.executeUpdate(sql);

        System.out.println("Database and Table created successfully!");

        sql = "insert into mytable(id, name, city) values (1, 'JethaLal', 'Pune')";
        stmt.executeUpdate(sql);

        conn.close();
    }
}
