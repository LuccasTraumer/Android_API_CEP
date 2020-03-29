package com.example.mycepproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private int inputCep =0;
    private Button btnBuscar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBuscar = (Button) findViewById(R.id.btnBuscar);
        btnBuscar.setOnClickListener(this);

    }
    public void onClick(View v){
        if(v.getId() == R.id.btnBuscar){
            try{
                inputCep = new Integer(new Integer(findViewById(R.id.edCep).toString()));
                Intent it = new Intent(MainActivity.this, SecondScreen.class);
                it.putExtra("cep",inputCep);
                startActivity(it);
            }catch(Exception err){
                Toast.makeText(getApplicationContext(),"Cep invalido!",Toast.LENGTH_SHORT).show();
            }
        }
    }
    @Override
    protected void onResume(){
        super.onResume();
    }
    @Override
    protected void onPause(){
        super.onPause();
    }
    @Override
    protected void onStop(){
        super.onStop();
    }
}
