package org.example.modelo;

public class Bodega {
    private long codigo;
    private int capacidadMaxima;
    private int capacidadActual;

    // 🔹 Constructor vacío necesario para Firestore
    public Bodega() {}

    public Bodega(long codigo, int capacidadMaxima) {
        this.codigo = codigo;
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = 0;
    }

    public long getCodigo() { return codigo; }
    public int getCapacidadMaxima() { return capacidadMaxima; }
    public int getCapacidadActual() { return capacidadActual; }

    public void setCodigo(long codigo) { this.codigo = codigo; }
    public void setCapacidadMaxima(int capacidadMaxima) { this.capacidadMaxima = capacidadMaxima; }
    public void setCapacidadActual(int capacidadActual) { this.capacidadActual = capacidadActual; }

    @Override
    public String toString() {
        return "Bodega{" +
                "codigo=" + codigo +
                ", capacidadMaxima=" + capacidadMaxima +
                ", capacidadActual=" + capacidadActual +
                '}';
    }
}
