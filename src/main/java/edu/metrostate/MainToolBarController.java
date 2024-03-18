package edu.metrostate;

import edu.metrostate.images.ImageUtil;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class MainToolBarController {

    private final MainMenu sidebar;


    private EventHandler<ActionEvent> incrementHandler;

    MainToolBarController(MainMenu toolBar, Stage ownerStage, Scene settings,Scene profile,Scene graphs, Scene main,Button graphsBack) {
        final Scene scene = null;
        this.sidebar = toolBar;
        this.sidebar.settingsButton.setOnAction(action -> {
            ownerStage.setScene(settings);
            ownerStage.setWidth(ownerStage.getWidth()+0.01);
            ownerStage.setWidth(ownerStage.getWidth()-0.01);

        });
        this.sidebar.profileButton.setOnAction(action ->{
            ownerStage.setScene(profile);
        });
        this.sidebar.exitButton.setOnAction(action -> {
            Platform.exit();
        });

        this.sidebar.viewGraphsButton.setOnAction(action ->{
            ownerStage.setScene(graphs);
        });
        this.sidebar.profileButton.setOnMouseEntered(action ->{
            this.sidebar.profileButton.setBackground(new ImageUtil().buttonBackgroundHover());
        });
        this.sidebar.profileButton.setOnMouseExited(action ->{
            this.sidebar.profileButton.setBackground(new ImageUtil().buttonBackground());
        });
        this.sidebar.addWorkoutButton.setOnMouseEntered(action ->{
            this.sidebar.addWorkoutButton.setBackground(new ImageUtil().buttonBackgroundHover());
        });
        this.sidebar.addWorkoutButton.setOnMouseExited(action ->{
            this.sidebar.addWorkoutButton.setBackground(new ImageUtil().buttonBackground());
        });
        this.sidebar.addGoalButton.setOnMouseEntered(action ->{
            this.sidebar.addGoalButton.setBackground(new ImageUtil().buttonBackgroundHover());
        });
        this.sidebar.addGoalButton.setOnMouseExited(action ->{
            this.sidebar.addGoalButton.setBackground(new ImageUtil().buttonBackground());
        });
        this.sidebar.settingsButton.setOnMouseEntered(action ->{
            this.sidebar.settingsButton.setBackground(new ImageUtil().buttonBackgroundHover());
        });
        this.sidebar.settingsButton.setOnMouseExited(action ->{
            this.sidebar.settingsButton.setBackground(new ImageUtil().buttonBackground());
        });
        this.sidebar.viewGraphsButton.setOnMouseEntered(action ->{
            this.sidebar.viewGraphsButton.setBackground(new ImageUtil().buttonBackgroundHover());
        });
        this.sidebar.viewGraphsButton.setOnMouseExited(action ->{
            this.sidebar.viewGraphsButton.setBackground(new ImageUtil().buttonBackground());
        });
        this.sidebar.exitButton.setOnMouseEntered(action ->{
            this.sidebar.exitButton.setBackground(new ImageUtil().buttonBackgroundHover());
        });
        this.sidebar.exitButton.setOnMouseExited(action ->{
            this.sidebar.exitButton.setBackground(new ImageUtil().buttonBackground());
        });
        graphsBack.setOnAction(action ->{
            ownerStage.setScene(main);
        });
    }
}
