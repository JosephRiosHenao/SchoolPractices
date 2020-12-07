package Practices.Java;

import javax.swing.JOptionPane;

public class Explicar1 {

    public static void main(String [] args){
        while(true){
            int Modo = Integer.parseInt(JOptionPane.showInputDialog(null,"1. caso1\n2. caso2\n3. salir"));
            switch (Modo){
                case 1: //caso 1
                    JOptionPane.showMessageDialog(null,"Caso 1");
                break;
                case 2: //caso 2
                    JOptionPane.showMessageDialog(null,"Caso 1");
                break;
                case 3: //salir
                    System.exit(0);
                break;
            }
        }
    }
    
}
