package com.example.homework08;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.homework08.adapter.LaunchSimpleAdapter;

public class LaunchSimpleActivity extends AppCompatActivity {

    private int[] lanuchImageArray = {R.drawable.ks1,
            R.drawable.ks2, R.drawable.ks3, R.drawable.ks4};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch_simple);


        ViewPager vp_launch = findViewById(R.id.vp_launch);

        LaunchSimpleAdapter adapter = new LaunchSimpleAdapter(this, lanuchImageArray);

        vp_launch.setAdapter(adapter);

        vp_launch.setCurrentItem(0);
    }
}