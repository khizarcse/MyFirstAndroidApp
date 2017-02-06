package com.application.my.myfirstandroidapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Declare our view variable and assigned values from the layout file
        final TextView factLabel = (TextView) findViewById(R.id.textView);
        final Button showFactButton = (Button) findViewById(R.id.button2);
        final RelativeLayout relativelayout = (RelativeLayout) findViewById(R.id.relativeLayout);
        View.OnClickListener listner = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fact = mFactBook.getFact();

                //update the label with our dynamic fact
                factLabel.setText(fact);
                int color = mColorWheel.getColor();
                relativelayout.setBackgroundColor(color);
                showFactButton.setTextColor(color);


            }
        };
        showFactButton.setOnClickListener(listner);

    }
}
