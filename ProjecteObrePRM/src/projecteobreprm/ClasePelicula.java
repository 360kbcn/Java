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
public class ClasePelicula extends ClaseObra{
    
     private int idPelicula;
     private String Genero;
     public static int contador;
    
/*
    ClasePelicula() {}


    ClasePelicula(int idPelicula, String Genero, String nombreAutor, String Titulo, int Precio) {
        super(nombreAutor, Titulo, Precio);
        this.idPelicula = idPelicula;
        this.Genero = Genero;
    }
     
  */
    public int  getIdPeli(){
         contador++;
         idPelicula=contador;     
        return this.idPelicula;
    }
    
 
     public void setGenero(String genero){
         if(genero!=" "){
             this.Genero=genero;
         }else{
             this.Genero="Genero sin Especifiicar";
             System.out.println("Genero sin Especificar");
         }
         
     }

     public String getGenero(){
         return this.Genero;
     }
     
     @Override
         public void mostrarObra(){
         super.mostrarObra();           
         System.out.println("Id_Pelicula.:"+idPelicula);
         System.out.println("Genero.:"+Genero);
         System.out.println("\n");
         
     }
     
     
}


