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
public class VerDatosPerro extends ClaseReptil{
    
        
    VerDatosPerro(String nombre, String especie, boolean esPeligroso, String venenoso) {
        super(nombre, especie, esPeligroso, venenoso);             
    }
    
    void mostrarDatosanimal(){
        System.out.println("\n--------------");        
        super.perro();
        super.serpiente();
        //super.serpiente(idreptil);
        
    }
    
    
}
