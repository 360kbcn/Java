/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prooperaciones26_main;

/**
 *
 * @author alumno15
 */
public class ClaseCalculos {

    
    int valor = 0;
    
    public int suma (int a, int b){
        System.out.println("Suma a + b");
        return (a+b);
    }
    
    
    public int suma (int a, int b, int c){
        System.out.println("Suma a + b + c");
        return (a+b+c);
    }
    
    public double  suma (double a, double b){
        System.out.println("Suma Double a + b");
        return (a+b);
    }
    
    public String concatena (String num, int a){
        System.out.println("La concatenacion de  String + int es ");           
        return (num+a);
        
    }
    
    public int convert1 (String num, int a){        
        valor = Integer.parseInt(num);
        System.out.println("La conversion de un String a int + int es ");
        return (valor+a);
    }

    
   
   
}
