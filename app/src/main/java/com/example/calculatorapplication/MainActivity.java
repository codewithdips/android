package com.example.calculatorapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.BreakIterator;

public class MainActivity<TextViev> extends AppCompatActivity {

      Button btn_add,btn_sub,btn_mult,btn_div;
      TextViev  txt_Ans;
      EditText et1,et2;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        Button btn_add = findViewById(R.id.btn_add);
        Button btn_sub = findViewById(R.id.btn_sub);
        Button btn_mult = findViewById(R.id.btn_mult);
        Button btn_div = findViewById(R.id.btn_div);
        View txt_Ans = findViewById(R.id.txt_Ans);


        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(et1.getText().toString());
                int num2 = Integer.parseInt(et2.getText().toString());
                 Toast.makeText(MainActivity.this,(num1+num2)+"",
                 Toast.LENGTH_SHORT).show();
                txt_Ans.setTextAlignment((num1 + num2));
            }
        });
        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1=Integer.parseInt(et1.getText().toString());
                int num2=Integer.parseInt(et2.getText().toString());
                //Toast.makeText(MainActivity.this,(num1-num2)+"",
                      //  Toast.LENGTH_SHORT).show();
                txt_Ans.setTextAlignment((num1-num2));
            }
        });
        btn_mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1=Integer.parseInt(et1.getText().toString());
                int num2=Integer.parseInt(et2.getText().toString());
               // Toast.makeText(MainActivity.this,(num1*num2)+"",
                      //  Toast.LENGTH_SHORT).show();
                txt_Ans.setTextAlignment((num1*num2));
            }
        });
        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1=Integer.parseInt(et1.getText().toString());
                int num2=Integer.parseInt(et2.getText().toString());
               // Toast.makeText(MainActivity.this,(num1/num2)+"",
                       // Toast.LENGTH_SHORT).show();
                txt_Ans.setTextAlignment((num1/num2));
            }
        });
    }

        }

