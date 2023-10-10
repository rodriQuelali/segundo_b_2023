package com.example.fragmentsqlite.model;

public class Producto {
    private int codigo;
    private String descripcion;
    private double precio;

    //metodos

    //set and get

    public int getCod() {
        return codigo;
    }

    public void setCod(int cod) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
