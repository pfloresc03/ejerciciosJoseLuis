<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Nóminas</h1>
        <form action="servletNominas">
            Nombre: <input type="text" name="nombre"><br>
            Apellidos: <input type="text" name="apellido"><br>
            Años en la empresa: <input type="text" name="anios"><br>
            Días trabajados: <input type="text" name="dias"><br>
            <input type="submit" value="Calcular Salario">
        </form>
    </body>
</html>
