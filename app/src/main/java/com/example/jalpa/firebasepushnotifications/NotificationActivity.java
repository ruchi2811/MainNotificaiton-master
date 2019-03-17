package com.example.jalpa.firebasepushnotifications;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class NotificationActivity extends AppCompatActivity {

    private TextView mNotifData;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        String dataMessage = getIntent().getStringExtra("dataMessage");
        String dataFrom = getIntent().getStringExtra("dataFrom");

        mNotifData = (TextView) findViewById(R.id.notif_text);

        mNotifData.setText("FROM: " +dataFrom+ "| MESSAGE: " +dataMessage);
    }
}


