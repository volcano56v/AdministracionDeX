package org.example.modelo;

import java.util.ArrayList;

public class Administrador {
    private final String surname;
    private final String password;
    private ArrayList<Bodega> bodegas;
    private ArrayList<Estante> estantes;
    private ArrayList<Producto> productos;

    public Administrador(String surname, String password) {
        this.surname = surname;
        this.password = password;
        this.bodegas = new ArrayList<>();
        this.estantes = new ArrayList<>();
        this.productos = new ArrayList<>();
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Administrador{" +
                "surname='" + surname + '\'' +
                ", password='" + password + '\'' +
                ", bodegas=" + bodegas +
                ", estantes=" + estantes +
                ", productos=" + productos +
                '}';
    }
}
