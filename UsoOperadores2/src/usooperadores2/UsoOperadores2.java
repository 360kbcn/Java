/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usooperadores2;

/**
 *
 * @author alumno15
 */
public class UsoOperadores2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=0,b=0,c=0; // Declaracion de multples variable int.
        
        int res1=0, res2=0;
        boolean res3 = true;
        double res4 = 3.141592654;
        float eur, eur2 = 0.00F;
        
        a=1;
        b=2;
        c=3;
        res1 = a+b;
        res2 = b+c*4-5;
        
        eur = 29.99F;
        
        eur2 = eur * res2;
         
        
        System.out.println("valor de las variables delaradas a,b,c, res1, res2 "+a+" "+b+" "+c+" "+res1+" "+res2);
        System.out.println(a+b+c+res1+res2);
       
        System.out.println(res2);
        
        a++;
        
        System.out.println(a);
        
        res3 = a>2;
        
        System.out.println(res3);
        
        System.out.println(res4);
        
        System.out.println(eur2);
        
        res1 = --b; // Se puede sumar y restar tanto delante como detras 
        
        System.out.println(res1);
        
        System.out.println(1+2+"abc");
        System.out.println("abc"+1+2);
        
        a=a+5;
        
        System.out.println("a=a+5 = "+a);
        
    }
    
}
