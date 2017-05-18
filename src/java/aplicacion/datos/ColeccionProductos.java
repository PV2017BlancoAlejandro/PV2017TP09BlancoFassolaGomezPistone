/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.datos;

import aplicacion.modelo.dominio.Productos;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Alumno
 */
public class ColeccionProductos implements Serializable {
    private ArrayList <Productos> productos;

    public ColeccionProductos() {
        productos= new ArrayList ();
    }

    public void agregarProducto(Productos unProducto){
        getProductos().add(unProducto);
    }
    
     public double precioTotal()
    {
        double precio = 0;
        for(Productos p: productos)
        {
            precio = precio + p.calcularPrecio();
        }     
        return precio;
    }
     
    /**
     * @return the productos
     */
    public ArrayList <Productos> getProductos() {
        return productos;
    }

    /**
     * @param productos the productos to set
     */
    public void setProductos(ArrayList <Productos> productos) {
        this.productos = productos;
    }
    
    
}
