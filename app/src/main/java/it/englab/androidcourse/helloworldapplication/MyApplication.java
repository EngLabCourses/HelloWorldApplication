package it.englab.androidcourse.helloworldapplication;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

/**
 * Created by spawn on 05/02/17.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        if (LeakCanary.isInAnalyzerProcess(this)) {
            // This process is dedicated to LeakCanary for heap analysis.
            // You should not init your app in this process.
            return;
        }
        LeakCanary.install(this);
    }
}
