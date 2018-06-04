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
public class ClaseHijo extends ClasePadre{
    
    public String estudios;

    ClaseHijo() {
    }

    ClaseHijo(String estudios, String profesion, String nombre, int edad) {
        super(profesion, nombre, edad);
        this.estudios = estudios;
    }

    public void mostrarDatosHijos(){
        System.out.println("Estudios.:"+this.estudios);
    }
    
    
}
