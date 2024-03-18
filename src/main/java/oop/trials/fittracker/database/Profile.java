package oop.trials.fittracker.database;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;

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

    public ArrayList<String> getAll(){
        ArrayList<String> rowList = new ArrayList<>();
        String sql = "Select * from profile";

        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs   = stmt.executeQuery(sql)){


            while (rs.next()) {
                rowList.add(rs.getInt(1) +  ":" +
                        rs.getString(2) + ":" +
                        rs.getString(3) + ":" +
                        rs.getString(4) + ":" +
                        rs.getString(5) + ":" +
                        rs.getFloat(6) + ":" +
                        rs.getFloat (7) + ":" +
                        rs.getString(8) + ":" +
                        rs.getInt(9));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return rowList;

    }

}
