package com.example.fragmentsqlite.ui_producto;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fragmentsqlite.AdapaterProducto.adapterProductoL;
import com.example.fragmentsqlite.DB.AdminSQLiteOpenHelper;
import com.example.fragmentsqlite.R;
import com.example.fragmentsqlite.model.Producto;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentListaProducto#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentListaProducto extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentListaProducto() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentListaProducto.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentListaProducto newInstance(String param1, String param2) {
        FragmentListaProducto fragment = new FragmentListaProducto();
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
    AdminSQLiteOpenHelper admin;
    List<Producto> proudcList;
    adapterProductoL productoAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_lista_producto, container, false);
        admin = new AdminSQLiteOpenHelper(getContext(), "administracion", null, 1);

        //recycleyView
        RecyclerView re = view.findViewById(R.id.listaProductoRecycleyView);
        re.setLayoutManager(new LinearLayoutManager(getContext()));
        proudcList = getAllProductos();
        productoAdapter = new adapterProductoL(proudcList);
        re.setAdapter(productoAdapter);

        return view;
    }


    public List<Producto> getAllProductos() {
        List<Producto> productosList = new ArrayList<>();

        String selectQuery = "SELECT * FROM articulo";
        admin = new AdminSQLiteOpenHelper(getContext(), "administracion", null, 1);
        SQLiteDatabase db = admin.getWritableDatabase();

        Cursor cursor = db.rawQuery(selectQuery, null);

        if (cursor.moveToFirst()) {
            do {
                int id = cursor.getInt(0);
                String descripcion = cursor.getString(1);
                double precio = cursor.getDouble(2);

                Producto producto = new Producto(id, descripcion, precio);
                productosList.add(producto);
            } while (cursor.moveToNext());
        }

        cursor.close();
        db.close();

        return productosList;
    }
}