module Fitness_Tracker_ICS_372 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens edu.metrostate to javafx.fxml;
    exports edu.metrostate;
    exports edu.metrostate.scenes.profile;
    opens edu.metrostate.scenes.profile to javafx.fxml;
    exports edu.metrostate.scenes.settings;
    opens edu.metrostate.scenes.settings to javafx.fxml;
    exports edu.metrostate.LanguageSystems;
    opens edu.metrostate.LanguageSystems to javafx.fxml;
    exports edu.metrostate.scenes.programsettings;
    opens edu.metrostate.scenes.programsettings to javafx.fxml;
}