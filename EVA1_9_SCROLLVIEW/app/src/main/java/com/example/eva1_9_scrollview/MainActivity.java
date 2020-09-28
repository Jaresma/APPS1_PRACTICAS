package com.example.eva1_9_scrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtVwTexto;
    final String cade = "fdsñklfñlsdjfklñsdjflkñsdjfkldsjfklñdjsfklñjsdklñfjsdkñfjdklsñfjldksjf" +
            "dlskfjlsdkjflkdsjflkdjslfkjdslkfjdslkjflkdsjflkdsjflkdsjflkjsdlkfjdslkfjkdsljflkdsjf" +
            "sdlkfjlksdjflkdsjflksdjflkjsdlfkjsdlkfjsdklfjdskljflkdsjflkdsjflkdsjlfkjdslkfjsdlkjdslk" +
            "ldksjflksdjflkdsjflksdjflkdsjflkdsjflkjdslkfjsdlkjflskdjfksdjflksdjflksdjflkdsjdlkfsjflks" +
            "dsfjlksdjflksdjflksdjflkjsdlfkjdslkfjdslkfjdslkjflksdjflkdsjflkdsjflkjdskfjdslkfjlkdsjflkdsj" +
            "dlfjsdlkjfsldkjflkdsjflksdjflksdjflksdjflkdsjflksdjflkdsjflksdjflksdjlfksdjlfkjdslkfjdslkfjdlsk" +
            "dlkfjsdjfsdlkjdsf"+
            "dlskfjlsdkjflkdsjflkdjslfkjdslkfjdslkjflkdsjflkdsjflkdsjflkjsdlkfjdslkfjkdsljflkdsjf" +
            "sdlkfjlksdjflkdsjflksdjflkjsdlfkjsdlkfjsdklfjdskljflkdsjflkdsjflkdsjlfkjdslkfjsdlkjdslk" +
            "ldksjflksdjflkdsjflksdjflkdsjflkdsjflkjdslkfjsdlkjflskdjfksdjflksdjflksdjflkdsjdlkfsjflks" +
            "dsfjlksdjflksdjflksdjflkjsdlfkjdslkfjdslkfjdslkjflksdjflkdsjflkdsjflkjdskfjdslkfjlkdsjflkdsj" +
            "dlfjsdlkjfsldkjflkdsjflksdjflksdjflksdjflkdsjflksdjflkdsjflksdjflksdjlfksdjlfkjdslkfjdslkfjdlsk" +
            "dlkfjsdjfsdlkjdsf";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtVwTexto = findViewById(R.id.txtVwTexto);
        txtVwTexto.setText(cade);
    }
}
