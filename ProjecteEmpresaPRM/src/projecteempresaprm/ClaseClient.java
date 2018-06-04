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
public class ClaseClient extends ClasePersona {
    
    
    public int idCliente;
      
    
    @Override
    public void mostrarPersona(){
    super.mostrarPersona();
        System.out.println("Id_Cliente.:"+this.idCliente);
    }
    
}
    
 
    
    
    
