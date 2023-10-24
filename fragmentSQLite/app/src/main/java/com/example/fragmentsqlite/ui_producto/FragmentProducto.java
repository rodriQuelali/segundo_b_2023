package com.example.fragmentsqlite.ui_producto;

import android.content.ContentValues;
import android.database.Cursor;
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

import com.example.fragmentsqlite.DB.productoSQLIte;
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
        Button btnConsulta = view.findViewById(R.id.btnBusqueda);


        //DB

                btnRe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //SQLiteDatabase db = admin.getWritableDatabase();
                res1 = new Producto(Integer.parseInt(txtC.getText().toString()), txtD.getText().toString(), Double.parseDouble(txtP.getText().toString()));
                productoSQLIte insPro = new productoSQLIte(getContext());
                int stackinsert = insPro.insertProduc(res1);
                if(stackinsert == 1){
                    Toast.makeText(getContext(), "SE GUARDO CORRECTAMENTE....", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(getContext(), "NOOOOO..... SE GUARDO CORRECTAMENTE....", Toast.LENGTH_SHORT).show();
                }

                /*String cod = String.valueOf(res1.getCod());
                String descri = res1.getDescripcion();
                String precio = String.valueOf(res1.getPrecio());
                ContentValues registro = new ContentValues();
                registro.put("codigo", cod);
                registro.put("descripcion", descri);
                registro.put("precio", precio);
                db.insert("articulo",null, registro);
                db.close();*/

            }
        });

                //eliminar
        btnEli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*SQLiteDatabase db = admin.getWritableDatabase();
                Producto PrE = new Producto(Integer.parseInt(txtC.getText().toString()));
                String cod = String.valueOf(PrE.getCod());
                ContentValues registro = new ContentValues();
                registro.put("codigo", cod);
                db.delete("articulo","codigo="+cod, null);
                db.close();
                Toast.makeText(getContext(), "Se elimino el PRODUCTO", Toast.LENGTH_SHORT).show();*/

            }
        });

        //consultas
        btnConsulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*SQLiteDatabase db = admin.getWritableDatabase();
                Producto eli = new Producto(Integer.parseInt(txtC.getText().toString()));
                String cod = String.valueOf(eli.getCod());
                String sqlCon = "SELECT * FROM articulo WHERE codigo=";
                Cursor fila = db.rawQuery(sqlCon + cod,null);
                if(fila.moveToFirst()){
                    Producto bus = new Producto(Integer.parseInt(fila.getString(0)), fila.getString(1),Double.parseDouble(fila.getString(2)));
                    Toast.makeText(getContext(), "IVA: " + bus.calIVA(), Toast.LENGTH_SHORT).show();
                    txtC.setText(String.valueOf(bus.getCod()));
                    txtC.setText(bus.getDescripcion());
                    txtC.setText(String.valueOf(bus.getPrecio()));
                }else{
                    Toast.makeText(getContext(), "NO hay datos del registro", Toast.LENGTH_SHORT).show();
                }
                db.close();*/
            }
        });

        return view;
    }





}