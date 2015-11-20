package Parcial.pkg3.Visual;
import javax.swing.JOptionPane;
public class Pro1_VisualSuma {
    public static void main(String[] args) {
    // Obtiene La Entrada Del Usuario De Los Dialogos De Entrada De JOptionPane.
    String PrimerNumero = JOptionPane.showInputDialog("Introduce El Primer Entero");
    String SegundoNumero = JOptionPane.showInputDialog("Introduce El Segundo Entero");
    // Convierte Las Entradas De String En Valores INT Para Usuarios En Un Calculo.
    int numero1=Integer.parseInt(PrimerNumero);
    int numero2=Integer.parseInt(SegundoNumero);
    int suma=numero1+numero2;
    // Muestra Resultados En Un Dialogo De Mensajes De JOptionPane
    JOptionPane.showMessageDialog(null,"La Suma Es: "+suma,"Suma De Enteros",JOptionPane.PLAIN_MESSAGE);
    } // Fin Del Main Principal.  
} // Fin De La Clase.
