package org.example.modelo;

import java.util.ArrayList;

public class Cliente {
    private String rut;
    private int dinero;
    private ArrayList<Estante> estantes;
    private ArrayList<Producto> productos;

    public Cliente(String rut, int dinero) {
        this.rut = rut;
        this.dinero = dinero;
        this.estantes = new ArrayList<>();
        this.productos = new ArrayList<>();
    }

    public Cliente(int dinero){
        this.dinero = dinero;
        this.rut = null;
        this.estantes = new ArrayList<>();
        this.productos = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "rut='" + rut + '\'' +
                ", dinero=" + dinero +
                ", estantes=" + estantes +
                ", productos=" + productos +
                '}';
    }
}
