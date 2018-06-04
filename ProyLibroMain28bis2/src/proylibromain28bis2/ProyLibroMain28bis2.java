/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proylibromain28bis2;

import sun.security.util.Length;

/**
 *
 * @author alumno15
 */
public class ProyLibroMain28bis2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //ClaseLibro LibroCondeMontecristo = new ClaseLibro("Alexander Dumas", "El conde de Montecristo");
        //ClaseLibro LibroAlicia = new ClaseLibro("Lewis Carroll", "Alicia en el Pais de las Maravillas");
        //ClaseLibro Libro10Negritos = new ClaseLibro ("Agatha Christie", "Diez Negritos");
        //ClaseLibro LibroElSabueso = new ClaseLibro ("Ser Arthur Conand Doyle", "El Sabueso de los Baskerville");
        
        ClaseLibro Libros [] = new ClaseLibro[4];
        
        Libros[0] = new ClaseLibro ("Alexander Dumas", "El conde de Montecristo");
        Libros[1] = new ClaseLibro ("Lewis Carroll", "Alicia en el Pais de las Maravillas");
        Libros[2] = new ClaseLibro ("Agatha Christie", "Diez Negritos");
        Libros[3] = new ClaseLibro ("Ser Arthur Conand Doyle", "El Sabueso de los Baskerville");
        
       //for (int contador=0;contador<Libros.length;contador++){
         //   Libros[contador].MostrarLibro();
       // }
           for (ClaseLibro Libro:Libros){
               Libro.MostrarLibro();
           }     
        
        
    }
    
}
