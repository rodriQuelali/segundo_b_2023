package com.example.fragmentsqlite.DB;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.fragmentsqlite.model.Producto;

public class productoSQLIte {
    private AdminSQLiteOpenHelper adminSQLiteOpenHelper;

    public productoSQLIte(Context context) {
        this.adminSQLiteOpenHelper = new  AdminSQLiteOpenHelper(context, "administracion", null, 1);
    }

    public int insertProduc(Producto a){
        try {
            SQLiteDatabase db = this.adminSQLiteOpenHelper.getWritableDatabase();
            String cod = String.valueOf(a.getCod());
            String descri = a.getDescripcion();
            String precio = String.valueOf(a.getPrecio());
            ContentValues registro = new ContentValues();
            registro.put("codigo", cod);
            registro.put("descripcion", descri);
            registro.put("precio", precio);
            db.insert("articulo",null, registro);
            db.close();
            return  1;
        }catch (Exception e){
            return 0;
        }

    }
    public int deletePro (Producto a){
        return 1;
    }

    public int updatePro (Producto a){
        return 1;
    }
}
