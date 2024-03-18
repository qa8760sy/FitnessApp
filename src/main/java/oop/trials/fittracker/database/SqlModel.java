package oop.trials.fittracker.database;

import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

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

    public String getSqlDateTimeFormat() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("YYYY-MM-DD HH:MM:SS"));
    }


    public ArrayList<String> stringQuery (String sql){

        ArrayList<String> rowList = new ArrayList<>();

        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs   = stmt.executeQuery(sql)){


            ResultSetMetaData rsmd = rs.getMetaData();
            int numCol = rsmd.getColumnCount();
            int counter = 0;

            while(rs.next()){
                StringBuilder builder = new StringBuilder();

                for(int i = 1; i <= numCol; i++) {
                    builder.append(rs.getNString(i) + ":");
                }
                rowList.add(builder.toString());

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return rowList;
    }




}
