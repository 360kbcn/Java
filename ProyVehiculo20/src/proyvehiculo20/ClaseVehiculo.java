/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyvehiculo20;

/**
 *
 * @author alumno4
 */
public class ClaseVehiculo {
    //atributos de vehiculo
    public String marca;
    public String modelo;
    private String color;
    private boolean nuevo;
    private String matricula;
    private int precio;
    
    
    //constructor vacío
    ClaseVehiculo(){};
    
    //constructor 2
    ClaseVehiculo(String marca, String modelo, String color, Boolean nuevo, 
            String matricula, int precio){
        this.marca = marca;
        this.modelo =modelo;
        this.color=color;
        this.nuevo=true;
        this.matricula=matricula;
        this.precio=precio;
        // el this. es para hacer referencia a los atributos de clase
        /*en el constructor hay que poner el this. y distinguir las 2 variables 
        que se llaman igual*/
    }
    
    //metodos
    
    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return this.color;
    }
   /* public void asignarColor (String color){
        if (color=="Azul"){
        this.color= color;
        } else if (color == "Blanco"){
        this.color=color;
        }else {
            System.out.println(" ");
        }
    }

    public String leerColor (){
        return this.color;    
    }*/
    
    public void setNuevo (boolean nuevo){
        this.nuevo=nuevo;
    }
    
    public boolean getNuevo(){
        return this.nuevo;
    }             
    
    public void setMatricula (String matricula){
        this.matricula= matricula;
    }
    public String getMatricula(){
        return this.matricula;
    } 
    
      
    /*public void asignarMatricula (String matricula){
         if (matricula=="2432MMN"){
        this.matricula= matricula;
        } else if (matricula == "8215JJL"){
        this.matricula=matricula;
        }else {
            System.out.println(" ");
        }
    }

    public String leerMatricula (){
        return this.matricula;    
    }*/
    public void setPrecio(int precio, boolean estaEnStock){
        
        if(estaEnStock){
            this.precio=precio;
        }else{
            System.out.println("Vehiculo no disponible. "
                                    + "No se puede asignar precio");
        }
            
    }
    
    public int getPrecio (){
        return this.precio;
    }
    /* public void asignarPrecio (int precio){
         if (precio==500){
        this.precio= precio;
        } else if (precio == 24000){
        this.precio=precio;
        }else {
            System.out.println(" ");
        }
    }

    public int leerPrecio (){
        return this.precio;    
    }*/
    
    public void mostrarAtributos (){
        System.out.println("\n---------");    
        System.out.println("Marca: "+ marca);
        System.out.println("Modelo: "+modelo);
        //en la clase no requiere poner "leerespecie" aunque sea privada
        System.out.println("Color: "+this.color);    
        System.out.println("Es nuevo: "+this.nuevo);
        System.out.println("Matricula: "+this.matricula);
        System.out.println("Precio: "+this.precio);
    }
}