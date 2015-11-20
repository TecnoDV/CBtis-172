package parcial2;

import java.util.Scanner;

public class serie1a2 {
    //Comienza el main
    public static void main (String [] args){
        Scanner Entrada = new Scanner(System.in);
        //Declaracion de variables
       double Num,i=1,Result,Suma=0;
            //Obtener datos
            System.out.print("Introduce un número: ");
                Num = Entrada.nextInt();
                //Uso del while
                while (i<=Num) {        
                Result=1/i;
                Suma=Result-Suma;
                i++;                   
                } 
                //Imprimiendo resultados
                 System.out.print("=================================");
                 System.out.print("\nEl Número Es: "+Suma);
                 System.out.print("\n=================================\n");
    }
}
