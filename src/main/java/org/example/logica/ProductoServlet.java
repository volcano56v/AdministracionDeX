package org.example.logica;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.example.modelo.Producto;

import java.io.IOException;
import java.util.List;

@WebServlet("/ProductoServlet")
public class ProductoServlet extends HttpServlet {
    private LogicaProducto logica = new LogicaProducto();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String accion = request.getParameter("accion");
        String codigoStr = request.getParameter("codigoBarra");
        long codigo = codigoStr == null || codigoStr.isEmpty() ? 0 : Long.parseLong(codigoStr);

        switch (accion) {
            case "crear":
                Producto nuevo = new Producto(
                        codigo,
                        request.getParameter("nombre"),
                        Integer.parseInt(request.getParameter("precio")),
                        request.getParameter("categoria"),
                        Integer.parseInt(request.getParameter("cantidad"))
                );
                logica.crearProducto(nuevo);
                break;

            case "actualizar":
                Producto actualizado = new Producto(
                        codigo,
                        request.getParameter("nombre"),
                        Integer.parseInt(request.getParameter("precio")),
                        request.getParameter("categoria"),
                        Integer.parseInt(request.getParameter("cantidad"))
                );
                logica.actualizarProducto(actualizado.getCodigoBarra(),actualizado.getCantidad());
                break;

            case "eliminar":
                logica.eliminarProducto(codigo);
                break;
        }

        // Refresca el listado
        List<Producto> productos = logica.listarProductos();
        request.setAttribute("productos", productos);
        request.getRequestDispatcher("productos.jsp").forward(request, response);
    }
}
