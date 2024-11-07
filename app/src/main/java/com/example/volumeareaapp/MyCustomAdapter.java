package com.example.volumeareaapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MyCustomAdapter extends ArrayAdapter<Shape> {

    private ArrayList<Shape> shapeArrayList;
    Context context;

    public MyCustomAdapter(ArrayList<Shape> shapeArrayList, Context context) {
        super(context, R.layout.grid_view_layout, shapeArrayList);
        this.shapeArrayList = shapeArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Shape shapes = getItem(position);
        ViewHolder viewHolder;
        if(convertView == null){
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.grid_view_layout, parent, false);
            viewHolder.shapeImage = (ImageView) convertView.findViewById(R.id.imgView);
            viewHolder.shapeName = (TextView) convertView.findViewById(R.id.txtView);
            convertView.setTag(viewHolder);
        }
        else{
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.shapeName.setText(shapes.getShapeName());
        viewHolder.shapeImage.setImageResource(shapes.getShapeImage());
        return convertView;
    }

    static class ViewHolder{
        ImageView shapeImage;
        TextView shapeName;
    }
}
