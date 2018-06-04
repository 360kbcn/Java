/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyvehiculo20;

/**
 *
 * @author alumno4
 */
public class ProyVehiculo20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* no hace falta definir las variables pq funcionan dsd la clase
        String marca;
        String modelo;
        String color;
        boolean nuevo;
        String matricula;
        int precio;*/
      boolean estaEnStock= true; 
    //Creacion de objetos =instanciar)
    ClaseVehiculo veh1 =new ClaseVehiculo();
    ClaseVehiculo veh2 =new ClaseVehiculo();
    ClaseVehiculo veh3 =new ClaseVehiculo();
    
    //llamada a métodos
    veh2.marca ="Toyota";
    veh2.modelo="Yaris";
    veh2.setColor ("Blanco");
    veh2.setNuevo(true);
    veh2.setMatricula("2432MMN");
    veh2.setPrecio(28000, estaEnStock);
    
    veh3.marca ="Peugeot";
    veh3.modelo="307SW";
    veh3.setColor ("Azul");
    veh3.setNuevo(false);
    veh3.setMatricula("8215JJL");
    veh3.setPrecio(500, false);
    
    veh1.mostrarAtributos();
    veh2.mostrarAtributos();
    veh3.mostrarAtributos();
    
    
    
            
    
    
    
            
            
            
            
            
            
            
    }
    
}
