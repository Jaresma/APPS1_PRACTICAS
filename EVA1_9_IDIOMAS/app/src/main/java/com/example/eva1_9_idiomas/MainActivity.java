package com.example.eva1_9_idiomas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RadioGroup rdGrpIdiomas;
    RadioButton rdBtnEs, rdBtnEn;
    TextView txtVwNom ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rdGrpIdiomas = findViewById(R.id.rdGrpIdiomas);
        rdBtnEs=findViewById(R.id.rdBtnEs);
        rdBtnEn=findViewById(R.id.rdBtnEn);
        


        rdGrpIdiomas.setOnCheckedChangeListener(
                new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        //comparamos el id que llego con los ids de los botones que tenemos
                        //todos los id estan en r R.id.(id);
                        if (checkedId == R.id.rdBtnEs){
                            rdBtnEs.setText(R.string.btn_es_español);
                            rdBtnEn.setText(R.string.btn_es_ingles);

                        }else if (checkedId == R.id.rdBtnEn){
                            rdBtnEs.setText(R.string.btn_en_español);
                            rdBtnEn.setText(R.string.btn_en_ingles);

                        }
                    }
                }
        );
    }
}
