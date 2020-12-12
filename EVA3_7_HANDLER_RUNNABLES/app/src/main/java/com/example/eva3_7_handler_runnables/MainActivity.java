package com.example.eva3_7_handler_runnables;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtVwMsg;
    int i= 0;

    Handler miHandler = new Handler();

    Runnable backGroundRun = new Runnable() {//trabajo pesado
        @Override
        public void run() {

            while(true){
                try {
                    Thread.sleep(1000);

                } catch (InterruptedException e) {
                    e.printStackTrace();

                }
                miHandler.post(foreGroundRun);
                Log.wtf("RUNNABLE",i+"");
                i++;
            }
        }
    };

    Runnable foreGroundRun = new Runnable() {//manejo de la ui
        @Override
        public void run() {
            txtVwMsg.append(i+"\n");
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtVwMsg = findViewById(R.id.txtVwMsg);

        //inicializamos hilo

        Thread tHilo = new Thread(backGroundRun);
        tHilo.start();
    }
}
