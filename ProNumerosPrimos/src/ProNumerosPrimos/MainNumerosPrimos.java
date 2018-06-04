/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProNumerosPrimos;

/**
 *
 * @author alumno15
 */

import java.util.Scanner;
       
public class MainNumerosPrimos {
    
    public static void main(String[] args) {
        
        int numero = 0;
        
        System.out.println("Introduce un numero  ");
        Scanner n1 = new Scanner(System.in); 
        numero = n1.nextInt();
        
        ClaseNumerosPrimos  Objeto_numero = new ClaseNumerosPrimos(); // Creacion Objeto
        
        numero = Objeto_numero.Numerosprimos(numero);
        
        System.out.println("");

        
        
        
    }
    
}
