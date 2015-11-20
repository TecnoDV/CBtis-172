package parcial.pkg3;

import java.util.Scanner;

public class Pro_2_MODULO {
    // Sinstaxis Para Crear El Modulo.
    public static void main(String args[]) {
        Scanner Entrada = new Scanner (System.in);
        float b,a,L,R;
        
            Pro_2_MODULO OArea = new Pro_2_MODULO();
            System.out.println("\nDame La Base Del Triangulo");
            b=Entrada.nextFloat();
            System.out.println("Dame La Altura Del Triangulo");
            a=Entrada.nextFloat();
            System.out.println("Dame Un Lado Del Cuadrado");
            L=Entrada.nextFloat();
            System.out.println("Dame El Radio Del Circulo");
            R=Entrada.nextFloat();
            OArea.AreaT(b,a);
            OArea.AreaCua(L);
            OArea.AreaCir(R);

    }  
    public void AreaT(float b, float a) {
        double AT;
        AT=b*a/2;
        System.out.printf ("\nEl Area Del Triangulo Es: %.2f\n ", AT);
    }
    
    public void AreaCua(float L) {
        double Acua;
        Acua=L*L;
        System.out.printf ("El Area Del Cuadrado Es:%.2f\n ", Acua);
    }
    
    public void AreaCir(float R) {
        double pi=3.1416;
        double ACir;
        ACir= pi*(R*R);
        System.out.printf ("El Area Del Circulo Es:%.2f\n ", ACir);
    }

}