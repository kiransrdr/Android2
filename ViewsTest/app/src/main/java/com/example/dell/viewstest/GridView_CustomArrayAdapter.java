package com.example.dell.viewstest;

import android.content.ClipData;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;


import java.util.ArrayList;

public class GridView_CustomArrayAdapter extends AppCompatActivity {
    GridView glayout;
    ArrayList birdList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view__custom_array_adapter);
        glayout = (GridView) findViewById(R.id.simpleGridView);
        birdList.add(new item("Bird 1",R.drawable.alarm));
        birdList.add(new item("Bird 2",R.drawable.camera));
        birdList.add(new item("Bird 3",R.drawable.cont));
        birdList.add(new item("Bird 4",R.drawable.google));
        birdList.add(new item("Bird 5",R.drawable.map));
        birdList.add(new item("Bird 6",R.drawable.mess));

        MyAdapter myAdapter=new MyAdapter(this,R.layout.activity_grid_view__custom_arrayadapter_items,birdList);
        glayout.setAdapter(myAdapter);
    }
}
