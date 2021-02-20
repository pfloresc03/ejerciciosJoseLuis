/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Pablo Flores
 */
public class Utilidades {
    public static ArrayList<Alumnos> getAlumnos(String grupo){
        ArrayList<Alumnos> alumnos = new ArrayList<Alumnos>();
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.mycompany_AlumnosCRUD_war_1.0-SNAPSHOTPU");
        EntityManager manager = factory.createEntityManager();
        String sql = "SELECT * FROM alumnos WHERE grupo='" +grupo+"'";
        Query q = manager.createNativeQuery(sql,Alumnos.class);
        List<Alumnos> alumnosBD =  q.getResultList();
        for ( Alumnos a: alumnosBD ){
            Alumnos alumno = new Alumnos(a.getId(),a.getGrupo(),a.getNombre(),a.getApellidos(), a.getCorreo());
            alumnos.add(alumno);         
        }
        return alumnos;
        
    }
    
	public static ArrayList<Alumno> getAlumnos2(String fichero) throws FileNotFoundException, IOException{
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		
		try {
			
                    BufferedReader buffer = new BufferedReader(new InputStreamReader(new FileInputStream(fichero), "utf-8"));
                    String linea;			
                    try {

                        while((linea = buffer.readLine())!=null) {
                            String[] atributosProducto = linea.split(";");
                            Alumno prod = new Alumno(
                                            Integer.parseInt(atributosProducto[0]),
                                            atributosProducto[1],
                                            atributosProducto[2],
                                            atributosProducto[3]);
                            alumnos.add(prod);
                         }

                            buffer.close();
                    } catch (IOException e) {

                    }
		
		} catch (UnsupportedEncodingException e) {
			
		}
		return alumnos;	
	}
}