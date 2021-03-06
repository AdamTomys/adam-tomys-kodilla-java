package com.kodilla.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public enum DbManager {

    INSTANCE;

    private Connection conn = null;

    public void createDataBase() throws SQLException {
        if (conn == null) {
            Properties connectionProps = new Properties();
            connectionProps.put("user", "kodilla_user");
            connectionProps.put("password", "kodilla_password");
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/kodilla_course?serverTimezone=Europe/Warsaw" +
                            "&useSSL=False",
                    connectionProps);
        }
    }

    public Connection getConnection() {
        return conn;
    }

}
