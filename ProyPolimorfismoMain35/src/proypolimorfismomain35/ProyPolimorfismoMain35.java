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
public class ProyPolimorfismoMain35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        int num [] = new int [3];
        
        num[0] =4;
        
        ClasePersona personas [] = new ClasePersona [3];
        
         
        //personas[0].nombre="Armando Bronca Segura";
        //personas[0].edad=45;
        
        // personas[1] = new ClasePersona("Manuel Rompe Casas", 35);
        
        
        personas[0] = new ClasePersona("Robin Williams", 40);
        personas[1] = new ClasePersona();
        personas[2] = new ClaseCantante("Pop", "Armando", 29);
        
        for (int contador=0; contador<personas.length; contador++){
            System.out.println("OBJETO.:"+contador);
            personas[contador].mostrarPersona();
        }                     
         
    }
    
}
