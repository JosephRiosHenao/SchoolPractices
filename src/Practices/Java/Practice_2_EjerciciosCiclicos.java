package Practices.Java;
import javax.swing.JOptionPane;
public class Practice_2_EjerciciosCiclicos {
    public static void main(String[] args) {
        Punto3();
    }
    public static void Punto1(){
        int i = 1;
        String Lista = "";
        while (i<=20){
            if (i%2==0){
                Lista += "Numero par: "+i+"\n";
            }
        }
        JOptionPane.showMessageDialog(null,Lista);
    }
    public static void Punto2(){
        int Entrada;
        do {
            Entrada = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite un numero\nSi desea salir digite \"20\""));
            if (Entrada == 0) JOptionPane.showMessageDialog(null,Entrada+" es numero es neutro");
            else if (Entrada > 0) JOptionPane.showMessageDialog(null,Entrada+" es numero positivo");
            else JOptionPane.showMessageDialog(null,Entrada+" es numero negativo");
        } while (Entrada != 20);
    }
    public static void Punto3(){
        int Suma = 0, Input = 0, Producto = 1;
        while (Input != 999){
            Input = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite '999' para salir\nDigite un numero: "));
            if (Input%2==0) Suma += Input;
            if (Input%5==0) Producto *= Input;
            JOptionPane.showMessageDialog(null,"Su suma es: "+Suma+"\nSu producto es: "+Producto);
        }
    }
}