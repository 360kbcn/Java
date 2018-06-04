/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteempresaprm;

/**
 *
 * @author Pedro Rios i Macias Curso Java 11/2017
 */
public class ClaseEmpleado extends ClasePersona{

    private int idEmpleado;
    private int sueldo;
    
   
    
    public int getidEmpleado(){
        return this.idEmpleado;
    }
    
    public int getsueldo(){
        return this.sueldo;
    }
    
    public void setSueldo(int sueldo){
        this.sueldo=sueldo;
        
    }
    
    public void setIdEmpleado(int empleado){
        this.idEmpleado=empleado;
    }
    
    @Override
        public  void mostrarPersona(){
        super.mostrarPersona();
        System.out.println("Id_Empleado.:"+this.idEmpleado);
        System.out.println("Sueldo.:"+this.sueldo+" Eur");    
        }

    
    

    
    
    
}

    

