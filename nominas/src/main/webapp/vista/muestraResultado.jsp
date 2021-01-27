<%-- 
    Document   : muestraResultado
    Created on : 25 ene. 2021, 20:36:27
    Author     : Pablo Flores
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Resultado</h1>
        <%
            String nombre = request.getParameter("nombre");
            String apellidos = request.getParameter("apellido");
        %>
        Nombre: <%= nombre %> <br>
        Apellidos: <%= apellidos %> <br>
        Años en la empresa: ${calcular.getAnios()} <br>
        Días trabajados: ${calcular.getDias()} <br>
        Nómina: ${calcular.getResultado()} <br>
        Salario Neto: ${calcular.getRetencion()}<br>
    </body>
</html>
