package com.danunora;

import java.sql.*;

public class sqlite3DB {

    private Connection conn = null;

    public sqlite3DB() {
    }

    public void openDB () {
        try {
            conn = DriverManager.getConnection(Consts.DB_URL);
            System.out.println("Connection opened successfully");
        } catch (SQLException e) {
            System.out.println("Connection failed");
            System.out.format("%s", e.getMessage());
        }
    }

    public void queryDB (String query) {
        try {
            Statement statement = conn.createStatement();
            ResultSet results = statement.executeQuery(query);
            while (results.next()){
                System.out.println(results.getString("name") + " " +
                                   results.getString("email") + " " +
                                   results.getString("phone"));
            }
            statement.close();
            System.out.println("Query executed successfully");
        } catch (SQLException e) {
            System.out.println("query failed");
            System.out.format("%s", e.getMessage());
        }
    }

    public void insertDB (String query) {
        try {
            Statement statement = conn.createStatement();
            statement.execute(query);
            statement.close();
            System.out.println("Query executed successfully");
        } catch (SQLException e) {
            System.out.println("query failed");
            System.out.format("%s", e.getMessage());
        }
    }

    public void closeDB () {
         try {
             if (conn != null) {
                 conn.close();
                 System.out.println("Connection closed successfully");
             }
         } catch (SQLException e) {
             System.out.println("Connection failed to be closed");
             System.out.println(e.getMessage());
         }
     }

}
