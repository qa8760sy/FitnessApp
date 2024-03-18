package oop.trials.fittracker;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import oop.trials.fittracker.database.*;

import javax.sql.RowSet;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        ArrayList<String> rowList = new ArrayList<>();
        Profile profile = new Profile();
        //Simple_workout wout = new Simple_workout();
        Profile wout = new Profile();
       // ResultSet setofrow = wout.stringQuery("Select * from profile");

       /* try {
            System.out.println(setofrow.getString("first_name") + setofrow.getNString("last_name") + setofrow.getNString("email"));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }*/

        rowList = wout.getAll();
        // rowList = wout.getLast30();
        for (int i = 0; i < rowList.size(); i++) {
            System.out.println(rowList.get(i));
        }
        launch();
    }
}