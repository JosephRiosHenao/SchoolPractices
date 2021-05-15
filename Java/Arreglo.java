package Practices.Java;
import java.util.Scanner;

public class Arreglo {
    static Scanner Entrada = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Digite el tamaño del array");
        int Cantidad = Entrada.nextInt();
        int[] Numeros = new int[Cantidad];
        System.out.println("Digite solo numeros enteros");
        for (int i = 0; i < Cantidad; i++){
            System.out.println("Digite el "+(i+1)+"° entero");
            Numeros[i] = Entrada.nextInt();
        }
        for (int i = 0; i < Cantidad; i++){
            int r = Numeros[i]+10;
            System.out.println((i+1)+") "+Numeros[i]+" + 10 = "+r+"");
        }
    }
    
}