package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Driven {

    static final String dburl = "jdbc:mysql://localhost:3306/learning_java";
    static final String user = "root";
    static final String password = "Scar2511@#";

    public static void main(String[] args) throws SQLException, IOException {

        Connection conn  = null;
        Statement stmt = null;
        ResultSet rs = null;

        int choice;
        conn = DriverManager.getConnection(dburl, user, password);

        do {
            System.out.println("\n");
            System.out.println("Menu : ");
            System.out.println("1. Insert record");
            System.out.println("2. Update the existing record");
            System.out.println("3. Display all records");
            System.out.println("4. Delete the record");
            System.out.println("5. Exit");

            System.out.print("Enter your choice : ");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            choice = Integer.parseInt(br.readLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter Name : ");
                    String Name = br.readLine();
                    System.out.print("Enter City : ");
                    String City = br.readLine();
                    System.out.print("Enter State : ");
                    String State = br.readLine();
                    System.out.print("Enter Pincode : ");
                    int Pincode = Integer.parseInt(br.readLine());

                    String sql = "insert into tab1(Name, City, State, Pincode) values(?,?,?,?)";

                    //  String sql = "INSERT INTO records
                    //  (Name, City, State, Pincode) VALUES
                    //  ('aman', 'pune', 'maharashtra', 411038)";

                    PreparedStatement pstmt = conn.prepareStatement(sql);

                    pstmt.setString(1, Name);
                    pstmt.setString(2, City);
                    pstmt.setString(3, State);
                    pstmt.setInt(4, Pincode);

                    pstmt.executeUpdate();
                    System.out.println("Inserted records successfully");
                    break;

                case 2:
                    System.out.print("Enter the Name of the record you want to update: ");
                    String oldName = br.readLine();
                    System.out.print("Enter New Name: ");
                    String newName = br.readLine();
                    System.out.print("Enter New City: ");
                    String newCity = br.readLine();
                    System.out.print("Enter New State: ");
                    String newState = br.readLine();
                    System.out.print("Enter New Pincode: ");
                    int newPincode = Integer.parseInt(br.readLine());

                    sql = "UPDATE tab1 SET Name = ?, City = ?, State = ?, Pincode = ? WHERE Name = ?";
                    PreparedStatement pstmtUpdate = conn.prepareStatement(sql);

                    pstmtUpdate.setString(1, newName);
                    pstmtUpdate.setString(2, newCity);
                    pstmtUpdate.setString(3, newState);
                    pstmtUpdate.setInt(4, newPincode);
                    pstmtUpdate.setString(5, oldName);

                    int rows = pstmtUpdate.executeUpdate();
                    System.out.println(rows > 0 ? "Updated successfully" : "Record not found");
                    break;

                case 3:
                    sql = "SELECT * FROM tab1";
                    stmt = conn.createStatement();
                    rs = stmt.executeQuery(sql);
                    while (rs.next()) {
                        System.out.println("Name: " + rs.getString("Name") + ", City: " + rs.getString("City") +
                                ", State: " + rs.getString("State") + ", Pincode: " + rs.getInt("Pincode"));
                    }
                    break;

                case 4:
                    System.out.print("Enter Name to delete record: ");
                    String deleteName = br.readLine();
                    sql = "DELETE FROM tab1 WHERE Name = ?";

                    PreparedStatement pstmtDelete = conn.prepareStatement(sql);
                    pstmtDelete.setString(1, deleteName);

                    int rowsDeleted = pstmtDelete.executeUpdate();
                    System.out.println(rowsDeleted > 0 ? "Record deleted" : "Record not found");
                    break;
            }
        }while (choice != 5);
        System.out.println("Exiting the console. Goodbye!");
        conn.close();
        }
}


