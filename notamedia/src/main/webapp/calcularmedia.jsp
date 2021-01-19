<%-- 
    Document   : calcularmedia
    Created on : 15 ene. 2021, 21:06:22
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
        <% String nombre=request.getParameter("nombre"); %>
        <h1><%= nombre %></h1>
        <%@page import="clases.Media" %>
        <% String num1=request.getParameter("num1");
        String num2=request.getParameter("num2");
        String num3=request.getParameter("num3");
        String mensaje="";
        Media notaMedia = new Media(num1, num2, num3);
        %>
        <h3>La nota media es: <%= notaMedia.getMedia() %></h3>
        <% if (notaMedia.getMedia()<5) {
            mensaje = "<p style=color:red> Suspenso</p>";
        } else {
            mensaje = "<p style=color:green> Aprovado</p>";
        }
        %>
        <%= mensaje %>
    </body>
</html>
