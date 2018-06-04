/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasestring18;

import javafx.beans.binding.Bindings;
import sun.security.util.Length;

/**
 *
 * @author alumno15
 */
public class ClaseString18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String cad1, cad2, cad3, cad4, cad5, SubCad1, SubCad2;
        
        
        
        cad1 = "Hola Barcelona";
        cad2 = new String("Hola Barcelona2"); // Creando un String Como una Clase
        
        int num1 = cad1.length();
        
        
        
        System.out.println(num1);
        
        //Usando el Metodo de la clase string startsWith
        
        cad3 = "NAT000";
        cad4 = "POR000";
        
        if (cad4.startsWith("NAT")){
            System.out.println("Producto natural");
            }else if (cad3.startsWith("PRO")){
            System.out.println("Producto procesado");                
        }else{
            System.out.println("Error");
        }
        
        
        // Usando comparaciones de String
        
        
        cad5=cad4; 
        
        if (cad4==cad5){
            System.out.println("Cadenas Iguales");
        }else{
            System.out.println("Cadenas Diferentes");
        }
        
        if (cad4.equals(cad5)){
            System.out.println("Cadenas equal Iguales");
        }else {
            System.out.println("Dadenas equal Diferentes");
        }
        
        // Extraer subcadena de una cadena String
        
        cad5 = "NAT0000";
        
        SubCad1 = cad5.substring(0,3);
        
        System.out.println(SubCad1);
        
        SubCad2 = cad5.substring(3);
        
        System.out.println(SubCad2);
        
        // Ejercicio para extraer una cadena intermedia;

        cad5="Curso Java 2017";
        
        SubCad1 = cad5.substring(6,10);
        
        System.out.println(SubCad1);
        
        System.out.println("Posicion  0 Subcad1 "+SubCad1.charAt(0));
        System.out.println("Posicion 10 cad5 "+cad5.charAt(10));
        
        for (int x=0; x<SubCad1.length(); x++){            
            System.out.print(SubCad1.charAt(x));
            System.out.print(x);            
            
        }
                                 
    }    
    
    
    
}
