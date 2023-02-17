package com.example.dell.viewstest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class List_View_arrayadapter extends AppCompatActivity {
    ListView list1;
    String countrylist[]=  {"isb","Atd","lahore","karachi","Peshawar","Quetta","Haripur","Rawalpindi","Gujrawala"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list__view_arrayadapter);
        list1=(ListView)findViewById(R.id.listview);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,R.layout.activity_list_view,R.id.tv,countrylist);
        list1.setAdapter(arrayAdapter);

    }
}
