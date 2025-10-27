package org.example.vistas;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.example.logica.ConexionFirebase;
import org.example.logica.HabitacionCRUD;
import com.google.cloud.firestore.QueryDocumentSnapshot;

import java.io.IOException;
import java.util.List;

@WebServlet("/listarHabitaciones")
public class ListarHabitacionesServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        try {
            // 1️⃣ Conectamos a Firebase (usa tu clase ConexionFirebase)
            ConexionFirebase.conectar();

            // 2️⃣ Obtenemos la lista de habitaciones desde el CRUD
            List<QueryDocumentSnapshot> habitaciones = HabitacionCRUD.obtenerTodas();

            // 3️⃣ La pasamos como atributo al JSP
            req.setAttribute("habitaciones", habitaciones);

            // 4️⃣ Redirigimos al JSP para mostrar la tabla
            req.getRequestDispatcher("listarHabitaciones.jsp").forward(req, resp);

        } catch (Exception e) {
            e.printStackTrace();

            // Si ocurre un error, lo mostramos de forma simple
            resp.setContentType("text/plain");
            resp.getWriter().println("Error al listar habitaciones: " + e.getMessage());
        }
    }
}
