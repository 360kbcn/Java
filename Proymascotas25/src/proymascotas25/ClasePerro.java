/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proymascotas25;

/**
 *
 * @author alumno15
 */
public class ClasePerro extends ClaseAnimal{
    
    public boolean esPeligroso;

    ClasePerro() {
       
    }

    ClasePerro(String nombre, String especie, boolean esPeligroso) {
        super(nombre,especie);
        this.esPeligroso = esPeligroso;
    }
    
    
    
    void perro(){
        System.out.println("\n--------------");
        System.out.println("Nombre "+this.nombre);
        System.out.println("Especie "+this.getEspecie());
        System.out.println("Peligroso "+this.esPeligroso);
    }    
}
