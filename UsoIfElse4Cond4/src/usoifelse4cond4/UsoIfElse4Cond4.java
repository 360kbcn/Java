/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usoifelse4cond4;

/**
 *
 * @author alumno15
 */
public class UsoIfElse4Cond4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int semaforo = 1;
        boolean pasa = true;
        
        // semaforo 0 rojo
        // semaforo 1 verde
        // semaforo 2 amarillo
        
        if (semaforo == 0)
        {
           pasa = false; 
        }else if (semaforo == 1){
            pasa = true;
        }else {
            pasa = false;
        }       
        System.out.println("Pasa ? "+pasa);
        
    }
    
}
