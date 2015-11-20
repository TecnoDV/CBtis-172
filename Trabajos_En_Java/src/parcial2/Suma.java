package parcial2;

    import java.util.Scanner;

        public class Suma {
            public static void main (String [] args){
                Scanner Entrada = new Scanner (System.in);
                int N,Suma=0;
                
                System.out.println("Dame Tu Numero");
                 N = Entrada.nextInt ();
                
                    for (int Cont=0;Cont<=N;Cont=Cont+2){
                        
                    Suma=Suma+Cont;
                    System.out.printf("%d\n",Suma);
                                            
                   }  
               }    
         }
