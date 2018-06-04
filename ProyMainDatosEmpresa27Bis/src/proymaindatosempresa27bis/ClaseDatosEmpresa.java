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
public final class ClaseDatosEmpresa {
    
    public static final String NOM_EMPRESA = "Mi Empresa, SCP", CIF_EMPRESA ="B123456789", TEL_EMPRESA ="93666666666";
    
    public static void mostrarDatos(){
        System.out.println("\n");
        System.out.println("Datos desde El Metodo mostrarDatos \n");
        System.out.println("El Nombre de La Empresa es "+NOM_EMPRESA);
        System.out.println("El CIF "+CIF_EMPRESA);
        System.out.println("EL Telefono "+TEL_EMPRESA);
        
    }
    
    
    public void mostrarDatosObjeto(){
        System.out.println("\n");
        System.out.println("Datos usando un Objeto \n");
        System.out.println("El Nombre de La Empresa es "+NOM_EMPRESA);
        System.out.println("El CIF "+CIF_EMPRESA);
        System.out.println("EL Telefono "+TEL_EMPRESA);
        
    }
   
    
}
