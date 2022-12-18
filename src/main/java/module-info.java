module com.example.forexamtree {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.forexamtree to javafx.fxml;
    exports com.example.forexamtree;
}