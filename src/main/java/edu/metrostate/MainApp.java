package edu.metrostate;

import edu.metrostate.LanguageSystems.LanguageProcessing;
import edu.metrostate.images.ImageUtil;
import edu.metrostate.scenes.profile.ProfileBar;
import edu.metrostate.scenes.profile.ProfileBarController;
import edu.metrostate.scenes.programsettings.ProgramSettingsController;
import edu.metrostate.scenes.settings.LanguageSettings;
import edu.metrostate.scenes.settings.SettingsBar;
import edu.metrostate.scenes.settings.SettingsWindowController;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.transform.Transform;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ArrayList;

public class MainApp extends Application {

    private String ProgramVerion = "0.0.1";
    static LanguageProcessing langProc = new LanguageProcessing();

    @Override
    public void start(Stage stage) throws Exception {
        UserDataProcessing UDP = new UserDataProcessing();
        UDP.initData();
        langProc.initLang(UDP);
        for(String key: UDP.AllUserInfo.keySet()){
            System.out.println(key);
            System.out.println(UDP.AllUserInfo.get(key));
        }
        ImageUtil iUtil = new ImageUtil();
        Background mainBackground = iUtil.mainBackground();
        BorderPane root = new BorderPane();
        GridPane roots = new GridPane();
        GridPane graphView = new GridPane();
        BorderPane rootp = new BorderPane();
        BorderPane settL = new BorderPane();
        GridPane mainpageGrid = new GridPane();
        GridPane profileGrid = new GridPane();
        Scene profile = new Scene(profileGrid);
        Scene scene = new Scene(root);
        Scene settings = new Scene(roots);
        Scene graphs = new Scene(graphView);
        Scene languagesettings = new Scene(settL);
        Scene MainScene = new Scene(mainpageGrid);
        Scene FitnessTrackerProgramOptions = new Scene(rootp);
        StackPane views = new StackPane();
        //scene.setCursor(Cursor.CROSSHAIR);


        stage.setScene(MainScene);
        //stage.setScene(scene);
        stage.setTitle("Fitness Tracker");
        stage.show();
        stage.setMaxHeight(1200);
        stage.setMaxWidth(900);
        stage.setHeight(700);
        stage.setWidth(600);
        stage.setMinHeight(700);
        stage.setMinWidth(600);
        stage.centerOnScreen();
        stage.setResizable(true);

        ImageView imageView = new ImageView(ImageUtil.minimalImage());
        imageView.setFitWidth(stage.getWidth());
        imageView.setFitHeight(stage.getHeight());

        LanguageSettings langBar = new LanguageSettings();
        MainMenu mainBar = new MainMenu(langProc);
        MainMenu graphViewBar = new MainMenu(langProc);
        SettingsBar settingsbar = new SettingsBar(langProc);
        ProfileBar profilebar = new ProfileBar(langProc,UDP);

        //mainpageGrid.prefWidthProperty().bind(MainScene.widthProperty());
        //mainpageGrid.prefHeightProperty().bind(MainScene.heightProperty());


        settL.setCenter(langBar);

        //Start Main Page Layout
        ColumnConstraints column1 = new ColumnConstraints();
        column1.setPercentWidth(50);
        column1.setHalignment(HPos.LEFT);
        ColumnConstraints column2 = new ColumnConstraints();
        column2.setPercentWidth(50);
        column2.setHalignment(HPos.CENTER);
        RowConstraints row1 = new RowConstraints();
        row1.setPercentHeight(10);
        RowConstraints row2 = new RowConstraints();
        row2.setPercentHeight(5);
        RowConstraints row3 = new RowConstraints();
        row3.setPercentHeight(58);
        RowConstraints row4 = new RowConstraints();
        row4.setPercentHeight(27);
        mainpageGrid.getColumnConstraints().addAll(column1, column2);
        mainpageGrid.getRowConstraints().addAll(row1,row2,row3,row4);
        Button title = new Button(langProc.getLang("application.title"));
        title.setAlignment(Pos.TOP_CENTER);
        title.setStyle("-fx-font-size: 35");
        title.setMinWidth(300);
        title.setMinHeight(40);
        title.setBackground(iUtil.buttonBackground());
        title.getTransforms().add(Transform.shear(0,.1));
        title.setOnAction(action ->{
            stage.setScene(FitnessTrackerProgramOptions);
        });
        Label userAccountTitle = new Label("User: " + UDP.getUser().getName());
        userAccountTitle.setAlignment(Pos.TOP_CENTER);
        userAccountTitle.setStyle("-fx-text-fill: red; -fx-font-size: 25");
        userAccountTitle.setTranslateY(50);
        mainpageGrid.add(title,0,0);
        mainpageGrid.add(userAccountTitle,1,0);
        mainpageGrid.add(iUtil.humanView(),0,2);
        mainpageGrid.add(mainBar,1,2);
        //End Main Page Layout

        //Start Profile Page Layout
        ColumnConstraints profileColumn1 = new ColumnConstraints();
        profileColumn1.setPercentWidth(5);
        ColumnConstraints profileColumn2 = new ColumnConstraints();
        profileColumn2.setPercentWidth(90);
        profileColumn2.setHalignment(HPos.CENTER);
        ColumnConstraints profileColumn3 = new ColumnConstraints();
        profileColumn3.setPercentWidth(5);
        RowConstraints profileRow1 = new RowConstraints();
        profileRow1.setPercentHeight(5);
        RowConstraints profileRow2 = new RowConstraints();
        profileRow2.setPercentHeight(30);
        RowConstraints profileRow3 = new RowConstraints();
        profileRow3.setPercentHeight(65);
        profileRow3.setValignment(VPos.BOTTOM);
        profileGrid.getColumnConstraints().addAll(profileColumn1,profileColumn2,profileColumn3);
        profileGrid.getRowConstraints().addAll(profileRow1,profileRow2,profileRow3);
        profileGrid.add(profilebar,1,1);
        Circle ava = new Circle(30);
        ava.setStyle("-fx-background-color: white");
        profileGrid.add(ava,0,0);
        //End Profile Page Layout
        
        //Start Settings Page Layout
        ColumnConstraints settingsColumn1 = new ColumnConstraints();
        settingsColumn1.setPercentWidth(33);
        ColumnConstraints settingsColumn2 = new ColumnConstraints();
        settingsColumn2.setPercentWidth(34);
        settingsColumn2.setHalignment(HPos.CENTER);
        ColumnConstraints settingsColumn3 = new ColumnConstraints();
        settingsColumn3.setPercentWidth(33);
        RowConstraints settingsRow1 = new RowConstraints();
        settingsRow1.setPercentHeight(5);
        RowConstraints settingsRow2 = new RowConstraints();
        settingsRow2.setPercentHeight(90);
        RowConstraints settingsRow3 = new RowConstraints();
        settingsRow3.setPercentHeight(5);
        settingsRow3.setValignment(VPos.BOTTOM);
        roots.getColumnConstraints().addAll(settingsColumn1,settingsColumn2,settingsColumn3);
        roots.getRowConstraints().addAll(settingsRow1,settingsRow2,settingsRow3);
        roots.add(settingsbar,1,1);
        HBox settingsTitle = new HBox(new Label(langProc.getLang("settings.title")));
        settingsTitle.setStyle("-fx-font-size: 24");
        settingsTitle.setAlignment(Pos.CENTER);
        roots.add(settingsTitle,1,0);
        //End Settings Page Layout

        //Start Graph View Layout
        ColumnConstraints graphColumn1 = new ColumnConstraints();
        graphColumn1.setMinWidth(stage.getWidth()-250);
        ColumnConstraints graphColumn2 = new ColumnConstraints();
        graphColumn2.setMinWidth(250);
        graphColumn2.setMaxWidth(250);
        RowConstraints graphRow1 = new RowConstraints();
        graphRow1.setPercentHeight(10);
        RowConstraints graphRow2 = new RowConstraints();
        graphRow2.setPercentHeight(85);
        RowConstraints graphRow3 = new RowConstraints();
        graphRow3.setPercentHeight(5);
        graphView.getColumnConstraints().addAll(graphColumn1,graphColumn2);
        graphView.getRowConstraints().addAll(graphRow1,graphRow2,graphRow3);
        graphView.add(graphViewBar,1,1);
        //End Graph View Layout

        HBox mainPage = new HBox(/*humanImage,mainBar*/);

        root.setRight(mainPage);

        //Set Backgrounds
        root.setBackground(mainBackground);
        graphView.setBackground(mainBackground);
        roots.setBackground(mainBackground);
        rootp.setBackground(mainBackground);
        settL.setBackground(mainBackground);
        mainpageGrid.setBackground(mainBackground);
        profileGrid.setBackground(mainBackground);

        profilebar.setBackground(iUtil.buttonBackground());
        //Make Back Buttons
        Button backLangSettings = new Button("<-");
        Button backSettings = new Button("<-");
        Button backGraphs = new Button("<-");
        Button backProgramSettings = new Button("<-");
        Button backProfile = new Button("<-");
        //Place Back Buttons
        settL.setBottom(backLangSettings);
        roots.add(backSettings,0,2);
        graphView.add(backGraphs,0,2);
        rootp.setBottom(backProgramSettings);
        profileGrid.add(backProfile,0,2);

        Button upCheck = new Button(langProc.getLang("application.update.button"));
        Label about = new Label("Program version: " + ProgramVerion + "\n" +
                "Authors:" + "\n" +
                "Corey" + "\n" +
                "Matthew" + "\n" +
                "Mahi" + "\n" +
                "Meng" + "\n" +
                "Micah" + "\n" +
                "Boss");
        about.setFont(Font.font("Impact",35));
        about.setStyle("-fx-text-fill: white");
        rootp.setTop(upCheck);
        rootp.setCenter(about);

        loadStylesheetIntoScene(scene);


        langProc.PrintLang("toast.time.update.app","50");

        MainToolBarController SideBar = new MainToolBarController(mainBar,stage,settings,profile,graphs,MainScene,backGraphs);
        SettingsWindowController SettingControl = new SettingsWindowController(stage, MainScene,settings,langBar,settingsbar,languagesettings,backSettings,backLangSettings,langProc);
        ProgramSettingsController ProgramControl = new ProgramSettingsController(stage, MainScene,FitnessTrackerProgramOptions,backProgramSettings);
        ProfileBarController ProfileControl = new ProfileBarController(stage,MainScene,profile,profilebar,backProfile);
        Toast.makeText(stage,langProc.getLang("toast.time.update.water","500"),1500,1000,1000, Color.ANTIQUEWHITE);
    }

    private void loadStylesheetIntoScene(Scene scene) {
        URL stylesheetURL = getClass().getResource("style.css");
        if (stylesheetURL == null) {
            return;
        }
        String urlString = stylesheetURL.toExternalForm();
        if (urlString == null) {
            return;
        }
        scene.getStylesheets().add(urlString);
    }


}