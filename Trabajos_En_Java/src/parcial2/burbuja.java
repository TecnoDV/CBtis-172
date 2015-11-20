package parcial2;

import java.util.Scanner;

public class burbuja{
    // Comienza el main.
    public static void main (String[] Args) {
    Scanner Entrada = new Scanner(System.in);
                //Definicion de variables.
                int i,n;              
                /* Piendo el valor del arreglo dependiendo 
                   el valor que el usuario le quiera dar.*/
                System.out.println("Cuantos numeros va  a ingresar :");
                    n=Entrada.nextInt();
                System.out.println("Usted ingresara " + n + " numeros");
                    char datos[]= new char[n];
          
                //Inicio de un ciclo FOR.
                for(i=0;i<n;i++){
                //Obtencion de datos.    
                System.out.println("Ingrese Su Numero :"  );
                int e=0;
                    int fg;
                //Ciclo Do WHILE para validar.    
                do{
                    datos[i]=Entrada.next().charAt(0);
                    fg = datos[i];
                    if (fg>=96 && fg<=122) {
                    System.out.println("Es letra,Introdusca Un Numero");
                
                    } else {
               
                }
                }while (fg>=96 && fg<=122); //Tertmina el cilo Do WHILE.
                }
                //Ordenacion de datos.
                for(i=0;i<n-1;i++){
                int min=i;
                   //Ordenacion de datos.
                   for(int j=i+1;j<n;j++){
                       if(datos[j]<datos[min]){
                       min=j;}
                  /*Ordenacion de datos. */ }
                  if(i!=min){
                      char aux =datos[i];
                      datos[i]=datos[min];
                      datos[min] = aux;}
                /*Impreciion de los datos obtenidos*/ }
                System.out.println("Los numeros de menor a mayor son :");
                for(int k=0; k<n;k++)
                System.out.print(datos[k] + "  ");
        }
    }