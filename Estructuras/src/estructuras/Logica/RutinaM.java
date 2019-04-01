/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras.Logica;

import estructuras.Logica.Pedido;
import estructuras.Logica.NodoP;
import estructuras.Logica.Mesa;
import estructuras.Logica.Cola;

/**
 *
 * @author Andrés
 */
public class RutinaM {
    Cola miCola = new Cola();
    public void probarMesas(){
          Mesa m = new Mesa();
        
        m.insertar(8, "ocupada");
        m.insertar(10, "desocupada");
        m.insertar(9,"desocupada");
        m.insertar(4,"desocupada");
        m.insertar(1,"ocupada");
        m.insertar(2,"desocupada");
        m.insertar(5,"desocupada");
        m.insertar(7,"desocupada");
        m.insertar(9,"desocupada");
        m.insertar(6,"ocupada");
        m.insertar(3,"ocupada");
         System.out.println("Mesas:");
        m.inOrden();
    }
     public void probarCola(){
        
        
        miCola.encola(new NodoP(new Pedido(50, "Pasta", "CocaCola")));
        miCola.encola(new NodoP(new Pedido(5, "Lomito", "Sandia en agua")));
        miCola.encola(new NodoP(new Pedido(15, "Rice and beans", "CocaCOla")));
        miCola.encola(new NodoP(new Pedido(33, "Pancakes", "Jugo de naranja")));
        System.out.println("----------------- Mostrar Cola --------------");
        System.out.println(miCola);
        System.out.println("----------------- Se atiende a dos -------------");
        System.out.println(miCola.atiende());
        System.out.println(miCola.atiende());
        System.out.println("----------------- Se va a agregar uno mas -------------");
        miCola.encola(new NodoP(new Pedido(35, "Gallopinto","Café")));
        System.out.println(miCola);
        System.out.println(miCola.encuentra(33));
    }
}
