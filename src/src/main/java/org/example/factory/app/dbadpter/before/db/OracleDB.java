package org.example.factory.app.dbadpter.before.db;

public class OracleDB {
    public void query(String sql){
        System.out.println("Querying" + sql + " in Oracle database");
    }

    public void update(String sql){
        System.out.println("Update" + sql + " in Oracle database");
    }
}
