/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usoswitch6;

/**
 *
 * @author alumno15
 */
public class UsoSwitch6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        byte mes = 11;
        String q; // q es igual a cuatrimestre
        
        switch (mes) {
            case 1: case 2: case 3: case 4:
                q = "Q1";
                break;
            case 5: case 6: case 7: case 8:
                q = "Q2";
                break;    
            case 9: case 10: case 11: case 12:
                q = "Q3";
                break; 
            default:
                q = "Fuera de Rango";
                break;
        }
        System.out.println("El Cuatrimestre es "+q);        
        
    }
    
}
