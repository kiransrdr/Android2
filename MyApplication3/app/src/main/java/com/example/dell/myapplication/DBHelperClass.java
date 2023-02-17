package com.example.dell.myapplication;

import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.TabHost;
import android.widget.Toast;

public class DBHelperClass extends SQLiteOpenHelper{
    private static final int version =1;
    private static  final String db_name="mydb";
    private static  final String table="Student";
    private static  final String col1="id";
    private static  final String col2="name";
    private static  final String col3="age";
    private static  final String col4="phone";

    public DBHelperClass(Context context) {
        super(context, db_name, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
    String sql="CREATE TABLE IF NOT EXISTS "+table+"("+ col1 +" iNTEGER PRIMARY kEY AUTOINCREMENT NOT NULL, "+col2+" text, "+ col3+" text, "+col4+ " TEXT)";
    db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    db.execSQL("DROP TABLE IF EXISTS "+table);
    }

    public boolean addData(String name, String age, String phone){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(col2,name);
        contentValues.put(col3,age);
        contentValues.put(col4,phone);
        db.insert(table,null,contentValues);
        return true;
    }

    public boolean updateData(String id,String name, String age, String phone){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(col2,name);
        contentValues.put(col3,age);
        contentValues.put(col4,phone);
        db.update(table,contentValues,id+" = ?",new String[]{id});
        return true;
    }

    public int countData(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cursor=db.rawQuery("SELECT COUNT(*) FROM "+ table,null);
        cursor.moveToFirst();
        int count= cursor.getInt(0);
        cursor.close();
        db.close();
        return count;
    }

    public void deleteById(String id){
        SQLiteDatabase db=this.getWritableDatabase();
        db.delete(table,"id =?",new String[]{id});
    }

    public void deleteAll(){
        SQLiteDatabase db=this.getWritableDatabase();
        db.delete(table,"1",null);
    }



}
