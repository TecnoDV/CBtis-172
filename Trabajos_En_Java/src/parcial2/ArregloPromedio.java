package parcial2;

import java.util.Scanner;


public class ArregloPromedio {
    public static void main (String [] args){
       Scanner Entrada = new Scanner(System.in);
       //Inicializacion de la variable CONT.
       int Cont;
       
        //Uso Del Vector o Arreglo INT Nombre[] = new INT [Tamaño];
        String nombres[] = new String[11];
        int Parcial1[] = new int[11];
        int Parcial2[] = new int[11];
        int Parcial3[] = new int[11];
        float PromFinal[] = new float[11];
        
            //Uso Del Ciclo FOR para contavilizar los alumnos.
            for(Cont=1; Cont <= 10; Cont++) {
                
                /*Obtencion De Los Datos A Insertar En
                  Cada Uno De Los Arreglos. */
                    System.out.println ("Dame El Nombre Del Alumno "+Cont+"");
                        nombres [Cont]= Entrada.nextLine();
                    System.out.println ("Dame La Calificacion Del Parcial 1: ");
                        Parcial1 [Cont]= Entrada.nextInt();
                    System.out.println ("Dame La Calificacion Del Parcial 2: ");
                        Parcial2 [Cont]= Entrada.nextInt();
                    System.out.println ("Dame La Calificacion Del Parcial 3: ");
                        Parcial3 [Cont]= Entrada.nextInt();  
                        Entrada.nextLine();
                    PromFinal[Cont] = (Parcial1[Cont]+Parcial2[Cont]+Parcial3[Cont])/3;
                    
                }//Fin del ciclo.
            //Imprecion de los datos.
            System.out.printf ("%s%15s%15s%15s%20s\n","Nombre Del Alumno","Parcial 1","Parcial 2","Parcial 3","Promedio Final");
            
            /*Uso del ciclo FOR para contavilizar los alumnos
            y llevar acabo la imprecion de las calificaciones.Cont*/
            for(Cont=1; Cont <= 10; Cont++) {
                
            //Imprecion de los datos.
            System.out.printf ( "%s%10d%15d%15d%22f\n",nombres[Cont],Parcial1[Cont],Parcial2[Cont],Parcial3[Cont],PromFinal[Cont]);
            
         }//Fin Del ciclo.
            
    }//Fin del main.
    
}//Fin de la clase.