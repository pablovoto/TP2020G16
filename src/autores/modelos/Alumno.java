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
public class Alumno {
    private int dni;
    private String nombres;
    private String apellidos;
    private String clave;
    private String cx;
    public Alumno(int dni, String apellidos, String nombres, String clave, String cx) {
        this.dni = dni;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.clave = clave;
        this.cx = cx;
    }
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

    public String verClave() {
        return clave;
    }

    public void asignarClave(String clave) {
        this.clave = clave;
    }

    public String verCx() {
        return cx;
    }

    public void asignarCx(String cx) {
        this.cx = cx;
    }

    @Override
    public String toString() {
        return "Datos del Alumno:" + "dni=" + dni + ", apellidos=" + apellidos + ", nombres=" + nombres + ", clave=" + clave + ", cx=" + cx ;
    }

   
    
    public void mostrar(){
        System.out.println(this);

    }

    
    
}
