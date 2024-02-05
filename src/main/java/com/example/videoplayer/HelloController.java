package com.example.videoplayer;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

import java.io.File;
import java.net.URI;

/**
 * This class describes how the program interacts with the view
 */
public class HelloController {
    /** Reference to the root panel. Automatically initialized by Java FX*/
    @FXML
    Pane root;
    /** Reference to the play / pause button. Automatically initialized by Java FX */
    @FXML
    Button playPause;

    /** Reference to the {@link MediaPlayer} */
    MediaPlayer player;

    /**
     * This method is called whenever the {@link javafx.scene.Scene} is loaded.
     */
    @FXML
    protected void initialize() {
        // Load video and get URI
        File pathToMedia = new File("C:\\Users\\mloth\\Desktop\\Test.mp4");
        URI locator = pathToMedia.toURI();

        // Create Media resource and MediaPlayer
        Media media = new Media(locator.toString());
        player = new MediaPlayer(media);

        // Create MediaPlayer
        MediaView view = new MediaView(player);
        view.setX(100);
        view.setY(50);
        view.setFitWidth(350);
        view.setFitHeight(400);
        root.getChildren().add(view);
    }

    /**
     * This method is called whenever the pause / play button is clicked
     */
    public void togglePlayPause() {
        switch (playPause.getText()) {
            // Toggle Play --> Pause
            case "Play" -> {
                player.play();
                playPause.setText("Pause");
            }
            // Toggle Pause --> Play
            case "Pause" -> {
                player.pause();
                playPause.setText("Play");
            }
        }
    }
}