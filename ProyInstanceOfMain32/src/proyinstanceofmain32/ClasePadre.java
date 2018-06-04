/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyinstanceofmain32;

/**
 *
 * @author alumno15
 */
public class ClasePadre extends ClaseAbuelo{
    
    public String profesion;

    ClasePadre() {
    }

    ClasePadre(String profesion, String nombre, int edad) {
        super(nombre, edad);
        this.profesion = profesion;
    }

    public void mostrarDatosPadre(){        
        System.out.println("Profesion.:"+this.profesion);
    }
    
    
    
    
}
