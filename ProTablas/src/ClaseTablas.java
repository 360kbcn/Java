/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno15
 */
public class ClaseTablas {
    int tAbla, vAlor;
    
    
    void calcularTabla(){
        
        for (int tAbla=1; tAbla<=vAlor; tAbla++){
           
           System.out.println("\n");
           System.out.println("La tabla del "+tAbla);
           
                for (int nUmero=1; nUmero<11; nUmero++){
        
                System.out.println(nUmero+" * "+tAbla+" = "+nUmero*tAbla);
            }
        }
    }
    

}
