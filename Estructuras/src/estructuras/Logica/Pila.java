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
public class Pila {
     private Dato top;

    public Dato getTop() {
        return top;
    }
   

    public void  push(Dato d){
    if (top == null){
        top = d;
    } else {
        d.setAbajo(top);
        top = d;
    }
}
    public Dato pushR (Dato d1, Dato d2){
        if(d1.getAbajo()!=null){
            d1.setAbajo(pushR(d1.getAbajo(), d2));
    } else {
            d1.setAbajo(d2);
    }
        return d1;
}
    public Dato pop(){
        Dato aux = null;
        if (top!=null){
            aux = top;
            top = aux.getAbajo(); // pasa top a ser el proximo abajo (el segundo)
        } 
        return aux;
    }

    @Override
    public String toString() {
       String s = "";
       Dato aux = top;
       while ( aux != null){
           s+=aux+"\n";     
           aux= aux.getAbajo();
       }
       return s;
    }
    
    
}
