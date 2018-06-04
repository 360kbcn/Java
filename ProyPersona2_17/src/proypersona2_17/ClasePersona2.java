/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proypersona2_17;

/**
 *
 * @author alumno15
 */
public class ClasePersona2 {
    String nom;
    String poblacion;
    int sueldo;

    ClasePersona2() {};

    public ClasePersona2(String nom, String poblacion, int sueldo) {
        this.nom = nom;
        this.poblacion = poblacion;
        this.sueldo = sueldo;
    }
    
    void mostrarPersona(){
        System.out.println("Nombre "+this.nom);
        System.out.println("Poblacion "+this.poblacion);
        System.out.println("Sueldo "+this.sueldo);
        System.out.println("\n");
        
    }
    
    void ponera0(ClasePersona2 persona){
        persona.sueldo=0;
    }
    
    
}
