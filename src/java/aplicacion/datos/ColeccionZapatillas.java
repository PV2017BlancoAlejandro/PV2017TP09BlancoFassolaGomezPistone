/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.datos;



import aplicacion.modelo.dominio.Zapatilla;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Alumno
 */
public class ColeccionZapatillas implements Serializable {
    private ArrayList<Zapatilla> zapas;
    
    public ColeccionZapatillas() {
    zapas = new ArrayList();
    }
    public void agregarZapatillas(Zapatilla unaZapatilla){
      getZapas().add(unaZapatilla);
    }

    /**
     * @return the zapas
     */
    public ArrayList<Zapatilla> getZapas() {
        return zapas;
    }

    /**
     * @param zapas the zapas to set
     */
    public void setZapas(ArrayList<Zapatilla> zapas) {
        this.zapas = zapas;
    }

    
    
}
