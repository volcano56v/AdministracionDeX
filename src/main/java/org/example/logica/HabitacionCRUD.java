package org.example.logica;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.*;
import org.example.modelo.Habitacion;

import java.util.List;
import java.util.concurrent.ExecutionException;

public class HabitacionCRUD {

    public static void agregarHabitacion(Habitacion habitacion) throws ExecutionException, InterruptedException {
        Firestore db = ConexionFirebase.getDB();
        ApiFuture<WriteResult> future = db.collection("habitaciones")
                .document(String.valueOf(habitacion.getNumero()))
                .set(habitacion);
        future.get();
        System.out.println("✅ Habitación agregada: " + habitacion);
    }

    public static List<QueryDocumentSnapshot> obtenerTodas() throws ExecutionException, InterruptedException {
        Firestore db = ConexionFirebase.getDB();
        ApiFuture<QuerySnapshot> future = db.collection("habitaciones").get();
        return future.get().getDocuments();
    }
}
