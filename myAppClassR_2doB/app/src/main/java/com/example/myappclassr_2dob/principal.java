package com.example.myappclassr_2dob;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        Button btn = (Button) findViewById(R.id.btnPali);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(principal.this, palindromo.class);
                startActivity(i);
            }
        });
    }

    public void llam(View v){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}