module com.example.java_lbs {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.java_lbs to javafx.fxml;
    exports com.example.java_lbs;
}