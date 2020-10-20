/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipos.modelos;

import java.util.Objects;

/**
 *
 * @author pablo
 */
public class Tipo {
    private String Tipo;

    public Tipo(String Tipo) {
        this.Tipo = Tipo;
    }
    @Override
    public int hashCode(){
        int hash=7;
        hash=79*hash+Objects.hashCode(this.Tipo);
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
        final Tipo other = (Tipo) obj;
        if (!Objects.equals(this.Tipo, other.Tipo)) {
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return "Tipo de material:" + Tipo;
    }

    public String verTipo() {
        return Tipo;
    }

    public void asignarTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    public void mostrar(){
        System.out.println(this);
    }
}