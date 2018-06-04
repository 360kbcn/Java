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
public class ClaseCantante extends ClasePersona{
    
    public String Estilo;

    ClaseCantante() {
    }

    ClaseCantante(String Estilo, String nombre, int edad) {
        super(nombre, edad);
        this.Estilo = Estilo;
    }
    
    @Override
     public void mostrarPersona(){
        System.out.println("Nombre.:"+this.nombre);
        System.out.println("Edad...:"+this.edad);
        System.out.println("Estilo.:"+this.Estilo);
    }
    
    
    
}
