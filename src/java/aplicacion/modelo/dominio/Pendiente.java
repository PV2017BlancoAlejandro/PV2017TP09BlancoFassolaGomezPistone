/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.io.Serializable;

/**
 *
 * @author Alumno
 */
public class Pendiente implements Serializable {
    private double p;

    public Pendiente() {
    }

    public Pendiente(double p) {
        this.p = p;
    }
    
    public double calcularPendiente (Punto A, Punto B){
        p = ((A.getY()-B.getY())/(A.getX()-B.getX()));
        return p;
    }
}
