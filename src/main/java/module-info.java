module oop.trials.fittracker {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens oop.trials.fittracker to javafx.fxml;
    exports oop.trials.fittracker;
}