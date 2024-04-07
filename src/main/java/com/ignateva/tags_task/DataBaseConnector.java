package com.ignateva.tags_task;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBaseConnector {
    private String ip ="127.0.0.1";
    private String uid ="sa";
    private String pass ="Zz123456";
    private String base ="postgres";
    private String conn="jdbc:postgresql://localhost:5432/postgres";

    private Connection connection;

    public Connection getConnection() {
        return connection;
    }

    public DataBaseConnector()
    {
        try
        {
            connection = DriverManager.
                    getConnection(conn, uid, pass);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
