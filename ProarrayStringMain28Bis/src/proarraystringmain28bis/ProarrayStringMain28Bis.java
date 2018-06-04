/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proarraystringmain28bis;

/**
 *
 * @author alumno15
 */
public class ProarrayStringMain28Bis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String puntosCardinales[] = new String[4];
        
        //puntosCardinales = ;
        
        puntosCardinales[0]="Norte";
        puntosCardinales[1]="Sur";
        puntosCardinales[2]="Este";
        puntosCardinales[3]="Oeste";
        
        
        /*
        for (int con=0;con<puntosCardinales.length;con++)
            
            System.out.println(con+" "+puntosCardinales[con]);
        */
        
        for (String brujula:puntosCardinales){
            
            System.out.println("Los Puntos Cardinales son "+brujula);
        
    }
        
    }
    
}
