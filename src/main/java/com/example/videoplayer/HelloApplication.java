package com.example.videoplayer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

/**
 * This class described the Java FX Application, hence the inheritance
 */
public class HelloApplication extends Application {
    /**
     * This method defines the properties of the default stage and its content
     * @param stage Reference to the default stage. Automatically provided by Java FX
     * @throws IOException if an error occurred while loading the fxml file
     */
    @Override
    public void start(Stage stage) throws IOException {
        // Load scene
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 500);

        // Set properties
        stage.setTitle("Hello!");
        stage.setScene(scene);
        // Show the stage
        stage.show();
    }

    /**
     * Starts the application
     * @param args arguments at call
     */
    public static void main(String[] args) {
        launch(args);
    }
}