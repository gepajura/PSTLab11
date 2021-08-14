package com.example.tlm_lab9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class showInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_info);
        TextView tv = findViewById(R.id.mostrarInfo);
        String user = getIntent().getStringExtra("usuario");
        tv.setText("Bienvenido "+user);
    }
    public void volver(View v){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }

}