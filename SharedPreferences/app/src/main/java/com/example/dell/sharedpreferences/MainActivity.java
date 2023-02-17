package com.example.dell.sharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.Map;
import java.util.Set;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    EditText editText2;
    public static final String email="";
    public static final String pass="";
    public static final String mypref="userinfo";
    SharedPreferences sp;
    SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=(EditText)findViewById(R.id.et1);
        editText2=(EditText)findViewById(R.id.et2);
        sp=getSharedPreferences(mypref, Context.MODE_PRIVATE);
        editor= sp.edit();
    }
    public void onSave(View view){
        String e=editText.getText().toString();
        String p=editText2.getText().toString();
        editor.putString(email,e);
        editor.putString(pass,p);
        editor.commit();

    }
    public void onClear(View view){
        editText.setText("");
        editText2.setText("");

    }
    public void onRetrieve(View view){
        if(sp.contains(email))
            editText.setText(sp.getString(email,"null"));
        if(sp.contains(pass))
            editText2.setText(sp.getString(pass,"null"));

    }
    public void onRemove(View view){
        editor.remove(email);
        editor.remove(pass);
        editor.commit();
    }
}
