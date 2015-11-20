package parcial2;

import java.util.Scanner;

public class Estatura {
    public static void main (String [] args){
        Scanner Entrada = new Scanner(System.in);
        
            float Est,Suma=0,Promedio,Rest;
            int i=0;
            
           do {
                System.out.print("Introduce La Estatura: ");
                Est = Entrada.nextFloat(); 
                
           Suma=Suma+Est;
           i++;    
           Rest=i-1;
           } while (Est!=0);
           
           Promedio=Suma/Rest;
           System.out.printf("\nEl Promedio Es: "+Promedio);

    }
    
}
