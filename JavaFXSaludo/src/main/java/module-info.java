module com.example.javafxsaludo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxsaludo to javafx.fxml;
    exports com.example.javafxsaludo;
    exports com.example.javafxsaludo.Controller;
    exports com.example.javafxsaludo.Modelo;
    opens com.example.javafxsaludo.Controller to javafx.fxml;
}