package com.example.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculatorController {
    @FXML
    public TextField firstTextField;
    public ChoiceBox operationChoiceBox;
    public TextField secondTextField;
    public Label resultLabel;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX CalculatorApplication!");
    }

    public void handleCalculate(ActionEvent actionEvent) {
    }
}