package com.example.eva_2_5_bundles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    TextView txtVwDatos;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        txtVwDatos = findViewById(R.id.txtVwDatos);
        intent = getIntent();
        Bundle bundle = intent.getExtras();

        txtVwDatos.append(bundle.getString("CIUDAD"));
        txtVwDatos.append(bundle.getInt("POSICION") +" ");

    }
}
