package com.example.dell.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Create_Class extends AppCompatActivity {

    EditText editText2;
    EditText editText3;
    EditText editText4;
    DBHelperClass db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create__class);

        db=new DBHelperClass(Create_Class.this);

        editText2=(EditText)findViewById(R.id.et2);
        editText3=(EditText)findViewById(R.id.et3);
        editText4=(EditText)findViewById(R.id.et4);

    }
    public void onInsert(View v) {
        Log.i("Tag",db.countData()+"");
       // String name = editText2.getText().toString();
        //String age = editText3.getText().toString();
        //String phone = editText4.getText().toString();
       // if (db.addData(name, age, phone)) {
           // Toast.makeText(Create_Class.this, db.countData(), Toast.LENGTH_LONG).show();
        //}
        //else {
          //  Toast.makeText(Create_Class.this, "insertion error ", Toast.LENGTH_LONG).show();
        //}
    }
}
