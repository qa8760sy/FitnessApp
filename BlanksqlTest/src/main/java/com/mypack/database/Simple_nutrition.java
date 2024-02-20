package com.mypack.database;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class Simple_nutrition extends SqlModel{

    public void insert (Date dateTime, String meal_name ,float calories, float fat,
                        float sugar, float protein ){



        String sql = "INSERT INTO simplified_nutrition(dateTime,meal_name,calories,\n" +
                "fat, sugar,protein) VALUES(?,?,?,?,?,?)";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setDate(1, dateTime);
            pstmt.setString(2, meal_name);
            pstmt.setFloat(3, calories);
            pstmt.setFloat(4, fat);
            pstmt.setFloat(5, sugar);
            pstmt.setFloat(6, protein);

            pstmt.executeUpdate();
            System.out.println(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }




}
