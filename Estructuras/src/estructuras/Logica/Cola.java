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
public class Cola {
  private NodoP frente;
  private NodoP ultimo;

    public NodoP getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoP ultimo) {
        this.ultimo = ultimo;
    }
 
 

    public NodoP getFrente() {
        return frente;
    }

    public void setFrente(NodoP frente) {
        this.frente = frente;
    }
   
        public boolean encuentra ( int m){
        boolean encuentra = false;
       NodoP aux = frente;
         
        while (aux!=null){
            if ( aux.getPedido().getNumero() == m){
                encuentra = true;
                return encuentra;
            }
                aux = aux.getAtras();
    }
    return encuentra;
}
        
      
  
    public void encola(NodoP n){
        if (frente == null){
            frente = n;
            ultimo = n;
        } else {
            ultimo.setAtras(n);
            ultimo = n;
        }
    }
    
    public NodoP atiende(){
        NodoP aux = frente;
        if (frente != null){
            frente =frente.getAtras();
          aux.setAtras(null);
        }
        return aux;
    }

    
    @Override
    public String toString() {
        String s = "";
        NodoP aux = frente;
        while (aux!=null){
            s += aux+"\n";
            aux = aux.getAtras();
        }
                return s;
    }
    
}
