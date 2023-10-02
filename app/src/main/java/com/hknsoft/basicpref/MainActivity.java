package com.hknsoft.basicpref;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private EditText editText;
    private Button buttonSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textview);
        editText = findViewById(R.id.edittext);
        buttonSave = findViewById(R.id.button_save);

        BasicPref basicPref = BasicPref.getInstance(MainActivity.this);

        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = editText.getText().toString().trim();
                basicPref.setString("name", name);

                String retrievedName = basicPref.getString("name", "Jack");
                textView.setText(retrievedName);
            }
        });
    }
}