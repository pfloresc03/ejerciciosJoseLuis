<%-- 
    Document   : horoscopo
    Created on : 11 feb. 2021, 12:08:14
    Author     : Pablo Flores
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Horóscopo</h1>
        <form action="horoscopo" method="post">
            <label for="nombre">Nombre:</label>
            <input type="text" name="nombre" id="nombre"><br>
            
            <% ArrayList<String> meses = (ArrayList<String>) request.getAttribute("meses"); 
                ArrayList<String> dias = (ArrayList<String>) request.getAttribute("dias");
            %>
           
            <label for="mes">Mes:</label>
            <select name="mes" id="mes">
                <% for(String mes: meses) { %>
                <option value="<%= mes %>"><%= mes %></option>
                <% } %>
            </select><br>
            <label for="dia">Dia:</label>
            <select name="dia" id="dia">
                <% for(String dia: dias) { %>
                <option value="<%= dia %>"><%= dia %></option>
                <% } %>
            </select><br>
            <input type="submit" value="Enviar">
        </form>
            
        <% String signo = (String) request.getAttribute("signo");
            String nombre = (String) request.getAttribute("nombre");
        %>
        <% if (nombre!=null){ %> 
            <%= nombre %> <%= signo %>
        <% } %>
    </body>
</html>
