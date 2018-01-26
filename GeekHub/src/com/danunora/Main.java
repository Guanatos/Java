package com.danunora;

public class Main {

    public static void main(String[] args) {

        String query, inserta;

        query = "CREATE TABLE contacts (name TEXT, phone TEXT, email TEXT)";
        inserta = "INSERT INTO contacts (name, phone, email) VALUES('Daniel','3313289342','daniel.nuno@gmail.com')";
        sqlite3DB sqlite3db = new sqlite3DB();
        sqlite3db.openDB();
        sqlite3db.queryDB(query);
        sqlite3db.queryDB(inserta);
        sqlite3db.closeDB();
    }
}

