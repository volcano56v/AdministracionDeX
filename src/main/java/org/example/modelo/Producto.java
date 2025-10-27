package org.example.modelo;

public class Producto {
    private final long codigoBarra;
    private final String nombre;
    private int precio;
    private final String categoria;

    public Producto(long codigoBarra, String nombre, int precio, String categoria) {
        this.codigoBarra = codigoBarra;
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigoBarra=" + codigoBarra +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}
