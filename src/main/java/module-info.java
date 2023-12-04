module com.example.connectt4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.connectt4 to javafx.fxml;
    exports com.example.connectt4;
}