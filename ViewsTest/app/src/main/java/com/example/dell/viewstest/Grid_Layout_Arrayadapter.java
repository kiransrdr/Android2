package com.example.dell.viewstest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridLayout;

public class Grid_Layout_Arrayadapter extends AppCompatActivity {
    String[] cities={"isb","lahore","rawalpindi","gilgit"};
    GridLayout gl1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid__layout__arrayadapter);
        gl1=(GridLayout)findViewById(R.id.gridlayout);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this, R.layout.activity_grid_list_view1,cities);
        //gl1.setAdapter(arrayAdapter);
    }
}
