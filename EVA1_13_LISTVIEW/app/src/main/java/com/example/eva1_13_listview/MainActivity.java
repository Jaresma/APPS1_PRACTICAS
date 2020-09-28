package com.example.eva1_13_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Datos
    String[] datos = {
            "Mole",
            "tacos",
            "cereal",
            "Mole",
            "tacos",
            "cereal",
            "tacos",
            "cereal",
            "tacos",
            "cereal",
            "tacos",
            "cereal",
            "tacos",
            "cereal",
            "Mole",
            "tacos",
            "cereal",
            "Mole",
            "tacos",
            "cereal",
            "Mole",
            "tacos",
            "cereal",
            "Mole",
            "tacos",
            "cereal",

    };

    ListView lstVwDatos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstVwDatos = findViewById(R.id.lstVwDatos);
        lstVwDatos.setAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                datos));
        lstVwDatos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),datos[position],Toast.LENGTH_SHORT).show();
            }
        });
    }




}
