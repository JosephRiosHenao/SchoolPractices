package Practices.Java;

import java.util.*;

import javax.swing.*;
public class Practice_9_HotelSunrise {
    static int optionGlobal = 0;
    static String Lista = "PERSONAS BD\n\n";
    public static void main(String[] args) {
        String user = "",pass = "";
        while(true){
            user = JOptionPane.showInputDialog(null,"Digite su usuario: ");
            if (user.equals("HotelSunrise2018")) pass = JOptionPane.showInputDialog(null, "Digite su contraseña");
            if (pass.equals("SUNRISE.12345")) break;
        }
        menu();
    }
    public static void menu(){
        int option;
        while(true){
            option = Integer.parseInt(JOptionPane.showInputDialog(null,"MENU\n1. Registro de clientes\n2. Registro de habitaciones\n3. Facturacion\n4. Tour\n5. Salir"));
            switch(option){
                case 1:
                    registerClients();
                break;
                case 2:
                    registerRooms();
                break;
                case 3:
                    checkIn();
                break;
                case 4:
                    tour();
                break;
                case 5:
                    System.exit(0);
                break;
                default:
                    JOptionPane.showMessageDialog(null,"Digite una opción valida");
                break;
            }
        }
    }
    public static void registerClients(){
        List<String> IDlist = new ArrayList<String>();
        int yearOfBirth = 0, ID;
        boolean a = true;
        while(a){
            optionGlobal = Integer.parseInt(JOptionPane.showInputDialog(null,"¿Que desea hacer?\n1. Ingresar datos\n2. Mostrar datos\n3. Volver al menu principal"));
            switch (optionGlobal) { 
                case 1:
                    ID = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite su ID (4 numeros)"));
                    IDlist.add(""+ID);
                    Lista += ID + " - ";
                    Lista += JOptionPane.showInputDialog(null,"Digite su nombre") + " - ";
                    Lista += JOptionPane.showInputDialog(null,"Digite sus apellidos" + " - ");
                    Lista += JOptionPane.showInputDialog(null,"Digite su cedula") + " - ";
                    yearOfBirth = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite su fecha de nacimiento"));
                    Lista +=  (2021-yearOfBirth) + " - ";
                    Lista += JOptionPane.showInputDialog(null,"Digite su nacionalidad") + " - ";
                    Lista += JOptionPane.showInputDialog(null,"Digite su telefono") + " - ";
                    Lista += JOptionPane.showInputDialog(null,"Digite su dirrecion") + "\n";
                break;
                case 2:
                    JOptionPane.showMessageDialog(null,Lista);
                break;
                case 3:
                    a = false;
                break;
                default:
                    JOptionPane.showMessageDialog(null,"Digite una opcion valdia");
                break;
            }
        }
    }
    public static void registerRooms(){
        int ID;
        boolean a = true;
        while(a){
            optionGlobal = Integer.parseInt(JOptionPane.showInputDialog(null,"¿Que desea hacer?\n1. Ingresar datos\n2. Mostrar datos\n3. Volver al menu principal"));
            switch (optionGlobal) { 
                case 1:
                    Lista += JOptionPane.showInputDialog(null,"Digite su Codigo de reserva (4 numeros)") + " - ";
                    while(true){
                        ID = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite su ID(existente)"));
                        CompararID()
                    }
                    Lista += JOptionPane.showInputDialog(null,"Digite sus apellidos" + " - ");
                    Lista += JOptionPane.showInputDialog(null,"Digite su cedula") + " - ";
                    Lista += JOptionPane.showInputDialog(null,"Digite su nacionalidad") + " - ";
                    Lista += JOptionPane.showInputDialog(null,"Digite su telefono") + " - ";
                    Lista += JOptionPane.showInputDialog(null,"Digite su dirrecion") + "\n";
                break;
                case 2:
                    JOptionPane.showMessageDialog(null,Lista);
                break;
                case 3:
                    a = false;
                break;
                default:
                    JOptionPane.showMessageDialog(null,"Digite una opcion valdia");
                break;
            }
        }
    }
    public static void checkIn(){

    }
    public static void tour(){

    }
}
