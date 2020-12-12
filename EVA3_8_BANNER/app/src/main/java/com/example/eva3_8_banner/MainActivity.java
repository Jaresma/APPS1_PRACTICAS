package com.example.eva3_8_banner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageViewBanner;
    int[] img = {R.drawable.f1,R.drawable.f2,R.drawable.f3};
    int indice = 0;
    Handler handler = new Handler();
    Runnable backG = new Runnable() {
        @Override
        public void run() {
            while(true){
                try{
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                handler.post(foreG);


            }

        }
    };
    Runnable foreG = new Runnable() {
        @Override
        public void run() {
            imageViewBanner.setImageResource(img[indice]);
            if(indice==2){
                indice = 0;
            }else{
                indice++;
            }

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageViewBanner=findViewById(R.id.imageViewBanner);
        Thread hilo = new Thread(backG);
        hilo.start();
    }
}
