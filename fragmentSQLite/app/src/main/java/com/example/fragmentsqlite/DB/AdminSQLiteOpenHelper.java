package com.example.fragmentsqlite.DB;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

final public class AdminSQLiteOpenHelper extends SQLiteOpenHelper {
    private final  String nameTable = "articulo";

    public AdminSQLiteOpenHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createProduc = "create table "+this.nameTable+"(codigo int primary key, descripcion text, precio real)";
        //String creausuario = "";
        db.execSQL(createProduc);
        //db.execSQL(creausuario);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    //consultas----



}
