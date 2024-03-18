package oop.trials.fittracker.database;

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
        String sql = "Select * from simple_workout  WHERE date_of > DATETIME('now', '-30 year')";

        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs   = stmt.executeQuery(sql)){


            ResultSetMetaData rsmd = rs.getMetaData();
            int numCol = rsmd.getColumnCount();
            int counter = 0;



            while (rs.next()) {
                System.out.println(rs.getDate("date_of") +  "\t" +
                        rs.getString("workout_name") + "\t" +
                        rs.getInt("length_min") + "\t" +
                        rs.getInt("calories_burnt"));
            }

            /*while(rs.next()){
                StringBuilder builder = new StringBuilder();

                System.out.println(rs.next());

                for(int i = 1; i <= numCol; i++) {
                    builder.append(rs.getNString(i) + ":");
                    System.out.println(rs.getNString(i) + ":");
                }
                rowList.add(builder.toString());

            }*/
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return rowList;

    }


}
