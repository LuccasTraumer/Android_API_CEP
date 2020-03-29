package com.example.mycepproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SecondScreen extends AppCompatActivity {

    private int cep;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);

        Intent it = getIntent();
        if(it != null){
            Bundle params = it.getExtras();
            if(params != null){
                cep = new Integer(params.get("cep").toString());
            }
        }
    }
}
