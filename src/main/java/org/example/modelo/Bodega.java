package org.example.modelo;

public class Bodega {
    private long id;
    private String nombre;
    private String direccion;
    private int capacidad;

    // 🔹 Constructor vacío (requerido por Firestore)
    public Bodega() {}

    // 🔹 Constructor completo
    public Bodega(long id, String nombre, String direccion, int capacidad) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.capacidad = capacidad;
    }

    // 🔹 Getters y setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
