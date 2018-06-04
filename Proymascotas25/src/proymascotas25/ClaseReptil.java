/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proymascotas25;

/**
 *
 * @author alumno15
 */
public class ClaseReptil extends ClasePerro{
   
     public String venenoso;
     public int idreptil;
     public static int numreptil;
   
    ClaseReptil(String nombre, String especie, boolean esPeligroso, String venenoso) {    
        super(nombre, especie, esPeligroso);
        this.venenoso=venenoso;
        numreptil++;
        idreptil=numreptil;
        

    }    
    
    void serpiente(){
        
        System.out.println("Venenoso "+this.venenoso);
        
    }
    
}
