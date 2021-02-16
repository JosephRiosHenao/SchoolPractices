package Practices.Java;

import javax.swing.JOptionPane;

public class c {
    public static void main(String[] args) {
        String pass = "", user = "";
        while(true){
            user = JOptionPane.showInputDialog(null, "Digite el usuario");
            if (user.equals("HotelSunrise2018")) break;
            else JOptionPane.showMessageDialog(null,"Digitastes el usuario incorrecto");
        }
        while(true){
            pass = JOptionPane.showInputDialog(null, "Digite el contraseña");
            if (pass.equals("SUNRISE.12345")) break;
            else JOptionPane.showMessageDialog(null,"Digitastes el contraseña incorrecto");
        }
        while(true){
            int Opciones = Integer.parseInt(JOptionPane.showInputDialog(null,"1.a\n2.b"));
            switch (Opciones){
                case 1:
                    while(true){
                        int Opciones2 = Integer.parseInt(JOptionPane.showInputDialog(null,"1. Ingresar datos. \n 2. Regresar al menú principal."));
                        if (Opciones2 == 2) break;
                        switch (Opciones2){
                            case 1:
                                //Programa
                            break;
                        }
                    }
                break;
                case 2:
                break;
            }
        }
    }
}
