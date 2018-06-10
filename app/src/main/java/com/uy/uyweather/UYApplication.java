package com.uy.uyweather;

import android.app.Application;
import android.content.Context;

import org.litepal.LitePal;

public class UYApplication extends Application {

    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        LitePal.initialize(this);
        init();
    }

    public static Context getContext(){
        return mContext;
    }

    private void init() {
        if(null == mContext){
            mContext =this.getApplicationContext();
        }
    }
}
