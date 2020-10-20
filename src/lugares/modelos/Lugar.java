/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lugares.modelos;

import java.util.Objects;

/**
 *
 * @author pablo
 */
public class Lugar {
    private String unLugar;

    public Lugar(String unLugar) {
        this.unLugar = unLugar;
    }

    @Override
    public String toString() {
        return "Se publicó en"+unLugar;
    }
    
    @Override
    public int hashCode(){
        int hash=3;
        hash=19*hash+ Objects.hashCode(this.unLugar);
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
        final Lugar other = (Lugar) obj;
        if (!Objects.equals(this.unLugar, other.unLugar)) {
            return false;
        }
        return true;
    }

    public String verunLugar() {
        return unLugar;
    }

    public void asginarunLugar(String unLugar) {
        this.unLugar = unLugar;
    }
    public void mostrar(){
       System.out.println(this);

   }
}
