package Practices.Java;

import javax.swing.JOptionPane;

public class Practice_5_TablaDeMultiplicar {
    public static void main(String[] args) {
        int i = 0, max = 0, num;
        String Tabla = "";
        max = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el tamaño de la tabla"));
        num = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el numero de la lista"));
        do {
            i++;
            Tabla += ""+num+" x "+i+" = "+(num*i)+"\n";
        } while (i<max);
        JOptionPane.showMessageDialog(null,Tabla);
    }
}
