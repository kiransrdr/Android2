package com.example.dell.viewstest;

import android.app.Activity;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.BaseAdapter;
import android.widget.ListView;

public class Listview_Baseadapter extends Activity {
    String countrylist[]=  {"isb","Atd","lahore","karachi","Peshawar","Quetta"};
    int flags[] = {R.drawable.alarm, R.drawable.camera, R.drawable.cont, R.drawable.google, R.drawable.map, R.drawable.mess};
    ListView lv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview__baseadapter);
        lv1=(ListView)findViewById(R.id.simpleListView);
        CustomAdapter baseAdapter=new CustomAdapter(getApplicationContext(), countrylist, flags);
        lv1.setAdapter(baseAdapter);
    }
}
