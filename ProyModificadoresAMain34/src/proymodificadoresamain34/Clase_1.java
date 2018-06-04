/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proymodificadoresamain34;



/**
 *
 * @author alumno15
 */
public class Clase_1 {
    
    public int aPublic=1;
    protected int aProtected=2;
    int aDefault=3;
    private int aPrivate=4;
    
    static  int aStatic = 5;

    public Clase_1(int aPublic, int aProtected, int aDefault, int aPrivate ) {
        this.aPublic = aPublic;
        this.aProtected = aProtected;
        this.aDefault = aDefault;
        this.aPrivate = aPrivate;
        
       
    }

    public Clase_1() {       
    }
    
    
    public int getprivate() {
        //aPrivate=4;
        return this.aPrivate;
    }
    
    
    public void setprivate(int aPrivate){
        this.aPublic=aPrivate;
}
           
    public int getProtected(){
        return this.aProtected;
    }
    
    public void setProtected(int aProtectedl){
        this.aProtected=aProtected;
    }
    
   
        
      
}
