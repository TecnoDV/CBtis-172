package parcial1;

import java.util.Scanner;
public class Datos {
        public static void main(String[] args) {
            Scanner Datos = new Scanner(System.in);
                String Nombre,Escolaridad,Carrera;
                int Edad;
            
            /* Inicializacion de un pequeño programa para capturar datos
             * llevandose acabo las funcionalidades investigadas.
             */
             
                System.out.println("Datos personales"); 
                System.out.printf ("\n"); // Salto de linea
                System.out.println("Nombre"); //leer un string
                    Nombre = Datos.nextLine(); // capturar datos  
                System.out.println("Escolaridad"); //leer un string
                    Escolaridad = Datos.nextLine (); // capturar datos
                System.out.println("Carrera"); // leer un string   
                    Carrera = Datos.nextLine (); // capturar datos
                System.out.println("Edad");    // leer un string
                    Edad = Datos.nextInt (); // capturar datos
                System.out.printf ("\n"); // Salto de linea
                        
            /* Imprecion de datos capturados para la comprobacio
             * de dicho programa
             */
                        
                System.out.printf ("%s\n", Nombre);  
                System.out.printf ("%s\n", Escolaridad);
                System.out.printf ("%s\n", Carrera);
                System.out.printf ("%s\n", Edad);
        }
}