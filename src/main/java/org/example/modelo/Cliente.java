package org.example.modelo;

public class Cliente {
    private String rut;
    private int dinero;

    public Cliente(String rut, int dinero) {
        this.rut = rut;
        this.dinero = dinero;
    }

    public Cliente(int dinero){
        this.dinero = dinero;
        this.rut = null;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "rut='" + rut + '\'' +
                ", dinero=" + dinero +
                '}';
    }
}
