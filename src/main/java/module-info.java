module com.example.reader {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.reader to javafx.fxml;
    exports com.example.reader;
}