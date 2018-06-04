/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proysobreescrituratostringmain36;

/**
 *
 * @author alumno15
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
    
    
    
    @Override
    public  boolean equals(Object obj){ // Sobreescritura de equalso
        boolean sonIguales=true;
        ClaseAve ave = (ClaseAve) obj;
        if(this.especie==ave.especie && this.color==ave.color && this.nPatas==ave.nPatas){
            System.out.println("Son Iguales");
            sonIguales=true;
        }else{
            System.out.println("Son Diferentes");
            sonIguales=false;
        }
        
        return sonIguales;
    }
    
    /*
    public static boolean soniguales(ClaseAve ave1, ClaseAve ave3){
        boolean condicion;
        if (ave1.especie==ave3.especie){
      //  if(ave1.equals(ave3)){
            System.out.println("Son Iguales");
            condicion=true;        
        }else{
            System.out.println("Son Diferentes");
            condicion=false;
        }
        return condicion;
    }   
*/
}