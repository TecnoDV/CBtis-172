
package parcial2;

import java.util.Scanner;


public class EstaturaGrupo {
    public static void main (String [] args){
        Scanner Entrada = new Scanner(System.in);
        //Declaracion de las variables
            float Est=0,Suma1=0,Promedio1=0,Promedio2=0,Suma2=0,Grupo,Total,Prome;
            int i=0,Cont=0;
            double s;
           //Uso del do while 
           do {
                System.out.println("\n+--------------------+");
                System.out.println("+Selecciona Tu Sexo: +");
                System.out.println("+--------------------+");
                System.out.println("+ 1.- Masculino      +");
                System.out.println("+--------------------+");
                System.out.println("+ 2.- Femenino       +");
                System.out.println("+--------------------+");
                s = Entrada.nextFloat();
               //Uso del IF 
               if (s==1){
                   System.out.println("\n+--------------------+");
                   System.out.print("Introduce La Estatura: \n");
                   System.out.println("+--------------------+");
                   Est = Entrada.nextFloat();
                   Suma1=Suma1+Est;
                    Cont++;    
                  
                    Promedio1=Suma1/Cont;
               } 
                else
               if (s==2) {
                   System.out.println("\n+--------------------+");
                   System.out.print("Introduce La Estatura: \n");
                   System.out.println("+--------------------+");
                   Est = Entrada.nextFloat();
                   Suma2=Suma2+Est;
                    i++;    
                    
                    Promedio2=Suma2/i;
               }  
                       
           
           } while (s!=0);
           //Imprimiendo datos 
           Grupo=Suma1+Suma2;
           Total=i+Cont;
           Prome=Grupo/Total;
           System.out.println("\n+-----------------------------------+");
           System.out.print("El Promedio De Los Hombres Es: "+Promedio1);
           System.out.print("\nEl Promedio De Las Mujeres Es: "+Promedio2);
           System.out.print("\nEl Promedio Grupal Es: "+Prome+"\n");
           System.out.println("+-----------------------------------+");
                
        
    }
}
