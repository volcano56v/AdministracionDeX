package org.example.logica;

import org.example.modelo.Bodega;
import java.util.*;

/**
 * 🏗️ Lógica de negocio para la entidad Bodega
 * Maneja las operaciones CRUD de las bodegas en Firestore.
 */
public class LogicaBodega {

    private final CRUDFireStore<Bodega> crudBodega;

    public LogicaBodega() {
        // Conecta con la colección "bodegas" en Firestore
        crudBodega = new CRUDFireStore<>("bodegas", Bodega.class);
    }

    /**
     * 🟢 Registrar una nueva bodega
     */
    public void registrarBodega(long codigo, int capacidadMaxima, int capacidadActual) {
   //     Bodega bodega = new Bodega(codigo, capacidadMaxima, capacidadActual);
   //     crudBodega.guardar(String.valueOf(codigo), bodega);
    }

    /**
     * 🟡 Obtener una bodega por su código
     */
    public Bodega obtenerBodega(long codigo) {
        return crudBodega.obtenerPorId(String.valueOf(codigo));
    }

    /**
     * 🔵 Listar todas las bodegas
     */
    public List<Bodega> listarBodegas() {
        return crudBodega.obtenerTodos();
    }

    /**
     * 🟠 Actualizar una bodega
     */
    public void actualizarBodega(long codigo, Map<String, Object> nuevosDatos) {
        crudBodega.actualizarCampos(String.valueOf(codigo), nuevosDatos);
    }

    /**
     * 🔴 Eliminar una bodega
     */
    public void eliminarBodega(long codigo) {
        crudBodega.eliminar(String.valueOf(codigo));
    }
}
