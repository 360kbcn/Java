/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteobreprm;

/**
 *
 * @author Pedro Rios i Macias Curso Java 11/2017
 */
public class ClaseCDMusica extends ClaseObra{

    
    public int id_CD;
    public String estilo;

 
        @Override
        public void mostrarObra(){
        super.mostrarObra();
            System.out.println("Id_CD.:"+id_CD);
            System.out.println("Estilo.:"+estilo);       
            System.out.println("\n");            
        }
               
           
    
}
