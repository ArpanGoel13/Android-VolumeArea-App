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

public class Circle extends AppCompatActivity {
    EditText editTextSphere;
    TextView textViewSphere;
    Button buttonSphere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);
        editTextSphere = findViewById(R.id.editTextSphere);
        textViewSphere = findViewById(R.id.textViewSphere);
        buttonSphere = findViewById(R.id.btnSphere);

        buttonSphere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int radius = Integer.parseInt(editTextSphere.getText().toString());
                double volume = (double) ((4/3)*3.1416*radius*radius*radius);
                textViewSphere.setText("Volume is: "+volume);
            }
        });


    }
}