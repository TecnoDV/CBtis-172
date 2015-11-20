package parcial2;

import java.util.Scanner;

public class vectorIMC {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
        
        String Nombres [] = new String [3];
        float peso []= new float [3];
        float estatura [] = new float [3];
        float imc []= new float [3];
        
        for(int i=1;i<3;i++){
        System.out.println ("Introduce Tu Nombre:");
        Nombres[i] = entrada.nextLine();
        System.out.println ("Introduce Tu Peso : ");
        peso[i]=entrada.nextFloat();
        System.out.println ("Introduce Tu Estatura : ");
        estatura[i]=entrada.nextFloat();
        Nombres[i] = entrada.nextLine();
        imc[i] = peso[i]/(estatura[i] * estatura[i]);
        }

        System.out.printf ("%s%15s%15s%15s\n","Nombre Del Alumno","Peso","Estatura","IMC");
        for(int i=1;i<3;i++){
        System.out.printf ( "%15s%10f%15f%15f\n",Nombres[i],peso[i],estatura[i],imc[i]);}

    }
}
