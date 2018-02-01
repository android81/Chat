package com.tom.chat;

import android.app.IntentService;
import android.content.Intent;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.text.format.DateFormat;
import android.util.Log;

/**
 * Created by tom on 2018/2/1.
 */

public class HelloIntentService extends IntentService {
    public static final String PARAM_MSG = "message";

    public HelloIntentService() {
        super("HelloIntentService");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        String msg = intent.getStringExtra(PARAM_MSG);
        SystemClock.sleep(3000);
        String debug = DateFormat.format(
                "hh:mm:ss", System.currentTimeMillis())
                + "\t" + msg;
        Log.d("HelloIntentService", debug);
    }
}
