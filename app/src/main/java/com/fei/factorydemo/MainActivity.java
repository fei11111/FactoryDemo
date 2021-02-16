package com.fei.factorydemo;

import android.os.Bundle;
import android.view.View;

import com.fei.factorydemo.simple1.PreferenceUtils;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PreferenceUtils.getInstance().saveString("name", "fei").saveString("age", "17").commit();
    }

    public void click(View view) {
        PreferenceUtils.getInstance().getString("name", "");

    }
}