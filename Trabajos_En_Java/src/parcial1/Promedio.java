package parcial1;

import java.util.Scanner;

public class Promedio {

    public static void main(String[] args) {
        Scanner Promedio = new Scanner(System.in);
        // Variables
        String Nom,Direccion,Tel;
        double Num1,Num2,Num3;
        // Capturando datos
        System.out.println("Papeleria Pinocho.\n");
        System.out.println("Nombre:");        
            Nom = Promedio.nextLine();        
        System.out.println("Direccion:");
            Direccion = Promedio.nextLine();
        System.out.println("Telefono:");
            Tel = Promedio.nextLine();
        System.out.println("Precio Del Producto 1");
            Num1 = Promedio.nextDouble();
        System.out.println("Precio Del Producto 2");
            Num2 = Promedio.nextDouble();
        System.out.println("Precio Del Producto 3");
            Num3 = Promedio.nextDouble();
        // Uso De Los Operadores
        double Sum = Num1+Num2+Num3;
        // Condiciones
        if (Sum>=500) {
                double subtotal = Sum ;
                    System.out.printf("\nel subtotal es:"+Sum+"\n");
                double descuento=subtotal*0.10 ;    
                    System.out.printf("\nSu descuento es de:"+descuento+"\n");
                double total=subtotal-descuento ; 
                    System.out.printf("\nSu total es de:"+total+"\n");
        } 
        else
            if (Sum<500) {
                    System.out.printf("el subtotal es:"+Sum+"\n");
                    System.out.printf("Su Total Es:"+Sum+"\n");
                
            }  
        }
    }

