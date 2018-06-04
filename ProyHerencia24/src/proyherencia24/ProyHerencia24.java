/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyherencia24;

/**
 *
 * @author alumno15
 */
public class ProyHerencia24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               
        // TODO code application logic here
        
        ClaseTrabajador24 pr1 = new ClaseTrabajador24();
        ClaseTrabajador24 pr2 = new ClaseTrabajador24(2900,4,"Anna", 'F', 35, "Mataro");
        
        pr1.mostrarTrabajador();
        pr2.mostrarTrabajador();
        
    }
    
}
