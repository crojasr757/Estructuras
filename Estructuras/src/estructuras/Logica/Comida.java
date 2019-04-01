/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras.Logica;

/**
 *
 * @author Andrés
 */
public class Comida {
   private String nombre;
   private int codigo;
   private int cantidad;

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Comida() {
    }

    public Comida(String nombre, int codigo, int cantidad ) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Comida{" + "nombre=" + nombre + ", codigo=" + codigo + ", cantidad=" + cantidad + '}';
    }

 
}
