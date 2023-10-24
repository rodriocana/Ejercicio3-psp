/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3.psp;

import javax.swing.JOptionPane;

/**
 *
 * @author Rodri
 */
public class Lista<E> {

    private Nodo<E> inicio;  // creamos dos atributos de la clase NODO para usar en la clase Lista, inicio y fin
    private Nodo<E> fin;
    private Nodo<E> nodoAnterior;
    private Nodo<E> nodoActual;

    Nodo<E> nodoVisualizar;  // nodo para acceder a cada empleado individual. por eso no es privado

    public Lista() {

        this.inicio = null;
        this.fin = null;
        this.nodoVisualizar = null;
    }

    public void insertar(E emple) {

        Nodo<E> nuevoNodo = new Nodo(emple);
        nuevoNodo.setSiguiente(this.inicio);
        this.inicio = nuevoNodo;

        this.nodoVisualizar = this.inicio;

    }
    
    public void Modificar(E emple){
        
        nodoActual = inicio;
        
        while(nodoActual !=null){
            
            if(nodoActual.getActual().equals(emple)){
                
                nodoActual.setActual(emple);
                break;
            }
            
            nodoActual.actual = (E) nodoActual.siguiente;
            
        }
    }

    public void borrarNodo() {
        if (nodoVisualizar == inicio && nodoVisualizar.getSiguiente() == null) //em caso de que solo haya 1 nodo
        {
            this.inicio = null;
            this.nodoVisualizar = null;

            return;
        }
        if (nodoVisualizar == inicio) //cuando es el ultimo nodo (habiendo más nodos)
        {
            inicio = nodoVisualizar.getSiguiente();
        } else //para las demás casuisticas
        {
            Nodo<E> siguiente = nodoVisualizar.getSiguiente();
            visualizarAnterior();
            nodoVisualizar.setSiguiente(siguiente);
        }
    }

    public E visualizar() {

        return this.nodoVisualizar.getActual();

    }

    public E avanzar() {

        if (nodoVisualizar != null) {
            nodoVisualizar = nodoVisualizar.getSiguiente();
        }

        return this.nodoVisualizar.getActual();

    }

    public void visualizarAnterior() //recorre desde el principio de la lista para toparse con el que va antes del visualizado
    {
        nodoAnterior = null;
        nodoActual = inicio;

        while (nodoActual != nodoVisualizar) {
            nodoAnterior = nodoActual;
            nodoActual = nodoActual.getSiguiente();
        }

        nodoVisualizar = nodoAnterior;
    }

    // INNER CLASS por eso es privada
    private class Nodo<E> {

        private Nodo<E> siguiente;  //
        private Nodo<E> anterior;

        E actual;

        public Nodo(E emple) {

            this.siguiente = null;
            this.actual = emple;
        }

        public Nodo<E> getSiguiente() {
            return this.siguiente;
        }

        public void setSiguiente(Nodo<E> siguiente) {
            this.siguiente = siguiente;
        }

        public E getActual() {
            return actual;
        }

        public void setActual(E emple) {
            this.actual = emple;
        }

        public Nodo<E> getAnterior() {
            return anterior;
        }

        public void setAnterior(Nodo<E> anterior) {
            this.anterior = anterior;
        }

    }

}
