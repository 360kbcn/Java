/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno15
 */
public class ClaseRectangulo {
    String nOmbre;
    int bAse, aLtura; // Atributos o variables de clases
    char cOlor;
   
    void calcularArea(){ // Metodo de clase
        int  area = bAse * aLtura;
        System.out.println("El Area es "+area);
    }
    void mostratObjetoRectangulo () {
        System.out.println("La Base es "+bAse);
        System.out.println("La Altura es "+aLtura);
        System.out.println("El color es "+cOlor);
        System.out.println("EL Nombre es "+nOmbre);
}        
}
