package com.danunora;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class sqlite3DB {

    public sqlite3DB() {
    }

    public void openDB () {
        Connection conn = null;
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

/*
    public boolean queryDB () {
        try {
            Statement statement = conn.createStatement();
        } catch (SQLException e) {
            System.out.format("%s", e.getMessage());
        }

    }

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
