/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Pablo Flores
 */
public class Calcular {
    private double anios, dias, resultado;

    public Calcular() {
    }

    public Calcular(double anios, double dias) {
        this.anios = anios;
        this.dias = dias;
    }

    public double getAnios() {
        return anios;
    }

    public double getDias() {
        return dias;
    }
    
    public double getResultado(){
        if (this.anios < 5){
            this.resultado = this.dias * 70;
        } else {
            this.resultado = this.dias * 80;
        }
        return this.resultado;
    }
    
    public double getRetencion(){
        return this.resultado*0.80;
    }
}
