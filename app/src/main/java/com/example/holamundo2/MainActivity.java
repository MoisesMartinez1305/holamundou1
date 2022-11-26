package com.example.holamundo2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText nombre;//DeclaracionObjetos
    TextView saludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {//Constructor
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre = findViewById(R.id.nombre);
        saludo = findViewById(R.id.saludo);

    }
    public void click(View view){
        /*String nombrepersona;
        nombrepersona = nombre.getText().toString();//guarda en variable nombre persona lo que se puso en el editext
        // con Get extraigo Con set mando
        saludo.setText("Hola " + nombrepersona + " Como estas?");*/
        //Log.i("info","Boton presionado");
        nombre = findViewById(R.id.nombre);
        String nombrepersona = nombre.getText().toString();
        saludo.setText("Hola " + nombrepersona + " Como estas?");
    }//como es metodo final se uso view view
}