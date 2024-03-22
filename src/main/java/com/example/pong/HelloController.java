package com.example.pong;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

public class HelloController {


    public TextField playerName;
    public RadioButton serverCheck;
    public TextField clientName;
    public RadioButton clientCheck;
    public ListView serverList;
    public Pane pane;
    public Label playerScore;
    public Label clientScore;
    public ImageView ball;
    public Label playerDisplayName;
    public Label clientDisplayName;
    public ToggleGroup mode;


    public void onAcceptClick() {

    }

    public void onFrissitClick() {

    }

    public void onKivalasztClick() {

    }

    public void onMouseMoved(MouseEvent e) {
        int my = (int)e.getY(); if (my < 90) my = 90; else if(my > 610) my = 610;
        if(serverCheck.isSelected()){
            playerDisplayName.setLayoutY(my);
        }else{
            clientDisplayName.setLayoutY(my);
        }
    }
}