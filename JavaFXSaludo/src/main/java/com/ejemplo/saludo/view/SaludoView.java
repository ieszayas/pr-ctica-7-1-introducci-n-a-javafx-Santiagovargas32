package com.ejemplo.saludo.view;


import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class SaludoView {
    private VBox root;
    private Button btnSalir;
    private Label lblSaludo;

    public SaludoView() {
        root = new VBox(20);
        root.setAlignment(Pos.CENTER);

        lblSaludo = new Label("¿Hola, qué tal?");
        lblSaludo.setStyle("-fx-font-size: 24px;");

        btnSalir = new Button("Salir");
        btnSalir.setOnAction(event -> System.exit(0));

        root.getChildren().addAll(lblSaludo, btnSalir);
    }

    public VBox getRoot() {
        return root;
    }
}

