/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proypolimorfismomain35;

/**
 *
 * @author alumno15
 */
public class ClasePersona {
    
    public String nombre;
    public int edad;

    ClasePersona() {
    }

    public ClasePersona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void mostrarPersona(){
        System.out.println("Nombre.:"+this.nombre);
        System.out.println("Edad...:"+this.edad);
    }
    
    
    
    
    
}
