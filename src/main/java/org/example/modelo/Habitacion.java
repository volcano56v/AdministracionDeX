package org.example.modelo;

public class Habitacion {
    private int numero;
    private boolean disponible;
    private boolean ocupada;
    private int capacidad;

    public Habitacion() {} // Requerido por Firestore

    public Habitacion(int numero, boolean disponible, boolean ocupada, int capacidad) {
        this.numero = numero;
        this.disponible = disponible;
        this.ocupada = ocupada;
        this.capacidad = capacidad;
    }

    public int getNumero() { return numero; }
    public boolean isDisponible() { return disponible; }
    public boolean isOcupada() { return ocupada; }
    public int getCapacidad() { return capacidad; }

    @Override
    public String toString() {
        return "Habitación N°" + numero +
                " | Disponible: " + disponible +
                " | Ocupada: " + ocupada +
                " | Capacidad: " + capacidad;
    }
}
