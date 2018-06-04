/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usoifelseestacion5;

/**
 *
 * @author alumno15
 */

import java.util.Scanner;

public class UsoIfElseEstacion5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char mes = 7;
        String estacion;
        
        // Primavera = Meses 4,5,6
        // Verano = Meses 7,8,9
        // Otoño = Meses 10,11,12
        // Invierno = 1,2,3
           
        if (mes <=0 || mes > 12 )
        {
            estacion="Fuera de Rango";
        }else if ( mes <=6 && mes >=4  ){
            estacion="Primavera";
        }else if ( mes <=9 && mes >=7 ) {
            estacion="Verano";
        }else if ( mes <=12 && mes >=10){
            estacion="Otoño";
        }else{
            estacion="Invierno";
        }
        System.out.println("La estacion es "+estacion);
    
    }
    
}
