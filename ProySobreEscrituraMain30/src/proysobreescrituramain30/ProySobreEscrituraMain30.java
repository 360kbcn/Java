/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proysobreescrituramain30;

/**
 *
 * @author alumno15
 */
public class ProySobreEscrituraMain30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ClasePersona30 Persona1 = new ClasePersona30(); // Construccio de Objeto
        
        Persona1.Nom="Alicia"; //Instanciamos los datos
        Persona1.Genero='F';
        Persona1.edad=35;
        
        Persona1.mostrarPersona(); //llamamos a la funcion para mostrar datos.
        
        ClaseEmpleado30 Empleado1 = new ClaseEmpleado30();
        
        Empleado1.Nom=Persona1.Nom;
        Empleado1.Genero=Persona1.Genero;
        Empleado1.edad =Persona1.edad;
        
        /*
        Empleado1.Nom="Ramon";
        Empleado1.Genero='H';
        Empleado1.edad=45;*/
        Empleado1.Id_Empleado=12;
        Empleado1.Sueldo=1500;
        //Persona1.mostrarPersona();
        
        Empleado1.mostrarPersona();
        
    }
    
}
