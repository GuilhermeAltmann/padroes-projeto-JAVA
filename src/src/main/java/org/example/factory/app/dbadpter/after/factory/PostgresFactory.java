package org.example.factory.app.dbadpter.after.factory;

import org.example.factory.app.dbadpter.after.db.DB;
import org.example.factory.app.dbadpter.after.db.PostgresDB;

public class PostgresFactory implements DBFactory{
    @Override
    public DB getDatabase() {
        return new PostgresDB();
    }
}
