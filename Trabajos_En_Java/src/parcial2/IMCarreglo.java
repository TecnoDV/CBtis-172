package parcial2;

import java.util.Scanner;

public class IMCarreglo {
public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
    //Declaracion De Variables
    float numero1, numero2;
        //Declarando Los Arreglos
        String Nombres [] = new String [3];
        String peso []= new String [3];
        String estatura [] = new String [3];
        float IMC []= new float [3];
            /* Obtencion De todos Los Datos
             * Para llevar acabo el proceso
             */
             System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");                                                              
    System.out.println("■   _____   _                                     _      _          ■");        
    System.out.println("■  (_____) (_)  ____  _              ____  _     (_)    (_)         ■");     
    System.out.println("■  (_)__(_) _  (____)(_)__   _   _  (____)(_)__   _   __(_)  ___    ■");  
    System.out.println("■  (_____) (_)(_)_(_)(____) (_) (_)(_)_(_)(____) (_) (____) (___)   ■");
    System.out.println("■  (_)__(_)(_)(__)__ (_) (_)(_)_(_)(__)__ (_) (_)(_)(_)_(_)(_)_(_)  ■");
    System.out.println("■  (_____) (_) (____)(_) (_)  (_)   (____)(_) (_)(_) (____) (___)   ■");
    System.out.println("■                                                                   ■");
             System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n\n");
             
                for(int i=1;i<3;i++){
                    System.out.print("¿Cual Es Tu Nombre?\n");
                    Nombres [i]=entrada.nextLine();
                    System.out.print("҉ Mucho Gusto " + Nombres [i] + " Introduce Tu Peso En KG: ҉\n");
                    peso [i]=entrada.nextLine();
                    System.out.print(Nombres [i] + " Introduce Tu Estatura:\n");
                    estatura [i]=entrada.nextLine();

                    numero1=Float.parseFloat(peso [i]);
                    numero2=Float.parseFloat(estatura [i]);
                    //Obtencion Del IMC
                    IMC [i]=numero1/(numero2*numero2);}
                
                    //Ciclos Para Acomodo De IMC
                    for(int i=1;i<3;i++){
                    System.out.print(Nombres[i] +" Tu IMC Es: " + IMC [i] + "\n" + "\n");

                    if (IMC [i]>18.5 && IMC [i]<24.9) {
                    System.out.println("Te Encuentras En Un Peso IDEAL ó NORMAL" + "\n"); }

                    if (IMC [i]<18.5)   {
                    System.out.println("Te Encuentras En Un Peso BAJO ó DESNUTRID@" + "\n"); }
 
                    if (IMC [i]>25 && IMC [i]<29.9) {
                    System.out.println("Estas En SOBRE PRESO" + "\n"); }

                    if (IMC [i]>30) {
                    System.out.println("Estas OBESO" + "\n"); }
                    
            //Resultado De Tu IMC
            System.out.println("Informacion De Indice De Masa Corporal" + "\n");
            System.out.print(" BAJO PESO MENOR QUE 18.5 " + "\n");
            System.out.print(" NORMAL ENTRE 18.5 Y 24.9 " + "\n");
            System.out.print(" SOBRE PESO ENTRE 25 Y 29.9" + "\n");
            System.out.print(" OBESIDAD SOBRE O IGUAL A 30" + "\n" + "\n");
            System.out.print(" HASTA PRONTO " + "\n" + "\n");}
}

}
    
