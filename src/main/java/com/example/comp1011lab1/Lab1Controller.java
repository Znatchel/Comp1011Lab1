package com.example.comp1011lab1;

import javafx.fxml.FXML;

import javafx.scene.control.Label;



public class Lab1Controller {
    @FXML
    private Label displayLabel;

    @FXML
    void createClothes() {

        Clothes newClothes = new Clothes("small","purple", 1);
        displayLabel.setText(newClothes.toString());
    }

}
