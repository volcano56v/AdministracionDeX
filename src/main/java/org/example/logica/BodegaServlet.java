package org.example.logica;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import org.example.modelo.Bodega;
import java.io.IOException;

@WebServlet("/bodegas")
public class BodegaServlet extends HttpServlet {
    private final LogicaBodega logica = new LogicaBodega();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        try {
            long codigo = Long.parseLong(req.getParameter("codigo"));
            int capacidad = Integer.parseInt(req.getParameter("capacidadMaxima"));

            Bodega bodega = new Bodega(codigo, capacidad);
           // logica.registrarBodega(bodega);

            resp.sendRedirect("listarBodegas.jsp");
        } catch (Exception e) {
            e.printStackTrace();
            resp.getWriter().write("Error: " + e.getMessage());
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        try {
            req.setAttribute("bodegas", logica.listarBodegas());
            req.getRequestDispatcher("listarBodegas.jsp").forward(req, resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
