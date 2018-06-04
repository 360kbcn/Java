/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulacion19;

import com.sun.javafx.binding.SelectBinding;

/**
 *
 * @author alumno15
 */
public class ClaseAnimal {
    
    // Atributos de la calse animal
    
    public String nombre;
    private String especie;    
    private String Color_Pelo;
    int edad;
    
    
    // Constructores;

    ClaseAnimal() {};
    
    public void asignarEspecie(String especie) {
        if (especie == "Perro" || especie == "PERRO" || especie == "perro"){
            this.especie=especie;
            //System.out.println("Especie "+this.especie);
        }else if (especie == "Gato" || especie == "GATO" || especie == "gato"){
            this.especie=especie;
           // System.out.println("Especie "+this.especie);
        }else{
            System.out.println("Especie no permitida");
        }        
    }
    
    public void asignarColor(String pelo){
        if (pelo == "Negro" || pelo == "negro"){
            this.Color_Pelo=pelo;
        }else if (pelo == "Blanco" || pelo == "blanco"){
            this.Color_Pelo=pelo;
        }else{
            System.out.println("color no permitido ");
        }
    }

    public String mostrartEspecie() {               
        return this.especie;
        
    }
    
    public String colorpelo(){
        return this.Color_Pelo;
    }
        
        
}
