/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maintablas_primos;

/**
 *
 * @author alumno15
 */
public class ClaseNumerosPrimos {
    
    int numero, contador;
    
    int Numerosprimos (int numero){
        
        for (int i=1;i<numero+1;i++){
            
            if(numero%i==0){
                contador++;
            }
        }
        
        if (contador>2){
            System.out.println(" y es compuesto ");
        }else{
            System.out.println(" y es primo ");      
        }
                   
        return numero;
    }
    
}
