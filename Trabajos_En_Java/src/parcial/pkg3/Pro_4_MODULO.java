package parcial.pkg3;

import java.util.Scanner;

public class Pro_4_MODULO {
    // Sinstaxis Para Crear El Modulo.
public void AreaT(float b, float a) {
    double AT;
    AT=(b*a)/2;
    System.out.printf ("\nEl Area Del Triangulo Es:%.2f\n", AT);
    }
    
public void AreaCua(float L) {
    double Acua;
    Acua=L*L;
    System.out.printf ("\nEl Area Del Cuadrado Es:%.2f\n", Acua);
    }
    
public void AreaCir(float R) {
    double pi=3.1416;
    double ACir;
    ACir= pi*(R*R);
    System.out.printf ("\nEl Area Del Circulo Es:%.2f\n", ACir);
    }

public static void main(String args[]) {
        Scanner Entrada = new Scanner (System.in);
        float b,a,L,R;
        int op;
        Pro_1_MODULO OArea = new Pro_1_MODULO();
                    
            System.out.println("De Que Figura Deseas Sacar El Area");
            System.out.println("\n******************");
            System.out.println("*  1.- Triangulo *");
            System.out.println("*  2.- Cuadrado  *");
            System.out.println("*  3.- Circulo   *");
            System.out.println("*  4.- Salir     *");
            System.out.println("******************");
            op=Entrada.nextInt();
            switch (op) {
            
                case 1:
                System.out.println("\nDame La Base Del Triangulo");
                b=Entrada.nextFloat();
                System.out.println("Dame La Altura Del Triangulo");
                a=Entrada.nextFloat();
                OArea.AreaT(b,a);
                break;
                    
                case 2:
                System.out.println("\nDame Un Lado Del Cuadrado");
                L=Entrada.nextFloat();
                OArea.AreaCua(L);
                break;
                    
                case 3:
                System.out.println("\nDame El Radio Del Circulo");
                R=Entrada.nextFloat();
                OArea.AreaCir(R);
                break;
                    
                case 4:
                break;}
    }
}