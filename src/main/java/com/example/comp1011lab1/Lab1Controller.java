package com.example.comp1011lab1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Lab1Controller {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}