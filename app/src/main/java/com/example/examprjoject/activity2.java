package com.example.examprjoject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class activity2 extends AppCompatActivity {
    EditText edit1, edit2;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
         edit1 = findViewById(R.id.edit1);
         edit2 = findViewById(R.id.edit2);
         btn = findViewById(R.id.btn);

         btn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Toast.makeText(activity2.this, "Welcome" +edit1.getText().toString(), Toast.LENGTH_SHORT).show();
                 {
                     Intent intent2 = new Intent(activity2.this, activity3.class);
                     startActivity(intent2);
                 }
             }
         });
    }
}