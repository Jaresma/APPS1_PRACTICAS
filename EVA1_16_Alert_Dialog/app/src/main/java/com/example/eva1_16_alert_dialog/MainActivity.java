package com.example.eva1_16_alert_dialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onShowAlertDialog(View v){
        new AlertDialog.Builder(this)
                .setTitle("Cuadro de dialogo andorid")
                .setMessage("cuafro de dialogo del sistema")
                .setIcon(R.drawable.ic_launcher_background)
                .setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Log.wtf("alert dialog","yes");

                    }
                })
                .setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Log.wtf("alert dialog","no");

                    }
                })
                .setNeutralButton("CANCEL", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Log.wtf("alert dialog","cencel");

                    }
                })
                .create()
                .show();
    }

    public void onShowMyAlertDialog(View v){
        final Dialog miCuadroDialogo = new Dialog(this);
        miCuadroDialogo.setContentView(R.layout.mi_dialogo);
        TextView txtVwtitu;
        txtVwtitu = miCuadroDialogo.findViewById(R.id.textView);
        txtVwtitu.setText("MI CUADRO DE DIALOGO");
        final EditText edtTxtDatos;
        edtTxtDatos = miCuadroDialogo.findViewById(R.id.editTxtDatos);
        Button btnOK;
        btnOK = miCuadroDialogo.findViewById(R.id.btnOk);
        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sCade;
                sCade = edtTxtDatos.getText().toString();
                Log.wtf("cuadro personal", sCade);



            }
        });
        miCuadroDialogo.show();


    }
}
