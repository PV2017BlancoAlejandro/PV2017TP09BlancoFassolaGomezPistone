/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.bean.form;

import aplicacion.datos.ColeccionProductos;
import aplicacion.modelo.dominio.Productos;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Alumno
 */
@ManagedBean
@ViewScoped
public class ProductosFormBean {
private ColeccionProductos productos;
private Productos producto;
private String unNombre;
private String unCodigo;
private double unPrecio;
private String unaCuota;
private ArrayList <String> cuotas;

    /**
     * Creates a new instance of ProductosFormBean
     */
    public ProductosFormBean() {
        productos=new ColeccionProductos();
        cuotas=new ArrayList();
        cuotas.add("1");
        cuotas.add("3");
        cuotas.add("6");
        cuotas.add("9");
        cuotas.add("12");
    }

    public void agregarProducto(){
        setProducto(new Productos(getUnNombre(), getUnCodigo(), getUnPrecio(), getUnaCuota()));
        getProductos().agregarProducto(getProducto());     
    }
    
     public double precioTotal()
    {
        return productos.precioTotal();
    }
    /**
     * @return the productos
     */
    public ColeccionProductos getProductos() {
        return productos;
    }

    /**
     * @param productos the productos to set
     */
    public void setProductos(ColeccionProductos productos) {
        this.productos = productos;
    }

    /**
     * @return the producto
     */
    public Productos getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(Productos producto) {
        this.producto = producto;
    }

    /**
     * @return the unCodigo
     */
    public String getUnCodigo() {
        return unCodigo;
    }

    /**
     * @param unCodigo the unCodigo to set
     */
    public void setUnCodigo(String unCodigo) {
        this.unCodigo = unCodigo;
    }

    /**
     * @return the unNombre
     */
    public String getUnNombre() {
        return unNombre;
    }

    /**
     * @param unNombre the unNombre to set
     */
    public void setUnNombre(String unNombre) {
        this.unNombre = unNombre;
    }

    /**
     * @return the unPrecio
     */
    public double getUnPrecio() {
        return unPrecio;
    }

    /**
     * @param unPrecio the unPrecio to set
     */
    public void setUnPrecio(double unPrecio) {
        this.unPrecio = unPrecio;
    }

    /**
     * @return the unaCuota
     */
    public String getUnaCuota() {
        return unaCuota;
    }

    /**
     * @param unaCuota the unaCuota to set
     */
    public void setUnaCuota(String unaCuota) {
        this.unaCuota = unaCuota;
    }

    /**
     * @return the cuotas
     */
    public ArrayList <String> getCuotas() {
        return cuotas;
    }

    /**
     * @param cuotas the cuotas to set
     */
    public void setCuotas(ArrayList <String> cuotas) {
        this.cuotas = cuotas;
    }
    
}
