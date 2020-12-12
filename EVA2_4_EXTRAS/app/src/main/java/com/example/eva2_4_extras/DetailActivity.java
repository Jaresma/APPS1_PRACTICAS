package com.example.eva2_4_extras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
TextView txtVwDatos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        txtVwDatos = findViewById(R.id.txtVwDatos);
        Intent intent = getIntent();
        txtVwDatos.append(intent.getStringExtra("mensaje"));
        txtVwDatos.append(""+ intent.getIntExtra("entero",0));
        txtVwDatos.append(""+intent.getFloatExtra("costo",0.0f));
    }
}
