/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyarraymain29;

/**
 *
 * @author alumno15
 */
public class ProyArrayMain29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numero [] [] = new int [3] [2];
        
        numero [0][0] = 0;
        numero [0][1] = 7;
        numero [1][0] = 12;
        numero [1][1] = 35;
        numero [2][0] = 21;
        numero [2][1] = 15;
        
        for (int filas=0;filas<3;filas++){            
        //    System.out.println(numero[filas][0]);            
            for(int colum=0;colum<2;colum++){
                System.out.println(numero[filas][colum]);                
                
            }
        }
        
        
        
        
    }
    
}
