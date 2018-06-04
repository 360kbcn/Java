/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proysobreescrituratostring36;

/**
 *
 * @author alumno12
 */
public class ClaseAve extends ClaseAnimal{
    public String color;
    
    ClaseAve(){}
    ClaseAve(String especie,int nPatas,String color){
        super(especie,nPatas);
        this.color=color;
    }
    @Override
/*  Con esta sobreescritura del metodo toString sale ya no la direccion del Stack
    sino el contenido de esa direccion en el Heap*/
    public String toString(){
        String pajaro="pajaro: "+this.especie+" "+this.nPatas+" "+this.color;
        return pajaro; 
    }
    
    @Override
    public void mostrarDetalles(){

        System.out.println("-Ave-");
        System.out.println("=====");
        System.out.println("Especie.:"+this.especie);
        // System.out.println("patas.:"+this.nPatas);
        System.out.println("\n");
        System.out.println("Color.::"+this.color);
    }
    
    public boolean soniguales(ClaseAve ave1, ClaseAve ave2){
        boolean condicion = false;
        if (ave1==ave2){
            condicion = true;
            System.out.println("Son Iguales:");
    }else{
            System.out.println("Son Diferentes");
        }       
        return condicion;
    }
}
