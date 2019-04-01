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
public class NodoM {
        int id;
        String estado;
    NodoM hijoIzq;
    NodoM hijoDer;

    public NodoM(int id, String estado) {
        this.id = id;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public NodoM getHijoIzq() {
        return hijoIzq;
    }

    public void setHijoIzq(NodoM hijoIzq) {
        this.hijoIzq = hijoIzq;
    }

    public NodoM getHijoDer() {
        return hijoDer;
    }

    public void setHijoDer(NodoM hijoDer) {
        this.hijoDer = hijoDer;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
