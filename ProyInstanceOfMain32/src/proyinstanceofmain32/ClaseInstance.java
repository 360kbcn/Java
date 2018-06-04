/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyinstanceofmain32;

/**
 *
 * @author alumno15
 */
public class ClaseInstance {
    
     public static void ClaseObjeto(ClaseAbuelo a) {
                System.out.println("\n");
                System.out.println("Clase Objeto");
                 if (a instanceof ClaseHijo){                     
                     System.out.println("El parametro pasado es de la Clase Hijo");                     
                 }else if (a instanceof  ClasePadre){
                     System.out.println("El parametro pasado es de la ClasePadre");                     
                 }else if(a instanceof ClaseAbuelo){
                     System.out.println("El parametro pasado es de la ClaseAbuelo");
                 }                 
     }
     
     public static void ClaseObjeto2(ClaseAbuelo a){                
           System.out.println("\n");
           System.out.println("Clase Objeto2");
           if (a instanceof  ClaseHijo) {
               System.out.println("El parametro pasado es de la Clase Hijo");                     
         }
           if (a instanceof ClasePadre){
               System.out.println("El parametro pasado es de la Clase Padre");               
           }
           if (a instanceof  ClaseAbuelo){
               System.out.println("El parametro pasado es de la clase Abuelo");               
           }
         
     }
}
