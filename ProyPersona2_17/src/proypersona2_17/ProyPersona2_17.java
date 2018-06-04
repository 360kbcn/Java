/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proypersona2_17;

/**
 *
 * @author alumno15
 * 
 */
 
// import ClasePersona3;

import Paquete2.ClasePersona3;

public class ProyPersona2_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ClasePersona2 pers1 = new ClasePersona2("Maria", "Badalona", 1200);
        ClasePersona2 pers2 = new ClasePersona2("Ricardo", "Barcelona", 980);
        
        Varios varios1 = new Varios();      
        
        ClasePersona3 pers3 = new ClasePersona3();
        
        pers1.ponera0(pers1);
        pers1.mostrarPersona();
        pers2.mostrarPersona();
        
        varios1.iniNom(pers1);
        pers1.mostrarPersona();
        
        pers2 = pers1;
        
        varios1.nom2(pers2);
        pers1.mostrarPersona();
        pers2.mostrarPersona();
        
       
        
        
        
    }
    
}
