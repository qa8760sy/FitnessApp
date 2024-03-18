package edu.metrostate.scenes.profile;

import edu.metrostate.scenes.profile.ProfileBar;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ProfileBarController {
    private final ProfileBar profilebar;
    public ProfileBarController(Stage ownerStage, Scene mainPage, Scene ProfilePage, ProfileBar ProfileBar, Button profileBack){
        this.profilebar = ProfileBar;
        profileBack.setOnAction(action ->{
            ownerStage.setScene(mainPage);
        });
    }
}
