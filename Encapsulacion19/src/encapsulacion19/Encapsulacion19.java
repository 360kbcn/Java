/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulacion19;

import javafx.scene.paint.Color;
import jdk.nashorn.internal.codegen.CompilerConstants;

/**
 *
 * @author alumno15
 */
public class Encapsulacion19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nombre;
        String especie = "perro";
        String Color_Pelo = "Blanco";
        int edad;
        
        ClaseAnimal an1 = new ClaseAnimal();
       
        
        an1.nombre = "Tobi";
        an1.asignarEspecie(especie);
        an1.asignarColor(Color_Pelo);
        an1.edad = 3;
        
        
        System.out.println("Nombre "+an1.nombre);
        System.out.println("Especie "+an1.mostrartEspecie());
        System.out.println("Edad "+an1.edad);
        System.out.println("Color de Pelo "+an1.colorpelo());
                
    }
    
}
