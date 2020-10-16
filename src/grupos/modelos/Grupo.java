/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupos.modelos;

/**
 *
 * @author pablo
 */
public class Grupo {
    private String nombre;
    private String descripcion;
    
    public String verNombre() {
        return nombre;
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }

    public String verDescripcion() {
        return descripcion;
    }

    public void asignarDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Grupo(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    public void mostrar(){
        System.out.println("\nDatos del grupo:");
        System.out.println("\nNombre:"+nombre);
        System.out.println("\nDescripción"+descripcion);
    }

    @Override
    public String toString() {
        return "Grupo{" + "nombre=" + nombre + ", descripcion=" + descripcion + "}\n";
    }

    
}