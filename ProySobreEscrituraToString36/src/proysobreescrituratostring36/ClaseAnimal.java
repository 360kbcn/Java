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
public class ClaseAnimal {
    public String especie;
    public int nPatas;
    
    ClaseAnimal(){}
    ClaseAnimal(String especie,int nPatas){
        this.especie=especie;
        this.nPatas=nPatas;
    }
    public void mostrarDetalles(){
        System.out.println("---Animal---");
        System.out.println("Especie:"+this.especie);
        System.out.println("Numero de Patas: "+this.nPatas);
    }
}
