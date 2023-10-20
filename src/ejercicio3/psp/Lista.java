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
    //private Nodo<E> fin;

    Nodo<E> nodoVisualizar;

    public Lista() {

        this.inicio = null;
        //this.fin = null;
        this.nodoVisualizar = null;
    }

    public void insertar(E emple) {

        Nodo<E> nuevoNodo = new Nodo(emple);
        nuevoNodo.setSiguiente(this.inicio);
        this.inicio = nuevoNodo;

        this.nodoVisualizar = this.inicio;

    }

    public E visualizar() {

        return this.nodoVisualizar.getActual();

    }

    

    public void Avanzar() {

    }

    public void Retroceder() {

    }

    public void Modificar() {

    }

    // INNER CLASS
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

    }

}
