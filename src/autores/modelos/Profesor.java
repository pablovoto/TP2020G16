/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autores.modelos;

/**
 *
 * @author pablo
 */
public class Profesor {
    int dni;
    String nombres;
    String apellidos;
    String clave;
    String cargo;
     public int verDni() {
        return dni;
    }

    public void asignarDni(int dni) {
        this.dni = dni;
    }

    public String verApellidos() {
        return apellidos;
    }

    public void asignarApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String verNombres() {
        return nombres;
    }

    public void asignarNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getverClave() {
        return clave;
    }

    public void asignarClave(String clave) {
        this.clave = clave;
    }

    public String verCargo() {
        return cargo;
    }

    public void asignarCargo(String cargo) {
        this.cargo = cargo;
    }
    public Profesor(int dni, String apellidos, String nombres, String clave, String cargo) {
        this.dni = dni;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.clave = clave;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Profesor{" + "dni=" + dni + ", apellidos=" + apellidos + ", nombres=" + nombres + ", clave=" + clave + ", cargo=" + cargo + "}\n";
    }
    
    
    public void mostrar(){
        System.out.println("\nDatos del Profesor:");
        System.out.println("\nApellido y Nombre: " + apellidos + "," + nombres);
        System.out.println("\nDNI: " + dni);
        System.out.println("\nClave: "+clave);
        System.out.println("\nCargo: "+cargo);
    }

   
}