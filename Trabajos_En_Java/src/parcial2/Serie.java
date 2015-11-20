package parcial2;

import java.util.Scanner;

public class Serie {
    public static void main (String [] args){
        Scanner numero = new Scanner(System.in);
        // Declaracion De Variables
            float Num,Cont,Suma=1;
        // Pidiendo datos A Necesitar.
        System.out.print("Introduce un número: ");
            Num = numero.nextInt();
                // Uso Del FOR    
                for (Cont=2;Cont<=Num;Cont++) {
                    
                Suma = Suma+1/Cont;
        }
        // Inprimiendo Resultados.   
        System.out.print("\n\n§§§§§§§§§§§§§§§§§§§§\n");        
        System.out.printf("Resultado: "+Suma+"");
        System.out.print("\n§§§§§§§§§§§§§§§§§§§§\n");
                
   }
}   