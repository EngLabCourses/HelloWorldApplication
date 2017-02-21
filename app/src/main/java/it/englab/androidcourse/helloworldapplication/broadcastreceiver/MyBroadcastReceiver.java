package it.englab.androidcourse.helloworldapplication.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by spawn on 06/02/17.
 */

public class MyBroadcastReceiver extends BroadcastReceiver {

    private static final String TAG = MyBroadcastReceiver.class.getSimpleName();

    @Override
    public void onReceive(Context context, Intent intent) {
        //recuperiamo l'action dell'evento ricevuto per poi implementare logiche specifiche in base all'azione ricevuta
        String action = intent.getAction();
        //il receiver riceve eventi con action ACTION_BOOT_COMPLETED o ACTION_AIRPLANE_MODE_CHANGED
        if (Intent.ACTION_BOOT_COMPLETED.equals(action)) {
            Log.d(TAG, "ACTION_BOOT_COMPLETED");
        } else if (Intent.ACTION_AIRPLANE_MODE_CHANGED.equals(action)) {
            Log.d(TAG, "ACTION_AIRPLANE_MODE_CHANGED");
        }
    }

}
