package Practices.Java;

import java.util.*;
import javax.swing.*;
import ConditionalActivity.ProgramaKernel;

public class Practice_9_HotelSunrise {
    static MainCode.RenderImagesClass Render = new MainCode.RenderImagesClass();
    static int optionGlobal = 0;
    static String Lista = "PERSONAS BD\n\n", ListaReserva = "RESERVA BD\n\n";
    static List<Integer> IDlist = new ArrayList<Integer>();

    public static void main(String[] args) {
        String user = "", pass = "";
        while (true) {
            user = JOptionPane.showInputDialog(null, "Digite su usuario: ");
            if (user.equals("HotelSunrise2018"))
                pass = JOptionPane.showInputDialog(null, "Digite su contraseña");
            if (pass.equals("SUNRISE.12345"))
                break;
        }
        menu();
    }

    public static void menu() {
        int option;
        while (true) {
            option = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "MENU\n1. Registro de clientes\n2. Registro de habitaciones\n3. Facturacion\n4. Shows\n5. Salir"));
            switch (option) {
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
                    shows();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Digite una opción valida");
                    break;
            }
        }
    }

    public static int CompararID(int IDClientRoom) {
        int Return = 1;
        for (int i = 0; i <= IDlist.size() - 1; i++) {
            if ((IDlist.get(i)) == IDClientRoom)
                Return = 0;
        }
        return Return;
    }

    public static void registerClients() {
        int yearOfBirth = 0, ID;
        boolean a = true;
        while (a) {
            optionGlobal = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "¿Que desea hacer?\n1. Ingresar datos\n2. Mostrar datos\n3. Volver al menu principal"));
            switch (optionGlobal) {
                case 1:
                    ID = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite su ID (4 numeros)"));
                    IDlist.add(ID);
                    Lista += ID + " - ";
                    Lista += JOptionPane.showInputDialog(null, "Digite su nombre") + " ";
                    Lista += JOptionPane.showInputDialog(null, "Digite sus apellidos") + " - ";
                    Lista += JOptionPane.showInputDialog(null, "Digite su cedula") + " - ";
                    yearOfBirth = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite su año de nacimiento"));
                    Lista += (2021 - yearOfBirth) + " - ";
                    Lista += JOptionPane.showInputDialog(null, "Digite su nacionalidad") + " - ";
                    Lista += JOptionPane.showInputDialog(null, "Digite su telefono") + " - ";
                    Lista += JOptionPane.showInputDialog(null, "Digite su direccion") + "\n\n";
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, Lista);
                    break;
                case 3:
                    a = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Digite una opcion valdia");
                    break;
            }
        }
    }

    public static void registerRooms() {
        String typeRooms[] = { "Sencilla", "Doble", "Especial" },typePaymentMethod[] = {"Tarjeta","Efectivo"};
        int ID = 0, b = 1, typeRoomSelect = 0,typePaymentMethodSelect = 0,HabitacionesCantidad;
        boolean a = true;
        while (a) {
            optionGlobal = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "¿Que desea hacer?\n1. Ingresar datos\n2. Mostrar datos\n3. Volver al menu principal"));
            switch (optionGlobal) {
                case 1:
                    ListaReserva += JOptionPane.showInputDialog(null, "Digite su Codigo de reserva (4 numeros)") + " - ";
                    while (b != 0) {
                        ID = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite su ID(existente)"));
                        b = CompararID(ID);
                        if (b == 0)
                            JOptionPane.showMessageDialog(null, "Codigo validado correctamente");
                        else
                            JOptionPane.showMessageDialog(null, "Validacion del codigo incorrecto");
                    }
                    ListaReserva += ID + " - ";
                    HabitacionesCantidad = Integer.parseInt(JOptionPane.showInputDialog(null,"Numero de habitaciones: "));
                    ListaReserva += HabitacionesCantidad + " - ";
                    typeRoomSelect = JOptionPane.showOptionDialog(null,
                            "Seleccione el tipo de habitacion:\nSencilla:500.000/dia\nDoble:800.000/dia\nEspecial:1.000.000/dia",
                            "Tipo de habitaciones", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                            Render.icono("/resources/IMG/Samsung.png", 100, 100), typeRooms, 0);
                    switch(typeRoomSelect){
                        case 0:
                            ListaReserva += ProgramaKernel.FormatearDinero((500000*HabitacionesCantidad)) + "/dia" + " - ";
                        break;
                        case 1:
                            ListaReserva += ProgramaKernel.FormatearDinero((800000*HabitacionesCantidad)) + "/dia" + " - ";
                        break;
                        case 2: 
                            ListaReserva += ProgramaKernel.FormatearDinero((1000000*HabitacionesCantidad)) + "/dia" + " - ";
                        break;
                    }
                    typePaymentMethodSelect = JOptionPane.showOptionDialog(null,
                            "Seleccione el metodo de pago::",
                            "Tipo de habitaciones", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                            Render.icono("/resources/IMG/Samsung.png", 100, 100), typePaymentMethod, 0);
                    switch(typePaymentMethodSelect){
                        case 0:
                            ListaReserva += "Tarjeta\n\n";
                        break;
                        case 1:
                            ListaReserva += "Efectivo\n\n";
                        break;
                    }
                break;
                case 2:
                    JOptionPane.showMessageDialog(null,ListaReserva);
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
        int menu, cant, cont = 1, tip, sen = 0, dob = 0, esp = 0;
        String nom, ape, preg;
        double sencilla = 500000, doble = 800000, especial = 1000000, valortotal, valortotaldes;
        boolean a = true;
        while(a){
            menu = Integer.parseInt(JOptionPane.showInputDialog("----------MENU----------\n"
                    + "Selecciona una de las siguientes opciones:\n"
                    + "1. Factura \n"
                    + "2. Consulta \n"
                    + "3. Volver \n"));
            switch (menu) {
                case 1:
                    nom = JOptionPane.showInputDialog("Escriba su nombre");
                    ape = JOptionPane.showInputDialog("Escriba su apellido");
                    cant = Integer.parseInt(JOptionPane.showInputDialog("que cantidad de habitaciones reservara?"));
                    while (cont <= cant) {
                        tip = Integer.parseInt(JOptionPane.showInputDialog("seleccione el tipo de habitacion \n"
                                + "1. Sencilla \n"
                                + "2. Doble \n"
                                + "3. Especial \n"));
                        if (tip == 1) {
                            sen = sen + 1;
                        } else if (tip == 2) {
                            dob = dob + 1;
                        } else if (tip == 3) {
                            esp = esp + 1;
                        }
                        cont++;
                    }
                    valortotal = ((sencilla * sen) + (doble * dob) + (esp * especial));
                    preg = JOptionPane.showInputDialog("su nacionalidad es colombiana? SI/NO");
                    if ("SI".equals(preg)) {
                        JOptionPane.showMessageDialog(null, "tiene descuento");
                        sencilla = (sencilla - (sencilla * 0.25));
                        doble = (doble - (doble * 0.15));
                        especial = (especial - (especial * 0.10));
                    } else {
                        JOptionPane.showMessageDialog(null, "no tiene descuento");
                    }
                    valortotaldes = ((sencilla * sen) + (doble * dob) + (esp * especial));
                    JOptionPane.showMessageDialog(null, "señor(a) " + nom +" "+ ape + "\n"
                            + "La cantidad de habitaciónes reservadas es de " + cant + " habitaciones \n"
                            + sen + " sencilla(s)\n"
                            + dob + " doble(s)\n"
                            + esp + " especial(es)\n"
                            + "su valor total es: " + valortotal + "\n"
                            + "como usted " + preg + " tiene descuento su valor total es: " + valortotaldes);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "habitaciones \n"
                            + "1. Sencilla ($ 500.000 el día)\n"
                            + "2. Doble ($ 800.000 el día)\n"
                            + "3. Especial (1’000.000 el día)\n"
                            + "Descuento \n"
                            + "si la nacionalidad del cliente es Colombia, tendrá\n"
                            + "un 25% en habitación sencilla \n"
                            + "15% en doble \n"
                            + "y 10% en habitaciones especial.");
                    break;
                case 3:
                    a = false;
                break;
            }
        }
    }
    public static void shows(){
        int menu, cont = 0;
        String nom;
        nom = JOptionPane.showInputDialog("Escriba su nombre");
        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog("------Actividades-----\n"
                    + "Selecciona la actividad que desea realizar :\n"
                    + "1. yoga \n"
                    + "2. clase de baile \n"
                    + "3. tour por la ciudad \n"
                    + "4. concierto \n"
                    + "5. show de comedia \n"
                    + "6. cena romantica \n"
                    + "7. fiesta \n"
                    + "8. pelicula "));

            switch (menu) {
                case 1:
                    JOptionPane.showMessageDialog(null, "señor(a) " + nom + " YOGA la actividad tiene un precio de 10000 por persona \n"
                            + "puede asistir en el siguiente horario \n"
                            + "8:00am \n"
                            + "9:00am \n"
                            + "10:00am \n"
                            + "11:00am \n"
                            + "recuerde cancelar en caja");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "señor(a) " + nom + " CLASE DE BAILE la actividad tiene un precio de 8000 por persona \n"
                            + "puede asistir en el siguiente horario \n"
                            + "9:00am \n"
                            + "3:00pm \n"
                            + "5:00pm \n"
                            + "7:00am \n"
                            + "recuerde cancelar en caja");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "señor(a) " + nom + " TOUR POR LA CIUDAD la actividad tiene un precio de 30000 por persona \n"
                            + "puede asistir en el siguiente horario \n"
                            + "8:00am \n"
                            + "10:00am \n"
                            + "1:00pm \n"
                            + "3:00pm \n"
                            + "4:00pm \n"
                            + "5:00pm \n"
                            + "recuerde cancelar en caja");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "señor(a) " + nom + " CONCIERTO la actividad tiene un precio de 40000 por persona \n"
                            + "puede asistir en el siguiente horario \n"
                            + "8:00pm \n"
                            + "10:00pm \n"
                            + "recuerde cancelar en caja");
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "señor(a) " + nom + " SHOW DE COMEDIA la actividad tiene un precio de 10000 por persona \n"
                            + "puede asistir en el siguiente horario \n"
                            + "8:00pm \n"
                            + "9:00pm \n"
                            + "10:00pm \n"
                            + "11:00pm \n"
                            + "recuerde cancelar en caja");
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "señor(a) " + nom + " CENA ROMANTICA la actividad tiene un precio de 50000 por persona \n"
                            + "puede asistir en el siguiente horario \n"
                            + "7:00pm \n"
                            + "8:00pm \n"
                            + "9:00pm \n"
                            + "recuerde cancelar en caja");
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "señor(a) " + nom + " FIESTA la actividad tiene un precio de 20000 por persona \n"
                            + "puede asistir en el siguiente horario \n"
                            + "desde la 7:00pm \n"
                            + "recuerde cancelar en caja");
                    break;
                case 8:
                    JOptionPane.showMessageDialog(null, "señor(a) " + nom + " PELICULA la actividad tiene un precio de 12000 por persona \n"
                            + "puede asistir en el siguiente horario \n"
                            + "8:00pm \n"
                            + "9:00pm \n"
                            + "10:00pm \n"
                            + "11:00pm \n"
                            + "recuerde cancelar en caja");
                    break;
            }
            cont=Integer.parseInt(JOptionPane.showInputDialog( "desea volver al menu principal"
                    + "SI=1"
                    + "NO=2"));
        } while (cont != 1);
    }
}
