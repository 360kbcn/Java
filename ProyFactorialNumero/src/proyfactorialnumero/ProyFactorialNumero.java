/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyfactorialnumero;

/**
 *
 * @author alumno15
 */

import java.util.Scanner;

public class ProyFactorialNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int factor = 0, result=0, sumando=0;
       
        
        Scanner sc = new  Scanner (System.in);
        
        System.out.println("Introduce un numero ");
        
        int valor = sc.nextInt();
        
        factor = valor * valor-1;            
                
        for (int cont  = valor -1;cont>-1 ;cont-- ){           
                                                         
            System.out.println("La variable valor  =  "+valor+" El valor de cont es "+cont+" Valor por contador vale "+factor+" La suma de los resultados es "+sumando);
            
            result = 
            
            valor --; 
                 
            
            
            
        }
        
        
        
    }
    
}
