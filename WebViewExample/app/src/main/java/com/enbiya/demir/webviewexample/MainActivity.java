package com.enbiya.demir.webviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText edituser;
    Button buttonuser;
    WebView webpage;
    String url;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edituser=(EditText)findViewById(R.id.edituser);
        buttonuser=(Button)findViewById(R.id.buttonuser);
        webpage=(WebView)findViewById(R.id.webpage);
        webpage.getSettings().setJavaScriptEnabled(true);
        webpage.setWebViewClient(new WebViewClient());


        buttonuser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                url=edituser.getText().toString();
                webpage.loadUrl("http://"+url);
            }
        });


    }

    @Override
    public void onClick(View view) {

    }
}