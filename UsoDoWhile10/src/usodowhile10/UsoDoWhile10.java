/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usodowhile10;

/**
 *
 * @author alumno15
 */
public class UsoDoWhile10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vInicial = 1, vFinal = 15, cOntador=vInicial;
        
        do {            
            System.out.print(" El valor de cotador es "+cOntador);
            if (cOntador % 3==0){
                System.out.println(" y es multiplo de 3");
            }else{
                System.out.println();
            }
            cOntador++;
        } while (cOntador<=vFinal);
                 
    }
    
}
