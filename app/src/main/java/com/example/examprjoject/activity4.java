package com.example.examprjoject;

import static com.example.examprjoject.R.id.last;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class activity4 extends AppCompatActivity {

    EditText totalPrice;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity4);

        Bundle b = getIntent().getExtras();
        int value = 0;
        if(b != null)
             value = b.getInt("key");

        Toast.makeText(this, "hello"+value, Toast.LENGTH_SHORT).show();

        totalPrice = findViewById(R.id.totalPrice);
        totalPrice.setText(String.valueOf(value));



//        last =findViewById(R.id.last);
//
//        last.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                Intent intent3 = getIntent();
//                int result = intent3.getIntExtra("result", 0);
//
//                last.setText("Result: " + result);
//
//            }
//        });



    }
}