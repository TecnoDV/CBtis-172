package parcial2.examen;

import java.util.Scanner;

public class Parcial2Examen {


    public static void main(String[] args) {
     //Comienzo Del Main.
     Scanner Entrada = new Scanner (System.in);
     int i;
        //Obtencion Del Tamañano Del Arreglo
         System.out.println ("--> Bienvenido <--");
        System.out.println ("Dame El Valor De Numeros A Insertar: ");
            int N=Entrada.nextInt();
        System.out.println ("\n\n");
            //Declarando el arreglo.
            int Arreglo []= new int[N]; 
            /* Cimienzo De un Ciclo para la obtencion
             * de cada uno de los arreglos.
             */
            for (i=0;i<N;i++){
        System.out.println("Ingresa Tu Numero "+i+":");
        Arreglo[i]=Entrada.nextInt();
            }
        //Realizando comparacion de los Valores ingresados.
        System.out.println ("\n\n");      
        for (i=0;i<N;i++){
        int Result=Arreglo[i]%2;
        if (Result==0){
        System.out.println("Los Varoes Pares Son:"+Arreglo[i]);}
        }
     
    }
}
