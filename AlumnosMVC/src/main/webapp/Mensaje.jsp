<%-- 
    Document   : Mensaje
    Created on : 10 feb. 2021, 11:35:54
    Author     : Pablo Flores
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="Modelo.Alumnos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
    </head>
    <body>
        <h1>Mensaje a Alumnos</h1>
        <% 
            String grupoActivo = ( String ) request.getAttribute("grupo");
            ArrayList<String> grupos = ( ArrayList<String> ) request.getAttribute("grupos");
            ArrayList<Alumnos> alumnos = ( ArrayList<Alumnos> ) request.getAttribute("alumnos");
            ArrayList<Alumnos> mensajes = ( ArrayList<Alumnos> ) request.getAttribute("mensajes");
         %>
         Grupo seleccionado: <%= grupoActivo %>
        <table border="red">
            <%
               for ( Alumnos alu: mensajes ){
               %>
            <tr>
                <td><%= alu.getNombre() %></td>
                <td><%= alu.getApellidos() %></td>
                <td><%= alu.getCorreo() %></td>
            </tr>
            <% } %>
              
        </table>

        Mensaje: 
        <br>
        <textarea name="textarea" rows="10" cols="50">
  
  
        </textarea><br>
        <input type="submit" value="Enviar">


    </body>
</html>
