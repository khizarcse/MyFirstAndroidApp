package com.application.my.myfirstandroidapp;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by sony on 1/4/2017.
 */

public class ColorWheel {
    public String[] mColors ={
            "#39add1",
            "#3079ab",
            "#c25975",
            "#e15258",
            "#f9845b",
            "#838cc7",
            "#7d669e",
            "#53bbb4",
            "#51b46d",
            "#e0ab18",
            "#637a91",
            "#f092b0",
            "#b7c0c7"

    };
    // methods(abilities: things that object can do)
    public int getColor(){

        String color = "";
        //randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mColors.length);
        color = mColors[randomNumber];
        int colorAsInt = Color.parseColor(color);


        return colorAsInt;

    }
}
