package com.example.dell.myservices;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button startbtn;
    Button stopbtn;
    Intent serviceI;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startbtn=(Button)findViewById(R.id.button);
        stopbtn=(Button)findViewById(R.id.button2);
        serviceI=new Intent(MainActivity.this,MyService.class);
    }

    public void onStartbtn(View view) {
        startService(serviceI);

    }
    public void onStopbtn(View view) {
        stopService(serviceI);

    }
}
