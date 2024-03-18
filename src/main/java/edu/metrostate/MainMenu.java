package edu.metrostate;

import edu.metrostate.LanguageSystems.LanguageProcessing;
import edu.metrostate.images.ImageUtil;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ToolBar;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.text.Font;
import javafx.scene.transform.Transform;

public class MainMenu extends ToolBar {
    Button spacingButton;
    Button exitButton;
    Button profileButton;
    Button addWorkoutButton;
    Button addGoalButton;
    Button viewGraphsButton;
    Button settingsButton;
    public MainMenu(LanguageProcessing lang){
        Background buttonback = new ImageUtil().buttonBackground();
        spacingButton = new Button();
        spacingButton.setOpacity(0);
        spacingButton.setMinHeight(50);
        exitButton = new Button(lang.getLang("mainmenu.buttons.exit"));
        exitButton.getTransforms().add(Transform.shear(0,-.3));
        exitButton.setMinWidth(250);
        exitButton.setMinHeight(50);
        exitButton.setBackground(buttonback);
        exitButton.setStyle("-fx-font-size: 24");
        profileButton = new Button(lang.getLang("mainmenu.buttons.profile"));
        profileButton.getTransforms().add(Transform.shear(0,-.3));
        profileButton.setMinWidth(250);
        profileButton.setMinHeight(50);
        profileButton.setBackground(buttonback);
        profileButton.setStyle("-fx-font-size: 24");
        addWorkoutButton = new Button(lang.getLang("mainmenu.buttons.workout"));
        addWorkoutButton.getTransforms().add(Transform.shear(0,-.3));
        addWorkoutButton.setMinWidth(250);
        addWorkoutButton.setMinHeight(50);
        addWorkoutButton.setBackground(buttonback);
        addWorkoutButton.setFont(Font.font("Impact"));
        addWorkoutButton.setStyle("-fx-font-size: 24");
        addGoalButton = new Button(lang.getLang("mainmenu.buttons.goal"));
        addGoalButton.getTransforms().add(Transform.shear(0,-.3));
        addGoalButton.setMinWidth(250);
        addGoalButton.setMinHeight(50);
        addGoalButton.setBackground(buttonback);
        addGoalButton.setFont(Font.font("Impact"));
        addGoalButton.setStyle("-fx-font-size: 24");
        viewGraphsButton = new Button(lang.getLang("mainmenu.buttons.viewgraph"));
        viewGraphsButton.getTransforms().add(Transform.shear(0,-.3));
        viewGraphsButton.setMinWidth(250);
        viewGraphsButton.setMinHeight(50);
        viewGraphsButton.setBackground(buttonback);
        viewGraphsButton.setStyle("-fx-font-size: 24");
        settingsButton = new Button();
        settingsButton.getTransforms().add(Transform.shear(0,-.3));
        settingsButton.setGraphic(new ImageView(ImageUtil.settingsImage()));
        settingsButton.setAlignment(Pos.CENTER);
        settingsButton.setMinWidth(250);
        settingsButton.setBackground(buttonback);
        this.setOrientation(Orientation.VERTICAL);
        this.setBackground(Background.EMPTY);
        this.setMinWidth(200);
        getItems()
                .addAll(spacingButton,profileButton,addWorkoutButton,addGoalButton,viewGraphsButton,exitButton,settingsButton);

    }
}
