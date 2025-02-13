package com.example.javafxsaludo.Controller;

import com.example.javafxsaludo.Modelo.SaludoModel;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

public class HelloController implements Initializable {

    private SaludoModel saludoModel = new SaludoModel(); // Modelo

    @FXML
    private Label welcomeText;

    @FXML
    private Button exitButton;

    @FXML
    private void handleExitButton() {
        Stage stage = (Stage) exitButton.getScene().getWindow();
        stage.close();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        welcomeText.setText(saludoModel.getSaludo()); // Establece el saludo al iniciar
    }
}
