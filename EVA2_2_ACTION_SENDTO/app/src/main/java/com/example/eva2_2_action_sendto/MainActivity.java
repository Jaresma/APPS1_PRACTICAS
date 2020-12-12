package com.example.eva2_2_action_sendto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Intent intent;
    EditText edtxttel,edtxtmsg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtxttel = findViewById(R.id.edtxttel);
        edtxtmsg = findViewById(R.id.edtxtmsg);
    }

    public void onClick(View v){
        String stel = "smsto:" + edtxttel.getText().toString();
        String smensaje = edtxtmsg.getText().toString();

        intent = new Intent(Intent.ACTION_SENDTO,Uri.parse(stel));
        intent.putExtra("sms_body",smensaje);
        startActivity(intent);

    }


}
