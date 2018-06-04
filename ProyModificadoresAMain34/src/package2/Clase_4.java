/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package2;

import proymodificadoresamain34.Clase_1;

/**
 *
 * @author alumno15
 */
public class Clase_4 extends Clase_3{
    
   
    Clase_1 obj1 = new Clase_1();
    
    @Override
    public void accesoAtributosClase1(){
        
        System.out.println("\n ACCESO DESDE CLASE 4");
        System.out.println("Atributos Publico.:"+obj1.aPublic);
        System.out.println("Atributos Protected.:"+aProtected); // las variables protected acceden directamente sin objeto y tambine se puede haciendolos publicos con un set y un get.
        System.out.println("Atributos Protected con Objeto.:"+obj1.getProtected());
        // System.out.println("Atributos Default"+obj1.aDefault());
        // Los defaults no se pueden acceder a menos que se hagan publicos con un get y set.                
        // System.out.println("Atributos Default"+obj1.getDefault());
        System.out.println("Atributos Private.:"+obj1.getprivate());
        System.out.println("");
        
    }
   
}
