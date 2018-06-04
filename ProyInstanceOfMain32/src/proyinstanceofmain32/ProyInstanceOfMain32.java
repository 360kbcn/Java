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
public class ProyInstanceOfMain32 {

    /**
     * @param args the command line arguments
     */
         public static void main(String[] args) {
        // TODO code application logic here
                 ClaseAbuelo a1 = new ClaseAbuelo();
                 a1.nombre="Abuelito";
                 a1.edad=75;
                  ClasePadre p1 = new ClasePadre();
                 p1.profesion="Pastor ";
                 ClaseHijo h1 = new ClaseHijo();
                 h1.estudios="Ingeniero AeroEspacial";
                 
                 
                 /*
                 if (h1 instanceof ClaseHijo){
                     System.out.println("h1 es de la Clase Hijo");                     
                 }else if (h1 instanceof  ClasePadre){
                     System.out.println("h1 es de la ClasePadre");                     
                 }else if(h1 instanceof ClaseAbuelo){
                     System.out.println("h1 es de la ClaseAbuelo");
                 }
                 */
        
                 a1.mostrarDatosAbuelo();
                 p1.mostrarDatosPadre();
                 h1.mostrarDatosHijos();
        
        
               
                ClaseInstance.ClaseObjeto(a1);
                ClaseInstance.ClaseObjeto(p1);
                ClaseInstance.ClaseObjeto2(h1);
                ClaseInstance.ClaseObjeto2(p1);
                
                
                        
               
                  
        }       
                

}    
  
    