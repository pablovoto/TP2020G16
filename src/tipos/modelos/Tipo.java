/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipos.modelos;

/**
 *
 * @author pablo
 */
public class Tipo {
    private String nombre;

    public Tipo(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Tipo{" + "nombre=" + nombre + "}\n";
    }

    public String verNombre() {
        return nombre;
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }
    
}