/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usoswicth7;

/**
 *
 * @author alumno15
 */
public class UsoSwicth7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int nUmero = 0, cAso =4;
        
        // De esta manera al  no tener break, se acumulan valores.
        
        switch (cAso){
            case 4:
                nUmero = cAso ;
            case 3:
                nUmero = nUmero + 3;
            case 2:    
                nUmero = nUmero + 2;
            case 1:
                nUmero = nUmero + 1;
                break;
        }
        System.out.println("El valor de numero es "+nUmero);
        
    }
    
}
