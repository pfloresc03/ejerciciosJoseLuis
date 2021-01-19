/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Pablo Flores
 */
public class Media {
    private double nota1, nota2, nota3, media;

    public Media(String nota1, String nota2, String nota3) {
        this.nota1 = Double.parseDouble(nota1);
        this.nota2 = Double.parseDouble(nota2);
        this.nota3 = Double.parseDouble(nota3);
        this.media = (this.nota1+this.nota2+this.nota3)/3;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public double getMedia() {
        return media;
    }
    
    
    
}
