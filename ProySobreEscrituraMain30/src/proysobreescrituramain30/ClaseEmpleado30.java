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
public class ClaseEmpleado30 extends ClasePersona30{
        public int Id_Empleado;
        public int Sueldo;

        
        
       @Override // Se escribe Override para saber que estamos sobre escribiendo un metodo.
        void mostrarPersona(){
        super.mostrarPersona();    // No hace falta crear constructor si usas el super de esta manera.
        System.out.println("Id_Empleado "+this.Id_Empleado);
        System.out.println("Sueldo "+this.Sueldo); 
        
    }
    
}
