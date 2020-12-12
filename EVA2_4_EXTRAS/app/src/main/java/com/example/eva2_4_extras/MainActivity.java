package com.example.eva2_4_extras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Intent intent;
    Button btnLanzar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLanzar = findViewById(R.id.btnLanzar);
        btnLanzar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(),DetailActivity.class);
                intent.putExtra(
                        "mensaje",
                        "hola mundo!!"
                );
                intent.putExtra("entero",100);
                intent.putExtra("costo",10.5f);
                startActivity(intent);
            }
        });
    }
}
