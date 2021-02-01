package Practices.Java;

import java.util.Random;

import javax.swing.JOptionPane;

public class Practice_4_EjerciciosDoWhile {
    static int input = 0;

    public static void main(String[] args) {

    }

    public static void menu() {
        int options = 0;
        while (true) {
            input = 0;
            options = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "MENU\n\n1.Punto1 (Contar numeros hasta negativo)\n2.Punto2 (Mostrar cuadrado)\n3.Punto3 (Par o impar hasta 0)\n4.Punto4 (Promedio de estatura y edad)\n5.Punto5 (Adivinar numero)\n6.Punto6 (Calcular promedio hasta negativo)\n7.Punto7 (Prueba clasificatoria de Produccion Cinematografica)\n8.Salir\n\n"));
            switch (options) {
                case 1:
                    point1();
                    break;
                case 2:
                    point2();
                    break;
                case 3:
                    point3();
                    break;
                case 4:
                    point4();
                    break;
                case 5:
                    point5();
                    break;
                case 6:
                    point6();
                    break;
                case 7:
                    point7();
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "\n\nDigite una opcion valida\n\n");
                    break;
            }
        }
    }

    public static void point1() {
        int cont = 0;
        do {
            input = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero\nSí digita uno negativo se termina el bucle"));
            cont++;
        } while (input < 0);
        JOptionPane.showInputDialog(null, "Usted a digitado " + cont + " numeros");
    }

    public static void point2() {
        do {
            input = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero\nSí digita uno negativo se termina el bucle"));
            JOptionPane.showMessageDialog(null, "El cuadrado de " + input + " es: " + (input * input));
        } while (input < 0);
        JOptionPane.showInputDialog(null,"Usted se salio por digita un numero negativo");
    }

    public static void point3(){
        do {
            input = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero\nSí digita '0' se termina el bucle"));
            if (input%2 == 0) JOptionPane.showMessageDialog(null,"El numero "+input+" es par");
            else JOptionPane.showMessageDialog(null,"El numero "+input+" es impar");
        } while (input == 0);
    }

    public static void point4(){
        int years = 0, persons = 1;
        float promYears, height = 0;
        do {
            years += Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la edad de la persona " + persons));
            height += Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la estatura de la persona " + persons));
            promYears = years/persons;
            JOptionPane.showMessageDialog(null,"PROMEDIOS ACTUALES\nEdad: "+promYears+"\nEstatura: "+(height/persons));
            persons++;
        } while (promYears > 30);
    }

    public static void point5(){
        int number = new Random().nextInt(100);
        do {
            input = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite un numero"));
            if (input>number) JOptionPane.showMessageDialog(null,"Su numero es alto");
            else if (input<number) JOptionPane.showMessageDialog(null,"Su numero es bajo");
            else JOptionPane.showMessageDialog(null,"Felicitaciones\nAcerto su numnero!!");
        } while (number == input);
    }

    public static void point6(){
        int cont = 1;
        do {
            input += Integer.parseInt(JOptionPane.showInputDialog(null,"Digite un numero, sí es negativo termina el ciclo"));
            cont++;
        } while (input<0);
        JOptionPane.showMessageDialog(null,"Su promedio es "+(input/cont)+"\nDigitastes el numero "+cont+" veces\nTu entrada en total es: "+input);
    }

    public static void point7(){
        int approved = 0, disapproved = 0;
        float totalRating = 0, rating = 0;
        do {
            rating = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite la nota del estuadiante "+input));
            totalRating += rating;
            input++;
            if (rating<3.0 && rating>0) disapproved++;
            else approved++;
        } while (input<0);
        JOptionPane.showMessageDialog(null,"Total de estuadiantes: "+(approved+disapproved)+"\nEstuadiantes que aprobaron: "+approved+"\nEstuantes que desaprobaron: "+disapproved+"\nPromedio del grupo: "+(totalRating/(approved+disapproved)));
    }
}