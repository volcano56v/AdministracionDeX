package org.example.logica;

import org.example.modelo.Administrador;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que gestiona la lógica relacionada con los administradores y sus operaciones
 * sobre entidades como Bodega, Estante y Producto.
 */
public class LogicaAdministrador {
    private final List<Administrador> administradores = new ArrayList<>();

    /**
     * Registra un nuevo administrador en la lista interna.
     *
     * @param admin Administrador a registrar
     */
    public void registrar(Administrador admin) {
        administradores.add(admin);
    }

    /**
     * Realiza el inicio de sesión de un administrador validando usuario y contraseña.
     *
     * @param user     nombre de usuario
     * @param password contraseña
     * @return Administrador si las credenciales son correctas, de lo contrario null
     */
    public Administrador login(String user, String password) {
        return administradores.stream()
                .filter(a -> a.getNombreUsuario().equals(user)
                        && a.getContraseña().equals(password))
                .findFirst()
                .orElse(null);
    }

    /* ===================== MÉTODOS CRUD PARA BODEGA ===================== */

    public void createBodega() {
        // TODO: Implementar la lógica para crear una nueva Bodega en el sistema.
        // Actualmente este método está vacío porque la funcionalidad aún no se ha definido.
        throw new UnsupportedOperationException("Método createBodega() no implementado aún.");
    }

    public void readBodega() {
        // TODO: Implementar la lógica para leer o listar las Bodegas existentes.
        throw new UnsupportedOperationException("Método readBodega() no implementado aún.");
    }

    public void updateBodega() {
        // TODO: Implementar la lógica para actualizar los datos de una Bodega.
        throw new UnsupportedOperationException("Método updateBodega() no implementado aún.");
    }

    public void deleteBodega() {
        // TODO: Implementar la lógica para eliminar una Bodega del sistema.
        throw new UnsupportedOperationException("Método deleteBodega() no implementado aún.");
    }

    /* ===================== MÉTODOS CRUD PARA ESTANTE ===================== */

    public void createEstante() {
        // TODO: Implementar la lógica para crear un nuevo Estante dentro de una Bodega.
        throw new UnsupportedOperationException("Método createEstante() no implementado aún.");
    }

    public void readEstante() {
        // TODO: Implementar la lógica para listar o consultar Estantes.
        throw new UnsupportedOperationException("Método readEstante() no implementado aún.");
    }

    public void updateEstante() {
        // TODO: Implementar la lógica para modificar datos de un Estante existente.
        throw new UnsupportedOperationException("Método updateEstante() no implementado aún.");
    }

    public void deleteEstante() {
        // TODO: Implementar la lógica para eliminar un Estante.
        throw new UnsupportedOperationException("Método deleteEstante() no implementado aún.");
    }

    /* ===================== MÉTODOS CRUD PARA PRODUCTO ===================== */

    public void createProducto() {
        // TODO: Implementar la lógica para crear un nuevo Producto dentro de un Estante.
        throw new UnsupportedOperationException("Método createProducto() no implementado aún.");
    }

    public void readProducto() {
        // TODO: Implementar la lógica para consultar o listar Productos.
        throw new UnsupportedOperationException("Método readProducto() no implementado aún.");
    }

    public void updateProducto() {
        // TODO: Implementar la lógica para actualizar información de un Producto.
        throw new UnsupportedOperationException("Método updateProducto() no implementado aún.");
    }

    public void deleteProducto() {
        // TODO: Implementar la lógica para eliminar un Producto.
        throw new UnsupportedOperationException("Método deleteProducto() no implementado aún.");
    }
}
