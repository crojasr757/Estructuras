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
public class Dato {
     private Comida comida;
  private   Dato abajo;

    

    public Dato(Comida comida) {
        this.comida = comida;
    }

    public Comida getComida() {
        return comida;
    }

    public void setComida(Comida comida) {
        this.comida = comida;
    }

    public Dato getAbajo() {
        return abajo;
    }

    public void setAbajo(Dato abajo) {
        this.abajo = abajo;
    }

    @Override
    public String toString() {
        return comida.toString();
    }
  

}
