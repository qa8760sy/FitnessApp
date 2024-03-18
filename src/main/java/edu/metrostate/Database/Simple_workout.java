package edu.metrostate.Database;

import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Simple_workout extends SqlModel {
    public void insert (String workout_name , float length, float calories_burnt){



        String sql = "INSERT INTO simple_workout(dateTime,workout_name,length_min,\n" +
                "calories_burnt) VALUES(?,?,?,?)";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, LocalDateTime.now().format(DateTimeFormatter.ofPattern("YYYY-MM-DD HH:MM:SS")).toString());
            pstmt.setString(2, workout_name);
            pstmt.setFloat(3, length);
            pstmt.setFloat(4, calories_burnt);

            pstmt.executeUpdate();
            System.out.println(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<String> getLast30(){
        ArrayList<String> rowList = new ArrayList<>();
        String sql = "Select * from simple_workout  WHERE date_of > DATETIME('now', '-30 days')";

        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs   = stmt.executeQuery(sql)){


            //ResultSetMetaData rsmd = rs.getMetaData();
            //int numCol = rsmd.getColumnCount();
            //int counter = 0;



            while (rs.next()) {
                rowList.add(rs.getDate("date_of") +  ":" +
                        rs.getString("workout_name") + ":" +
                        rs.getInt("length_min") + ":" +
                        rs.getInt("calories_burnt"));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return rowList;

    }

    public ArrayList<String> getLastyear(){
        ArrayList<String> rowList = new ArrayList<>();
        String sql = "Select * from simple_workout  WHERE date_of > DATETIME('now', '-1 year')";

        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs   = stmt.executeQuery(sql)){


            ResultSetMetaData rsmd = rs.getMetaData();
            int numCol = rsmd.getColumnCount();
            int counter = 0;



            while (rs.next()) {
                rowList.add(rs.getDate("date_of") +  ":" +
                        rs.getString("workout_name") + ":" +
                        rs.getInt("length_min") + ":" +
                        rs.getInt("calories_burnt"));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return rowList;

    }


}
