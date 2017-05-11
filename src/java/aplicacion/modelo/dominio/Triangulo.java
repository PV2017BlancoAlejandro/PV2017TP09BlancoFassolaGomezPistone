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
public class Triangulo implements Serializable {
    
    private Pendiente p;
    private Punto unPuntoA;
    private Punto unPuntoB;
    private Punto unPuntoC;

    public Triangulo() {
    }

    public Triangulo(Pendiente p, Punto unPuntoA, Punto unPuntoB, Punto unPuntoC) {
        this.p = p;
        this.unPuntoA = unPuntoA;
        this.unPuntoB = unPuntoB;
        this.unPuntoC = unPuntoC;
    }
    
    public boolean verificarTriangulo (Punto unPuntoA, Punto unPuntoB, Punto unPuntoC){
     boolean bandera=true;
     p = new Pendiente ();
     double pendiente1 = p.calcularPendiente(unPuntoA, unPuntoB);
     double pendiente2 = p.calcularPendiente(unPuntoB, unPuntoC);
     double pendiente3 = p.calcularPendiente(unPuntoA, unPuntoC);
     
     if (pendiente1 == pendiente2){
         if (pendiente2 == pendiente3){
             bandera=false;
         }
     }
     return bandera;
    }
}
