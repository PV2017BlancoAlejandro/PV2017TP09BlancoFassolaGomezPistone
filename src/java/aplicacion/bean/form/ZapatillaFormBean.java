/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.bean.form;


import aplicacion.datos.ColeccionZapatillas;
import aplicacion.modelo.dominio.Zapatilla;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Alumno
 */
@ManagedBean
@ViewScoped
public class ZapatillaFormBean implements Serializable {
private ColeccionZapatillas zapas;
private Zapatilla zapatilla;
private ArrayList<String> marca;
private ArrayList<String> tipo;
private boolean tip;
private boolean marc;
private String unaMarca;
private String unTipo;
    /**
     * Creates a new instance of ZapatillaFormBean
     */
    public ZapatillaFormBean() {
    zapas = new ColeccionZapatillas();
    tipo= new ArrayList();
    tipo.add("Original");
    tipo.add("Copia");
    tip=false;
    marca = new ArrayList ();
    marca.add("Adidas");
    marca.add("Nike");
    marca.add("Topper");
    marca.add("Reebok");
    marca.add("DC");
    marca.add("otra");
    marc = false;
    }
    public void agregarZapatilla(){
    setZapatilla(new Zapatilla(getUnaMarca(),getUnTipo()));
             getZapas().agregarZapatillas(getZapatilla());
    }

    /**
     * @return the marca
     */
    public ArrayList<String> getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(ArrayList<String> marca) {
        this.marca = marca;
    }

    /**
     * @return the marc
     */
    public boolean isMarc() {
        return marc;
    }

    /**
     * @param marc the marc to set
     */
    public void setMarc(boolean marc) {
        this.marc = marc;
    }

    /**
     * @return the zapatilla
     */
    public Zapatilla getZapatilla() {
        return zapatilla;
    }

    /**
     * @param zapatilla the zapatilla to set
     */
    public void setZapatilla(ColeccionZapatillas zapatilla) {
        this.setZapatilla(zapatilla);
    }

    /**
     * @return the unaMarca
     */
    public String getUnaMarca() {
        return unaMarca;
    }

    /**
     * @param unaMarca the unaMarca to set
     */
    public void setUnaMarca(String unaMarca) {
        this.unaMarca = unaMarca;
    }

    /**
     * @return the unTipo
     */
    public String getUnTipo() {
        return unTipo;
    }

    /**
     * @param unTipo the unTipo to set
     */
    public void setUnTipo(String unTipo) {
        this.unTipo = unTipo;
    }

    /**
     * @return the zapas
     */
    public ColeccionZapatillas getZapas() {
        return zapas;
    }

    /**
     * @param zapas the zapas to set
     */
    public void setZapas(ColeccionZapatillas zapas) {
        this.zapas = zapas;
    }

    /**
     * @param zapatilla the zapatilla to set
     */
    public void setZapatilla(Zapatilla zapatilla) {
        this.zapatilla = zapatilla;
    }

    /**
     * @return the tipo
     */
    public ArrayList<String> getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(ArrayList<String> tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the tip
     */
    public boolean isTip() {
        return tip;
    }

    /**
     * @param tip the tip to set
     */
    public void setTip(boolean tip) {
        this.tip = tip;
    }
}
