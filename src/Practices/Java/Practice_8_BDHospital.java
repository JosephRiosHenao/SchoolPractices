package Practices.Java;

import javax.swing.JOptionPane;

public class Practice_8_BDHospital {
    public static void main(String[] args) {
        String name = "", DB[], output = "PRIORIDAD\n\n";
        int priority = 0;
        int pacients = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la cantidad de pacientes"));
        DB = new String[pacients+1];
        for (int i = 0; i < pacients; i++) {
            name = JOptionPane.showInputDialog(null,"Digite el nombre del paciente #"+(i+1));
            priority = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la prioridad del paciente "+name+"\n(De 0 a "+pacients+", entre más alto tiene mayor prioridad)"));
            DB[priority] = name;
        }
        for (int i = pacients; i >= 0; i--) {
            output += i+") "+DB[i]+"\n";
        }
        JOptionPane.showMessageDialog(null,output);
    }
}