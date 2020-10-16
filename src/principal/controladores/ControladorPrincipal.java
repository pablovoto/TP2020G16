package principal.controladores;


import autores.modelos.Alumno;
import autores.modelos.Profesor;
import autores.vistas.VentanaAMAlumno;
import autores.vistas.VentanaAMProfesor;
import grupos.modelos.Grupo;
import grupos.vistas.VentanaAMGrupo;
import idiomas.modelos.Idioma;
import idiomas.vistas.VentanaAIdioma;
import java.util.ArrayList;
import lugares.modelos.Lugar;
import lugares.vistas.VentanaALugar;
import palabrasclaves.modelos.PalabraClave;
import palabrasclaves.vistas.VentanaAPalabraClave;
import tipos.modelos.Tipo;
import tipos.vistas.VentanaATipo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cristian
 */
public class ControladorPrincipal {
    public static void main(String[] args) {
// guardarlos en su correspondiente ArrayList. Luego
//recorrerlos y mostrar sus contenidos por pantalla.
    ArrayList<Alumno> Alumnos =new ArrayList<>();
    ArrayList<Profesor> Profesores =new ArrayList<>();
    ArrayList<Idioma> Idiomas =new ArrayList<>();
    ArrayList<Lugar> Lugares =new ArrayList<>();
    ArrayList<PalabraClave> PalabrasClaves =new ArrayList<>(); 
    ArrayList<Tipo> Tipos =new ArrayList<>();
    ArrayList<Grupo> Grupos =new ArrayList<>(); 

    VentanaAMAlumno ventanaAlumno = new VentanaAMAlumno(null); //se instancia la ventana
        ventanaAlumno.setLocationRelativeTo(null); //se centra la ventana
        ventanaAlumno.setVisible(true); //se hace visible la ventana     
     
    VentanaAMProfesor ventanaProfesor = new VentanaAMProfesor(null);
        ventanaProfesor.setLocationRelativeTo(null); 
        ventanaProfesor.setVisible(true);    
        
    VentanaAMGrupo ventanaGrupo = new VentanaAMGrupo(null); 
        ventanaGrupo.setLocationRelativeTo(null); 
        ventanaGrupo.setVisible(true); 
        
    VentanaAIdioma ventanaIdioma = new VentanaAIdioma(null); 
        ventanaIdioma.setLocationRelativeTo(null); 
        ventanaIdioma.setVisible(true);    
        
    VentanaALugar ventanaLugar = new VentanaALugar(null); 
        ventanaLugar.setLocationRelativeTo(null);
        ventanaLugar.setVisible(true);   
        
    VentanaAPalabraClave ventanaPalabraClave = new VentanaAPalabraClave(null); 
        ventanaPalabraClave.setLocationRelativeTo(null); 
        ventanaPalabraClave.setVisible(true);   
        
     VentanaATipo ventanaTipo = new VentanaATipo(null); 
        ventanaTipo.setLocationRelativeTo(null); 
        ventanaTipo.setVisible(true);       

 }   
}

