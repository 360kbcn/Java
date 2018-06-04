/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proymascotas25;

/**
 *
 * @author alumno15
 */
public class Proymascotas25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here       
        VerDatosPerro perro1= new VerDatosPerro("Tod","Perro",false, null);        
        VerDatosPerro serpiente = new VerDatosPerro("Lucia", "Lapropentis", false, "No");
        
        ClasePerro perro = new ClasePerro();
        
        perro1.mostrarDatosanimal();
        serpiente.mostrarDatosanimal();
        
        perro.perro();
         
        
        
    }
    
}
