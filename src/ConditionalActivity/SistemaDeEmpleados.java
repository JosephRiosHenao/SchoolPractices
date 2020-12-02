package ConditionalActivity;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class SistemaDeEmpleados {
    static MainCode.LecturaYEscritura JOP = new MainCode.LecturaYEscritura();

    public static void Inicializar() {
        Seccion();
    }

    public void Menu() {
        Object[] Opciones = { "Registro", "Nomina", "Salir" };
        int Opcion = JOptionPane.showOptionDialog(null, "Seleccione una opcion", "MENU", JOptionPane.CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE, new ImageIcon(new ImageIcon(getClass().getResource("/resources/IMG")).getImage().getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH)),Opciones, 2);
        switch (Opcion) {
            case 0:
                Registrar();
                break;
            case 1:

                break;
            default:
                System.exit(0);
                break;
        }
    }

    public static void Seccion() {
        JOptionPane.showMessageDialog(null, "Acontinuacion registrese", "Informacion", JOptionPane.INFORMATION_MESSAGE);
        String User = JOP.LeerString("Registre su Usuario", "/resources/IMG/ProfileIconDefault.png", 100, 100);
        String Password = JOP.LeerString("Registre su Contraseña", "/resources/IMG/ProfileIconDefault.png", 100, 100);
        System.out.println(User+", "+Password);
        boolean RegistroCompletado = true;
        JOptionPane.showMessageDialog(null, "Acontinuacion logueese", "Informacion", JOptionPane.INFORMATION_MESSAGE);
        while (RegistroCompletado) {
            String UserConfirm = JOP.LeerString("Ingrese su Usuario", "/resources/IMG/ProfileIconDefault.png", 100,100);
            String PasswordConfirm = JOP.LeerString("Ingrese su Contraseña", "/resources/IMG/ProfileIconDefault.png",100, 100);
            System.out.println(User+", "+Password);
            System.out.println(UserConfirm+", "+PasswordConfirm);

            if (User.equals(UserConfirm) && Password.equals(PasswordConfirm)){
                RegistroCompletado = false;
                JOptionPane.showMessageDialog(null,"Logeo exitoso","Entrada exitosa!",JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null,"Registro incorrecto","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    public void Registrar(){
        String PasswordConfirm = JOP.LeerString("Ingrese su Contraseña", PathImage, 100, 100);
    }
}
