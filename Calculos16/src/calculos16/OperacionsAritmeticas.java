package calculos16;




public class OperacionsAritmeticas {
    
    int operando1, operando2, resultado1, resultadoOpAr;
    String valor;
    
    
    int sumaValores(int opera1, int opera2){  // Metodo sumaValores
        
        this.resultado1 = opera1+opera2;
        
        return this.resultado1;
    }
    
    int crearAleatorio(int opera1) { // Metodo crearAleatorios
        int otroresultadoaletorio;
        
        otroresultadoaletorio =(int) (Math.random()*opera1+1);
        return this.resultado1;
    }
    
    
    String unir(String valor, int opera1){ // Metodo Unir
        
        /*
        this.valor = valor+opera1;
        
       return this.valor ;*/
        
        return(valor+opera1); // Mas simple 
    }
    
}
