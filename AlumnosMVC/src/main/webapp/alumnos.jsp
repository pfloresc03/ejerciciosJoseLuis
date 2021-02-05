<%-- 
    Document   : alumnos
    Created on : 4 feb. 2021, 11:28:40
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
        <h1>Alumnos de DAW</h1>
        <% 
            String grupoActivo = ( String ) request.getAttribute("grupo");
            ArrayList<String> grupos = ( ArrayList<String> ) request.getAttribute("grupos");
            ArrayList<String> alumnos = ( ArrayList<String> ) request.getAttribute("alumnos");
         %>
         Grupo Seleccionado: <%=grupoActivo%> <br>
         <form action="AlumnosServlet" method="post">
         Grupo: <select name="grupo">
             
             <% 
                 
                 for ( String gru: grupos ) { 
                 String textoSelected="";
                 if ( gru.equals(grupoActivo)) {
                     textoSelected = " selected";
                 }
                 %>
                     <option <%=textoSelected%> value="<%=gru%>"><%=gru%></option>
             <% } %>
         </select>
         <input type="submit" value="Enviar">
         </form>
         <br>
         
          Alumnos: 
          <table border="red">
              <% 
                 
                 for ( String alu: alumnos) { 
                 %>
              <tr>
                  <td><%= alu %></td>
                  <td><input type="checkbox"></td>
              </tr>
              <% } %>
          </table>
    </body>
</html>
