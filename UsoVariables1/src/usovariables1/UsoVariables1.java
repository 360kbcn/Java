/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usovariables1;

/**
 *
 * @author alumno15
 */
public class UsoVariables1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Declaracion de variables
        
        char caracter;  //tipo char simple 2 bytes
        int numero; // tipo int entero de 4 bytes
        byte edad; // tipo byte mas pequeño 1 bytes 
        short cp; // tipo short tamaño 2 bytes
        boolean pasa; // tipo boleand true false 1 bytes
        String palabra; // tipo string  
        
        caracter = 'C';
   
        numero = 13;
        
        pasa = true;
        
        edad = 47;
        
        cp = 8917;
        
        palabra = "Cien cañones por banda";
        
        System.out.println("Bienvenido al Curso");
        
        System.out.println("\n"); // igual que en html5 \n salto de linea
        
        System.out.println("Valor de char = " + caracter + " Y el valor int es= "+ numero);
        
        System.out.println("Valor de boolean= " + pasa);
        
        System.out.println("Valor de byte = " + edad + " Y el short es= "+ cp);
        
        System.out.println("Valor de string = "+ palabra);
   }
   
}
