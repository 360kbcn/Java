/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteobreprm;

/**
 *
 * @author alumno15
 */
public class ProjecteObrePRM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
       /* ClaseObra Libro1 = new ClaseObra();        
        ClaseObra Libro2 = new ClaseObra();
        ClaseObra Libro3 = new ClaseObra();*/
        ClaseCDMusica CdMusica1 = new ClaseCDMusica ();
        ClaseCDMusica CdMusica2 = new ClaseCDMusica ();
        ClaseCDMusica CdMusica3 = new ClaseCDMusica ();
        ClasePelicula Pelicula1 = new ClasePelicula();        
        ClasePelicula Pelicula2 = new ClasePelicula();
        ClasePelicula Pelicula3 = new ClasePelicula();
        
        
        ClaseEmpresa.mostrardatos();
            
               
        CdMusica1.nombreAutor="AC/DC";
        CdMusica1.Titulo="Back in Black";
        CdMusica1.Precio=3;
        CdMusica1.id_CD=4352;
        CdMusica1.estilo="Heavy Metal";
        
        CdMusica2.nombreAutor="Madonna";
        CdMusica2.Titulo="The Immaculate Collection";
        CdMusica2.Precio=3;
        CdMusica2.id_CD=3456;
        CdMusica2.estilo="Pop";
       
        CdMusica3.nombreAutor="The Rolling Stones";
        CdMusica3.Titulo="It's Only Rock 'n' Roll";
        CdMusica3.Precio=3;        
        CdMusica3.id_CD=2347;
        CdMusica3.estilo="PopRock";
        
        CdMusica1.mostrarObra();
        CdMusica2.mostrarObra();
        CdMusica3.mostrarObra();
        
        Pelicula1.nombreAutor="Ridley Scott";
        Pelicula1.Titulo="Alien el 8th Pasajero";
        Pelicula1.Precio=2;
        Pelicula1.setGenero("Terror");
        Pelicula1.getIdPeli();
        
        Pelicula2.nombreAutor="William Friedkin";
        Pelicula2.Titulo="El Exorcista";
        Pelicula2.Precio=2;
        Pelicula2.setGenero("Terror");
        Pelicula2.getIdPeli();
                
        Pelicula3.nombreAutor="George Lucas";
        Pelicula3.Titulo="Star Wars IV Una nueva Esperanza";
        Pelicula3.Precio=2;
        Pelicula3.setGenero("Ciencia Ficcion");
        Pelicula3.getIdPeli();
                
        Pelicula1.mostrarObra();
        Pelicula2.mostrarObra();
        Pelicula3.mostrarObra();
        
    }
    
}
