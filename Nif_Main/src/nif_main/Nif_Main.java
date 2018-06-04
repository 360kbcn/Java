/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nif_main;

/**
 *
 * @author alumno15
 */

import java.util.*;
public class Nif_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numDNI, Introducido;
        
        final int POSICIONES=23;
        
        String cadena = "TRWAGMYFPDXBNJZSQVHLCKE";
        
        char letras[];
        
        Scanner sc = new Scanner(System.in);
                
        System.out.println("Introduce el Numero de DNI.:");
        
        Introducido=sc.nextInt();
        numDNI = Introducido%POSICIONES;
        
   
        letras = cadena.toCharArray();
        
        System.out.println("Al DNI numero.:"+Introducido+" Le corresponde la letra.:"+letras[numDNI]);
        
        
        
    }
    
}
