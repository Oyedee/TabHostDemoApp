package com.example.tabhostdemoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TabHost;

public class TabHostSecondMethodImplementation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_host_second_method_implementation);

        TabHost tabHost = findViewById(R.id.tabHost1);
        tabHost.setup();

        //Tab one
        TabHost.TabSpec spec = tabHost.newTabSpec("one");
        spec.setIndicator("Tab One");
        spec.setContent(R.id.tab1);
        tabHost.addTab(spec);

        //Tab Two
        spec = tabHost.newTabSpec("Two");
        spec.setIndicator("", getDrawable(R.drawable.ic_baseline_account_circle_24));
        spec.setContent(R.id.tab2);
        tabHost.addTab(spec);

        //tab Three
        spec = tabHost.newTabSpec("Three");
        spec.setIndicator("", getDrawable(R.drawable.ic_baseline_archive_24));
        spec.setContent(R.id.tab3);
        tabHost.addTab(spec);
    }
}