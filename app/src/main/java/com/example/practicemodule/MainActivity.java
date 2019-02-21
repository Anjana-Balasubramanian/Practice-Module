package com.example.practicemodule;

import android.media.MediaPlayer;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PlayMusic = (Button) findViewById(R.id.music);
        blue = (Button) findViewById(R.id.blue);
        green = (Button) findViewById(R.id.green);
        red = (Button) findViewById(R.id.red);
        final MediaPlayer mp= MediaPlayer.create(this,R.raw.sample1);
        PlayMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });
        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Hey correct",Toast.LENGTH_SHORT).show();
            }
        });
        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Hey not correct",Toast.LENGTH_SHORT).show();
            }
        });
        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Hey not correct",Toast.LENGTH_SHORT).show();
            }
        });



    }
}
