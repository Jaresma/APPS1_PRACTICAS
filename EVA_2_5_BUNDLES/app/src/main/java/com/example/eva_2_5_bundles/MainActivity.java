package com.example.eva_2_5_bundles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView lstVwDatos;
    String[] datos = {
            "rkmrepkgre",
            "verververv",
            "rverververver",
            "vreververv",
            "rverververver",
            "vcreverver",
            "rkmrepkgre",
            "verververv",
            "rverververver",
            "vreververv",
            "rverververver",
            "vcreverver",

    };
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstVwDatos = findViewById(R.id.LstVwDatos);
        intent = new Intent(this,DetailActivity.class);
        lstVwDatos.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,datos));
        lstVwDatos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Bundle bundle = new Bundle();
                bundle.putString("CIUDAD",datos[position]);
                bundle.putInt("POSICION",position);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}
