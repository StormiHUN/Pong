package com.example.pong;

import javafx.animation.AnimationTimer;
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


    int lx = 500;
    int ly = 350;
    int ls = 10;
    int dx = 0;
    int dy = ls;

    int sy = 350;
    int sp = 0;
    int cy = 350;
    int cp = 0;

    boolean jatek = true;

    AnimationTimer timer = null;

    public void initialize(){
        timer = new AnimationTimer() {
            @Override
            public void handle(long l) {
                if(jatek) pattog();
            }
        };
        timer.start();
    }

    public void pattog(){
        if(lx+dx <= 60 && ly >= sy-70 && ly <= sy+70){
            sp++;
            dx = +ls;
        }if(lx+dx >= 940 && ly >= cy-70 &&ly <= cy+70){
            dx = -ls;
            cp++;
        }
        if(ly+dy <= 30) {
            dy = +ls;
        }if(ly+dy >= 670) dy = -ls;
        lx+=dx;
        ly+=dy;
        playerScore.setText(sp+"");
        clientScore.setText(cp+"");
        ball.setLayoutX(lx);
        ball.setLayoutY(ly);
        if(lx < 30 || lx > 970) jatek = false;
    }

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
            sy = my;
        }else{
            clientDisplayName.setLayoutY(my);
            cy = my;
        }
    }
}