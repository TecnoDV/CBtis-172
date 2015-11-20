package parcial2;

import java.util.Scanner;

public class Factorial {
    public static void main (String [] args){
        Scanner numero = new Scanner(System.in);
        // Declaracion De Variables
            long Factorial=1;
            int Num;
        // Pidiendo datos A Necesitar.
        System.out.print("Introduce un número: ");
            Num = numero.nextInt();
                // Uso Del FOR    
                for (int i = Num; i > 0; i--) {
                Factorial = Factorial * i;
        }
        // Inprimiendo Resultados.  
        System.out.print("︹︹︹︹︹︹︹︹︹︹︹︹︹︹︹︹︹︹︹︹\n");        
        System.out.printf("El Factorial Del Número: "+Num+" Es: "+Factorial+"\n");
        System.out.print("︺︺︺︺︺︺︺︺︺︺︺︺︺︺︺︺︺︺︺︺\n");
                
   }
}   

