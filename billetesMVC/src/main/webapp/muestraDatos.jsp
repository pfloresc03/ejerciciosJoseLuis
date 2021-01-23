<%-- 
    Document   : muestraDatos
    Created on : 22 ene. 2021, 21:35:40
    Author     : Pablo Flores
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelo.Billete" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Precio Final del vuelo</h1>
        <% Billete billete = (Billete) request.getAttribute("billete"); %>
        <h2>Número de billetes: <%= billete.getCant() %></h2>
        <h2>Fecha del vuelo: <%= billete.getFechaVuelo() %></h2>
        <h2>Importe de los billetes: <%= Math.floor(billete.getImporte()) %></h2>
    </body>
</html>
