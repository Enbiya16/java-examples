package com.enbiya.demir.ticttactoe_twoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button play,about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        play =(Button)findViewById(R.id.play);
        about=(Button)findViewById(R.id.about);


        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentabout =new Intent(MainActivity.this,About.class);
                startActivity(intentabout);
            }
        });

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentgame=new Intent(MainActivity.this,tttgame.class);
                startActivity(intentgame);
            }
        });

    }



    @Override
    public void onClick(View view) {

    }
}