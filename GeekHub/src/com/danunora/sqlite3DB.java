package com.danunora;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class sqlite3DB {

    Connection conn = null;

    public sqlite3DB() {
    }

    public void openDB () {
        try {
            String url = "jdbc:sqlite:/home/danunora/Develop/Java/GeekHub/geekhub.db";
            conn = DriverManager.getConnection(url);
            System.out.println("Connection successful");
        } catch (SQLException e) {
            System.out.println("Connection failed");
            System.out.format("%s", e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());;
            }
        }
    }

    public void queryDB (String query) {
        try {
            Statement statement = conn.createStatement();
            statement.execute(query);
        } catch (SQLException e) {
            System.out.println("query failed");
            System.out.format("%s", e.getMessage());
        }

    }

/*
    public boolean closeDB () {
        try {
            Connection conn = DriverManager.();
            return true;
        } catch (SQLException e) {
            System.out.format("%s",e.getMessage());
            return false;
        }
    }

*/
}
