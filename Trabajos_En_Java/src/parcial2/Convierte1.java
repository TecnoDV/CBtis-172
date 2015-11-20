
package parcial2;

import java.util.Scanner;

public class Convierte1 {
    public static void main (String [] args){
        Scanner Entrada = new Scanner(System.in);
        // Obtiene La Raiz
        System.out.println ("Escriba La Raiz");
        int raiz=Entrada.nextInt();
        
        // Obtiene La Seccion Del Usuario
        System.out.printf ("Selecione una opcion:\n1 -- %s\n2 -- %sn",
            "Convertir digito a caracter","Convetir caracter a digito");
        int opcion=Entrada.nextInt();
        
        // Procesa La Informacion.
        switch (opcion)
        {
            case 1: // Convierte Un Digito A Caracter.
                System.out.println ("Escribe un digito:");
                int digito=Entrada.nextInt();
                System.out.printf ("Convertir digito a caracter:%s\n",
                        Character.forDigit (digito ,  raiz) );
                break;
            
            case 2: // Convierte Un Caracter A Digito.
                System.out.println ("Escribe un caracter:");
                char caracter=Entrada.next() . charAt( 0 );
                System.out.printf ("Convertir digito a caracter:%s\n",
                        Character.digit (caracter ,  raiz) );
                break;
                
        } // Fin Del Switch.
    } // Fin Del Main.
} // Fin De La Clase.