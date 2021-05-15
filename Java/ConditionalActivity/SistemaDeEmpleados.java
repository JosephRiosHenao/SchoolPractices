package ConditionalActivity;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class SistemaDeEmpleados {
    static MainCode.LecturaYEscritura JOP = new MainCode.LecturaYEscritura();
    public void Menu() {
        Object[] Opciones = { "Registro", "Nomina", "Salir" };
        while (true) {
            int Opcion = JOptionPane.showOptionDialog(null, "Seleccione una opcion", "MENU", JOptionPane.CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE, new ImageIcon(new ImageIcon(getClass().getResource("/resources/IMG")).getImage().getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH)),Opciones, 2);
            switch (Opcion) {
                case 0:
                    Registrar();
                    break;
                case 1:
                    Nomina();
                    break;
                default:
                    System.exit(0);
                    break;  
            }
        }
    }
    public void Seccion() {
        JOptionPane.showMessageDialog(null, "Acontinuacion registrese", "Informacion", JOptionPane.INFORMATION_MESSAGE);
        String User = JOP.LeerString("Registre su Usuario", "/resources/IMG/ProfileIconDefault.png", 100, 100);
        String Password = JOP.LeerString("Registre su Contraseña", "/resources/IMG/PasswordIcon.png", 100, 100);
        boolean RegistroCompletado = true;
        JOptionPane.showMessageDialog(null, "Acontinuacion logueese", "Informacion", JOptionPane.INFORMATION_MESSAGE);
        while (RegistroCompletado) {
            String UserConfirm = JOP.LeerString("Ingrese su Usuario", "/resources/IMG/ProfileIconDefault.png", 100,100);
            String PasswordConfirm = JOP.LeerString("Ingrese su Contraseña", "/resources/IMG/PasswordIcon.png",100, 100);
            if (User.equals(UserConfirm) && Password.equals(PasswordConfirm)){
                RegistroCompletado = false;
                JOptionPane.showMessageDialog(null,"Logeo exitoso","Entrada exitosa!",JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null,"Registro incorrecto","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        Menu();
    }
    public void Registrar(){
        String MensajeAMostrar = "---Datos registrados---\n\n";
        MensajeAMostrar += "Nombre: "+(JOP.LeerString("Ingrese su Nombre", "/resources/IMG/ProfileIconDefault.png", 100, 100))+"\n";
        MensajeAMostrar += "Apellidos: "+(JOP.LeerString("Ingrese su Apellidos", "/resources/IMG/ProfileIconDefault.png", 100, 100))+"\n";
        MensajeAMostrar += "Cedula: "+(JOP.LeerString("Ingrese su Cedula", "/resources/IMG/ProfileIconDefault.png", 100, 100))+"\n";
        MensajeAMostrar += "Direccion: "+(JOP.LeerString("Ingrese su Direccion", "/resources/IMG/ProfileIconDefault.png", 100, 100))+"\n";
        MensajeAMostrar += "Telefono: "+(JOP.LeerString("Ingrese su Telefono", "/resources/IMG/ProfileIconDefault.png", 100, 100))+"\n";
        int Edad = Integer.parseInt(JOP.LeerString("Ingrese su Año de nacimiento", "/resources/IMG/ProfileIconDefault.png", 100, 100));
        Edad = (2020-Edad);
        MensajeAMostrar += "Edad: "+Edad+"\n";
        MensajeAMostrar += "Antiguedad: "+(JOP.LeerString("Cuantos años has estado en la empresa?", "/resources/IMG/ProfileIconDefault.png", 100, 100))+" años\n";
        JOptionPane.showMessageDialog(null, MensajeAMostrar, "Informacion",JOptionPane.PLAIN_MESSAGE,new ImageIcon(new ImageIcon(getClass().getResource("/resources/IMG/InformationList.jpg")).getImage().getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH)));
    }
    public void Nomina(){
        int Horas, HorasExtras, Ocupacion; 
        double SueldoBase = 0, SueldoTotal = 0, Descuento;
        Ocupacion = Integer.parseInt(JOptionPane.showInputDialog(null,  "Ingrese su puesto de trabajo\n"
                                                                        +"1. Director\n"
                                                                        +"2. Gerente\n"
                                                                        +"3. Empleado general\n"));
        Horas = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese sus horas de trabajo"));
        HorasExtras = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese sus horas extras de trabajo"));
        if (Ocupacion == 1){
            SueldoBase = 33333 * Horas;
        }
        if (Ocupacion == 2){
            SueldoBase = 20000 * Horas;
        }
        if (Ocupacion == 3){
            SueldoBase = 5500 * Horas;
        }
        Descuento = SueldoBase * 0.10;
        SueldoTotal = SueldoTotal - Descuento;
        Descuento = SueldoBase * 0.20;
        SueldoTotal = SueldoTotal - Descuento;
        if (HorasExtras>=1 && HorasExtras<=5){
            SueldoTotal = SueldoTotal + 15000;
        }
        if (HorasExtras>=6 && HorasExtras<=8){
            SueldoTotal = SueldoTotal + 25000;
        }
        if (HorasExtras>10){
            JOptionPane.showMessageDialog(null, "Ganastes un bono de supermercado!");
        }
        SueldoTotal = SueldoTotal + 55000;
        JOptionPane.showMessageDialog(null,  "Su sueldo base es: "+SueldoBase+"\n"
                                            +"Su sueldo total es: "+SueldoTotal);
    }
}