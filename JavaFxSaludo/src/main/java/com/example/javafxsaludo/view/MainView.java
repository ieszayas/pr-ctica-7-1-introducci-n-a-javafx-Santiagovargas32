package com.example.javafxsaludo.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class MainView {

    public static void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainView.class.getResource("/com/example/javafxsaludo/hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 400); // Cambia el tamaño de la ventana
        stage.setTitle("Saludo MVC");
        stage.setScene(scene);
        stage.setResizable(false); // Desactiva el redimensionamiento
        stage.show();
    }
}