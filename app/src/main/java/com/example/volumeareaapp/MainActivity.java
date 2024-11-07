package com.example.volumeareaapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    ArrayList<Shape> shapeArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView = findViewById(R.id.gridView);
        shapeArrayList = new ArrayList<>();
        Shape shape1 = new Shape(R.drawable.circle,"Circle");
        Shape shape2 = new Shape(R.drawable.cube,"Cube");
        Shape shape3 = new Shape(R.drawable.cuboid,"Cuboid");
        Shape shape4 = new Shape(R.drawable.cylinder,"Cylinder");
        shapeArrayList.add(shape1);
        shapeArrayList.add(shape2);
        shapeArrayList.add(shape3);
        shapeArrayList.add(shape4);

        MyCustomAdapter adapter = new MyCustomAdapter(shapeArrayList, getApplicationContext());
        gridView.setAdapter(adapter);
        gridView.setNumColumns(2);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Shape shapes = (Shape)parent.getItemAtPosition(position);
                Intent i;
                if(shapes.getShapeImage()==R.drawable.circle){
                    i = new Intent(getApplicationContext(), Circle.class);
                    startActivity(i);
                }
                else if(shapes.getShapeImage()==R.drawable.cube){
                    i = new Intent(getApplicationContext(), Cube.class);
                    startActivity(i);
                }
                else if(shapes.getShapeImage()==R.drawable.cuboid){
                    i = new Intent(getApplicationContext(), Cuboid.class);
                    startActivity(i);
                }
                else if(shapes.getShapeImage()==R.drawable.cylinder){
                    i = new Intent(getApplicationContext(), Cylinder.class);
                    startActivity(i);
                }



            }
        });


    }
}