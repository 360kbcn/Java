/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteempresaprm;

/**
 *
 * @author Pedro Rios i Macias Curso Java 11/2017
 */
public class ClasePersona {
    
    public String nombre;
    public char genero;
    private int edad;

    public ClasePersona() {}
    
    public ClasePersona(String nombre, char genero, int edad) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
    
     
    }
      public int getedad(){
        return  this.edad;
        
    }
    
    public void setedad(int edad){
        this.edad=edad;
    }
    
    
    public void mostrarPersona(){
        System.out.println("\n");
        System.out.println("Nombre.:"+nombre);
        System.out.println("Genero.:"+genero);
        System.out.println("edad.:"+edad);
    }
    
}

    

