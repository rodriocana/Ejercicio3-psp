/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3.psp;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Empleado {

    Scanner sc = new Scanner(System.in);

    private int NumeroEmpleado;
    private String Nombre;
    private String Apellido;
    private GregorianCalendar FechaDeAlta;
    private int Sueldo;
    int contadorEmple = 0;

    // constructores
    public Empleado(String Nombre, String Apellido, int Sueldo, int NumeroEmpleado) {

        this.NumeroEmpleado = NumeroEmpleado;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.FechaDeAlta = new GregorianCalendar();
        this.Sueldo = Sueldo;
    }

    public Empleado() {

        pedirDatos();
    }

    public Empleado(int NumeroEmpleado, String Nombre) {

    }

    public void pedirDatos() {

        System.out.println("Introduce el nombre del empleado: ");
        Nombre = sc.next();

        System.out.println("Introduce el apellido del empleado: ");
        Apellido = sc.next();

        System.out.println("Introduce el sueldo del empleado: ");
        Sueldo = sc.nextInt();
        sc.nextLine();

    }

    public int getNumeroEmpleado() {
        return NumeroEmpleado;
    }

    public void setNumeroEmpleado(int NumeroEmpleado) {
        this.NumeroEmpleado = NumeroEmpleado;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public GregorianCalendar getFechaDeAlta() {
        return FechaDeAlta;
    }

    public void setFechaDeAlta(GregorianCalendar FechaDeAlta) {
        this.FechaDeAlta = FechaDeAlta;
    }

    public int getSueldo() {
        return Sueldo;
    }

    public void setSueldo(int Sueldo) {
        this.Sueldo = Sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "NumeroEmpleado=" + NumeroEmpleado + ", Nombre=" + Nombre + ", Apellido=" + Apellido + ", Sueldo=" + Sueldo + '}';
    }

}
