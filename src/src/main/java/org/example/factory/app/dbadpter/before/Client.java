package org.example.factory.app.dbadpter.before;

import org.example.factory.app.dbadpter.before.db.OracleDB;

public class Client {
    public static void main(String[] args) {
        OracleDB db = new OracleDB();
        db.query("SELECT * FROM users");
        db.update("INSERT INTO users VALUES ('User', 25)");
    }
}
