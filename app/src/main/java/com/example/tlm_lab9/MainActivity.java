package com.example.tlm_lab9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*public void inicio(View v){
        EditText et1 = (EditText) findViewById(R.id.url);
        Intent i = new Intent(this,webSite.class);
        i.putExtra("direccion",et1.getText().toString());
        startActivity(i);
    }*/

    public void sesion(View v){
        Intent i = new Intent(this,iniciarSesion.class);
        startActivity(i);
    }

    public void correo(View v){
        Intent i = new Intent(this,correoSesion.class);
        startActivity(i);
    }

    public void acercaDe(View v){
        Intent i = new Intent(this,acercaDe.class);
        startActivity(i);
    }

    public void bd(View v){
        Intent i = new Intent(this,ActivityBD.class);
        startActivity(i);
    }

    public void bdQuery(View v){
        Intent i = new Intent(this,BaseDatosRemota.class);
        startActivity(i);
    }
}