package com.example.practicemodule;

import android.content.Intent;
import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button PlayMusic;
    Button blue;
    Button green;
    Button red;
    Button black;
    Button orange;
    Button dgreen;
    Button brown;
    Button lblue;
    Button grey;
    Button purple;
    Button maroon;
    Button pink;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PlayMusic = (Button) findViewById(R.id.playaudio);
        blue = (Button) findViewById(R.id.blue);
        green = (Button) findViewById(R.id.green);
        black = (Button) findViewById(R.id.black);
        orange = (Button) findViewById(R.id.orange);
        dgreen = (Button) findViewById(R.id.dgreen);
        brown = (Button) findViewById(R.id.brown);
        lblue = (Button) findViewById(R.id.lblue);
        grey = (Button) findViewById(R.id.grey);
        purple = (Button) findViewById(R.id.purple);
        maroon = (Button) findViewById(R.id.maroon);
        pink = (Button) findViewById(R.id.pink);
        red = (Button) findViewById(R.id.red);




        final MediaPlayer bluep= MediaPlayer.create(this,R.raw.blue);
        final MediaPlayer hurray = MediaPlayer.create(this,R.raw.hurray);
        final MediaPlayer wrong = MediaPlayer.create(this,R.raw.wrong);
        PlayMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bluep.start();
            }
        });
        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hurray.start();
                Intent intent = new Intent(MainActivity.this,red.class);
                startActivity(intent);

            }
        });
        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wrong.start();
            }
        });
        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wrong.start();
            }
        });
        black.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wrong.start();
            }
        });
        orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wrong.start();
            }
        });
        dgreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wrong.start();
            }
        });
        brown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wrong.start();
            }
        });
        lblue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wrong.start();
            }
        });
        pink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wrong.start();
            }
        });
        grey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wrong.start();
            }
        });
        purple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wrong.start();
            }
        });
        maroon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wrong.start();
            }
        });



    }
}
