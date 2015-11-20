
package parcial2;

import java.util.Scanner;

public class Arreglo2 {
     public static void main (String [] args){
       Scanner Entrada = new Scanner(System.in);
       
       int arreglo[]={ 10, 20, 30, 40, 50 };
       
       // Arreglo = new int [ 5 ]; // crea el espacio para el arreglo
       System.out.printf ( "%s%15s\n", "Indice", "Valor"); // Estructura de columna
       // imprime el valor de cada elemento del arreglo
       for ( int contador = 0; contador < arreglo.length; contador++)
       System.out.printf ( "%d%8d\n", contador, arreglo [ contador ] );  
       
     } // Fin Del Main
}
