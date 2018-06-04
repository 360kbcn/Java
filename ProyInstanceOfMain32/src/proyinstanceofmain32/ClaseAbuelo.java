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
public class ClaseAbuelo {
    
    public String nombre;
    public int edad;

    ClaseAbuelo() {
    }

    ClaseAbuelo(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void mostrarDatosAbuelo(){        
        System.out.println("Nombre.:"+this.nombre);
        System.out.println("Edad.:"+this.edad);
    }
    
}
