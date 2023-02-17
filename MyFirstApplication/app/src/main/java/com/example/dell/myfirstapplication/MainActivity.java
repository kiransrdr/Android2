package com.example.dell.myfirstapplication;

import android.app.DownloadManager;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.provider.AlarmClock;
import android.provider.CalendarContract;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.File;

import static com.example.dell.myfirstapplication.R.id.text;

public class MainActivity extends AppCompatActivity {
    Intent implicitintent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        implicitintent =new Intent();
    }
    public void search(View view){
        implicitintent.setAction(Intent.ACTION_VIEW);
        implicitintent.setData(Uri.parse("http://www.google.com"));
        startActivity(implicitintent);
    }
    public void dial(View view){
        implicitintent.setAction(Intent.ACTION_VIEW);
        implicitintent.setData(Uri.parse("tel: 03354456765"));
        startActivity(implicitintent);
    }
    public void sms(View view){
        implicitintent.setAction(Intent.ACTION_VIEW);
        implicitintent.setData(Uri.parse("smsto: 03354456765"));
        implicitintent.putExtra("sms_body", "text here");
        startActivity(implicitintent);
    }

    public void call(View view){
        implicitintent.setAction(Intent.ACTION_DIAL);
        implicitintent.setData(Uri.parse("tel: 03354456765"));
        startActivity(implicitintent);
    }
    public void streetviewmap(View view){
        implicitintent.setAction(Intent.ACTION_VIEW);
        implicitintent.setData(Uri.parse("google.streetview:cbll=46.414382,10.013988"));
        startActivity(implicitintent);
    }
    public void viewcontacts(View view){
        implicitintent.setAction(android.content.Intent.ACTION_VIEW);
        implicitintent.setData(ContactsContract.Contacts.CONTENT_URI);
        startActivity(implicitintent);
    }
    public void viewmap(View view){
        implicitintent.setAction(Intent.ACTION_VIEW);
        implicitintent.setData(Uri.parse("geo:0,0?q=37.423156,-122.084917 "));
        startActivity(implicitintent);
    }
    public void viewgallery(View view){
        Intent intent = new Intent();
        intent.setAction(android.content.Intent.ACTION_GET_CONTENT);
        intent.setType("image/*");
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
    public void viewcalculator(View view){
         implicitintent.setClassName("com.android.calculator2",
                "com.android.calculator2.Calculator");
        startActivity(implicitintent);

    }
    public void openmediaplayer(View view){
        Intent implicitintent = new Intent("android.intent.action.MUSIC_PLAYER");
        startActivity(implicitintent);

    }
    public void wallpaper(View view) {
        Intent intent = new Intent(Intent.ACTION_SET_WALLPAPER);
        startActivity(Intent.createChooser(intent, "Select Wallpaper"));
        startActivity(intent);
    }
    public void opencamera(View view){
       // Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        //startActivity(intent);
        Intent intent=new Intent(MediaStore.INTENT_ACTION_STILL_IMAGE_CAMERA);
        startActivity(intent);
    }

    public void openinbox(View view){
        Intent calIntent = new Intent(Intent.ACTION_MAIN);
        calIntent.addCategory(Intent.CATEGORY_APP_MESSAGING);
        startActivity(calIntent);
    }
    public void sendmail(View view)
    {
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.setType("text/plain");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, "example@gmail.com");
        emailIntent.putExtra(Intent.EXTRA_CC, "example@gmail.com");
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, " subject here");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "Email message  here");
        startActivity(Intent.createChooser(emailIntent, "Send mail..."));

    }
    public  void opensetting(View view){
        /**/
        startActivityForResult(new Intent(android.provider.Settings.ACTION_SETTINGS), 0);
    }
    public void opencalndr(View view){
        Intent calIntent = new Intent(Intent.ACTION_MAIN);
        calIntent.addCategory(Intent.CATEGORY_APP_CALENDAR);
        startActivity(calIntent);
    }
    public void setpassword(View view){
        Intent intent = new Intent(DevicePolicyManager.ACTION_SET_NEW_PASSWORD);
        startActivity(intent);
    }
    public void openmailbox(View view){
        Intent calIntent = new Intent(Intent.ACTION_MAIN);
        calIntent.addCategory(Intent.CATEGORY_APP_EMAIL);
        startActivity(calIntent);
    }
    public void recordvideo(View view){
        final int VIDEO = 1;
        Intent intent = new Intent();
        intent.setClassName("com.android.camera","com.android.camera.VideoCamera");
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivityForResult(intent, VIDEO );
    }
    public void downloads(View view)
    {
        startActivity(new Intent(DownloadManager.ACTION_VIEW_DOWNLOADS));
    }
}
