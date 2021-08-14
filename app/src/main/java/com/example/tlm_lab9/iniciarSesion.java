package com.example.tlm_lab9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class iniciarSesion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciar_sesion);

    }
    public void enviar(View v){
        EditText et1 = (EditText) findViewById(R.id.user);
        Intent i = new Intent(this,showInfo.class);
        i.putExtra("usuario", et1.getText().toString());
        startActivity(i);
    }
    public void volver(View v){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}