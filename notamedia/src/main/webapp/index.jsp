<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Nota Media</h1>
        <form action="calcularmedia.jsp">
            Nombre: <input type="text" name="nombre"><br>
            Nota 1: <input type="text" name="num1"><br>
            Nota 2: <input type="text" name="num2"><br>
            Nota 3: <input type="text" name="num3"><br>
            <input type="submit" value="Calcular Media">
        </form>
    </body>
</html>
