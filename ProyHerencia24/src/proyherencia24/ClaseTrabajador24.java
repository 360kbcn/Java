/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyherencia24;

/**
 *
 * @author alumno15
 */
public class ClaseTrabajador24 extends ClasePersona24{
    
    private int sueldo;
    private int idtrabajador;
    
    ClaseTrabajador24(){
       // super ();
        
    };
    
    

    ClaseTrabajador24(int sueldo, int idtrabajador, String nombre, char genero, int edad, String poblacion) {
        super(nombre, genero, edad, poblacion);
        
        //this.sueldo = sueldo;
        setSueldo(sueldo);
        //this.idtrabajador = idtrabajador;
        setIdtrabajador(idtrabajador);
    }
    
    public void setSueldo(int sueldo){
        if (sueldo>0){
            this.sueldo=sueldo;
        }else{
            System.out.println("Sueldo Incorrecto");
        }  
    
    }
    
    public void setIdtrabajador(int id){
        this.idtrabajador=id;
    }    
    
    
    void mostrarTrabajador(){
        System.out.println("\n-------------------");
        System.out.println("Nombre "+this.nombre);
        System.out.println("Genero "+this.genero);
        System.out.println("Edad "+this.edad);
        System.out.println("Poblacion "+this.poblacion);
        System.out.println("Sueldo "+this.sueldo);
        System.out.println("IdTrabajador "+this.idtrabajador);      
       
               
    }
    
}
