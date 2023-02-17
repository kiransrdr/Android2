package com.example.dell.viewstest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class GridView_BaseAdapter extends AppCompatActivity {
    GridView simpleGrid;
    int logos[] = {R.drawable.mess, R.drawable.map, R.drawable.google, R.drawable.cont,
            R.drawable.camera, R.drawable.cont, R.drawable.alarm, R.drawable.mess, R.drawable.map,
            R.drawable.google, R.drawable.cont, R.drawable.camera, R.drawable.alarm};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view__base_adapter);
        simpleGrid = (GridView) findViewById(R.id.simpleGridView); // init GridView
        // Create an object of CustomAdapter and set Adapter to GirdView
        GridLayoutCustomAdapter customAdapter = new GridLayoutCustomAdapter(getApplicationContext(), logos);
        simpleGrid.setAdapter(customAdapter);

    }
}
