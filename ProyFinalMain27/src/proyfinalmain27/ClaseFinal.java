/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyfinalmain27;

/**
 *
 * @author alumno15
 */
public class ClaseFinal {
    
    public static final int NUM_MAX=10;  // NUM_MAX es una constante y no se puede modificar su valor
    int numeroMaximo=20; /*numero maximo es una variable no statica y se necesita 
    objeto para poder modificarla */
    static int numeroMaximoStatic=30; /*La podemos modificar llamando a la clase "ClaseFinal.numeroMaxmoStatic"*/
    
    
    public void mostrarValores(){
        
        System.out.println("Public static final int NUM_MAX "+NUM_MAX);
        System.out.println("ClaseFinal.numeroMaximoStatic "+this.numeroMaximoStatic);
        System.out.println("numero.numeroMaximo "+numeroMaximo);
        
        
    }
}
