package edu.metrostate.scenes.settings;

import edu.metrostate.LanguageSystems.LanguageProcessing;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class SettingsWindowController {
    private final SettingsBar settingsbar;
    public SettingsWindowController(Stage ownerStage, Scene main, Scene settings, LanguageSettings lSet, SettingsBar settingsBar, Scene langChoice, Button settingsBack, Button backLangSettings, LanguageProcessing lang){
        this.settingsbar = settingsBar;
        this.settingsbar.languageSettings.setOnAction(action ->{
            ownerStage.setScene(langChoice);
        });
        backLangSettings.setOnAction(action ->{
            ownerStage.setScene(settings);
        });
        settingsBack.setOnAction(action ->{
            ownerStage.setScene(main);
        });
        lSet.Spanish.setOnAction(action ->{
            lang.LanguageSetting = 1;
        });
        lSet.English.setOnAction(action ->{
            lang.LanguageSetting = 0;
        });
    }
}
