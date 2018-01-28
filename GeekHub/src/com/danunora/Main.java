package com.danunora;

public class Main {

    public static void main(String[] args) {

        String inserta = "INSERT INTO contacts (name, phone, email) VALUES('Daniel','3313289342','daniel.nuno@gmail.com')";
        sqlite3DB sqlite3db = new sqlite3DB();
        sqlite3db.openDB();
//        sqlite3db.queryDB(query);
        sqlite3db.insertDB(inserta);
        sqlite3db.queryDB(Consts.SEL_TBL_Contacts);
        sqlite3db.closeDB();
    }
}

