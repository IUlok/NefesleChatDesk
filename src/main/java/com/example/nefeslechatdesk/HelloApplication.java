package com.example.nefeslechatdesk;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Authorization auth = new Authorization();
        Scene scene = new Scene(auth, 600, 600);
        stage.setTitle("NefesleChat");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}