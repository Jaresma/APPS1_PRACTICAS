package com.example.eva3_3_runnable;
//LOS HILOS NOS SIRVEN PARA EJECUTAR RECURSOS EN SEGUNDO PLANO
//PARA CONEXIONES A BASES DE DATOS

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    Runnable runnable;

    {
        runnable = new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++) {
                    try {
                        Thread.sleep(1000);
                        Log.wtf("RUNNABLE",i+"");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        };
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread thread = new Thread(runnable);
        thread.start();
        MiRunnable miRunnable = new MiRunnable();
        Thread thread1 = new Thread(miRunnable);
        thread1.start();

    }
}

class MiRunnable implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<10;i++) {
            try {
                Thread.sleep(1000);
                Log.wtf("RUNNABLE2",i+"");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
