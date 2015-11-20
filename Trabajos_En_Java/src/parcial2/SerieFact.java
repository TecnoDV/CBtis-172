package parcial2;

import java.util.Scanner;

public class SerieFact {
    public static void main (String [] args){
        Scanner numero = new Scanner(System.in);
        // Declaracion De Variables
            float Num,i,Suma=1,Factorial=1;
        // Pidiendo datos A Necesitar.
        System.out.print("Introduce un número: ");
            Num = numero.nextInt();
                // Uso Del FOR    
                for (i = Num; i > 0; i--) {
                Factorial = Factorial * i;
                
                }
                for (i=2;i<=Num;i++) {
                    
                Suma = Suma+1/i; 
        }
        // Inprimiendo Resultados.
        System.out.print("\n\n*************************************\n");        
        System.out.printf("El Factorial Del Número: "+Num+" Es: "+Factorial+"\nSeríe: "+Suma+"\n"); 
        System.out.print("*************************************\n");
   }
}   