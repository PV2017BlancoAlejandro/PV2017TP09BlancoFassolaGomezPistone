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
public class Productos implements Serializable {
    private String codigo;
    private String nombre;
    private double preciounit;
    private String cuota;

    public Productos() {
    }

    public Productos(String codigo, String nombre, double preciounit, String cuota) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.preciounit = preciounit;
        this.cuota = cuota;
    }

   

    public double calcularPrecio(){
        double c,pre,cuotaa;
        int i;
        pre=0;
        c=Double.parseDouble(cuota);
        cuotaa = (preciounit/c);
        if(c == 1){
            return preciounit;
        }
        i=0;
        while (i<c){
            pre = pre + cuotaa;
            cuotaa = cuotaa*1.015;
            i=i+1;
        }
        return pre;
    }
    
    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the preciounit
     */
    public double getPreciounit() {
        return preciounit;
    }

    /**
     * @param preciounit the preciounit to set
     */
    public void setPreciounit(double preciounit) {
        this.preciounit = preciounit;
    }



    /**
     * @return the cuota
     */
    public String getCuota() {
        return cuota;
    }

    /**
     * @param cuota the cuota to set
     */
    public void setCuota(String cuota) {
        this.cuota = cuota;
    }

    
}
