package com.example.listarray;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class listasViews extends AppCompatActivity {

    private ArrayList<String> nombre;
    private ArrayAdapter<String> addAdap;
    EditText txtName;
    ListView listName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listas_views);

        txtName = (EditText) findViewById(R.id.txtAddName);
        listName = (ListView) findViewById(R.id.listName);

        //pore defecto se lista Hector
        nombre = new ArrayList<>();
        nombre.add("Hector");
        addAdap = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, nombre);
        listName.setAdapter(addAdap);


    }
    public void addName(View v){
        nombre.add(txtName.getText().toString());
        listName.setAdapter(addAdap);
    }
}