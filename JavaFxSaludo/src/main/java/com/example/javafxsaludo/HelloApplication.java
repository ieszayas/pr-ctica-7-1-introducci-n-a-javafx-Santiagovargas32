package com.example.javafxsaludo;

import com.example.javafxsaludo.view.MainView;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        MainView.start(stage);
    }

    public static void main(String[] args) {
        launch();
    }
}