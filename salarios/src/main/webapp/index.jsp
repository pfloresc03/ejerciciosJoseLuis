<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Retención de salarios</h1>
        <form action="retencionsalario">
            Nombre del empleado: <input type="text" name="nombre"><br>
            Salario Bruto: <input type="text" name="salariobruto"><br>
            <input type="submit" value="Calcular Salario">
        </form>
    </body>
</html>
