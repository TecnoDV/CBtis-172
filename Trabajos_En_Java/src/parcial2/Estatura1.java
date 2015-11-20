package parcial2;

import java.util.Scanner;

public class Estatura1 {
    public static void main (String [] args){
        Scanner Entrada = new Scanner(System.in);
        
            float Est,Suma=0,Promedio;
            int i=0;
            
            System.out.print("Introduce La Estatura: ");
                Est = Entrada.nextFloat(); 
                
           while (Est!=0){
               System.out.print("Introduce La Estatura: ");
           Est = Entrada.nextFloat();
           Suma=Suma+Est;
           i++;    
           }
           
           Promedio=Suma/i;
           System.out.printf("\nEl Promedio Es: "+Suma);

    }
    
}
