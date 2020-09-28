package com.example.eva1_12_orientacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Referenciamos nuestros componentes
        button = findViewById(R.id.button);

        button.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                int iOrienta = getResources().getConfiguration().orientation;
                if(iOrienta == Configuration.ORIENTATION_PORTRAIT)
                Toast.makeText(getApplicationContext(), "MODO PORTRAIT", Toast.LENGTH_LONG).show();
                else
                Toast.makeText(getApplicationContext(),"MODO LANDSCAPE",Toast.LENGTH_LONG).show();
            }
        });
    }
}
