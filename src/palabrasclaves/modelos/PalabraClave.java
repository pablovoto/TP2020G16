/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palabrasclaves.modelos;

/**
 *
 * @author pablo
 */
import java.util.Objects;

public class PalabraClave {
private String PalabraClave;

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + Objects.hashCode(this.PalabraClave);
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
        final PalabraClave other = (PalabraClave) obj;
        if (!Objects.equals(this.PalabraClave, other.PalabraClave)) {
            return false;
        }
        return true;
    }



    
    public PalabraClave(String PalabraClave) {
        this.PalabraClave = PalabraClave;}
    
    @Override
    public String toString(){
    return "Palabra Clave: "+PalabraClave;}
    
    public void mostrar() {
       System.out.println(this);}    
    
    public String verPalabraClave() {
        return PalabraClave;
    }

    public void asignarPalabraClave(String PalabraClave) {
        this.PalabraClave = PalabraClave;
    }
    
}