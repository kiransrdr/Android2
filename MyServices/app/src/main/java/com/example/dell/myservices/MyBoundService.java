package com.example.dell.myservices;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class MyBoundService extends Service {
    public MyBoundService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
    MyBoundService getservice()
    {
        return  MyBoundService.this;
    }

    public  String publicmsg()
    {

        return  "My Message...";
    }

    public  String publicmsg_2()
    {

        return  "This is Bond Service";
    }
}
