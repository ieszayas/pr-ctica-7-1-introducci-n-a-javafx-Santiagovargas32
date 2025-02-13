package com.example.operaciones.controler;

import com.example.operaciones.model.Calculadora;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField txtNumero1;

    @FXML
    private TextField txtNumero2;

    @FXML
    private TextField txtResultado;

    @FXML
    private Button btnSumar;

    @FXML
    private Button btnResetear;

    @FXML
    private void sumarNumeros() {
        try {
            double num1 = Double.parseDouble(txtNumero1.getText());
            double num2 = Double.parseDouble(txtNumero2.getText());
            double resultado = Calculadora.sumar(num1, num2);
            txtResultado.setText(String.valueOf(resultado));
        } catch (NumberFormatException e) {
            mostrarAlerta("Error", "Por favor ingrese números válidos.");
        }
    }

    @FXML
    private void resetearCampos() {
        txtNumero1.clear();
        txtNumero2.clear();
        txtResultado.clear();
    }

    private void mostrarAlerta(String titulo, String mensaje) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
}
