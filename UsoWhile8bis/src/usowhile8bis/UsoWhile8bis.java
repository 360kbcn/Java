/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usowhile8bis;

/**
 *
 * @author alumno15
 */
public class UsoWhile8bis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int vFinal = 10;
        int cOntador = 1;
        
        while (cOntador <=vFinal) {
            if (cOntador%2==0){
                System.out.println("El numero "+cOntador+" es par");
            }else{
                System.out.println("El numero "+cOntador+" es impar");
            } 
            cOntador ++;
    }
}        
    
}
