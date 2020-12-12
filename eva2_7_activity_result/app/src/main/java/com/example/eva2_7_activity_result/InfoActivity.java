package com.example.eva2_7_activity_result;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class InfoActivity extends AppCompatActivity {
    EditText edittxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        edittxt = findViewById(R.id.edittxt1);
    }

    public void onClick2(View v){
        //DEVOLVER LOS DATOS
        Intent intent = new Intent();
        String sCade = edittxt.getText().toString();
        intent.putExtra("DATOS",sCade);
        setResult(Activity.RESULT_OK,intent);
        finish(); // FINALIZA!!


    }

}
