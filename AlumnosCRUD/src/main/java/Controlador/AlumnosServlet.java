/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Alumno;
import Modelo.Alumnos;
import Modelo.Utilidades;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Pablo Flores
 */
public class AlumnosServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    private ArrayList<String> grupos;
    
    public void init(ServletConfig config)
          throws ServletException {
        grupos = new ArrayList<String>();
        grupos.add("2daw_a");
        grupos.add("2daw_b");
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AlumnosServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AlumnosServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ArrayList<Alumnos> alumnos = Utilidades.getAlumnos("2daw_a");
        request.setAttribute("grupos", grupos);
        request.setAttribute("grupo", "2daw_a");
        request.setAttribute("alumnos", alumnos);
        request.getRequestDispatcher("alumnos.jsp").forward(request,response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String archivoSeleccionado = request.getParameter("grupo");
        ArrayList<Alumnos> alumnos = Utilidades.getAlumnos(archivoSeleccionado);
        request.setAttribute("grupos", grupos);
        request.setAttribute("grupo", request.getParameter("grupo"));
        request.setAttribute("alumnos", alumnos);
        ArrayList<Alumnos> mensajes = new ArrayList();
        for (int i=0; i<20; i++){
            
            if (request.getParameter(String.valueOf(i))!=null){
                for (Alumnos alu: alumnos){
                    if (alu.getId() == i){
                        Alumnos mensajeAlumno = new Alumnos(alu.getId(),alu.getGrupo(),
                                alu.getNombre(),alu.getApellidos(),alu.getCorreo());
                        mensajes.add(mensajeAlumno);
                    }
                }
                
            }
             
        }
        if (mensajes.size()!=0){
            request.setAttribute("mensajes", mensajes);
            request.getRequestDispatcher("Mensaje.jsp").forward(request,response);
        }
            
        
        request.getRequestDispatcher("alumnos.jsp").forward(request,response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
