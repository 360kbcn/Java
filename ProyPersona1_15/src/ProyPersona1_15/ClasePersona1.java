/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyPersona1_15;

/**
 *
 * @author alumno15
 */
public class ClasePersona1 {
    
    // 1.- Variables de clase - Atributos de Clase 
    String nombre;
    int edad;
    String ocupacion;
    String poblacion;
    char genero;
    int sueldo;
    
    
    // 2.- Constructores de Clase
    ClasePersona1() {};

    ClasePersona1(String nombre, int edad, String ocupacion, String poblacion,
                  char genero, int sueldo) {
        
        
        /* this hace referencia al atributo de la clase = (this.nombre) y (nombre) es
        el valor que le damos desde main
        */
        this.nombre = nombre;
        this.edad = edad;
        this.ocupacion = ocupacion;
        this.poblacion = poblacion;
        this.genero = genero;
        this.sueldo = sueldo;
        
        
        
    }
    
    ClasePersona1 (String nombre, int edad){
        
        this.nombre = nombre;
        this.edad = edad;
        
    }
    
    
    
    
    
    
    // 3.- Metodos de Clases
        
    void mostrartvaloresobjeto(){
            
    System.out.println("Nombre "+nombre);
    System.out.println("Edad "+edad);
    System.out.println("Ocupacion "+ocupacion);
    System.out.println("Poblacion "+poblacion);
    System.out.println("Genero "+genero);
    System.out.println("Sueldo "+sueldo);
    System.out.println("\n");
        
    }
    
    void mostrartvaloresobjeto2(){
    System.out.println("Nombre "+nombre);
    System.out.println("Edad "+edad);
    System.out.println("\n");
    }
    
}
