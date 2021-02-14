package Practices.Java;

import javax.swing.JOptionPane;

/**
 * Crear una BD de una clinita la cual tendra que introducir el nombre del paciente
 * y su prioridad donde al final te debera mostrar en orden la prioridad de la
 * de cada perona ordenada segun su prioridad
 */

public class Practice_8_BDHospital {
    public static void main(String[] args) {
        boolean a = true;
        while(a){
            do{
                String name = "", DB[], output = "PRIORIDAD\n\n";
                int priority = 0;
                int pacients = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la cantidad de pacientes"));
                DB = new String[pacients+1];
                for (int i = 0; i < pacients; i++) {
                    name = JOptionPane.showInputDialog(null,"Digite el nombre del paciente #"+(i+1));
                    priority = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la prioridad del paciente "+name+"\n(De 1 a "+pacients+", entre más alto tiene mayor prioridad)"));
                    DB[priority] = name;
                }
                for (int i = pacients; i >= 0; i--) {
                    output += i+") "+DB[i]+"\n";
                }
                JOptionPane.showMessageDialog(null,output);
                if (a == true) a = false;
                else a= true;
            }while(a==true);
        }
    }
}