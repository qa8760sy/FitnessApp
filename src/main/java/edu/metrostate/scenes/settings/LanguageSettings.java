package edu.metrostate.scenes.settings;

import javafx.geometry.Orientation;
import javafx.scene.control.Button;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.Background;

public class LanguageSettings extends ToolBar {
    Button Dutch;
    Button English;
    Button Korean;
    Button Chinese;
    Button Spanish;
    public LanguageSettings(){
        Dutch = new Button("Deutch");
        English = new Button("English");
        Korean = new Button("한국인");
        Chinese = new Button("中国人");
        Spanish = new Button("Español");
        this.setOrientation(Orientation.VERTICAL);
        this.setBackground(Background.EMPTY);
        getItems()
                .addAll(Dutch,English,Spanish,Korean,Chinese);
    }
}
