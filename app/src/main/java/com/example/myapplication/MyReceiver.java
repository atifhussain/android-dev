package com.example.myapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    String msg = "Android : ";
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Intent Detected.", Toast.LENGTH_LONG).show();
        Log.d(msg, "The Custom intent broadcast received: step : com.myapplication.CUSTOM_INTENT : context : " + context + " : intent" + intent);
    }
}