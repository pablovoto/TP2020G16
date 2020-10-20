
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publicaciones.modelos;

import grupos.modelos.MiembroEnGrupo;
import idiomas.modelos.Idioma;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;
import lugares.modelos.Lugar;
import palabrasclaves.modelos.PalabraClave;
import tipos.modelos.Tipo;

/**
 *
 * @author pablo
 */
public class Publicacion {
    private String Titulo;
    private LocalDate fechaPublicacion;
    private String Enlace;
    private String Resumen;
    private MiembroEnGrupo unMiembroEnGrupo;
    private Tipo unTipo;
    private Idioma unIdioma;
    private Lugar unLugar;
    private ArrayList<PalabraClave> ListaPalabrasClaves;
    
    @Override
    public int hashCode(){
        int hash=3;
        hash=41*hash+Objects.hashCode(this.Titulo);
        return hash;
    }
    @Override
    public boolean equals(Object obj){
        if(this==obj){
            return true;
        }
        if(obj==null){
            return false;
        }
        if(getClass()!=obj.getClass()){
        return false;
        }
        final Publicacion other=(Publicacion)obj;
        if(!Objects.equals(this.Titulo,other.Titulo)){
            return false;
        }
        return true;
    }
    public Publicacion(String Titulo,LocalDate fechaPublicacion,String Enlace,String Resumen,MiembroEnGrupo unMiembroEnGrupo,Tipo unTipo,Idioma unIdioma,Lugar unLugar,ArrayList<PalabraClave> ListaPalabrasClaves){
        this.unTipo=unTipo;
        this.Enlace=Enlace;
        this.Titulo=Titulo;
        this.Resumen=Resumen;
        this.unLugar=unLugar;
        this.unIdioma=unIdioma;
        this.fechaPublicacion=fechaPublicacion;
        this.unMiembroEnGrupo=unMiembroEnGrupo;
        this.ListaPalabrasClaves=ListaPalabrasClaves;
    }
    
    public void mostrar(){
        System.out.println( "\nTítulo: "+this.Titulo+
                "\nAutor: "+unMiembroEnGrupo.verUnProfesor().verApellidos()+", "+unMiembroEnGrupo.verUnProfesor().verNombres()+
                "\nGrupo: "+unMiembroEnGrupo.verUnGrupo().verNombre()+
                "\nRol: "+ unMiembroEnGrupo.verRol()+
                "\nFecha de publicación: "+ this.fechaPublicacion+
                "\nTipo: "+this.unTipo.verTipo() +
                "\nIdioma: "+this.unIdioma.verunIdioma()+
                "\nLugar: "+this.unLugar.verunLugar()+
                "\nPalabras Claves: "+
                        "\n----------------");
        for (PalabraClave g : ListaPalabrasClaves) {
            g.mostrar();}
            System.out.println("\nEnlace: "+this.Enlace+
                "\nResumen: "+ this.Resumen);
    }
    public String verTitulo() {
        return Titulo;}
    public void asignarTitulo(String Titulo) {
        this.Titulo = Titulo;}
    public LocalDate verFechaPublicacion() {
        return fechaPublicacion;}
    public void verFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;}
    public String verEnlace() {
        return Enlace;}
    public void asignarEnlace(String Enlace) {
        this.Enlace = Enlace;}
    public String verResumen() {
        return Resumen;}
    public void asignarResumen(String Resumen) {
        this.Resumen = Resumen;}
    public MiembroEnGrupo verUnMiembroEnGrupo() {
        return unMiembroEnGrupo;}
    public void asignarUnMiembroEnGrupo(MiembroEnGrupo unMiembroEnGrupo) {
        this.unMiembroEnGrupo = unMiembroEnGrupo;}
    public Tipo verUnTipo() {
        return unTipo;}
    public void asignarUnTipo(Tipo unTipo) {
        this.unTipo = unTipo;}
    public Idioma verUnIdioma() {
        return unIdioma;}
    public void asignarUnIdioma(Idioma unIdioma) {
        this.unIdioma = unIdioma;}
    public Lugar verUnLugar() {
        return unLugar;}
    public void asignarUnLugar(Lugar unLugar) {
        this.unLugar = unLugar;}
    public ArrayList<PalabraClave> verListaPalabrasClaves() {
        return ListaPalabrasClaves;}
    public void asignarListaPalabrasClaves(ArrayList<PalabraClave> ListaPalabrasClaves) {
        this.ListaPalabrasClaves = ListaPalabrasClaves;}
}
