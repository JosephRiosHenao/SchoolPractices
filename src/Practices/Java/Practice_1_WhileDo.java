package Practices.Java;

import java.util.Random;
import java.util.Scanner;

public class Practice_1_WhileDo {
    public static void main(String[] args) {
        //Mayor();
CicloNumeros();
//Receptor();
    }
    public static void CicloNumeros(){
        int Numero = 100;
        do {
            Numero--;
            System.out.println(Numero);
        } while (Numero != 0);
    }
    public static void Mayor(){
        int Maximo = 0;
        Scanner Lector = new Scanner(System.in);
        Random r1 = new Random();
        int Numero = 0;
        do {
            Maximo = 22;
            System.out.println("---------------------------------------------------------");
            for (int i = 0; i < 3; i++){
                int NumeroRandom  = r1.nextInt(20);
                System.out.println(NumeroRandom);
                if (Numero > Maximo) {
                    Maximo = Numero;
                }
                System.out.println(Maximo);
            }
            System.out.print("Digite el numero mayor: ");
            Numero = Lector.nextInt();
        } while (Numero != Maximo);
    }
    public static void Receptor(){
        int Numero = 5;
        int Entrada = 0;
        Scanner Lector  = new Scanner(System.in);
        do {
            System.out.println("Digite el numero "+Numero);
            Entrada = Lector.nextInt();
        } while (Numero != Entrada);
    }
}
