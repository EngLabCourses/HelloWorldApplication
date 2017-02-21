package it.englab.androidcourse.helloworldapplication.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class MyService extends Service {
    public MyService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();

        // TODO: Add code for Service
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        //metodo invocato da startService()
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public IBinder onBind(Intent intent) {
        //metodo invocato da bindService()
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
