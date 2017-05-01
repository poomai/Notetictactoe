package com.example.momotaro.notetictactoe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class HardPlay3x3 extends AppCompatActivity implements View.OnClickListener {

    //Explicit
    private Button[][] buttons = new Button[3][3];
    private int[][] ints = new int[][]{
            {R.id.btn3x11, R.id.btn3x12, R.id.btn3x13},
            {R.id.btn3x21, R.id.btn3x22, R.id.btn3x23},
            {R.id.btn3x31, R.id.btn3x32, R.id.btn3x33}};
    private boolean aBoolean = true; // Value True ==> first User Choose
    private String tag = "30AprilV1";
    private int timesAnInt = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hard_play3x3);

        initialView();

        buttonController();

    }   // Main Method

    private void buttonController() {

        for (int i = 0; i < 3; i++) {
            for (int i1 = 0; i1 < 3; i1++) {
                buttons[i][i1].setOnClickListener(HardPlay3x3.this);
            }
        }

    }   // buttonController

    private void initialView() {

        for (int i = 0; i < 3; i++) {
            for (int i1 = 0; i1 < 3; i1++) {
                buttons[i][i1] = (Button) findViewById(ints[i][i1]);
            }   //for
        }   // for

    }   // initial

    @Override
    public void onClick(View view) {

        for (int i = 0; i < 3; i++) {
            for (int i1 = 0; i1 < 3; i1++) {
                if (view == buttons[i][i1]) {

                    //For Write X on Button
                    writeXOonButton(buttons[i][i1], "X");

                    //For Write O on Button
                    if (aBoolean) {
                        calculateByCom(i, i1);
                    }

                    aBoolean = false;

                }   // if
            }   // for
        }   // for


    }   // onClick

    private void calculateByCom(int indexX, int indexy) {

        Log.d(tag, "indexX ==> " + indexX);
        Log.d(tag, "indexY ==> " + indexy);

        int x1 = 0, y1 = 0, x2, y2, x3, y3, x4, y4;


        switch (timesAnInt) {
            case 1:

                x1 = indexX;
                y1 = indexy;

                if ((indexX == 1) && (indexy == 1)) {
                    writeXOonButton(buttons[0][0], "O");
                } else {
                    writeXOonButton(buttons[1][1], "O");
                }
                break;
            case 2:

                calculateByComTime2(x1, y1, indexX, indexy);

                break;
            case 3:
                break;
            case 4:
                break;
        }



    }   // calculateByCom

    private void calculateByComTime2(int x1, int y1, int indexX, int indexY) {

        //For (0,0)


        //For (0,1)

        //For (0,2)

        //For (1,0)

        //For (1,1)

        //For (1,2)

        //For (2,0)

        //For (2,1)

        //For (2,2)

    }   // calculate


    private void writeXOonButton(Button btnClick, String strXO) {

        btnClick.setText(strXO);

    }   // writeX

}   // Main Class
