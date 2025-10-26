<%@ page import="org.example.logica.HabitacionCRUD, org.example.modelo.Habitacion" %>
<%@ page import="java.util.List, com.google.cloud.firestore.QueryDocumentSnapshot" %>
<%
    List<QueryDocumentSnapshot> docs = HabitacionCRUD.obtenerTodas();
%>
<html>
<head>
    <title>Habitaciones</title>
</head>
<body>
<h1>Listado de Habitaciones</h1>
<table border="1">
    <tr><th>Número</th><th>Disponible</th><th>Ocupada</th><th>Capacidad</th></tr>
    <% for (QueryDocumentSnapshot doc : docs) {
        Habitacion h = doc.toObject(Habitacion.class); %>
    <tr>
        <td><%= h.getNumero() %></td>
        <td><%= h.isDisponible() %></td>
        <td><%= h.isOcupada() %></td>
        <td><%= h.getCapacidad() %></td>
    </tr>
    <% } %>
</table>
</body>
</html>
