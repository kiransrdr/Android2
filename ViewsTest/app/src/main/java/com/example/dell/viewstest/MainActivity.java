package com.example.dell.viewstest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        }

    public void arrayadapter_listview_onClick(View view){
        Intent i=new Intent(this, List_View_arrayadapter.class);
        startActivity(i);
    }

    public void baseadapter_listview_onClick(View view){
        Intent i=new Intent(this, Listview_Baseadapter.class);
        startActivity(i);
    }

    public void gridlayout_Arrayadapter_Onclick(View v){
        Intent i=new Intent(this, Grid_Layout_Arrayadapter.class);
        startActivity(i);
    }

    public void gridlayout_Baseadapter_Onclick(View v){
        Intent i=new Intent(this, GridView_BaseAdapter.class);
        startActivity(i);
    }

    public void gridlayout_CustomArrayadapter_Onclick(View v){
        Intent i=new Intent(this, GridView_CustomArrayAdapter.class);
        startActivity(i);

    }
}
