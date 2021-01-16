<%-- 
    Document   : calcularsalario
    Created on : 15 ene. 2021, 21:26:47
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
        <% double bruto = Double.parseDouble(request.getParameter("salario"));
        double retencion = 0;
        double retenido = 0;
        double neto = 0;
        if ((bruto>1000) && (bruto<=3000)){
            retencion = 10;
        } else if ((bruto>3000)){
            retencion = 20;
        }
        retenido = bruto * (retencion/100);
        neto = bruto - retenido;
        %>
        <h3>El salario bruto es: <%= bruto %></h3>
        <h3>La retencion es del <%= retencion %>%</h3>
        <h3>El salario neto es: <%= neto %></h3>
        
    </body>
</html>
