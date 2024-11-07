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

public class Cylinder extends AppCompatActivity {
    EditText editTextCylinderR;
    EditText editTextCylinderH;
    TextView textViewCylinder;
    Button buttonCylinder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylinder);
        editTextCylinderR = findViewById(R.id.editTextCylinderR);
        editTextCylinderH = findViewById(R.id.editTextCylinderH);
        textViewCylinder = findViewById(R.id.textViewCylinder);
        buttonCylinder = findViewById(R.id.btnCylinder);

        buttonCylinder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double radius =Double.parseDouble(editTextCylinderR.getText().toString());
                double height =Double.parseDouble(editTextCylinderH.getText().toString());
                double volume = (double) (3.14*radius*radius*height);
                textViewCylinder.setText("Volume is: "+volume);
            }
        });

    }
}