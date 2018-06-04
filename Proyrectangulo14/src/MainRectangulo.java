/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno15
 */
public class MainRectangulo {
    
    public static void main(String[] args) {
    
        ClaseRectangulo rectangulo1 = new ClaseRectangulo();  // Declaración y Constrccion de Objeto
        
        ClaseRectangulo rectangulo2 = new ClaseRectangulo();
        
        ClaseRectangulo rectangulo3 = new ClaseRectangulo();
        
        rectangulo1.aLtura = 10;
        rectangulo1.bAse = 10;
        rectangulo1.cOlor = 'A';
        rectangulo1.nOmbre = "Rectangulo 1";
        
        rectangulo2.nOmbre = "Rectangulo 2"; 
        
        rectangulo3.aLtura = 8;
        rectangulo3.bAse = 10;
        rectangulo3.cOlor = 'R';
        rectangulo3.nOmbre= "Rectangulo 3";
        
        System.out.println("Rectangulo1: "+rectangulo1);
        System.out.println("Color Rectangulo1 "+rectangulo1.cOlor);
        rectangulo1.calcularArea();
        rectangulo1.mostratObjetoRectangulo();
        
        System.out.println("Rectangulo2: "+rectangulo2);
        System.out.println("Color Rectangulo2 "+rectangulo2.cOlor);
        rectangulo2.calcularArea();
        rectangulo2.mostratObjetoRectangulo();
        
        System.out.println("Rectangulo3: "+rectangulo3);
        System.out.println("Color Rectangulo3 "+rectangulo3.cOlor);
        rectangulo3.calcularArea();
        rectangulo3.mostratObjetoRectangulo();
        
        
    }
    
    
}
