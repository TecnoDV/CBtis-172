package parcial1;

import java.util.Scanner;

public class Cine {
    // Comienza El Main.
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        // Declarando Variables Y Definiendo El Tipo De Variables Que Son.
            String Nombre,Horario,Tarjeta,Pelicula;
                int op,Boleto,Sala=0;
                double Total=0;
                // Obteniedo Datos Para La Solucion Del Problema.
                    System.out.println("Nombre:");
                        Nombre = Entrada.nextLine();
                    System.out.println("*********************************************");
                    System.out.println("*                Cartelera                  *");
                    System.out.println("*********************************************");
                    System.out.println("*   1.- Pixeles       * 2.- El Regalo       *");
                    System.out.println("*        $69          *        $69          *");
                    System.out.println("*    4:45pm,7:05pm    *   2:55pm,5:20pm     *");
                    System.out.println("*********************************************");
                    System.out.println("*   3.- Siniestro2    * 4.- Por Mis bigotes *");
                    System.out.println("*        $69          *        $69          *");
                    System.out.println("*   8:25pm,10:30pm    *    2:25pm,4:40pm    *");
                    System.out.println("*********************************************");
                    System.out.println("*   5.-      Shaun Del Cordero              *");
                    System.out.println("*                   $69                     *");
                    System.out.println("*                  2:50pm                   *");
                    System.out.println("*********************************************");
                    System.out.println("*   6.-             SALIR                   *");
                    System.out.println("*********************************************");
                    System.out.println("\n¿Nombre De La Pelicula Deseada a Ver?");
                        Pelicula = Entrada.nextLine();
                    System.out.println("\n¿Que Horario Deseas?");
                        Horario = Entrada.nextLine();
                    System.out.println("\n¿Como Desea Pagar?");
                    System.out.println("*********************************************");
                    System.out.println("*                  Efectivo                 *");
                    System.out.println("*********************************************");
                    System.out.println("*********************************************");
                    System.out.println("*                  Tarjeta                  *");
                    System.out.println("*********************************************");
                        Tarjeta = Entrada.nextLine();
                    System.out.println("\n¿Cuantos Boletos?");
                        Boleto = Entrada.nextInt();
                    System.out.println("\n¿Numero De la pelicula?");
                        op = Entrada.nextInt();
                        // Aplicando La Estructura De Seleccion. 
                        switch ( op ) {
                            case 1:
                                Total=Boleto*68;
                                Sala=1;
                            break;  
                            case 2:
                                Total=Boleto*68;
                                Sala=3;
                            break;    
                            case 3:
                                Total=Boleto*68;
                                Sala=4;
                            break;
                            case 4:
                                Total=Boleto*68;
                                Sala=5;
                            break;
                            case 5:
                                Total=Boleto*68;
                                Sala=6;
                            break;
                            case 6:
                            break;
                    
           } 
                    // Imprimiendo Resultados Finales.
                    System.out.printf("Nombre: "+Nombre+"\n");  
                    System.out.printf("Pelicula: "+Pelicula+"\n");
                    System.out.printf("Horario: "+Horario+"\n");
                    System.out.printf("No De Boletos: "+Boleto+"\n");
                    System.out.printf("Sala: "+Sala+"\n");
                    System.out.printf("Forma De Pago: "+Tarjeta+"\n");
                
     }
    
}
