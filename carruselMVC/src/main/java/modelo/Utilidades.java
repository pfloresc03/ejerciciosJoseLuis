/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author Pablo Flores
 */
public class Utilidades {
    public static ArrayList<String> getArchivos( String ruta){
        File dir = new File(ruta);
        String[] ficheros = dir.list();
        ArrayList<String> imagenes = new ArrayList<String>();
        for (String f: ficheros ){
            if (f.endsWith(".jpg") || f.endsWith(".png")){
                f = "ficheros".concat(File.separator).concat(f);
                imagenes.add(f);
            }
            
        }
        return imagenes;
    }
}
