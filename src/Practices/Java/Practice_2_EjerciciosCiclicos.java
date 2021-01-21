package Practices.Java;
import javax.swing.JOptionPane;

import ConditionalActivity.ProgramaKernel;

public class Practice_2_EjerciciosCiclicos {
    public static void main(String[] args) {
        Punto5();
    }
    public static void Punto1() {
        int i = 1;
        String Lista = "";
        while (i <= 20) {
            if (i % 2 == 0) {
                Lista += "Numero par: " + i + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, Lista);
    }
    public static void Punto2() {
        int Entrada;
        do {
            Entrada = Integer
                    .parseInt(JOptionPane.showInputDialog(null, "Digite un numero\nSi desea salir digite \"20\""));
            if (Entrada == 0)
                JOptionPane.showMessageDialog(null, Entrada + " es numero es neutro");
            else if (Entrada > 0)
                JOptionPane.showMessageDialog(null, Entrada + " es numero positivo");
            else
                JOptionPane.showMessageDialog(null, Entrada + " es numero negativo");
        } while (Entrada != 20);
    }
    public static void Punto3() {
        int Suma = 0, Input = 0, Producto = 1;
        while (Input != 999) {
            Input = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite '999' para salir\nDigite un numero: "));
            if (Input % 2 == 0)
                Suma += Input;
            if (Input % 5 == 0)
                Producto *= Input;
            JOptionPane.showMessageDialog(null, "Su suma es: " + Suma + "\nSu producto es: " + Producto);
        }
    }
    public static void Punto4(){
        String[] NombreMeses =  {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        long[] DineroMeses = new long[12];
        long DineroTotal = 0;
        String Mensaje = "MESES\n";
        for (int i = 0; i < 12; i++){
            DineroMeses[i] = ProgramaKernel.PedirNumeroDinero("Cuanto dinero ahorrastes el mes de "+NombreMeses[i], 50, 50);
            DineroTotal += DineroMeses[i];
            Mensaje += NombreMeses[i]+": "+DineroMeses[i]+"\n";
        }
        JOptionPane.showMessageDialog(null,Mensaje+"\n\nDinero ahorrado en todo el año: "+ProgramaKernel.FormatearDinero(DineroTotal));
    }
    public static void Punto5(){    
        String Color = "N/A";
        while(true){
            Color = JOptionPane.showInputDialog(null,"Color = "+Color+"\nDigite un color, sí digita 'BLUE' finaliza el programa");
            if (Color.equals("BLUE")) break;
        }
    }
}