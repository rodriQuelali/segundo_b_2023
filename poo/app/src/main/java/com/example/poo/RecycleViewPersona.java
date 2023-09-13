package com.example.poo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.poo.adapter.adapterListaPersona;
import com.example.poo.clases.Persona;

import java.util.ArrayList;

public class RecycleViewPersona extends AppCompatActivity {

    RecyclerView recyViewPersonaView;
    ArrayList<Persona> vitaliano;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view_persona);
        recyViewPersonaView = (RecyclerView) findViewById(R.id.recyclerViewPersona);
        recyViewPersonaView.setLayoutManager(new LinearLayoutManager(this));
        vitaliano =new ArrayList<>();
        vitaliano.add(new Persona("VITALIANO"));
        vitaliano.add(new Persona("RODRIGO"));
        vitaliano.add(new Persona("VITALIANO"));
        vitaliano.add(new Persona("RONALD"));
        vitaliano.add(new Persona("VITALIANO"));



        adapterListaPersona adapterVi = new adapterListaPersona(vitaliano);
        adapterVi.setOnClickListener(new adapterListaPersona.OnItemClickListener() {
            @Override
            public void onItemClick(int posicion, Persona persona) {

                Intent  i = new Intent(RecycleViewPersona.this, MainActivity.class);

                Toast.makeText(RecycleViewPersona.this, "Persona: "+persona.getName() +" Posiscion: "+ posicion, Toast.LENGTH_SHORT).show();

            }
        });
        recyViewPersonaView.setAdapter(adapterVi);
    }
}