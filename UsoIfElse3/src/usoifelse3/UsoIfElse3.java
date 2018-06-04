/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usoifelse3;

/**
 *
 * @author alumno15
 */
public class UsoIfElse3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Boolean semaforo=true, pasa=true;
        
        int paso = 1;
        
        if (semaforo != false) {
            semaforo=false;
            System.out.println("Primer if semaforo true y pasa");
        } else {
            System.out.println("Primer else semaforo true y no Pasa");
        }if (semaforo != true) {
            System.out.println("Segundo if semaforo flase y no pasa");
        } else {
            System.out.println("Segundo else semaforo false y Pasa ");
        }
        
        
    }
    
}
