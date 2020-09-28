package com.example.eva1_6_recursos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtVwdatos;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.nombreimagen);
        txtVwdatos.setText(R.string.mis_datos);

    }
}
