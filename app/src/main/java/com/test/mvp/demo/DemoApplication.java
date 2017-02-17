package com.test.mvp.demo;

import android.app.Application;
import android.content.Context;

/**
 * Created by Arun Pillai on 2/17/2017.
 */

public class DemoApplication extends Application {
    private static DemoApplication demoApplication;
    @Override
    public void onCreate() {
        super.onCreate();
        demoApplication = (DemoApplication) getApplicationContext();
    }

    public static Context getDemoApplication() {
        return demoApplication.getApplicationContext();
    }
}
