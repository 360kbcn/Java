/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proycastingmain31;

/**
 *
 * @author alumno15
 */
public class ProyCastingMain31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        byte nbyte = 1;
        short nshort = 2;
        int nint = 3;
        long nlong = 4;
        float nfloat = 5.5f;
        double ndouble = 6.6d;
        
        String cadena1 = "123";
        String cadena2 = "Java Version";
        
        int num=0;
        
        
        // Casting de Variables Primitivas
        
        nbyte=(byte) nshort;
        nshort=nbyte;
        
        nint=(int) nlong;
        
        nlong=nint;
        
        System.out.println("Valor de nbyte "+nbyte);        
        System.out.println("Valor del long "+nlong);
        System.out.println("Valor del int "+nint);
        
        // Casting de Variables String
        
        num = Integer.parseInt(cadena1);

        System.out.println("Valor de num Cogiendo los valores de Cadena1 "+num);
        
        nfloat = Float.parseFloat(cadena1);
        
        System.out.println("Valor de nfloat Cogiendo los valores de Cadena1 "+nfloat);
                
        
        // Casting de Variables de String a numeros primitivos
        
        cadena1 = String.valueOf(nbyte);
        
        System.out.println("Valor de Cadena1 Cogiendo los valores de nbyte "+cadena1);
        
        // Casting Pasar un String a un Array
        
        char arrayCadena2[] = cadena2.toCharArray();
        
        for (char c1:arrayCadena2) {
            System.out.println(c1);
            
        }
        
        
        
    }
    
}
