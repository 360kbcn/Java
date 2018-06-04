/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prooperaciones26_main;

import javax.xml.transform.Source;

/**
 *
 * @author alumno15
 */
public class ProOperaciones26_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int i1=4, i2=5, i3=1;
        
        double d1=7.5, d2=8.0;
        
        String numero = "5";
        
        ClaseCalculos num1 = new ClaseCalculos();        
        ClaseCalculos num3 = new ClaseCalculos();
        ClaseCalculos ValorString = new ClaseCalculos();
        
        System.out.println(num1.suma(i1, i2));
        System.out.println(num1.suma(i1, i2, i3));
        System.out.println(num1.suma(d1, d2));
        System.out.println(num3.concatena(numero, i3));                       
        System.out.println(ValorString.convert1(numero, i3));
        
        
    }
    
     
    
    
         
    
}
