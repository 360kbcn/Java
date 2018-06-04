/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proysobreescrituratostring36;

/**
 *
 * @author alumno12
 */
public class ProySobreescrituraToString36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//si es un String lo escribe tal cual, no muesta la direccion@
        String cadena="Ejercicio toString";
        ClaseAve ave1=new ClaseAve("Colibri",2,"Multicolor");
        ClaseAve ave2=new ClaseAve("Grajo",2,"Negro");
// Muestra el package y la direccion del STACK que apunta al contenido del HEAP       
        System.out.println(cadena);
        System.out.println("Ave1: "+ave1);
        System.out.println("Ave2: "+ave2);
        
        ClaseAnimal animal1 = new ClaseAnimal("Zarigueya",4);
        ClaseAnimal animal2 = new ClaseAnimal();
        animal2.especie="Leon";
        animal2.nPatas=4;                         
        animal1.mostrarDetalles();        
        // ave1.mostrarDetalles();
        System.out.println(ave1);
        System.out.println(animal1);
        
        ave1.soniguales(ave1, ave2);
    }
    
}
