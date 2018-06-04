/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usofor11;

/**
 *
 * @author alumno15
 */
public class UsoFor11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int cOntador=1; cOntador<15; cOntador++){
            System.out.print(" El valor de cotador es "+cOntador);
            if (cOntador % 3==0){
                System.out.println(" y es multiplo de 3");
            }else{
                System.out.println();
            }
        }
    }
    
}
