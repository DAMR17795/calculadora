package com.example.calculadora;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class HelloController {

    @FXML
    private Button btnSuma;
    @FXML
    private TextField pantallaLabel;
    @FXML
    private Button btnResta;
    @FXML
    private Button btn7;
    @FXML
    private Button btn8;
    @FXML
    private Button btn4;
    @FXML
    private Button btn5;
    @FXML
    private Button btn1;
    @FXML
    private Button btn2;
    @FXML
    private Button btn3;
    @FXML
    private Button btn6;
    @FXML
    private Button btn9;
    @FXML
    private Button btnMult;
    @FXML
    private Button btnDiv;
    @FXML
    private Button btn0;
    @FXML
    private Button btnBorrar;
    @FXML
    private Button btnPunto;


    @FXML
    public void escribirSiete(ActionEvent actionEvent) {
        pantallaLabel.setText(pantallaLabel.getText() + btn7.getText());
        /*if (ActionEvent.getTarget() instanceof Button) {
            String btnaux = ((Button) ActionEvent.getTarget()).getText();
            pantallaLabel.setText(pantallaLabel.getText() + btnaux);
            System.out.println(((Button) ActionEvent.getTarget()).getText());
        }*/
    }

    @FXML
    public void mostrar7(Event event) {
    }

    @FXML
    public void escribirOcho(ActionEvent actionEvent) {
    }

    @FXML
    public void mostrar8(Event event) {
    }

    @FXML
    public void escribirCuatro(ActionEvent actionEvent) {
    }

    @FXML
    public void mostrar4(Event event) {
    }

    @FXML
    public void escribirCinco(ActionEvent actionEvent) {
    }

    @FXML
    public void mostrar5(Event event) {
    }

    @FXML
    public void escribirUno(ActionEvent actionEvent) {
    }

    @FXML
    public void mostrar1(Event event) {
    }

    @FXML
    public void escribirDos(ActionEvent actionEvent) {
    }

    @FXML
    public void mostrar2(Event event) {
    }

    @FXML
    public void escribirTres(ActionEvent actionEvent) {
    }

    @FXML
    public void mostrar3(Event event) {
    }

    @FXML
    public void escribirSeis(ActionEvent actionEvent) {
    }

    @FXML
    public void mostrar6(Event event) {
    }

    @FXML
    public void escribirNueve(ActionEvent actionEvent) {
    }

    @FXML
    public void mostrar9(Event event) {
    }

    @FXML
    public void escribirCero(ActionEvent actionEvent) {
    }

    @FXML
    public void mostrar0(Event event) {
    }

    @FXML
    public void escribir(ActionEvent actionEvent) {
    }
}