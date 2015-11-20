package parcial2;

import java.util.Scanner;


public class ArregloPromedio2 {
    public static void main (String [] args){
       Scanner Entrada = new Scanner(System.in);
       int Cont;
        //Uso Del Vector o Arreglo
        String nombres[] = new String[11];
        int Parcial1[] = new int[11];
        int Parcial2[] = new int[11];
        int Parcial3[] = new int[11];
        float PromFinal[] = new float[11];
            //Uso Del Ciclo FOR
            for(Cont=1; Cont <= 2; Cont++) {
                /*Obtencion De Los Datos A Insertar En
                  Cada Uno De Los Arreglos*/
                    System.out.println ("Dame El Nombre Del Alumno "+Cont+"");
                        nombres [Cont]= Entrada.nextLine();
                do {
                    System.out.println ("Dame La Calificacion Del Parcial 1: ");
                        Parcial1[Cont] = Entrada.next().charAt (0);
                        do {
                    int Prueba=0;
                        
                        Character.forDigit (Parcial1[Cont],Prueba);}
                        while (Parcial1[Cont]<0);
                }
                while (Parcial1[Cont]>=9.99);
                do {
                    System.out.println ("Dame La Calificacion Del Parcial 2: ");
                        Parcial2 [Cont]= Entrada.nextInt(); }
                while (Parcial2[Cont]>=9.99);
                do {
                    System.out.println ("Dame La Calificacion Del Parcial 3: ");
                        Parcial3 [Cont]= Entrada.nextInt(); }
                while (Parcial3[Cont]>=9.99);
                        Entrada.nextLine();
                    PromFinal[Cont] = (Parcial1[Cont]+Parcial2[Cont]+Parcial3[Cont])/3;
       }
            //Uso Del Ciclo FOR
            System.out.printf ("%s%15s%15s%15s%20s\n","Nombre Del Alumno","Parcial 1","Parcial 2","Parcial 3","Promedio Final");
            for(Cont=1; Cont <= 2; Cont++) {
            System.out.printf ( "%s%10d%15d%15d%22f\n",nombres[Cont],Parcial1[Cont],Parcial2[Cont],Parcial3[Cont],PromFinal[Cont]);
         }
    }
}
