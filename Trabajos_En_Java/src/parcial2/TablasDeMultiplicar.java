package parcial2;

import java.util.Scanner;

public class TablasDeMultiplicar {
    public static void main (String [] args){
        Scanner Entrada = new Scanner (System.in);
            int Resultado,Num,Mult=0;
            
            System.out.println("Dame Tu Numero A Multiplicar");
                 Num = Entrada.nextInt ();
                 
           for (int Cont=1;Cont<=10;Cont++){
               
                    Resultado=Cont*Num;
                    
                    System.out.printf("%d\n\n",Resultado);
               
           }
    }
    
}
