package com;

import com.ejemplo.saludo.view.SaludoView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        SaludoView vista = new SaludoView();
        Scene scene = new Scene(vista.getRoot(), 600, 300);

        primaryStage.setTitle("Saludo JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

