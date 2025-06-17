package com.dnhh.quizapp;

import com.dnhh.utils.MyAlert;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import javafx.stage.Stage;

public class PrimaryController {

    public void handleQuestionManagement(ActionEvent event) throws IOException {
        Scene scene = new Scene(new FXMLLoader(App.class.getResource("questions.fxml")).load());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Quiz App");
        stage.show();
        
//        Alert alert = new Alert(Alert.AlertType.INFORMATION);
//        alert.setHeaderText("Quiz App");
//        alert.setContentText("Question:  soon ...");
//        alert.showAndWait();
    }

    public void handlePractice(ActionEvent event) {
        MyAlert.getInstace().showMsg("Practice: Coming soon...");
//        Alert alert = new Alert(Alert.AlertType.INFORMATION);
//        alert.setHeaderText("Quiz App");
//        alert.setContentText("Practice:  soon ...");
//        alert.showAndWait();
    }

}
