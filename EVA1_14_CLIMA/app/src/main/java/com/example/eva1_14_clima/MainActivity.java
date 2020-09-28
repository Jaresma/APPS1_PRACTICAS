package com.example.eva1_14_clima;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listVwWeather;
    Weather [] weathers =  {
            new Weather("chihuha",20,"lluvia ligera",R.drawable.lluvia),
            new Weather("chihuha",20,"lluvia ligera",R.drawable.lluvia),
            new Weather("chihuha",20,"lluvia ligera",R.drawable.lluvia),
            new Weather("chihuha",20,"lluvia ligera",R.drawable.lluvia),
            new Weather("chihuha",20,"lluvia ligera",R.drawable.lluvia),
            new Weather("chihuha",20,"lluvia ligera",R.drawable.lluvia),
            new Weather("chihuha",20,"lluvia ligera",R.drawable.lluvia),
            new Weather("chihuha",20,"lluvia ligera",R.drawable.lluvia),
            new Weather("chihuha",20,"lluvia ligera",R.drawable.lluvia),
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listVwWeather = findViewById(R.id.listVwWeather);
        listVwWeather.setAdapter(new WeatherAdapter(this,R.layout.layout_weather,
                weathers));
    }
}
