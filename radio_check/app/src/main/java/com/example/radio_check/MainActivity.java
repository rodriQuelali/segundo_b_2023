package com.example.radio_check;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txt1,txt2;
    CheckBox ch,ch2;
    int vl, vl2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1 = (EditText) findViewById(R.id.txt1);
        txt2 = (EditText) findViewById(R.id.txt2);

        RadioButton rb1 = (RadioButton) findViewById(R.id.rbSuma);
        RadioButton rb2 = (RadioButton) findViewById(R.id.rbResta);

        ch = (CheckBox) findViewById(R.id.chMulti);
        ch2 = (CheckBox) findViewById(R.id.chDiv);

        Button btnR = (Button) findViewById(R.id.btnR);
        //dos forma para hacer el evento click en. id.addListener.... , function(){} ---> onclick

        btnR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               vl = Integer.parseInt(txt1.getText().toString());
               vl2 = Integer.parseInt(txt2.getText().toString());
               if(rb1.isChecked() == true){
                   System.out.println("suma:--------->" + String.valueOf(vl + vl2));
                   Toast.makeText(MainActivity.this, "La suma es: "+ String.valueOf(vl + vl2), Toast.LENGTH_SHORT).show();
               } else if (rb2.isChecked() == true) {
                   Toast.makeText(MainActivity.this, "La Resta es: "+ String.valueOf(vl - vl2), Toast.LENGTH_SHORT).show();
               }
            }
        });

    }

    //para check
    public void chackE(View v){

        vl = Integer.parseInt(txt1.getText().toString());
        vl2 = Integer.parseInt(txt2.getText().toString());
        if(ch.isChecked() == true){
            System.out.println("suma:--------->" + String.valueOf(vl * vl2));
            Toast.makeText(MainActivity.this, "La Multiplicacion es: "+ String.valueOf(vl * vl2), Toast.LENGTH_SHORT).show();
        }

        if(ch2.isChecked() == true){
            Toast.makeText(MainActivity.this, "La Division es: "+ String.valueOf(vl / vl2), Toast.LENGTH_SHORT).show();
        }
    }
}