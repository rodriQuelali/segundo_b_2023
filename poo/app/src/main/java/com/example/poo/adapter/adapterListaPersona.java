package com.example.poo.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.poo.R;
import com.example.poo.clases.Persona;

import java.util.ArrayList;

public class adapterListaPersona extends RecyclerView.Adapter<adapterListaPersona.listaPersonaHolder> {

    ArrayList<Persona> listPersona;

    public adapterListaPersona(ArrayList<Persona> listPersona) {
        this.listPersona = listPersona;
    }

    //conexion ami diseño
    @NonNull
    @Override
    public adapterListaPersona.listaPersonaHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.lista_persona_diseno, null, false);

        return new listaPersonaHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull adapterListaPersona.listaPersonaHolder holder, int position) {
        holder.tvAdapterPersona.setText(listPersona.get(position).getName());
    }

    //tamaño
    @Override
    public int getItemCount() {
        return listPersona.size();
    }

    // conectar con clase R.
    public class listaPersonaHolder extends RecyclerView.ViewHolder {
        TextView tvAdapterPersona;
        public listaPersonaHolder(@NonNull View itemView) {
            super(itemView);
            tvAdapterPersona = itemView.findViewById(R.id.tvListaPersonaDiseno);
        }
    }
}
