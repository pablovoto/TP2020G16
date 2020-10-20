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
import java.util.ArrayList;
import grupos.modelos.*;
public class Profesor {
private String nombres;
private String apellidos;
private String clave;
private Cargo cargo;
private ArrayList<MiembroEnGrupo> MiembroEnGrupo;
private int dni;

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + this.dni;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Profesor other = (Profesor) obj;
        if (this.dni != other.dni) {
            return false;
        }
        return true;
    }


 //Constructores
    public Profesor(String nombres, String apellidos, String clave, Cargo cargo, int dni) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.clave = clave;
        this.cargo = cargo;
        this.dni = dni;
    }
  //Metodo toString
    @Override
    public String toString(){
    return "Datos del Profesor:\n1."+apellidos+", "+nombres+"\n2.Dni: "+dni+"\n3."+cargo;}
 //Metodo para mostrar
    public void mostrar() {
       System.out.println(this);}
 //Metodo Get Set
    public ArrayList<MiembroEnGrupo> verMiembroEnGrupo() {
        return MiembroEnGrupo;}
    public void asignarMiembroEnGrupo(ArrayList<MiembroEnGrupo> MiembroEnGrupo) {
        this.MiembroEnGrupo = MiembroEnGrupo;}
    public String verNombres() {
        return nombres;}
    public void asignarNombres(String nombres) {
        this.nombres = nombres;}
    public String verApellidos() {
        return apellidos;}
    public void asignarApellidos(String apellidos) {
        this.apellidos = apellidos;}
    public String verClave() {
        return clave;}
    public void asignarClave(String clave) {
        this.clave = clave;}
    public Cargo verCargo() {
        return cargo;}
    public void asignarCargo(Cargo cargo) {
        this.cargo = cargo;}
    public int verDni() {
        return dni; }
    public void asignarDni(int dni) {
        this.dni = dni;}
}