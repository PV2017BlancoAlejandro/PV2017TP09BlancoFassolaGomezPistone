/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.datos;

import aplicacion.modelo.dominio.Libro;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Alumno
 */
public class ColeccionZapatillas implements Serializable {
    private ArrayList<Libro> zapatilla;
    public ColeccionZapatillas() {
    zapatilla = new ArrayList();
    }
}
