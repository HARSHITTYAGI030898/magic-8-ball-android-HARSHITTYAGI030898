package com.londonappbrewery.magiceightball;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mybutton = findViewById(R.id.askbutton);

        final ImageView balldisplay = findViewById(R.id.image_Eightball);

        final int [] ballarray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5};

        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random randomnumbergenerator = new Random();

                int number = randomnumbergenerator.nextInt(5);
                balldisplay.setImageResource(ballarray[number]);


            }
        });

    }
}
