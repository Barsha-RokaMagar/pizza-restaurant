package com.example.examprjoject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class activity1 extends AppCompatActivity {
    Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1);

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent1 = new Intent(activity1.this, activity2.class);
                startActivity(intent1);
                finish();

            }
        }, 3000);


    }
}