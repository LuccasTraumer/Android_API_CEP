package com.example.mycepproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondScreen extends AppCompatActivity {

    private String cep;
    private TextView txtInfoCep;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);

        Intent it = getIntent();
        if(it != null){
            Bundle params = it.getExtras();
            if(params != null){
                cep = params.get("cep").toString();
            }
        }
        Toast.makeText(getApplicationContext(),"Second Screen",Toast.LENGTH_SHORT);
        //txtInfoCep = (TextView) findViewById(R.id.txtInfoCep);
        //txtInfoCep.setText(cep);
    }
}
