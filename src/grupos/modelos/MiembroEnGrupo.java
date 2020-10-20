/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupos.modelos;

import autores.modelos.Profesor;

/**
 *
 * @author pablo
 */
public class MiembroEnGrupo {
private Rol rol;
private Profesor unProfesor;
private Grupo unGrupo;
    public MiembroEnGrupo(Rol rol,Profesor unProfesor,Grupo unGrupo){
        this.rol=rol;
        this.unProfesor=unProfesor;
        this.unGrupo=unGrupo;
    }

    @Override
    public String toString() {
        return "Autor: "+this.unProfesor.verApellidos()+", "+this.unProfesor.verNombres()+"\nRol: "+this.rol+"\n Grupo: "+this.unGrupo.verNombre();
    }
    public void mostrar(){
        System.out.println(this);
    }
    public Rol verRol(){
        return rol;
    }
    public void asignarRol(Rol rol){
        this.rol=rol;
    }
    public Profesor verUnProfesor(){
        return unProfesor;
    }
    public void asignarUnProfesor(Profesor unProfesor){
        this.unProfesor=unProfesor;
    }
    public Grupo verUnGrupo(){
        return unGrupo;
    }
    public void asignarUnGrupo(Grupo unGrupo){
        this.unGrupo=unGrupo;
    }
}
