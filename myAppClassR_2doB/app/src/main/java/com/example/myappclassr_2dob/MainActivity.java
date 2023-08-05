package com.example.myappclassr_2dob;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText txt1,txt2;
    TextView tvR;
    Button btns;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1 = (EditText) findViewById(R.id.num_1);
        txt2 = (EditText) findViewById(R.id.num_2);
        tvR = (TextView) findViewById(R.id.tvResult);

        btns = (Button) findViewById(R.id.btnSumar);
        btns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a,b,s;
                a=Integer.parseInt(txt1.getText().toString());
                b=Integer.parseInt(txt2.getText().toString());
                s=a+b;
                tvR.setText(String.valueOf(s));
            }
        });
    }

    public void suma(View v){
        int a,b,s;
        a=Integer.parseInt(txt1.getText().toString());
        b=Integer.parseInt(txt2.getText().toString());
        s=a+b;
        tvR.setText(String.valueOf(s));
    }
}