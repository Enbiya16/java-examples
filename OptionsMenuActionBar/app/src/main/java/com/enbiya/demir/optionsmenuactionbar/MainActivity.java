package com.enbiya.demir.optionsmenuactionbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout background;
    TextView centertext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        centertext=(TextView)findViewById(R.id.centertext);
        background = (ConstraintLayout)findViewById(R.id.background);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){

            case R.id.beyaz:centertext.setTextColor(Color.WHITE);
            break;
            case R.id.siyah:centertext.setTextColor(Color.BLACK);
            break;
            case R.id.kırmızı:centertext.setTextColor(Color.RED);
            break;

        }

        return super.onOptionsItemSelected(item);
    }
}