/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proymodificadoresamain34;

/**
 *
 * @author alumno15
 */
public class Clase_2 {

    Clase_1 obj1 = new Clase_1();
    
    public void accesoAtributosClase1(){
        
        System.out.println("\n ACCESO DESDE CLASE 2");
        System.out.println("Atributos Publico.:"+obj1.aPublic);
        System.out.println("Atributos Protected.:"+obj1.aProtected);
        System.out.println("Atributos Default.:"+obj1.aDefault);
        System.out.println("Atributos Private.:"+obj1.getprivate());
        System.out.println("Atributos Static.:"+Clase_1.aStatic);
        System.out.println("");
        
        
        
    }
    
    /*
    Clase_2(int aPublic, int aProtected, int aDefault, int aPrivate) {
        super(aPublic, aProtected, aDefault, aPrivate);
    }
    
  
    
    public void MostrarAtributosClase1(){
        System.out.println(this.aPublic);
        System.out.println(this.aProtected);
        System.out.println(this.aDefault);
        
    }
*/
    
}
