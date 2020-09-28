package com.example.eva1_15_ciclo_de_vida;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //oncreate es el primer evento en el ciclo de vida de una app
    //eventos que hacen visiblre la app
    @Override
    protected void onCreate(Bundle savedInstanceState) {//1 cosas que se usaran una vez
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this,"onCreate" ,Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {//intermediario iniciar cosas que se pausaron
        super.onRestart();
        Toast.makeText(this,"onRestart" ,Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart() {//2 iniciar cosas
        super.onStart();
        Toast.makeText(this,"onStart" ,Toast.LENGTH_LONG).show();
    }


    @Override
    protected void onResume() {//3
        super.onResume();
        Toast.makeText(this,"onResume" ,Toast.LENGTH_LONG).show();
    }
    //eventos cuando la app se cierra


    @Override
    protected void onPause() {//4
        super.onPause();
        Toast.makeText(this,"onPause" ,Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {//5 Operaciones de uso intencivo del pross , guardar a base de datos
        super.onStop();
        Toast.makeText(this,"onStop" ,Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {//6 Libera los recursos
        super.onDestroy();
        Toast.makeText(this,"onDestroys" ,Toast.LENGTH_LONG).show();
    }
}
