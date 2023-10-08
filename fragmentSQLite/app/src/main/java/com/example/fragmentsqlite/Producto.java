package com.example.fragmentsqlite;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fragmentsqlite.ui_producto.FragmentListaProducto;
import com.example.fragmentsqlite.ui_producto.FragmentProducto;

public class Producto extends AppCompatActivity {

    private Button btnPro, btnLispro;
    Fragment frgmP, frmLP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producto);
        btnPro = (Button) findViewById(R.id.btnProducto);
        btnLispro = (Button) findViewById(R.id.btnListaProducto);

        frgmP = new FragmentProducto();
        getSupportFragmentManager().beginTransaction().add(R.id.fragmentProducto, frgmP).commit();

        //para los botones
        btnPro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frgmP = new FragmentProducto();
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentProducto, frgmP).commit();
            }
        });
        btnLispro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frmLP = new FragmentListaProducto();
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentProducto, frmLP).commit();
            }
        });


    }
}