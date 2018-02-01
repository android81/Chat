package com.tom.chat;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {
    public MyService() {
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("MyService", "onStartCommand");
        Log.d("MyService", "下載檔案中...");
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Log.d("MyService", "下載完成");
            }
        }, 3000);
        Log.d("MyService", "onStartCommand將結束");
        return START_NOT_STICKY;
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
