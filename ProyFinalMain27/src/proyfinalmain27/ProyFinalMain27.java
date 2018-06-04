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
public class ProyFinalMain27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Uso de Final en tipos primitivos.
        ClaseFinal numero = new ClaseFinal();
                        
        ClaseFinal.numeroMaximoStatic=30;
        
        numero.numeroMaximo=35;
       
        numero.mostrarValores();
        
        // Uso de fnal en el Objeto.
        ClaseSuperheroe sp1 = new ClaseSuperheroe("Tormenta", true, "Marvel");        
        final ClaseSuperheroe sp2 = new ClaseSuperheroe("Flash", false, "Marvel");
        
        sp1.mostrarSuperHeroe();
        sp2.mostrarSuperHeroe();
        
        sp2.nombre="Spiderman";
        
        sp2.mostrarSuperHeroe();
        
        System.out.println("Muestra la direccion de Memora "+sp1); 
        /*sp1 no es una variable los que tiene es la direccion
        de memoria donde estan los datos. Para ver los datos hay
        que llamar a la funcion "mostrarSuperHeroes"*/
        
        /*
        sp1=null;
        
        System.out.println("Valor de Sp1 = "+sp1);
       
       */
        
       
        
        
        
    }
    
}
