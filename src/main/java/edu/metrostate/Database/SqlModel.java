package edu.metrostate.Database;

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


    public ResultSet stringQuery(String sql){


        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs   = stmt.executeQuery(sql)){
            return rs;




        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;

    }


   /* public ArrayList<String> stringQuery(String sql){

        ArrayList<String> rowList = new ArrayList<>();


        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs   = stmt.executeQuery(sql)){

            ResultSetMetaData rsmd = rs.getMetaData();
            int numCol = rsmd.getColumnCount();
            int counter = 0;


            do {
                StringBuilder builder = new StringBuilder();
                System.out.println(numCol);
                for(int i = 1; i <= numCol; i++) {
                    builder.append(rs.getNString(i) + ":");
                    System.out.println("yeet");
                }



                rowList.add(builder.toString());
                System.out.println(builder.toString());

            } while(rs.next());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return rowList;
    }*/




}
