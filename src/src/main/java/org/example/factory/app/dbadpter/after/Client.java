package org.example.factory.app.dbadpter.after;

import org.example.factory.app.dbadpter.after.db.DB;
import org.example.factory.app.dbadpter.after.factory.OracleFactory;

public class Client {
    public static void main(String[] args) {
        DB db = new OracleFactory().getDatabase();
        db.query("SELECT * FROM users");
        db.update("INSERT INTO users VALUES ('User', 25)");
    }
}
