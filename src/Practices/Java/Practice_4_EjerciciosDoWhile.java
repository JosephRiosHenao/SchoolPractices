package Practices.Java;

import javax.swing.JOptionPane;

public class Practice_4_EjerciciosDoWhile {
    static int input;

    public static void main(String[] args) {

    }

    public static void menu() {
        int options = 0;
        while (true) {
            options = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "MENU\n\n1.Punto1 (Numero pares de 0 a 20)\n2.Punto2 (Detectar valor de numero)\n3.Punto3 (Sumar pares y multiplicar multiplos de 5)\n4.Punto4 (Dinero ahorrado en el año)\n5.Punto5 (Digitador de colores)\n6.Punto6 (Ciudades de Colombia)\n7.Punto7 (Ciclo hasta que digites 5)\n8.Salir\n\n"));
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

    }

    public static void point6(){

    }

    public static void point7(){

    }
}