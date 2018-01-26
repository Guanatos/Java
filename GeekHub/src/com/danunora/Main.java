package com.danunora;

public class Main {

    public static void main(String[] args) {

        String query;

        query = "CREATE TABLE contacts (name TEXT, phone INTEGER, email TEXT)";

        sqlite3DB sqlite3db = new sqlite3DB();
        sqlite3db.openDB();
        sqlite3db.queryDB(query);
    }
}

