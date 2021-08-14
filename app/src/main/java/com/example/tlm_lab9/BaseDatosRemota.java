package com.example.tlm_lab9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.concurrent.ExecutionException;

public class BaseDatosRemota extends AppCompatActivity {

    private TextView query;
    private EditText tabla;
    private EditText cond;
    private String servidor = "192.168.56.1";
    private String ruta = "/android";
    private int puerto = 8080;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_datos_remota);
        query = (TextView) findViewById(R.id.txtQuery);
        tabla = (EditText) findViewById(R.id.tabla);
        cond = (EditText) findViewById(R.id.condicional);
    }

    public void conectar(View v) {
        String resultado = null;
        try {
            String url = "http://" + servidor + ":" + puerto + ruta;
            AsyncQuery queryText = new AsyncQuery();
            resultado = queryText.execute(url).get();
            if (resultado != null) {
                query.setText(resultado);
            } else {
                query.setText("Error");
            }
        } catch (ExecutionException ex) {
            ex.printStackTrace();
        } catch (InterruptedException ex) {
            ex.printStackTrace();

        }
    }

    public void consultar(View view){
        String resultado = null;
        try {
            if(cond.getText().toString().isEmpty()){
                String datos = "http://" + servidor + ":" + puerto + "/android/" + "Select"+ cond.getText().toString() +" FROM " + tabla.getText().toString();
                AsyncQuery async = new AsyncQuery();
                resultado = async.execute(datos).get();
                query.setText(resultado);
            }else {
                String datos = "http://" + servidor + ":" + puerto + "/android/" + " Select * FROM " + tabla.getText().toString();
                AsyncQuery async = new AsyncQuery();
                resultado = async.execute(datos).get();
                query.setText(resultado);
            }
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}