/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Pablo Flores
 */
public class Utilidades {
    public static ArrayList<String> getMeses(){
        ArrayList<String> meses = new ArrayList<String>();
        for (int i=1; i<=12; i++){
            meses.add(String.valueOf(i));
        }
        return meses;
    }
    public static ArrayList<String> getDias(){
        ArrayList<String> meses = new ArrayList<String>();
        for (int i=1; i<=31; i++){
            meses.add(String.valueOf(i));
        }
        return meses;
    }
    public static String getSigno(int dia, int mes){
        switch(mes) {		
            case 1: 
              // Enero
              if (dia>=21)
                return("tu signo es Acuario");
              else
                return("tu signo es Capricornio");				
              
            case 2:
              // Febrero
              if (dia>=19 && dia<=29)
                return("tu signo es Piscis");
              else if (dia<19)
                return("tu signo es Acuario");
              else
                return null;
              
            case 3:
              // Marzo
              if (dia>=21)
                return("tu signo es Aries");
              else
                return("tu signo es Piscis");
              
            case 4:
              // Abril
              if (dia>=21 && dia<=30)
                return("tu signo es Tauro");
              else if (dia<21)
                return("tu signo es Aries");
              else
                return null;
              
            case 5:
              // Mayo
              if (dia>=21)
                return("tu signo es Géminis");
              else
                return("tu signo es Tauro");
              
            case 6:
              // Junio
              if (dia>=21 && dia<=30)
                return("tu signo es Cáncer");
              else if (dia<21)
                return("tu signo es Géminis");
              else
                return null;
            
            case 7:
              // Julio
              if (dia>=23)
                return("tu signo es Leo");
              else
                return("tu signo es Cáncer");
              
            case 8:
              // Agosto
              if (dia>=23)
                return("tu signo es Virgo");
              else
                return("tu signo es Leo");
              
            case 9:
              // Septiembre
              if (dia>=22 && dia<=30)
                return("tu signo es Libra");
              else if (dia<22)
                return("tu signo es Virgo");
              else
                return null;
              
            case 10:
              // Octubre
              if (dia>=23)
                return("tu signo es Escorpio");
              else
                return("tu signo es Libra");
              
            case 11:
              // Noviembre
              if (dia>=23 && dia<=30)
                return("tu signo es Sagitario");
              else if (dia<23)
                return("tu signo es Escorpio");
              else 
                return null;
              
            case 12:
              // Diciembre
              if (dia>=22)
                return("tu signo es Capricornio");
              else
                return("tu signo es Sagitario");
              }
        return null;
    }
}
