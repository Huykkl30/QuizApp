module com.dnhh.quizapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.sql;

    opens com.dnhh.quizapp to javafx.fxml;
    exports com.dnhh.quizapp;
}
