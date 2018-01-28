package com.danunora;

public class Consts {

    public static final String DB_URL = "jdbc:sqlite:/home/danunora/Develop/Java/GeekHub/geekhub.db";

    public static final String CRE_TBL_Contacts = "CREATE TABLE contacts IF NOT EXISTS (name TEXT, phone TEXT, email TEXT)";

    public static final String SEL_TBL_Contacts = "SELECT * FROM contacts";

    private Consts(){
    }

}
