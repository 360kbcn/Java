/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proymascotas25;

/**
 *
 * @author alumno15
 */
public class ClaseAnimal{
    public String nombre;
    private String especie;

    ClaseAnimal() {
    }
   
    ClaseAnimal(String nombre, String especie) {
        this.nombre=nombre;
        this.especie=especie;
       
    }
    
    public void setEspecie (String especie){
        if (especie!=" "){
            this.especie=especie;
        }else{
            this.especie="Campo Vacio";
            System.out.println("Campo Vacio");
        }
        
    }
    
    public String getEspecie (){
        return this.especie;
    }
    
    
}
