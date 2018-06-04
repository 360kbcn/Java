/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proypoli35;

/**
 *
 * @author alumno4
 */
public class Figura {
    public String nombre; 
    int num;

    public Figura() {
    }//necesitamos al constructor vacío para que lo use el hijo
    
    Figura(String nombre, int num){
     this.nombre=nombre;
     this.num=num;
     }
     
}
