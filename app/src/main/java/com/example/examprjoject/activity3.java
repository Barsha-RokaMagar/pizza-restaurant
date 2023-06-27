package com.example.examprjoject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class activity3 extends AppCompatActivity {
    Button plus1, plus2, minus1, minus2, checkout1, checkout2;
    EditText edittxt1, edittxt2;
    TextView    price1, price2;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity3);
        plus1 = findViewById(R.id.plus1);
        plus2 = findViewById(R.id.plus2);
        minus1 = findViewById(R.id.minus1);
        minus2 = findViewById(R.id.minus2);
        checkout1 = findViewById(R.id.checkout1);
        checkout2 = findViewById(R.id.checkout2);
        edittxt1 = findViewById(R.id.edittxt1);
        edittxt2 = findViewById(R.id.edittxt2);
        price1 = findViewById(R.id.price1);
        price2 = findViewById(R.id.price2);

        plus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                edittxt1.setText(" " + count);

            }
        });
        minus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count <= 0) count = 0;
                else {
                    count--;
                    edittxt1.setText(" " + count);
                }
            }
        });

        plus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                edittxt2.setText(" " + count);

            }
        });
        minus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count <= 0) count = 0;
                else {
                    count--;
                    edittxt2.setText(" " + count);
                }
            }
        });

        checkout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int price1Value = 18;
                int editxt1Value =  Integer.parseInt(edittxt1.getText().toString().trim());
                int result = price1Value*editxt1Value;
// getting value from user

               Intent intent = new Intent(activity3.this, activity4.class);
               Bundle b = new Bundle();
                b.putInt("key",result);
               intent.putExtras(b);
               startActivity(intent);
              //  finish();
            }



        });


        checkout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int price1Value = 15;
                int editxt2Value =  Integer.parseInt(edittxt2.getText().toString().trim());
                int result = price1Value*editxt2Value;


                Intent intent = new Intent(activity3.this, activity4.class);
                Bundle b = new Bundle();
                b.putInt("key",result);
                intent.putExtras(b);
                startActivity(intent);
                //  finish();
            }



        });

    }
}