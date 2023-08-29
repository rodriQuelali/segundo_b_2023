package com.example.listarray;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
<<<<<<< HEAD
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

=======
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;
>>>>>>> 8e4ab8766d96a3f9b51af5d2e94a60a08b8f1f7f

public class MainActivity extends AppCompatActivity {

    String pais [] = {"Boliva", "Peru", "Argentina", "Colombia"};

    String empleado [] = {"alan", "ximena", "adriana", "Alex"};
    String sueldo [] = {"1000", "3000", "4500", "1500"};
    Spinner sp;

    ListView lsEm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp = (Spinner) findViewById(R.id.spPais);
        lsEm = (ListView) findViewById(R.id.listEmpleados);

        ArrayAdapter<String> apt = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,pais);
        sp.setAdapter(apt);
        ArrayAdapter<String> aptEmp = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,empleado);
        lsEm.setAdapter(aptEmp);

<<<<<<< HEAD
        lsEm.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int con, long po) {
                System.out.println("El nombre empleado: " + lsEm.getItemAtPosition(con) + "----->" + po);
                //Toast.makeText(MainActivity.this, "El nombre empleado: " + lsEm.getItemAtPosition(i) + "----->" + l, Toast.LENGTH_SHORT).show();
            }
        });



=======
>>>>>>> 8e4ab8766d96a3f9b51af5d2e94a60a08b8f1f7f
    }
}