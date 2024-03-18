package edu.metrostate.scenes.settings;

import edu.metrostate.LanguageSystems.LanguageProcessing;
import javafx.geometry.Orientation;
import javafx.scene.control.Button;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.Background;

public class SettingsBar extends ToolBar {
    Button languageSettings;
    Button themeSettings;
    public SettingsBar(LanguageProcessing lang){

        languageSettings = new Button(lang.getLang("settingsbar.button.language"));
        languageSettings.setMinWidth(300);
        languageSettings.setMinHeight(120);
        languageSettings.setStyle("-fx-font-size: 36");
        themeSettings = new Button(lang.getLang("settingsbar.button.theme"));
        themeSettings.setMinWidth(300);
        themeSettings.setMinHeight(120);
        themeSettings.setStyle("-fx-font-size: 36");
        this.minWidth(300);
        this.setBackground(Background.EMPTY);
        this.setOrientation(Orientation.VERTICAL);
        getItems()
                .addAll(languageSettings,themeSettings);
    }
}
