package parcial.pkg3;

import java.util.Scanner;

public class Pro_3_MODULO {
    // Sinstaxis Para Crear El Modulo.
    public static void main(String args[]) {
        float b=2,a=10,L=10,R=4;

            Pro_3_MODULO OArea = new Pro_3_MODULO();
            OArea.AreaT();
            OArea.AreaCua();
            OArea.AreaCir();

    }  
    public void AreaT() {
        Scanner Entrada = new Scanner(System.in);
        System.out.println("\nDame La Base Del Triangulo");
        float b=Entrada.nextFloat();
        System.out.println("Dame La Altura Del Triangulo");
        float a=Entrada.nextFloat();
        double AT;
        AT=b*a/2;
        System.out.printf ("\nEl Area Del Triangulo Es:%.2f\n ", AT);
    }
    
    public void AreaCua() {
        Scanner Entrada = new Scanner(System.in);
        System.out.println("\nDame Un Lado Del Cuadrado");
        float L=Entrada.nextFloat();
        double Acua;
        Acua=L*L;
        System.out.printf ("El Area Del Cuadrado Es:%.2f\n ", Acua);
    }
    
    public void AreaCir() {
        Scanner Entrada = new Scanner(System.in);
        System.out.println("\nDame El Radio Del Circulo");
        float R=Entrada.nextFloat();
        double pi=3.1416;
        double ACir;
        ACir= pi*(R*R);
        System.out.printf ("El Area Del Circulo Es:%.2f\n ", ACir);
    }
}
