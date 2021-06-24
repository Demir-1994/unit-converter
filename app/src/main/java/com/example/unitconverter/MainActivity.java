package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void kmToMilesClick(View view) {
        Intent intent = new Intent(this, kmToMilesActivity.class);
        startActivity(intent);
    }

    public void inchesToCmClick(View view) {
        Intent intent = new Intent(this, inchesToCmActivity.class);
        startActivity(intent);
    }
}