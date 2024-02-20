module oop.trials.fittracker {
    requires javafx.controls;
    requires javafx.fxml;


    opens oop.trials.fittracker to javafx.fxml;
    exports oop.trials.fittracker;
}