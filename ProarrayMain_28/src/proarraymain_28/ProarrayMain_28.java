/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proarraymain_28;

/**
 *
 * @author alumno15
 */
public class ProarrayMain_28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Hola");
        
        int nums [];
        nums = new int [6];
        int contador = 1;
        
        for (int i=0;i<nums.length;i++){
            nums[i]=contador;
            contador = (contador + contador)*2;
        }
        
        for (int x=0;x<6;x++){
            System.out.println("El Elemento "+x+" es "+nums[x]);
        
    }
    }
    
}
