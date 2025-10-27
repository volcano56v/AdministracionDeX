<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Agregar Habitación</title>
    <style>
        body { font-family: Arial, sans-serif; background: #f4f4f4; padding: 20px; }
        h1 { color: #333; }
        form { background: white; padding: 20px; border-radius: 8px; width: 300px; margin: auto; box-shadow: 0 2px 5px rgba(0,0,0,0.1); }
        label { display: block; margin-top: 10px; }
        input[type="number"], input[type="text"] { width: 100%; padding: 8px; margin-top: 5px; border: 1px solid #ccc; border-radius: 5px; }
        button { background: #007bff; color: white; border: none; padding: 10px; width: 100%; margin-top: 15px; border-radius: 5px; cursor: pointer; }
        button:hover { background: #0056b3; }
        a { display: block; text-align: center; margin-top: 10px; color: #007bff; text-decoration: none; }
    </style>
</head>
<body>

<h1d>➕ Agregar nueva habitación</h1d>

<form action="agregarHabitacion" method="post">
    <label for="numero">Número:</label>
    <input type="number" id="numero" name="numero" required>

    <label for="disponible">Disponible (true/false):</label>
    <input type="text" id="disponible" name="disponible" required>

    <label for="ocupada">Ocupada (true/false):</label>
    <input type="text" id="ocupada" name="ocupada" required>

    <label for="capacidad">Capacidad:</label>
    <input type="number" id="capacidad" name="capacidad" required>

    <button type="submit">Guardar</button>
</form>

<a href="listarHabitaciones">⬅ Volver al listado</a>

</body>
</html>
