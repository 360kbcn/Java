/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyarraystringmain29;

import sun.security.util.Length;

/**
 *
 * @author alumno15
 */
public class ProyarrayStringMain29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int Cuatrimestre = 1;
        
        String Matriz [][] = new String [3][4];
                
        Matriz[0][0] = "Enero"; Matriz[0][1] = "Febrero"; Matriz[0][2] = "Marzo"; Matriz[0][3] = "Abril"; 
        Matriz[1][0] = "Mayo"; Matriz[1][1] = "Junio";Matriz[1][2] = "Julio"; Matriz[1][3] = "Agosto"; 
        Matriz[2][0] = "Septiembre";Matriz[2][1] = "Octubre"; Matriz[2][2] = "Noviembre"; Matriz[2][3] = "Diciembre";
        
        for (int fila=0;fila<3;fila++){
            System.out.println("El cuatrimestre "+Cuatrimestre+" Tiene estos meses:");           
            for (int colum=0;colum<4;colum++){
                System.out.print(Matriz[fila][colum]+" | ");                
            }
            Cuatrimestre++;
            System.out.println("\n");
            
        }
        
    }
    
}
