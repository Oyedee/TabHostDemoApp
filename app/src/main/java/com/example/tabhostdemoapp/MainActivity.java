package com.example.tabhostdemoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityGroup;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends ActivityGroup {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = findViewById(R.id.tabHost);
        tabHost.setup(getLocalActivityManager());

        //this is the first tab
        TabHost.TabSpec spec = tabHost.newTabSpec("One");
        spec.setIndicator("Tab One");
        Intent intent = new Intent(MainActivity.this, FirstActivity.class);
        spec.setContent(intent);
        tabHost.addTab(spec);

        //this is the second tab
        spec = tabHost.newTabSpec("Two");
        spec.setIndicator("Tab Two");
        Intent intent1 = new Intent(MainActivity.this, SecondActivity.class);
        spec.setContent(intent1);
        tabHost.addTab(spec);

        //this is the third tab
        spec = tabHost.newTabSpec("Three");
        spec.setIndicator("Tab Three");
        Intent intent2 = new Intent(MainActivity.this, ThirdActivity.class);
        spec.setContent(intent2);
        tabHost.addTab(spec);
    }
}