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
        <% int num1=Integer.parseInt(request.getParameter("num1"));
        int num2=Integer.parseInt(request.getParameter("num2"));
        int num3=Integer.parseInt(request.getParameter("num3"));
        String mensaje="";
        double media = 0;
        double suma = num1+num2+num3;
        media = suma/3;
        %>
        <h3>La nota media es: <%= media %></h3>
        <% if (media<5) {
            mensaje = "<p style=color:red> Suspenso</p>";
        } else {
            mensaje = "<p style=color:green> Aprovado</p>";
        }
        %>
        <%= mensaje %>
    </body>
</html>
