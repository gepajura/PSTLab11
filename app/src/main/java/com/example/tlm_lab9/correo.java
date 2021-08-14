package com.example.tlm_lab9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class correo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_correo);
        setContentView(R.layout.activity_web_site);
        WebView wv = (WebView) findViewById(R.id.bandejaEntrada);
        WebSettings ws = wv.getSettings();
        ws.setJavaScriptEnabled(true);
        wv.setWebViewClient(new WebViewClient());
        wv.loadUrl("https://mail.google.com/");
    }
    public void volver(View v){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}