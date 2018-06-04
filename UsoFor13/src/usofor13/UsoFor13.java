/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usofor13;

import java.util.Scanner;

/**
 *
 * @author alumno15
 */
public class UsoFor13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Introdude la tabla que quieres ver");
        Scanner input = new Scanner(System.in);
        int vAlor = input.nextInt();
       for (int tAbla=vAlor; tAbla<=vAlor; tAbla++){
           
           System.out.println("\n");
           System.out.println("La tabla del "+tAbla);
           
                for (int nUmero=1; nUmero<11; nUmero++){
        
                System.out.println(nUmero+" * "+tAbla+" = "+nUmero*tAbla);
            }
        }        
    }
    
}
