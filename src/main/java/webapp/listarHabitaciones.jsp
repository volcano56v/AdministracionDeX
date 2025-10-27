<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List, com.google.cloud.firestore.QueryDocumentSnapshot, org.example.modelo.Habitacion" %>

<%
    List<QueryDocumentSnapshot> docs = (List<QueryDocumentSnapshot>) request.getAttribute("habitaciones");
%>

<!DOCTYPE html>
<html>
<head>
    <title>Listado de Habitaciones</title>
    <style>
        body { font-family: Arial, sans-serif; background: #f4f4f4; margin: 0; padding: 20px; }
        h1 { color: #333; }
        table { border-collapse: collapse; width: 100%; background: white; border-radius: 8px; overflow: hidden; }
        th, td { border: 1px solid #ddd; padding: 10px; text-align: center; }
        th { background: #007bff; color: white; }
        tr:nth-child(even) { background: #f2f2f2; }
        a { display: inline-block; margin-top: 15px; padding: 10px 15px; background: #007bff; color: white; text-decoration: none; border-radius: 5px; }
        a:hover { background: #0056b3; }
    </style>
</head>
<body>

<h1>📋 Habitaciones registradas</h1>

<table>
    <tr>
        <th>Número</th>
        <th>Disponible</th>
        <th>Ocupada</th>
        <th>Capacidad</th>
    </tr>
    <%
        if (docs != null && !docs.isEmpty()) {
            for (QueryDocumentSnapshot doc : docs) {
                Habitacion h = doc.toObject(Habitacion.class);
    %>
    <tr>
        <td><%= h.getNumero() %></td>
        <td><%= h.isDisponible() ? "Sí" : "No" %></td>
        <td><%= h.isOcupada() ? "Sí" : "No" %></td>
        <td><%= h.getCapacidad() %></td>
    </tr>
    <%
        }
    } else {
    %>
    <tr>
        <td colspan="4">No hay habitaciones registradas.</td>
    </tr>
    <% } %>
</table>

<a href="agregarHabitacion.jsp">➕ Agregar nueva habitación</a>

</body>
</html>
