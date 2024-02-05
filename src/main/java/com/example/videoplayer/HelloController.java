package com.example.videoplayer;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

import java.io.File;
import java.net.URI;

public class HelloController {
    @FXML
    Pane root;
    @FXML
    Button playPause;

    MediaPlayer player;

    @FXML
    protected void initialize() {
        File pathToMedia = new File("C:\\Users\\mloth\\Desktop\\Test.mp4");
        URI locator = pathToMedia.toURI();

        Media media = new Media(locator.toString());
        player = new MediaPlayer(media);

        MediaView view = new MediaView(player);
        view.setX(100);
        view.setY(50);
        view.setFitWidth(350);
        view.setFitHeight(400);
        root.getChildren().add(view);
    }

    public void togglePlayPause() {
        switch (playPause.getText()) {
            case "Play" -> {
                player.play();
                playPause.setText("Pause");
            }
            case "Pause" -> {
                player.pause();
                playPause.setText("Play");
            }
        }
    }
}