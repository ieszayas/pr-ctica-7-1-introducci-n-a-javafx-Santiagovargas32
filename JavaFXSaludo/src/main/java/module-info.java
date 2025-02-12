module com.example.javafxsaludo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxsaludo to javafx.fxml;
    exports com.example.javafxsaludo;
}