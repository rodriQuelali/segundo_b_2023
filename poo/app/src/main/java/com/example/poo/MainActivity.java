package com.example.poo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.poo.clases.Calculadora;


public class MainActivity extends AppCompatActivity {

    Calculadora casio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //la instancia de calulkadora
        casio = new Calculadora(2,5);
        System.out.println("Resultado: ------->"+casio.suma());

    }
}