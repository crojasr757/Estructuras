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
public class Pedido {
    private int numero;
    private String plato;
    private String bebida;

    public Pedido() {
    }

    public Pedido(int numero, String plato, String bebida) {
        this.numero = numero;
        this.plato = plato;
        this.bebida = bebida;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPlato() {
        return plato;
    }

    public void setPlato(String plato) {
        this.plato = plato;
    }

    public String getBebida() {
        return bebida;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

    @Override
    public String toString() {
        return "Pedido{" + "numero=" + numero + ", plato=" + plato + ", bebida=" + bebida + '}';
    }
    
    
    
}
