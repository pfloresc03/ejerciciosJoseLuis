/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Pablo Flores
 */
public class Billete {
    private String fechaVuelo;
    private int cant;
    

    public Billete() {
    }

    public Billete(String fechaVuelo, int cant) {
        this.fechaVuelo = fechaVuelo;
        this.cant = cant;
    }

    public String getFechaVuelo() {
        return fechaVuelo;
    }

    public int getCant() {
        return cant;
    }
    
    
    
    public double getImporte(){
        double precio;
        int mes;
        mes = Integer.parseInt(this.fechaVuelo.substring(5,7));
        if (mes>=5 && mes<=9){
            precio = 150.0; //Temporada alta
        } else {
            precio = 90.0;
        }
        double precioSinIva=precio*cant;
        return precioSinIva*1.21;
    }
}
