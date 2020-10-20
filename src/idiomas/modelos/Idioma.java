/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idiomas.modelos;

import java.util.Objects;

/**
 *
 * @author pablo
 */
public class Idioma {
    private String unIdioma;
    @Override
    public String toString() {
        return "Publicacion en el idioma "+unIdioma;
    }
    @Override 
    public int hashCode(){
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.unIdioma);
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
        final Idioma other = (Idioma) obj;
        if (!Objects.equals(this.unIdioma, other.unIdioma)) {
            return false;
        }
        return true;
    }
    public String verunIdioma() {
        return unIdioma;
    }

    public void asignarunIdioma(String unIdioma) {
        this.unIdioma = unIdioma;
    }

    public Idioma(String unIdioma) {
        this.unIdioma = unIdioma;
    }
  
    public void mostrar(){
        System.out.println(this);

    }
    
}