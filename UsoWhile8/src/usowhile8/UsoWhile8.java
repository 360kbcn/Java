/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usowhile8;

import javafx.animation.Animation;

/**
 *
 * @author alumno15
 */
public class UsoWhile8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int cOntador = 1, lImite = 64;
        long cAsilla=1;
        
        
        while (cOntador <= lImite ){
            System.out.println("El valor de la casilla   "+cOntador+"   es=    "+cAsilla);
            cAsilla = cAsilla * 2;
            cOntador++;
        }
        System.out.println("While llego al final del bucle");
    }
    
}
