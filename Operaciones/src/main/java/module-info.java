module com.example.operaciones {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.operaciones to javafx.fxml;
    exports com.example.operaciones;
}