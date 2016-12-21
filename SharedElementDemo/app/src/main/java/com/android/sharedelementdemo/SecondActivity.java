package com.android.sharedelementdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

public class SecondActivity extends AppCompatActivity {
    ImageView img1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        img1 = (ImageView) findViewById(R.id.img1);
        if (getIntent() != null && getIntent().getExtras() != null) {
            if (getIntent().getIntExtra("image_name", 1) == 2)
                img1.setImageResource(R.drawable.random_user_13);
            else
                img1.setImageResource(R.drawable.random_user_01);

        }

    }

}
