/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proylibromain28bis2;

/**
 *
 * @author alumno15
 */
public class ClaseLibro {
    
    private String NombreA;
    public  String titulo;
    public int CodISBN ;
    
    static int numLibros=0;

        ClaseLibro() {
         this.CodISBN = ++numLibros;   
        }

        ClaseLibro(String NombreA, String titulo) {
            this.NombreA = NombreA;
            this.titulo = titulo;
            this.CodISBN = ++numLibros;            
        }
    
        public String getNombreA (){            
            return NombreA;
        }
        
        public void setNombreA (String NombreA){
            this.NombreA = NombreA;
        }
        
        public int getCodISBM (){
            return CodISBN;
        }
        
        void MostrarLibro(){
            System.out.println("================");
            System.out.println("Nombre Autor "+this.getNombreA());
            System.out.println("Titulo del Libro "+this.titulo);
            System.out.println("Codigo ISBN "+this.CodISBN);
            System.out.println("Numero de Libros "+numLibros);
        }
    
    
    
}
