package com.example.calculadora;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;

public class CalculadoraFX extends Application {

    public static void main(String[] args) {
        launch(args);
    }



    public void addDimensionsButtons (Button boton, int ancho, int alto) {
        boton.setPrefHeight(alto);
        boton.setPrefWidth(ancho);
    }

    public void addMaxDimensionsButtons (Button boton) {
        boton.setMaxHeight(Double.MAX_VALUE);
        boton.setMaxWidth(Double.MAX_VALUE);
    }

    @Override
    public void start(Stage primaryStage) {

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(5);
        grid.setVgap(5);
        grid.setPadding(new Insets(25, 25, 25, 25));

        //Columnas
        ColumnConstraints column1 = new ColumnConstraints();
        column1.setPercentWidth(100/3);
        column1.setHgrow(Priority.ALWAYS);

        ColumnConstraints column2 = new ColumnConstraints();
        column2.setPercentWidth(100/3);
        column2.setHgrow(Priority.ALWAYS);

        ColumnConstraints column3 = new ColumnConstraints();
        column3.setPercentWidth(100/3);
        column3.setHgrow(Priority.ALWAYS);

        //Filas
        RowConstraints row1 = new RowConstraints();
        row1.setPercentHeight(100/3);
        row1.setVgrow(Priority.ALWAYS);

        RowConstraints row2 = new RowConstraints();
        row2.setPercentHeight(100/3);
        row2.setVgrow(Priority.ALWAYS);

        RowConstraints row3 = new RowConstraints();
        row3.setPercentHeight(100/3);
        row3.setVgrow(Priority.ALWAYS);
        RowConstraints row4 = new RowConstraints();
        row4.setPercentHeight(100/3);
        row4.setVgrow(Priority.ALWAYS);

        grid.getColumnConstraints().add(column1);
        grid.getColumnConstraints().add(column2);
        grid.getColumnConstraints().add(column3);

        grid.getRowConstraints().add(row1);
        grid.getRowConstraints().add(row2);
        grid.getRowConstraints().add(row3);
        grid.getRowConstraints().add(row4);

        Scene scene = new Scene(grid, 300 ,275);
        primaryStage.setScene(scene);

        TextField userTextField = new TextField();
        //GridPane.setConstraints(userTextField, 0, 0, 4, 1);
        grid.add(userTextField,0,0, 4 ,1);

        //Botones
        Button boton7 = new Button("7");
        grid.add(boton7, 0, 1);
        addMaxDimensionsButtons(boton7);

        Button boton4 = new Button("4");
        grid.add(boton4, 0, 2);
        addMaxDimensionsButtons(boton4);

        Button boton1 = new Button("1");
        grid.add(boton1, 0, 3);
        addMaxDimensionsButtons(boton1);

        Button boton2 = new Button("2");
        grid.add(boton2, 1, 3);
        addMaxDimensionsButtons(boton2);

        Button boton3 = new Button("3");
        grid.add(boton3, 2, 3);
        addMaxDimensionsButtons(boton3);

        Button boton5 = new Button("5");
        grid.add(boton5, 1, 2);
        addMaxDimensionsButtons(boton5);

        Button boton6 = new Button("6");
        grid.add(boton6, 2, 2);
        addMaxDimensionsButtons(boton6);

        Button boton8 = new Button("8");
        grid.add(boton8, 1, 1);
        addMaxDimensionsButtons(boton8);

        Button boton9 = new Button("9");
        grid.add(boton9, 2, 1);
        addMaxDimensionsButtons(boton9);

        //grid.setGridLinesVisible(true);


      /*  boton7.setOnAction(evento -> {
            userTextField.setText(userTextField.getText() + boton7.getText());
            System.out.println(((Button) evento.getTarget()).getText());
        });

        boton8.setOnAction(evento -> {
            userTextField.setText(userTextField.getText() + boton8.getText());
        });

        boton9.setOnAction(evento-> {
            userTextField.setText(userTextField.getText() + boton9.getText());
        });

        boton4.setOnAction(evento-> {
            userTextField.setText(userTextField.getText() + boton4.getText());
        });

        boton5.setOnAction(evento-> {
            userTextField.setText(userTextField.getText() + boton5.getText());
        });

        boton6.setOnAction(evento-> {
            userTextField.setText(userTextField.getText() + boton6.getText());
        });

        boton1.setOnAction(evento-> {
            userTextField.setText(userTextField.getText() + boton1.getText());
        });

        boton2.setOnAction(evento-> {
            userTextField.setText(userTextField.getText() + boton2.getText());
        });

        boton3.setOnAction(evento-> {
            userTextField.setText(userTextField.getText() + boton3.getText());
        });*/

        grid.addEventFilter(MouseEvent.MOUSE_CLICKED, evento-> {
            if (evento.getTarget() instanceof Button) {
               String btnaux = ((Button) evento.getTarget()).getText();
               userTextField.setText(userTextField.getText() + btnaux);
               System.out.println(((Button) evento.getTarget()).getText());

            }
        });


        primaryStage.setTitle("Calculadora");
        primaryStage.show();


    }
}
