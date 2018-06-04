/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno15
 */
public class ClaseNumeroFactorial {
    
    int nUmero, lImite;
    
    void Factorial(){
        
        lImite=nUmero;
        for (int i=1;i<nUmero;i++){
            lImite--;
            System.out.print(lImite+" ");
        }
    
    }
}
