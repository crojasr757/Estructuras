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
public class Mesa {
     NodoM raiz = null;
    int contador = 0;

    public NodoM getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoM raiz) {
        this.raiz = raiz;
    }
    
    
    
    public void insertar(int x, String s){
         if (raiz==null){
            raiz = new NodoM(x,s);
        } else {
            insertarRec(raiz,x,s);
            
        
    }
    }
    
    
    public void insertarRec(NodoM n, int x, String s){
       if (x<= n.getId()){
           if (n.getHijoIzq()==null){
               n.setHijoIzq(new NodoM(x,s));
           } else {
               insertarRec(n.getHijoIzq(),x,s);
           }
       } else {
            if (n.getHijoDer()==null){
               n.setHijoDer(new NodoM(x,s));
           } else {
               insertarRec(n.getHijoDer(),x,s);
           }
       }
        }
    
    public void inOrden(){
        if (raiz != null){
            inOrdenRec(raiz);
            
        }else {
            System.out.println("Arbol vacio");
        }
    }
    
    public void inOrdenRec(NodoM n){
        if (n!=null){
            inOrdenRec(n.getHijoIzq());
            System.out.print(n.getId() + " -> " + n.getEstado() );
            System.out.println("");
            inOrdenRec(n.getHijoDer());
        }
    }
   
}

 
