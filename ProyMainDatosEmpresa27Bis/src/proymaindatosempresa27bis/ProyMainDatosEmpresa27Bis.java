/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proymaindatosempresa27bis;

/**
 *
 * @author alumno15
 */
public class ProyMainDatosEmpresa27Bis {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        ClaseDatosEmpresa DatosDeMiEmpresa = new ClaseDatosEmpresa();
           
        System.out.println("Datos desde el Main \n");
        System.out.println("El Nombre de La Empresa es "+ClaseDatosEmpresa.NOM_EMPRESA);
        System.out.println("El CIF "+ClaseDatosEmpresa.CIF_EMPRESA);
        System.out.println("EL Telefono "+ClaseDatosEmpresa.TEL_EMPRESA);
        
        ClaseDatosEmpresa.mostrarDatos(); /*de esta manera llamamos al 
                                            metodo statc mostrar empresa*/
        
        DatosDeMiEmpresa.mostrarDatosObjeto(); /*de esta manera llamamos al
                                                metodo sin static y con 
                                                un objeto*/
    }
    
}
