package org.example.modelo;

public class Bodega {
    private final long codigo;
    private final int capacidadMAxima;
    private int capacidadActual;


    public Bodega(long codigo, int capacidadMAxima) {
        this.codigo = codigo;
        this.capacidadMAxima = capacidadMAxima;
        this.capacidadActual = 0;
    }

    @Override
    public String toString() {
        return "Bodega{" +
                "codigo=" + codigo +
                ", capacidadMAxima=" + capacidadMAxima +
                ", capacidadActual=" + capacidadActual +
                '}';
    }
}
