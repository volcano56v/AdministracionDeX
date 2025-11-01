<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*, org.example.modelo.Producto" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Gestión de Productos</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            background: #f4f6f8;
            font-family: 'Segoe UI', sans-serif;
        }
        .container {
            margin-top: 40px;
            background: white;
            border-radius: 10px;
            padding: 30px;
            box-shadow: 0 4px 15px rgba(0,0,0,0.1);
        }
        .form-section {
            background: #e9f0fa;
            padding: 20px;
            border-radius: 10px;
            margin-bottom: 30px;
        }
        h1 {
            color: #2c3e50;
            font-weight: bold;
        }
        table {
            margin-top: 20px;
        }
        th {
            background-color: #007bff;
            color: white;
        }
    </style>
</head>
<body>
<div class="container">
    <h1 class="text-center mb-4">📦 Administración de Productos</h1>

    <!-- ====================== FORMULARIO ====================== -->
    <div class="form-section">
        <form action="ProductoServlet" method="post">
            <div class="row">
                <div class="col-md-4 mb-3">
                    <label for="codigoBarra" class="form-label">Código de Barra</label>
                    <input type="number" class="form-control" id="codigoBarra" name="codigoBarra" required>
                </div>

                <div class="col-md-4 mb-3">
                    <label for="nombre" class="form-label">Nombre</label>
                    <input type="text" class="form-control" id="nombre" name="nombre" required>
                </div>

                <div class="col-md-4 mb-3">
                    <label for="categoria" class="form-label">Categoría</label>
                    <input type="text" class="form-control" id="categoria" name="categoria" required>
                </div>

                <div class="col-md-4 mb-3">
                    <label for="precio" class="form-label">Precio</label>
                    <input type="number" class="form-control" id="precio" name="precio" required>
                </div>

                <div class="col-md-4 mb-3">
                    <label for="cantidad" class="form-label">Cantidad</label>
                    <input type="number" class="form-control" id="cantidad" name="cantidad" required>
                </div>
            </div>

            <div class="text-center">
                <button type="submit" name="accion" value="crear" class="btn btn-success">➕ Agregar</button>
                <button type="submit" name="accion" value="actualizar" class="btn btn-primary">✏️ Actualizar</button>
                <button type="submit" name="accion" value="eliminar" class="btn btn-danger">🗑️ Eliminar</button>
                <button type="submit" name="accion" value="listar" class="btn btn-secondary">🔄 Listar</button>
            </div>
        </form>
    </div>

    <!-- ====================== LISTADO DE PRODUCTOS ====================== -->
    <%
        List<Producto> productos = (List<Producto>) request.getAttribute("productos");
        if (productos != null && !productos.isEmpty()) {
    %>
    <table class="table table-bordered table-striped text-center">
        <thead>
        <tr>
            <th>Código Barra</th>
            <th>Nombre</th>
            <th>Categoría</th>
            <th>Precio</th>
            <th>Cantidad</th>
        </tr>
        </thead>
        <tbody>
        <% for (Producto p : productos) { %>
        <tr>
            <td><%= p.getCodigoBarra() %></td>
            <td><%= p.getNombre() %></td>
            <td><%= p.getCategoria() %></td>
            <td>$<%= p.getPrecio() %></td>
            <td><%= p.getCantidad() %></td>
        </tr>
        <% } %>
        </tbody>
    </table>
    <% } else { %>
    <p class="text-center text-muted">No hay productos registrados.</p>
    <% } %>
</div>
</body>
</html>
