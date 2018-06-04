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
public class ClaseObra {

    public String nombreAutor;
    public String Titulo;
    int Precio;

    ClaseObra() {};

    public ClaseObra(String nombreAutor, String Titulo, int Precio) {
        this.nombreAutor = nombreAutor;
        this.Titulo = Titulo;
        this.Precio = Precio;
    }

    
    
    public void setprecio(int precio){
        this.Precio=precio;
    }
    
    public int getprecio(){
        return this.Precio;
    }

   
    public void mostrarObra(){
        System.out.println("\n");
        System.out.println("Nombre Autor.:"+nombreAutor);
        System.out.println("Titulo.:"+Titulo);
        System.out.println("Precio.:"+Precio+" Euros.");
        
    }
    
}
