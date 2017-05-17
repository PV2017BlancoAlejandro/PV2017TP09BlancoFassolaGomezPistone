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
private Zapatilla zapatilla;
private ArrayList<String> marca;
private boolean marc;
private ColeccionZapatillas zapatillas;
private String unaMarca;
    private String unTipo;
    /**
     * Creates a new instance of ZapatillaFormBean
     */
    public ZapatillaFormBean() {
        zapatillas = new ColeccionZapatillas();
    marca = new ArrayList ();
    marca.add("Adidas");
    marca.add("Nike");
    marca.add("Topper");
    marca.add("Reebok");
    marca.add("DC");
    marc = false;
    }
    public void agregarZapatilla(){
        setZapatilla(new Zapatilla(getUnaMarca(),getUnTipo()));
                getZapatilla().agregarZapatilla(getZapatilla());
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
    public ColeccionZapatillas getZapatilla() {
        return zapatilla;
    }

    /**
     * @param zapatilla the zapatilla to set
     */
    public void setZapatilla(ColeccionZapatillas zapatilla) {
        this.zapatilla = zapatilla;
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
}
