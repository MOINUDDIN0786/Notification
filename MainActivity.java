package com.example.notification;

import
        androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.os.Bundle;
import android.view.View;

import com.example.notification.utils.Utils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        public void createNotification (View v){
            createFirstNotification();

        }
        private void createFirstNotification () {
            NotificationCompat.Builder builder = new NotificationCompat.Builder(this, Utils.FIRST_CHANNEL_ID)
                    .setSmallIcon(R.mipmap.ic_launcher)
                    .setContentTitle(Utils.FIRST_NOTIFICATION_TITLE)
                    .setContentText(Utils.FIRST_NOTIFICATION_DESC)
                    .setPriority(NotificationCompat.PRIORITY_DEFAULT);

            NotificationManagerCompat managerCompat = NotificationManagerCompat.from(this);
            managerCompat.notify(Utils.FIRST_NOTIFICATION_ID, builder.build());
        }
    }

