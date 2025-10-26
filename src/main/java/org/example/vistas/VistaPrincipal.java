package org.example.vistas;

import org.example.logica.HabitacionCRUD;
import org.example.modelo.Habitacion;

import java.util.concurrent.ExecutionException;

public class VistaPrincipal {

    public static void iniciar() {
        System.out.println("🟢 Iniciando sistema de gestión de habitaciones...");

        try {
            // Mostrar todas las habitaciones
            System.out.println("📋 Habitaciones registradas:");
            HabitacionCRUD.obtenerTodas().forEach(doc ->
                    System.out.println(doc.toObject(Habitacion.class))
            );

            // Agregar una habitación de ejemplo
            Habitacion nueva = new Habitacion(202, true, false, 3);
            HabitacionCRUD.agregarHabitacion(nueva);

            System.out.println("✅ Nueva habitación agregada correctamente.");
        } catch (ExecutionException | InterruptedException e) {
            System.err.println("❌ Error al cargar datos: " + e.getMessage());
        }
    }
}
