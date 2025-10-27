package org.example.vistas;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.example.logica.ConexionFirebase;
import org.example.logica.HabitacionCRUD;
import org.example.modelo.Habitacion;

import java.io.IOException;

@WebServlet("/agregarHabitacion")
public class AgregarHabitacionServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        try {
            ConexionFirebase.conectar();

            int numero = Integer.parseInt(req.getParameter("numero"));
            boolean disponible = Boolean.parseBoolean(req.getParameter("disponible"));
            boolean ocupada = Boolean.parseBoolean(req.getParameter("ocupada"));
            int capacidad = Integer.parseInt(req.getParameter("capacidad"));

            Habitacion h = new Habitacion(numero, disponible, ocupada, capacidad);
            HabitacionCRUD.agregarHabitacion(h);

            resp.sendRedirect("listarHabitaciones");
        } catch (Exception e) {
            e.printStackTrace();
            resp.getWriter().write("Error al agregar la habitación: " + e.getMessage());
        }
    }
}
