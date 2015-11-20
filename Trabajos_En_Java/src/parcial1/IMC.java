package parcial1;

import java.util.Scanner;
public class IMC {
        // Comienza el MAIN
        public static void main(String[] args) {
            Scanner IMC = new Scanner(System.in);
            // Definiendo Nombre De Las Variantes
            String Nombre;
            float Estatura,Peso;
                // Captura De Datos
                System.out.println("Calcula Tu IMC");
                System.out.println("\n"); // Salto De Linea.
                System.out.println("Nombre");
                    Nombre  = IMC.nextLine();
                System.out.println("Peso");
                    Peso = IMC.nextFloat();
                System.out.println("Estatura");
                    Estatura = IMC.nextFloat();
                    // Haciendo Uso De Los Operadores.
                    float Mult = Estatura * Estatura;
                    float Result = Peso / Mult;
                // Obtencion Del Resultado.
                System.out.printf("\nTu IMC Es: "+Result+"\n");
            
    }
        
}
