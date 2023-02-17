package com.example.dell.myservices;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class MyService extends Service {
    public MyService() {
    }
    final class myThread implements Runnable{
        int service_id;

        public myThread(int service_id) {
            this.service_id = service_id;
        }

        @Override
        public void run() {
            int i=0;
            while (i<100){
                try {
                    Log.i("Service in Progress__", String.valueOf(i));

                    i++;
                    wait(1000);
                } catch (Exception e)
                {}
            }
            stopSelf(service_id);
        }
    }
    @Override
    public IBinder onBind(Intent intent) {
        Toast.makeText(getApplicationContext(),"Bind Service Started...!!!", Toast.LENGTH_LONG).show();
        return null;
    }
    public void onCreate() {
        Toast.makeText(getApplicationContext(),"Service Created....!!!",Toast.LENGTH_LONG).show();
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        myThread myThread = new myThread(startId);
        Thread thread = new Thread(myThread);
        thread.start();
        Toast.makeText(getApplicationContext(),"Unbounded Service Started...!!!",Toast.LENGTH_LONG).show();
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        Toast.makeText(getApplicationContext(),"Service Destroyed....!!!",Toast.LENGTH_LONG).show();
        super.onDestroy();
    }
}
