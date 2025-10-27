package org.example.modelo;

public class Estante {
    private final long codigo;
    private final int capacidadMaxima;
    private int capacidadActual;

    public Estante(long codigo, int capacidadMaxima) {
        this.codigo = codigo;
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = 0;
    }

    @Override
    public String toString() {
        return "Estante{" +
                "codigo=" + codigo +
                ", capacidadMaxima=" + capacidadMaxima +
                ", capacidadActual=" + capacidadActual +
                '}';
    }
}
