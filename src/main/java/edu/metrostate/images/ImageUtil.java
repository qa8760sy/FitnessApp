package edu.metrostate.images;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;

import java.net.URL;

public class ImageUtil {
    public static Image minimalImage(){
        URL url = ImageUtil.class.getResource("blue_swirl_background.png");
        return new Image(url.toString());
    }

    public static Image settingsImage(){
        URL url = ImageUtil.class.getResource("settings_cog.png");
        return new Image(url.toString());
    }

    public static Image humanImage(){
        URL url = ImageUtil.class.getResource("human-body.jpg");
        return new Image(url.toString());
    }

    public Background mainBackground(){
        URL url = ImageUtil.class.getResource("blue_swirl_background.png");
        Image imageToUse = new Image(url.toString());
        BackgroundImage backgroundImageToUse = new BackgroundImage(imageToUse,null,null,null,null);
        Background back = new Background(backgroundImageToUse);
        return back;
    }

    public Background buttonBackground(){
        URL url = ImageUtil.class.getResource("buttonBackground.jpg");
        Image imageToUse = new Image(url.toString());
        BackgroundImage backgroundImageToUse = new BackgroundImage(imageToUse,null,null,null,null);
        Background back = new Background(backgroundImageToUse);
        return back;
    }

    public Background buttonBackgroundHover(){
        URL url = ImageUtil.class.getResource("buttonBackground-hover.jpg");
        Image imageToUse = new Image(url.toString());
        BackgroundImage backgroundImageToUse = new BackgroundImage(imageToUse,null,null,null,null);
        Background back = new Background(backgroundImageToUse);
        return back;
    }

    public Background humanBackground(){
        URL url = ImageUtil.class.getResource("human-body.jpg");
        Image imageToUse = new Image(url.toString());
        BackgroundImage backgroundImageToUse = new BackgroundImage(imageToUse,null,null,null,null);
        Background back = new Background(backgroundImageToUse);
        return back;
    }

    public ImageView humanView(){
        ImageView toView = new ImageView();
        toView.setImage(humanImage());
        toView.setPreserveRatio(true);
        return toView;
    }
}
