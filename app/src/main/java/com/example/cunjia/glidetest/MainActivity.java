package com.example.cunjia.glidetest;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.mainFragmentContainer);
        Log.d("ZJL","start");
        if (fragment == null){
            Log.d("ZJL","fragment");
            fragment = new MainUiFragment();
            fm.beginTransaction().add(R.id.mainFragmentContainer,fragment).commit();
        }
    }
}
