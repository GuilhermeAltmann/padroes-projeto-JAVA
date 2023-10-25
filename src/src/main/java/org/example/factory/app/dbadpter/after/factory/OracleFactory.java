package org.example.factory.app.dbadpter.after.factory;

import org.example.factory.app.dbadpter.after.db.DB;
import org.example.factory.app.dbadpter.after.db.OracleDB;

public class OracleFactory implements DBFactory{
    @Override
    public DB getDatabase() {
        return new OracleDB();
    }
}
