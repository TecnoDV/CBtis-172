package parcial1;

import java.util.Scanner;

public class ticket {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        String Nombre,Domicilio,RFC;
            int op;
            float Litros;
            double Subtotal=0,Total=0;
            float Iva= (float) 0.16;
                System.out.println("Nombre:");
                    Nombre = Entrada.nextLine();
                System.out.println("Domicilio:");
                    Domicilio = Entrada.nextLine();
                System.out.println("RFC:");
                    RFC = Entrada.nextLine();
                System.out.println("Litros:");
                    Litros = Entrada.nextFloat();
                System.out.println("**********************");
                System.out.println("*      Menu          *");
                System.out.println("**********************");
                System.out.println("* 1.- Gasolina Roja  *");
                System.out.println("**********************");
                System.out.println("* 2.- Gasolina Verde *");
                System.out.println("**********************");
                System.out.println("* 3.- Diesel         *");
                System.out.println("**********************");
                System.out.println("* 4.- Salir          *");
                System.out.println("**********************");
                op = Entrada.nextInt();
                switch ( op ) {
                case 1:
                    Subtotal=Litros*13.52;
                    Total= Subtotal+(Subtotal+Iva);
                    break;  
                case 2:
                    Subtotal=Litros*14.38;
                    Total= Subtotal+(Subtotal+Iva);
                    break;    
                case 3:
                    Subtotal=Litros*14.20;
                    Total= Subtotal+(Subtotal+Iva);
                    break;
                case 4:
                    break;
                    
           } 
                
               System.out.printf("%s\n",Nombre); 
               System.out.printf("%s\n",Domicilio);
               System.out.printf("%s\n",RFC);
               System.out.printf("%s\n",Litros);
               System.out.printf("%s\n",Subtotal);
               System.out.printf("%s\n",Total);
               
     }
    
}
