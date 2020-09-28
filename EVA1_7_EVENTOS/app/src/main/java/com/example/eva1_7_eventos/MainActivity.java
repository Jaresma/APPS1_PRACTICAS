package com.example.eva1_7_eventos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnInListener; // creamos el objeto
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnInListener =findViewById(R.id.btnInListener); // vinculamos el boton
        btnInListener.setOnClickListener(this); // botton obtiene su click listener
        

    }

    //lisener objeto que espera la accion de un evento
    //todos los widget son view
    //TOAST (PEQUEÑO DISCURSO) MENSAJE VREBE
    //EL CONTEXTYO SE VINCULA CON RECURSOS , UI , Y UNA ACTIVIDA DO APLICACION
    // TODA AOPLICACION TIENE UN CONTEXTO
    // listener es una interfaces
    public void miClick(View v){
        Toast.makeText(this, "HOLAAAA MUNDO!!", Toast.LENGTH_SHORT).show();


    }


    @Override
    public void onClick(View v) {
        Toast.makeText(this, "EVENTO X IF LISTENER!!!", Toast.LENGTH_SHORT).show();
    }
}
