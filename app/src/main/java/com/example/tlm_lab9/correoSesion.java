package com.example.tlm_lab9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class correoSesion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correo_sesion);
    }

    public void sesion(View v){
        Intent i = new Intent(this, correo.class);
        startActivity(i);
    }


    public void volver (View v){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

}