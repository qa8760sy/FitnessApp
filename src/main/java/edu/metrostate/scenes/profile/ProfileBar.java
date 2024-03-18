package edu.metrostate.scenes.profile;

import edu.metrostate.LanguageSystems.LanguageProcessing;
import edu.metrostate.UserDataProcessing;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ToolBar;
import javafx.scene.text.Font;

public class ProfileBar extends ToolBar {
    Label Age;
    Label Weight;
    Label Email;
    Label Name;
    public ProfileBar(LanguageProcessing lang,UserDataProcessing UDP){
        Age = new Label(lang.getLang("profilemenu.label.age",UDP.getUser().getAge().toString()));
        Age.setFont(Font.font("Impact",36));
        Weight = new Label(lang.getLang("profilemenu.label.weight",UDP.getUser().getWeight().toString()));
        Weight.setFont(Font.font("Impact",36));
        Email = new Label(lang.getLang("profilemenu.label.email",UDP.getUser().getEmail().toString()));
        Email.setFont(Font.font("Impact", 25));
        Name = new Label(lang.getLang("profilemenu.label.name",UDP.getUser().getName().toString()));
        Name.setFont(Font.font("Impact",36));
        Label sep = new Label("=====+=====+=====");
        sep.setFont(Font.font("Impact",15));
        sep.setAlignment(Pos.CENTER);
        this.setOrientation(Orientation.VERTICAL);
        this.setMinWidth(300);
        getItems()
                .addAll(Name,Email,sep,Age,Weight);
    }
}
