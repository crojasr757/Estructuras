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
public class NodoP {
     Pedido pedido;
    NodoP atras;

    public NodoP() {
    }

    public NodoP(Pedido pedido) {
        this.pedido = pedido;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
  
   

    public NodoP getAtras() {
        return atras;
    }

    public void setAtras(NodoP atras) {
        this.atras = atras;
    }

    @Override
    public String toString() {
        return pedido.toString();
    }
}
