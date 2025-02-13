module com.example.operaciones {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.operaciones to javafx.fxml;
    exports com.example.operaciones;
    exports com.example.operaciones.controler;
    opens com.example.operaciones.controler to javafx.fxml;
}