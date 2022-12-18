package com.example.forexamtree;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Perexod {
    public void  perexod(String name) throws IOException { 
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(name));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setMaxHeight(400);
        stage.setMaxWidth(400);
        stage.setMinWidth(200);
        stage.setMinHeight(200);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}
