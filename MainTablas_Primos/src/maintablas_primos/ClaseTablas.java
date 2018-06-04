/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maintablas_primos;

import com.sun.media.sound.SoftAbstractResampler;

/**
 *
 * @author alumno15
 */
public class ClaseTablas {
    
   
    
    public int Tablas (int valor, int multi){               
        
        ClaseNumerosPrimos primo = new ClaseNumerosPrimos();
        
        System.out.println("La tabla del Numero "+valor+" es");
        System.out.println("_________________________"+"\n");        
        
        for (int i=1;i<=multi; i++){                       
            
            int resultado = valor*i;      
            
            System.out.print(valor+" por "+i+" es "+resultado);
                                   
            primo.Numerosprimos(resultado);                        
           
                       
        }
        
        return valor;
    }
}
