module com.example.demo12345 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demo12345 to javafx.fxml;
    exports com.example.demo12345;
}