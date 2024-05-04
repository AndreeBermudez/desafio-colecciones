package com.bermudez.desafio.clases;

public class Productos implements Comparable<Productos>{
    private String nombreProducto;
    private double precioProducto;

    public Productos(String nombreProducto, double precioProducto) {
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    @Override
    public String toString() {
        return getNombreProducto() + " - " + getPrecioProducto();
    }

    @Override
    public int compareTo(Productos otraCompra) {
        //Comparar mediante el casteo de primitivos a clases
        return Double.valueOf(this.precioProducto).compareTo(Double.valueOf(otraCompra.precioProducto));
    }
}
