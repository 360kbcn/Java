/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno15
 */

import java.util.Scanner;

public class MainTablas {
    public static void main(String[] args) {
        
        
        ClaseTablas tablas = new ClaseTablas();
        
        System.out.println("Introduce desde la tabla ");
        Scanner input = new Scanner(System.in);
        int dAto1 = input.nextInt();
        
        System.out.println("4hasta la tabla ");
        Scanner input2 = new Scanner(System.in);
        int dAto2 = input2.nextInt();
        
        tablas.tAbla = dAto1;
        tablas.vAlor = dAto2;
       
        tablas.calcularTabla();
        
    }
    
}
