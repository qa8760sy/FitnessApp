package oop.trials.fittracker.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Profile extends SqlModel{

    public void insert (String first_name, String last_name, String user_name,
                        String password, float height,float weight, String email ){



        String sql = "INSERT INTO profile(first_name,last_name,user_name,\n" +
                "password,height,weight,email) VALUES(?,?,?,?,?,?,?)";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, first_name);
            pstmt.setString(2, last_name);
            pstmt.setString(3, user_name);
            pstmt.setString(4, password);
            pstmt.setFloat(5, height);
            pstmt.setFloat(6, weight);
            pstmt.setString(7, email);
            pstmt.executeUpdate();
            System.out.println(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


}
