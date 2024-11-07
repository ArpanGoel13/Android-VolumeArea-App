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

public class Cuboid extends AppCompatActivity {
    EditText editTextCuboidL;
    EditText editTextCuboidH;
    EditText editTextCuboidB;
    TextView textViewCuboid;
    Button buttonCuboid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuboid);
        editTextCuboidL = findViewById(R.id.editTextCuboidL);
        editTextCuboidH = findViewById(R.id.editTextCuboidH);
        editTextCuboidB = findViewById(R.id.editTextCuboidB);

        textViewCuboid = findViewById(R.id.textViewCuboid);
        buttonCuboid = findViewById(R.id.btnCuboid);


        buttonCuboid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double length =Double.parseDouble(editTextCuboidL.getText().toString());
                double height =Double.parseDouble(editTextCuboidH.getText().toString());
                double breadth =Double.parseDouble(editTextCuboidB.getText().toString());
                double volume = (double) (length*height*breadth);
                textViewCuboid.setText("Volume is: "+volume);
            }
        });

    }
}