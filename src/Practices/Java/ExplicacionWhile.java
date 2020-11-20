package Practices.Java;

import javax.swing.JOptionPane;

public class ExplicacionWhile{
    public static void main (String[] args){
        int Opcion;
        boolean Ciclo = true;
        while (Ciclo){
            Opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
            "1) Promedio 1\n"
            +"2) Promedio 2\n"
            +"3) Salir\n"
            ));

        }
    }
}