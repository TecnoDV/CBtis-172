package parcial.pkg3;
import java.util.Scanner;
public class Pro_6_GASOLINERA {
    /* 
        Modulo Para La Obtencion e Imprecion De Datos
        Sobre El Calculo De La Gasolina Roja.
    */
    public void Roja(float Litros, float Iva, String Nombre, String Domicilio, String RFC) {
        double Subtotal,Total; Subtotal=Litros*14.20; Total= Subtotal+(Subtotal+Iva);
        System.out.println("\n _____             _                                          _     _ _       ");
        System.out.println("|   __|___ ___ ___|_|___ ___    ___ ___ ___    ___ _ _    _ _|_|___|_| |_ ___ ");
        System.out.println("|  |  |  _| .'|  _| | .'|_ -|  | . | . |  _|  |_ -| | |  | | | |_ -| |  _| .'|");
        System.out.println("|_____|_| |__,|___|_|__,|___|  |  _|___|_|    |___|___|   \\_/|_|___|_|_| |__,|");
        System.out.println("                               |_|                                            \n\n+--------------------------------------------+");
        System.out.println("+         -> Gasolinera Los Mismo <-         +\n+--------------------------------------------+");
        System.out.println("+  Nombre: "+Nombre+"\n+--------------------------------------------+");
        System.out.println("+  Domicilio: "+Domicilio+"\n+--------------------------------------------+");
        System.out.println("+  RFC: "+RFC+"\n+--------------------------------------------+");
        System.out.println("+  Litros: "+Litros+"\n+--------------------------------------------+");
        System.out.println("+  Subtotal: "+Subtotal+"\n+--------------------------------------------+");
        System.out.println("+  Total: "+Total+"\n+--------------------------------------------+");
        System.out.println("+ Copyright © 2015-2016 All Rights Reserved. +\n+--------------------------------------------+");
    }
    /* 
        Modulo Para La Obtencion e Imprecion De Datos
        Sobre El Calculo De La Gasolina Verde.
    */
    public void Verde(float Litros, float Iva, String Nombre, String Domicilio, String RFC) {
        double Subtotal,Total; Subtotal=Litros*14.20; Total= Subtotal+(Subtotal+Iva);
        System.out.println("\n _____             _                                          _     _ _       ");
        System.out.println("|   __|___ ___ ___|_|___ ___    ___ ___ ___    ___ _ _    _ _|_|___|_| |_ ___ ");
        System.out.println("|  |  |  _| .'|  _| | .'|_ -|  | . | . |  _|  |_ -| | |  | | | |_ -| |  _| .'|");
        System.out.println("|_____|_| |__,|___|_|__,|___|  |  _|___|_|    |___|___|   \\_/|_|___|_|_| |__,|");
        System.out.println("                               |_|                                            \n\n+--------------------------------------------+");
        System.out.println("+         -> Gasolinera Los Mismo <-         +\n+--------------------------------------------+");
        System.out.println("+  Nombre: "+Nombre+"\n+--------------------------------------------+");
        System.out.println("+  Domicilio: "+Domicilio+"\n+--------------------------------------------+");
        System.out.println("+  RFC: "+RFC+"\n+--------------------------------------------+");
        System.out.println("+  Litros: "+Litros+"\n+--------------------------------------------+");
        System.out.println("+  Subtotal: "+Subtotal+"\n+--------------------------------------------+");
        System.out.println("+  Total: "+Total+"\n+--------------------------------------------+");
        System.out.println("+ Copyright © 2015-2016 All Rights Reserved. +\n+--------------------------------------------+");
    }
    /* 
        Modulo Para La Obtencion e Imprecion De Datos
        Sobre El Calculo Del Disel.
    */
    public void Disel(float Litros, float Iva, String Nombre, String Domicilio, String RFC) {
        double Subtotal,Total; Subtotal=Litros*14.20; Total= Subtotal+(Subtotal+Iva);
        System.out.println("\n _____             _                                          _     _ _       ");
        System.out.println("|   __|___ ___ ___|_|___ ___    ___ ___ ___    ___ _ _    _ _|_|___|_| |_ ___ ");
        System.out.println("|  |  |  _| .'|  _| | .'|_ -|  | . | . |  _|  |_ -| | |  | | | |_ -| |  _| .'|");
        System.out.println("|_____|_| |__,|___|_|__,|___|  |  _|___|_|    |___|___|   \\_/|_|___|_|_| |__,|");
        System.out.println("                               |_|                                            \n\n+--------------------------------------------+");
        System.out.println("+         -> Gasolinera Los Mismo <-         +\n+--------------------------------------------+");
        System.out.println("+  Nombre: "+Nombre+"\n+--------------------------------------------+");
        System.out.println("+  Domicilio: "+Domicilio+"\n+--------------------------------------------+");
        System.out.println("+  RFC: "+RFC+"\n+--------------------------------------------+");
        System.out.println("+  Litros: "+Litros+"\n+--------------------------------------------+");
        System.out.println("+  Subtotal: "+Subtotal+"\n+--------------------------------------------+");
        System.out.println("+  Total: "+Total+"\n+--------------------------------------------+");
        System.out.println("+ Copyright © 2015-2016 All Rights Reserved. +\n+--------------------------------------------+");
    }
    /* 
        Este El Comienzo Del Main Principal Donde
        Se llevara A Cabo La Optencion De Los Datos
        Personales Del Cliente.
    */
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        Pro_6_GASOLINERA OArea = new Pro_6_GASOLINERA();
        String Nombre,Domicilio,RFC; boolean NombreCorrecto, RFCCorrecto; int op; float Litros,Iva= (float) 0.16;
                // Menu De Eleccion Para El Cliente.
                do{
                System.out.println("\n\n\n _____ _                     _   _         ");
                System.out.println("| __  |_|___ ___ _ _ ___ ___|_|_| |___ ___ ");
                System.out.println("| __ -| | -_|   | | | -_|   | | . | . |_ -|");
                System.out.println("|_____|_|___|_|_|\\_/|___|_|_|_|___|___|___|\n\n**********************");
                System.out.println("*      Menu          *\n**********************");
                System.out.println("* 1.- Gasolina Roja  *\n**********************");
                System.out.println("* 2.- Gasolina Verde *\n**********************");
                System.out.println("* 3.- Diesel         *\n**********************");
                System.out.println("* 4.- Salir          *\n**********************");
                op = Entrada.nextInt();
                /* 
                    Utilizando El Metodo De Casos Esto Nos
                    Servira Para llevar A Cabo Las Operaciones
                    Matemeticas De Cada Eleccion Dpendiendo La
                    Que Elija El Cliente O Usuario.
                */
                switch ( op ) {
                case 1:
                    System.out.println("\nNombre:");
                    do{ Nombre = Entrada.nextLine(); NombreCorrecto=Nombre.matches("[a-z].*"); }while(!NombreCorrecto);       
                    System.out.println("Domicilio:"); Domicilio = Entrada.nextLine();
                    do{ System.out.println("RFC:"); RFC = Entrada.nextLine(); RFCCorrecto=RFC.matches("[A-Z]+\\d{1,10}"); }while(!RFCCorrecto);
                    System.out.println("Litros:"); Litros = Entrada.nextFloat();
                    OArea.Disel(Litros,Iva,Nombre,Domicilio,RFC);
                    break;  
                case 2:
                    System.out.println("\nNombre:");
                    do{ Nombre = Entrada.nextLine(); NombreCorrecto=Nombre.matches("[a-z].*"); }while(!NombreCorrecto);       
                    System.out.println("Domicilio:"); Domicilio = Entrada.nextLine();
                    do{ System.out.println("RFC:"); RFC = Entrada.nextLine(); RFCCorrecto=RFC.matches("[A-Z]+\\d{1,10}"); }while(!RFCCorrecto);
                    System.out.println("Litros:"); Litros = Entrada.nextFloat();
                    OArea.Disel(Litros,Iva,Nombre,Domicilio,RFC);
                    break;    
                case 3:
                    System.out.println("\nNombre:");
                    do{ Nombre = Entrada.nextLine(); NombreCorrecto=Nombre.matches("[a-z].*"); }while(!NombreCorrecto);       
                    System.out.println("Domicilio:"); Domicilio = Entrada.nextLine();
                    do{ System.out.println("RFC:"); RFC = Entrada.nextLine(); RFCCorrecto=RFC.matches("[A-Z]+\\d{1,10}"); }while(!RFCCorrecto);
                    System.out.println("Litros:"); Litros = Entrada.nextFloat();
                    OArea.Disel(Litros,Iva,Nombre,Domicilio,RFC);
                    break;
                case 4:
                    break;  
            } // Fin Del Metodo SWITCH.
        }while(op<4); // Fin Del Ciclo DO WHILE.
     } // Fin Del Main Principal.  
} // Fin De La Clase.