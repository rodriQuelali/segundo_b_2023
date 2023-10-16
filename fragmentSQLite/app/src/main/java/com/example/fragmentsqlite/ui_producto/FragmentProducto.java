package com.example.fragmentsqlite.ui_producto;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.fragmentsqlite.DB.AdminSQLiteOpenHelper;

import com.example.fragmentsqlite.R;
import com.example.fragmentsqlite.model.Producto;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentProducto#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentProducto extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentProducto() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentProducto.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentProducto newInstance(String param1, String param2) {
        FragmentProducto fragment = new FragmentProducto();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    Producto res1;
    AdminSQLiteOpenHelper admin;
    private EditText txtC,txtD,txtP;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_producto, container, false);
        txtC = view.findViewById(R.id.txtCodigo);
        txtD = view.findViewById(R.id.txtDescrip);
        txtP = view.findViewById(R.id.txtPrecio);

        Button btnRe = view.findViewById(R.id.btnGuardar);
        Button btnEli = view.findViewById(R.id.btnEliminar);

        //DB
        admin = new AdminSQLiteOpenHelper(getContext(), "administracion", null, 1);
                btnRe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQLiteDatabase db = admin.getWritableDatabase();
                res1 = new Producto(Integer.parseInt(txtC.getText().toString()), txtD.getText().toString(), Double.parseDouble(txtP.getText().toString()));
                String cod = String.valueOf(res1.getCod());
                String descri = res1.getDescripcion();
                String precio = String.valueOf(res1.getPrecio());
                ContentValues registro = new ContentValues();
                registro.put("codigo", cod);
                registro.put("descripcion", descri);
                registro.put("precio", precio);
                db.insert("articulo",null, registro);
                db.close();
                Toast.makeText(getContext(), "SE GUARDO CORRECTAMENTE....", Toast.LENGTH_SHORT).show();
            }
        });

                //eliminar
        btnEli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQLiteDatabase db = admin.getWritableDatabase();
                Producto PrE = new Producto(Integer.parseInt(txtC.getText().toString()));
                String cod = String.valueOf(PrE.getCod());


            }
        });
        return view;
    }

    public void guardar(View v){

        /*AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(getContext(), "administracion", null, 1);
        SQLiteDatabase db = admin.getWritableDatabase();
        String cod = "";
        String descri = "";
        String precio = "";
        ContentValues registro = new ContentValues();
        registro.put("codigo", cod);
        registro.put("descripcion", descri);
        registro.put("precio", precio);
        db.insert("articulo",null, registro);
        db.close();
        Toast.makeText(getContext(), "SE GUARDO CORRECTAMENTE....", Toast.LENGTH_SHORT).show();*/

    }


}