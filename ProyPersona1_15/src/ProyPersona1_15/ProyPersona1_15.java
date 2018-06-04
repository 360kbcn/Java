/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyPersona1_15;

import java.util.Scanner;

/**
 *
 * @author alumno15
 */
public class ProyPersona1_15 {
    
    public static void main(String[] args) {
        
        
        Scanner valorentrada = new Scanner(System.in);
        
        
        ClasePersona1 p1 = new ClasePersona1();
        ClasePersona1 p2 = new ClasePersona1();
        
        // Creamos Objero p3 con nuevo constructor
        ClasePersona1 p3 = new ClasePersona1("Clara", 45, "Funcionaria", "Mataro", 'F', 1500);
        
        // ClasePersona1 p4 = new ClasePersona1("Antonia", 78);
        
        ClasePersona1 p4  = new ClasePersona1();
        
        
        
        /*
        System.out.println("Nombre p1 "+p1.nombre);
        System.out.println("Edad p1 "+p1.edad);
        System.out.println("Ocupacion p1 "+p1.ocupacion);
        System.out.println("Poblacion p1 "+p1.poblacion);
        System.out.println("Genero p1 "+p1.genero);
        System.out.println("Sueldo p1 "+p1.sueldo);
        System.out.println("\n");
        
        */
        
        // Atributos de Clase
        
        p1.nombre = "Anna";
        p1.edad = 25;
        p1.ocupacion = "Estudiante";
        p1.poblacion = "Barcelona"; 
        p1.genero = 'F';
        p1.sueldo = 0;
        
        p2.nombre = "Manuel";
        p2.edad = 35;
        p2.ocupacion = "Fontanero";
        p2.poblacion = "Valencia";
        p2.genero = 'M';
        p2.sueldo = 1200;
        
        
        p1.mostrartvaloresobjeto();
        p2.mostrartvaloresobjeto();
        p3.mostrartvaloresobjeto(); // Con el Constructor de Clase.
        
        //p4.mostrartvaloresobjeto();
        
        
        System.out.print("Nombre ");
        p4.nombre = valorentrada.next();
        System.out.print("Edad ");
        p4.edad = valorentrada.nextInt();
        System.out.print("Ocupacion ");
        p4.ocupacion = valorentrada.next();
        System.out.print("Poblacion ");
        p4.poblacion = valorentrada.next();
        System.out.print("Sueldo ");
        p4.sueldo = valorentrada.nextInt();
        System.out.print("Genero (m/h)"); 
        p4.genero = valorentrada.next().charAt(0);
        p4.mostrartvaloresobjeto();
        
        
    }
    
    
    
}
