package it.englab.androidcourse.helloworldapplication.activity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import it.englab.androidcourse.helloworldapplication.R;
import it.englab.androidcourse.helloworldapplication.broadcastreceiver.MyBroadcastReceiver;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getName();
    private MyBroadcastReceiver receiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //impostiamo il layout dell'activity
        setContentView(R.layout.activity_main);

        String logMessage = getString(R.string.hello_world_text);

        //log che sarà visibile come DEBUG in adb logcat
        Log.d(TAG, logMessage);
    }

    @Override
    protected void onResume() {
        super.onResume();

        //creiamo un IntentFilter per dare modo al nostro receiver di rispondere ad eventi di sistema
        IntentFilter intentFilter = new IntentFilter();
        //action per il quale il nostro receiver riceverà l'evento
        intentFilter.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED);
        //creiamo in nostro receiver
        receiver = new MyBroadcastReceiver();
        //registriamo il nostro receiver. Da questo momento riceverà l'evento con action = ACTION_AIRPLANE_MODE_CHANGED
        registerReceiver(receiver, intentFilter);
    }

    @Override
    protected void onPause() {
        //deregistriamo il nostro receiver. L'evento ACTION_AIRPLANE_MODE_CHANGED non sarà più ricevuto
        unregisterReceiver(receiver);
        super.onPause();
    }
}
