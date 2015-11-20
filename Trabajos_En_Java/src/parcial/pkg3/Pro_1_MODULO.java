package parcial.pkg3;

public class Pro_1_MODULO {
    // Sinstaxis Para Crear El Modulo.
    public static void main(String args[]) {
        float b=2,a=10,L=10,R=4;

            Pro_1_MODULO OArea = new Pro_1_MODULO();
            OArea.AreaT(b,a);
            OArea.AreaCua(L);
            OArea.AreaCir(R);

    }  
    public void AreaT(float b, float a) {
        double AT;
        AT=b*a/2;
        System.out.printf ("\n El Area Del Triangulo Es:%.2f\n ", AT);
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
