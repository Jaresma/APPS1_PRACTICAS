package com.example.eva3_5_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //UI INTERFAZ GRAFICA DEBE SER COONTROLADA POR THREADMAIN!!!
    //UN HILO NO PUEDE MODIFICAR UN OBJETO DE LA UI QUE NO LE PERTENECE
    TextView txtVwDatos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtVwDatos = findViewById(R.id.txtVwDatos);

        Thread tHilo = new Thread(){
            @Override
            public void run() {
                super.run();
                int i= 0;
                while(true){
                    try {
                        Thread.sleep(1000);

                    } catch (InterruptedException e) {
                        e.printStackTrace();

                    }
                    Log.wtf("RUNNABLE",i+"");
                    txtVwDatos.append(i+"\n");
                    i++;
                }
            }
        };
        tHilo.start();
    }
}
