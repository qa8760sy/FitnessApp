package com.mypack.database;

import java.sql.*;

public abstract class SqlModel {
    Connection connect() {
        Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:sqlite:test.db";
            // create a connection to the database
            conn = DriverManager.getConnection(url);

            System.out.println("Connection to SQLite has been established.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public ResultSet query (String sql){

        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs   = stmt.executeQuery(sql)){
            return rs;


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

}
