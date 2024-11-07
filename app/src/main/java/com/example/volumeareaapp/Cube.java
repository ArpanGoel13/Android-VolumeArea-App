package com.example.volumeareaapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Cube extends AppCompatActivity {
    EditText editTextCube;
    TextView textViewCube;
    Button buttonCube;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cube);
        editTextCube = findViewById(R.id.editTextCube);
        textViewCube = findViewById(R.id.textViewCube);
        buttonCube = findViewById(R.id.btnCube);

        buttonCube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double edge = Double.parseDouble(editTextCube.getText().toString());
                double volume = (double) (edge*edge*edge);
                textViewCube.setText("Volume is: "+volume);
            }
        });
    }
}