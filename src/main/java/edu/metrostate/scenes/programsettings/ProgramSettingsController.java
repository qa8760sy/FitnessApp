package edu.metrostate.scenes.programsettings;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ProgramSettingsController {
    public ProgramSettingsController(Stage ownerStage, Scene main, Scene programSettings, Button backButtonProgramSettings){
        backButtonProgramSettings.setOnAction(action ->{
            ownerStage.setScene(main);
        });
    }
}
