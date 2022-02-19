package com.example.notification.App;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;

import com.example.notification.utils.Utils;

public class NotificationExercise extends Application {
    @Override
    public void onCreate(){
        super.onCreate();
        createNotification();
    }
    private void createNotification(){

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            NotificationChannel channel=new NotificationChannel(Utils.FIRST_CHANNEL_ID,
                    Utils.FIRST_CHANNEL_NAME, NotificationManager.IMPORTANCE_DEFAULT);
            channel.setDescription(Utils.FIRST_CHANNEL_DESC);
            NotificationManager manager=getSystemService(NotificationManager.class);
            manager.createNotificationChannel(channel);
        }

    }
}
