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

    Nodo<E> inicio;  // Atributo tipo NODO para ver el comprobar el inicio de la lista
    Nodo<E> fin;  // atributo para comprobar el final de la lista
    Nodo<E> nodoAnterior;
    Nodo<E> nodoActual;

    Nodo<E> nodoVisualizar;  // atributo tipo nodo para acceder a cada empleado individual. por eso no es privado

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

    

    public void Modificar(E emple) {

        nodoActual = inicio;

        while (nodoActual != null) {

            if (nodoActual.getActual().equals(emple)) {

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
    
    public void ComprobarBorrar(){
        
        //si solo hay un empleado ya que siguiente es null.
      if(nodoVisualizar == inicio && nodoVisualizar.getSiguiente() == null) {
          
          borrarNodo();
          System.out.println("hBorrado de 1");
          
      }else{  // si hay mas de uno
          
          borrarNodo();
          System.out.println("Hay mas de uno");
      }
    }

    public E avanzar() {

        
            nodoVisualizar = nodoVisualizar.getSiguiente();
        

        return (E) this.nodoVisualizar.getSiguiente();

    }

    public void visualizarAnterior() //recorre desde el principio de la lista para toparse con el que va antes del visualizado
    {
        nodoAnterior = null;
        nodoActual = inicio;

        while (nodoActual != nodoVisualizar) 
        {
            nodoAnterior = nodoActual;
            nodoActual = nodoActual.getSiguiente();
        }

        nodoVisualizar = nodoAnterior;
    }

    // INNER CLASS por eso es privada
    private class Nodo<E> {

        private Nodo<E> siguiente;  // atributo para movernos al siguiente nodo.
        private Nodo<E> anterior;  // atributo para movernos al nodo anterior.

        E actual;  // atributo para saber que empleado es el empleado actual

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
