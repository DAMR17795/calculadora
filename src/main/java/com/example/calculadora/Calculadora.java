package com.example.calculadora;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.HashMap;

public class Calculadora {

    public String operacion(String opera) {

        int resultado, num1, num2;
        String result = "";

        if (opera.contains("+")){

            String[] parts = opera.split("\\+");
            opera="";
            num1= Integer.parseInt(parts[0]);
            num2= Integer.parseInt(parts[1]);
            resultado = num1 + num2;
            result = String.valueOf(resultado);

        }

        if (opera.contains("-")) {

            String[] parts= opera.split("\\-");
            opera="";
            num1=Integer.parseInt(parts[0]);
            num2=Integer.parseInt(parts[1]);
            resultado= num1 - num2;
            result= String.valueOf(resultado);

        }

        if (opera.contains("x")){
            String[] parts = opera.split("x");
            opera="";
            num1 = Integer.parseInt(parts[0]);
            num2= Integer.parseInt(parts[1]);
            resultado= num1 * num2;
            result = String.valueOf(resultado);
        }

        if (opera.contains("/")) {
            String[] parts = opera.split("\\/");
            result="";
            num1= Integer.parseInt(parts[0]);
            num2= Integer.parseInt(parts[1]);
            if (num2 ==0) {
                result = "No se puede dividir entre cero";
            } else {
                resultado = num1 / num2;
                result = String.valueOf(resultado);
            }
        }
        return result;
    }



}
