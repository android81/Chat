package com.tom.chat;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

public class ChatService extends Service {
    ChatBinder mBinder = new ChatBinder();
    public class ChatBinder extends Binder {
        public ChatService getService(){
            return ChatService.this;
        }
    }

    public ChatService() {
    }
    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }
    public void sendMessage(String message){
        Log.d("ChatService", "sendMessage:"+message);
    }
    public void deleteMessage(){
        Log.d("ChatService", "deleteMessage");
    }
}
