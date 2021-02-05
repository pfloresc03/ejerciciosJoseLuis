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

/**
 *
 * @author Pablo Flores
 */
public class Utilidades {
	public static ArrayList<String> getAlumnos(String fichero) throws FileNotFoundException, IOException{
		ArrayList<String> alumnos = new ArrayList<String>();
		
		try {
			
			BufferedReader buffer = new BufferedReader(new InputStreamReader(new FileInputStream(fichero), "utf-8"));
			String alumno;			
			try {
				
				while((alumno = buffer.readLine())!=null) {
					alumnos.add(alumno);					
				 }
				
				buffer.close();
			} catch (IOException e) {
				
			}
		
		} catch (UnsupportedEncodingException e) {
			
		}
		return alumnos;		
	}
}