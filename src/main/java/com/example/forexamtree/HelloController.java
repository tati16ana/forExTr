package com.example.forexamtree;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Window;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class HelloController {
    @FXML
    private Label label;

    @FXML
    TextField loginField;

    @FXML
    TextField passField;

    @FXML
    Button buttonEx;

    private Perexod perexod = new Perexod();

    public void login (ActionEvent event) throws SQLException, IOException{
        Window window = buttonEx.getScene().getWindow();
        perexod.perexod("profile.fxml");

    }



}
