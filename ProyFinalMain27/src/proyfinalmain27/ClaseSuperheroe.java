/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyfinalmain27;

/**
 *
 * @author alumno15
 */
public class ClaseSuperheroe  extends ClasePersonaje{
    
    public String nombre;
    public boolean vuela;

    ClaseSuperheroe() {
    }

    ClaseSuperheroe(String nombre, boolean vuela, String saga) {
        super(saga);
        this.nombre = nombre;
        this.vuela = vuela;
    }
    
    // Metodo para mostrar el Objeto
    
    public void mostrarSuperHeroe(){
        System.out.println("\n");
        System.out.print("Nombre "+this.nombre);
        System.out.print(" Vuela "+this.vuela);
        System.out.println(" Saga "+saga);
        System.out.println("\n");
    }
    
    
}
