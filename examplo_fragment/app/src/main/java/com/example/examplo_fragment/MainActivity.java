package com.example.examplo_fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import com.example.examplo_fragment.ui_fragment_carreras.PrincipalFragment;
import com.example.examplo_fragment.ui_fragment_carreras.RegistroCarreraFragment;

public class MainActivity extends AppCompatActivity {

    Fragment fragPrincipal, fragRegistro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragPrincipal = new PrincipalFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.fragment, fragPrincipal).commit();

    }

    public  void registro(View v){
        fragRegistro = new RegistroCarreraFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment, fragRegistro).commit();

    }

}