package com.mypack.database;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Simple_workout extends SqlModel {
    public void insert (Date dateTime, String workout_name , float length, float calories_burnt){



        String sql = "INSERT INTO simplified_workout(dateTime,workout_name,length_min,\n" +
                "calories_burnt) VALUES(?,?,?,?)";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setDate(1, dateTime);
            pstmt.setString(2, workout_name);
            pstmt.setFloat(3, length);
            pstmt.setFloat(4, calories_burnt);

            pstmt.executeUpdate();
            System.out.println(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
