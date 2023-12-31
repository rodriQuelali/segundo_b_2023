package com.example.fragmentsqlite.model;

public class Producto {
    private int codigo;
    private String descripcion;
    private double precio;

    public Producto(int codigo, String descripcion, double precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public Producto(int codigo) {
        this.codigo = codigo;
    }
//metodos
    public Double calIVA(){
        return this.precio * 0.13;
    }
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
