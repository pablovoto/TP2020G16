/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupos.modelos;

import java.util.ArrayList;

/**
 *
 * @author pablo
 */
public class Grupo {
    private String nombre;
    private String descripcion;
    private ArrayList<MiembroEnGrupo> MiembrosEnGrupo;
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
    
    public ArrayList<MiembroEnGrupo> verMiembrosEnGrupo() {
        return MiembrosEnGrupo;
    }
    
    public void asignarMiembrosEnGrupo(ArrayList<MiembroEnGrupo> MiembrosEnGrupo) {
        this.MiembrosEnGrupo = MiembrosEnGrupo;
    }
    
    public Grupo(String nombre){
        this.nombre=nombre;
    }
    
    public Grupo(String nombre, String descripcion) {
        this(nombre);
        this.descripcion = descripcion;
    }

    public Grupo(String nombre, String descripcion, ArrayList<MiembroEnGrupo> MiembrosEnGrupo) {
        this(nombre,descripcion);
        this.MiembrosEnGrupo = MiembrosEnGrupo;
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