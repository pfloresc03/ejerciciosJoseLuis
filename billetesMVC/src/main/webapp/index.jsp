<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Aerolineas Bosco</h1>
        <form action="recibeDatos">
            Fecha del vuelo: <input type="date" name="fechaIni"><br>
            Número de billetes: <input type="number" name="cantidad"><br>
            <input type="submit" name="Calcular">
        </form>
    </body>
</html>
