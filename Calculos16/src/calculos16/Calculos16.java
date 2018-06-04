/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculos16;

import java.util.*;


public class Calculos16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int operando1=0, operando2=0, resultado1=0, variable=100, resultadomaim=0;
        
        String valor = "", unido = "";
        
        System.out.println("Introduce un numero ");
        Scanner n1 = new Scanner(System.in);
        operando1 = n1.nextInt();
        System.out.println("Introduce otro numero ");
        Scanner n2 = new Scanner(System.in);
        operando2 = n2.nextInt();
        System.out.println("Introduce una cadena String");
        Scanner n3 = new Scanner(System.in);
        valor = n3.next();
        
        
        OperacionsAritmeticas op1 = new OperacionsAritmeticas(); //Creo Objeto op1
        OperacionsAritmeticas op2 = new OperacionsAritmeticas(); //Creo Objeto op2
        OperacionsAritmeticas op3 = new OperacionsAritmeticas(); //Creo el Objeto op3
        
        
        resultado1 = op1.sumaValores(operando1, operando2); // Instanciamos el Metodo sumaValores
                                                            // de la clase OperacionsAritmeticas.
        
        System.out.println("Resultado de la suma es "+resultado1);
            
            
        resultado1 = op2.crearAleatorio(variable);  // Instanciamos el Metodo crear Aleatorio
                                                    // de la clase OperacionsAritmeticas
        
        System.out.println("El numero Aleatorio es "+resultado1);
            
        unido = op3.unir(valor, operando1);
        
        System.out.println("La concatenacion de "+valor+" y de "+operando1+" es "+unido);
        
            
    }    
         
}
