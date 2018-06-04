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
public class ProjecteEmpresaPRM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       ClaseEmpleado emple1 = new ClaseEmpleado();
       ClaseEmpleado emple2 = new ClaseEmpleado();
       ClaseEmpleado emple3 = new ClaseEmpleado();
       
      
       ClaseClient clien1 = new ClaseClient();
       ClaseClient clien2 = new ClaseClient();
       ClaseClient clien3 = new ClaseClient();
      
        
       ClaseEmpresa.mostrardatos();
       
       
       emple1.nombre="Armando Bronca Segura";
       emple1.genero='H';
       emple1.setIdEmpleado(35);
       emple1.setIdEmpleado(2354);
       emple1.setSueldo(1200);
       
       
       emple2.nombre="Dolores Fuertes de Barriga";
       emple2.genero='M';
       emple2.setedad(35);
       emple2.setIdEmpleado(3456);
       emple2.setSueldo(1450);
       
       
       emple3.nombre="Pepe Construye Casas";
       emple3.genero='H';
       emple3.setedad(35);
       emple3.setIdEmpleado(78954);
       emple3.setSueldo(1345);
       
        
       emple1.mostrarPersona();
       emple2.mostrarPersona();
       emple3.mostrarPersona();
       
       
       clien1.nombre="Cliente1";
       clien1.genero='H';
       clien1.setedad(25);
       clien1.idCliente=345;
       
       clien2.nombre="Cliente2";
       clien2.genero='M';
       clien2.setedad(47);
       clien2.idCliente=567;
       
       clien3.nombre="Cliente3";
       clien3.genero='H';
       clien3.setedad(55);
       clien3.idCliente=678;
       
       
       clien1.mostrarPersona();
       clien2.mostrarPersona();
       clien3.mostrarPersona();
        
        
    }
    
}
