package com.example.eva1_8_radiogroup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup rdGrpComida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rdGrpComida = findViewById(R.id.rdGrpComida);

        rdGrpComida.setOnCheckedChangeListener(
                new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        RadioButton radioButton = findViewById(checkedId);

                        Toast.makeText(getApplicationContext(), radioButton.getText(), Toast.LENGTH_SHORT).show();

                    }
                }
        );
    }
}
