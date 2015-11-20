package parcial1;

import java.util.Scanner;
public class Colores {
        public static void main(String[] args) {
            Scanner Colores = new Scanner(System.in);
            int Color;
                System.out.println("Elige tu color");
                System.out.println("\n");
                System.out.println("**************");
                System.out.println("*  1.- Rojo  *");
                System.out.println("*  2.- Verde *");
                System.out.println("*  3.- Azul  *");
                System.out.println("**************");
                System.out.println("\n");
                System.out.println("Que Color Quieres Elejir");
                    Color  = Colores.nextInt();        
                        if (Color==1) {
                                System.out.printf("\nTu Color Es:Rojo");
                        } else 
                        if (Color==2) {
                                System.out.printf("\nTu Color Es:Verde");
                        } else 
                        if (Color==3) {
                                System.out.printf("\nTu Color Es:Azul");
                        } else 
                        if (Color>=4) {
                                System.out.printf("\nColor No Valido\n");
                        }
                        if (Color<=0){
                                System.out.printf("\nColor No Valido\n");
                     
        }
    }
        
}